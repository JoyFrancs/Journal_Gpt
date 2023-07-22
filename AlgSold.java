public class AlgSold extends Algorithm {
    
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

        else {
            dr="Cash a/c";
        }
        //cr logic:
        if(strOp.hasNameAfter(keyword,"good")){
            cr=StrOp.nameAfterKey + " a/c";
        }
        else{
            cr="Sales a/c";
        }

        //cmt logic
        addCmt("being sold ");

        if(StrOp.nameAfterKey.isEmpty()){
            addCmt("goods");
        }
        else{
            addCmt(StrOp.nameAfterKey);
        }
        Journal.setJournal(dr,cr,cmt);
    }
    
    void addCmt(String s){
        cmt=cmt+s;
    }
    
}
