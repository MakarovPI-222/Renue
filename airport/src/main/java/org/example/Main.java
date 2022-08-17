package org.example;
import java.io.*;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    //CSV = Comma-Separated Values
    //   text file that uses a comma to separate values
    long time = System.currentTimeMillis();
    String file = "src\\airports.csv";
    BufferedReader reader = null;
    String line = "";int k = 0;
    //int p=2;
    //args[0]= "2";
    String g = args[0];
    int p =Integer.parseInt(g);
    Scanner in = new Scanner(System.in);
    String n = in.nextLine();

    try {
      reader = new BufferedReader(new FileReader(file));
      while((line = reader.readLine()) != null) {

        String[] row = line.split(",");



          if (row[p-1].startsWith(n)){
            k=k+1;
            System.out.printf(row[0]+" "+ row[1]+" "+ row[2]+" "+ row[3]+" "+ row[4]+" "+ row[5]+" "+ row[6]+" "+ row[7]+" "+ row[8]+" "+ row[9]+" "+ row[10]+" "+ row[11]+" "+ row[12]+" "+ row[13]);
            System.out.print("  ");
          }


      }
    }
    catch(Exception e) {
      e.printStackTrace();
    }

    finally {
      try {
        reader.close();
      } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }
    }
    System.out.print("\n"+k);
    System.out.print("  ");
    System.out.print(System.currentTimeMillis() - time);
  }
}

