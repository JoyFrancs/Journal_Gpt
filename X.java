import java.util.Scanner;
class X{
    static int arrLen;
    static int amt;

    static String[] strArr;
    static String name="";
    
    public static void main(String[] args){
        try{
        Scanner sc=new Scanner(System.in);
        //Print print =new Print();
        while(true){
        Print.msg("\nEnter the demo string:");

        //string operation class StrOp object creation
        StrOp strOp =new StrOp();

        String inp=sc.nextLine();
        strOp.getString(inp);
        strArr=strOp.getStrArr();
        arrLen=strArr.length; //initializing the array length

        //Remove object to be created only when the string array strArr is initialized

        RemovStr removStr = new RemovStr();

        //to break the loop - when one string is entered
        if(arrLen==1) break;

        //creating whether the entered string is a TRANSACTION
        if(strOp.hasOneAmt(strArr)){

        removStr.unwanted();

        //Print.arr(strArr,arrLen);
    
        strOp.getName();

        System.out.println("the name is :"+StrOp.name);
        Print.msg("amt="+amt);
        StrOp.name="";
        
        }
        else{
            Print.msg("The sentence you provided is not an transaction.");
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