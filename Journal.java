public class Journal {
    String dr="",cr="";
    
    StrOp strOp =new StrOp();

    void algSold(){
        //dr logic:
        if(strOp.has("credit")){
            dr="Credit a/c";
        }
        else if(strOp.has("cash") || StrOp.name==""){
            dr="Cash a/c";
        }
        else {
            dr= StrOp.name+" a/c";
        }
        //cr logic:
        String tmp=strOp.getAccounts()[0];
        if(!tmp.equals("")){
            cr=tmp;
        }
        else{
            cr="Sales a/c";
        }
    }
}
