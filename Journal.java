public class Journal {
    static String dr="",cr="";
    static String cmt="being ";
    static StrOp strOp =new StrOp();

    Algorithm algorithm;
    boolean hasAlgo;
    Journal(){
        algorithm=new Algorithm();
        hasAlgo=algorithm.find();
    }

    void begin(){
        algorithm.execute();
    }
    void print(){
        System.out.println("Journal :"+dr+" Dr To "+cr+" Cr");
        System.out.println("comment:"+cmt);
    }
    static void setDr(String d){
        dr=d;
    }
    static void setCr(String c){
        cr=c;
    }
    void setCmt(String cm){
        cmt=cm;
    }
    static void setJournal(String d,String c,String cm){
        dr=d;
        cr=c;
        cmt=cm;
    }
    void reset(){
        dr="";
        cr="";
        cmt="";
    }
    
}
