package main;

import java.io.*;
import java.util.Scanner;

public class file{
    public static  void main (String[]args )  {

        try {
            BufferedWriter bfw = new BufferedWriter
                    (new FileWriter("/Users/abdo/Documents/GitHub/Ethical Hacking/src/main/a.txt"));

            BufferedReader bfr = new BufferedReader(
                    new FileReader("/Users/abdo/Documents/GitHub/Ethical Hacking/src/main/a.txt"));
            String s;

            while ((s = bfr.readLine()) != null){
                bfw.write(s + "\n");

            }
            bfw.write("Hello\n");
            bfw.write("Hello\n");
            bfw.write("Hello\n");
            bfw.write("Hello\n");
            bfw.close();
            bfr.close();


        }catch(Exception e){
            return;
        }
  /*      PrintWriter p = null;

        //File f = new File("a.txt");

        //FileOutputStream out = new FileOutputStream(f , true);
        //p = new PrintWriter(out);
//        p.println("Hello");
//            System.out.println("hello ");
//
//        p.flush(); // it forces java data to its distination
//            p.close();
//

        try {
            File f = new File("a.txt");
            FileInputStream input = new FileInputStream(f);
            Scanner s = new Scanner(System.in);
            while(read.hasNext){

        }catch ()
*/
}}
