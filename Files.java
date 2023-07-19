import java.io.*;
//import java.util.Arrays;
import java.util.Scanner;

public class Files {
    static File rem = new File("D:\\JavaPro\\ProjectX\\unwanted.txt");

    static String[] getUnwanted() {
        String[] src = getinLine(1);
        // System.out.println("unwanted s="+Arrays.toString(src));
        /* 
        try {
            Scanner scan = new Scanner(Files.rem);
            while (scan.hasNextLine()) {
                src = scan.nextLine().split(" ");
            }
            scan.close();
        } catch (Exception e) {
            System.out.println("Error in setSrcFromFile() while reading");
        }
        */
        return src;
    }

    static String[] getinLine(int getLine) {
        String[] sr={};
        try {

            Scanner scn = new Scanner(Files.rem);
            int lineNo = 0;
            while (scn.hasNextLine()&&lineNo<getLine) {
                lineNo++;
                if (lineNo == getLine) {
                    sr = scn.nextLine().split(" ");
                    break;
                }
                /* 
                if (lineNo >= getLine)
                    break;
                    */
                
                scn.nextLine();
            }
            scn.close();
        } catch (Exception e) {
            System.out.println("Error in setSrcToLine() while trying to read line " + getLine);
        }
        return sr;
    }

    static boolean hasLine(int line){
        try {

            Scanner sc = new Scanner(Files.rem);
            int lineNo = 0;
            while (sc.hasNextLine()&&lineNo<line) {
                lineNo++;
                if(lineNo==line){
                    String[] s=sc.nextLine().split(" ");
                    if(s.length ==0){
                        sc.close();
                        return false;
                    }
                    else{
                        sc.close();
                        //System.out.println("s="+Arrays.toString(s));
                       return true;
                    }
                }
                sc.nextLine(); 
                }
                sc.close(); 
                //System.out.println("pllayings linNo="+lineNo);
            }
         catch (Exception e) {
            System.out.println("Error in hasLine() while trying to read line " + line);
        }
        return false;
    } 

}
