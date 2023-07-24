public class AlgSold extends Algorithm {

    void algSold(String keyword) {
        // dr logic:
        if (strOp.has("credit")) {
            if(!StrOp.name.isEmpty()){
                dr=StrOp.name+" a/c";
            }
            else{
            dr = "Credit a/c";
            }
        } else if (strOp.has("cash") || StrOp.name.equals("")) {
            dr = "Cash a/c";

        } else {
            dr = StrOp.name + " a/c";
        }
        // cr logic:
        if (strOp.hasNameAfter(keyword, "good")) {
            cr = StrOp.nameAfterKey + " a/c";
        } else {
            cr = "Sales a/c";
        }

        // cmt logic
        addCmt("being sold ");

        if (StrOp.nameAfterKey.isEmpty()) {
            addCmt("goods");
        } else {
            addCmt(StrOp.nameAfterKey);
        }
        Journal.setJournal(dr, cr, cmt);
    }


}
