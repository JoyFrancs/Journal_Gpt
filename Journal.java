public class Journal {
    String dr="",cr="";
    String cmt="being ";
    StrOp strOp =new StrOp();

    void algSold(String keyword){
        //dr logic:
        if(strOp.has("credit")){
            if(StrOp.name.equals("")){
            dr="Credit a/c";
            }
            else{
                dr= StrOp.name+" a/c";
            }
        }
        //else if(strOp.has("cash") || StrOp.name==""){
          //  dr="Cash a/c";
        //}
        else {
            dr="Cash a/c";
        }
        //cr logic:
         //String tmp=strOp.getAccounts()[0];
        if(strOp.hasNameAfter(keyword,"goods")){
            cr=StrOp.nameAfterKey + " a/c";
        }
        else{
            cr="Sales a/c";
        }

        //cmt logic
        addCmt("sold ");

        if(StrOp.nameAfterKey.isEmpty()){
            addCmt("goods");
        }
        else{
            addCmt(StrOp.nameAfterKey);
        }
    }

    void addCmt(String s){
        cmt=cmt+s;
    }
}
