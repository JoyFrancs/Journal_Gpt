//algorithm pur chase
public class AlgPur extends Algorithm {
    void algPur(String keyword) {
        addCmt("being "+keyword);
        // dr logic
        if (strOp.hasNameAfter(keyword, "goods")) {
            //addCmt(" "+StrOp.nameAfterKey);
            dr = StrOp.nameAfterKey + " a/c";
        } else {
            dr = "Purchase a/c";
        }
        // cr logic
        if (strOp.has("credit")) {
            addCmt(" for credit");
            if(!StrOp.name.isEmpty()){
                cr=StrOp.name+" a/c";
            }
            else{
            cr = "Credit a/c";
            }
        } 
        else if (strOp.has("cash") || StrOp.name.equals("")) {
            addCmt(" for cash");
            cr = "Cash a/c";
        } 
        else {
            cr = StrOp.name + " a/c";
        }

        Journal.setJournal(dr, cr, cmt);
    }
}
