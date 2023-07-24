import java.util.Scanner;
class X{
    static int arrLen;
    static int amt;

    static String[] strArr;
    static String name="";

    static String inp;
    
    public static void main(String[] args){
        try{
        Scanner sc=new Scanner(System.in);
        //Print print =new Print();
        while(true){
        Print.msg("\nEnter the demo string:");

        //string operation class StrOp object creation
        StrOp strOp =new StrOp();

        inp=sc.nextLine();
        strOp.getString(inp);
        strArr=strOp.getStrArr();
        arrLen=strArr.length; //initializing the array length

        //Remove object to be created only when the string array strArr is initialized

        RemovStr removStr = new RemovStr();
        Journal journal =new Journal();
        //Algorithm algorithm =new Algorithm();

        //to break the loop - when one string is entered
        if(arrLen==1) break;

        //creating whether the entered string is a TRANSACTION
        if(strOp.hasOneAmt(strArr) && journal.hasAlgo){

        removStr.unwanted();

        //Print.arr(strArr,arrLen);
    
        strOp.getName();

        System.out.println();

    //    System.out.println("the name is :"+StrOp.name);
    //    Print.msg("amt="+amt+"\n");
        
        journal.begin();
        journal.print();
        StrOp.name="";
        StrOp.nameAfterKey="";
        journal.reset();

        }
        else{
            Print.msg("Sorry, the transaction cannot be recognized.");
        }

        }
        sc.close();
    }
    catch(Exception e){
        System.out.println("Caught error in main");
        e.printStackTrace();
    } 
    }

}