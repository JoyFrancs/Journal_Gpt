public class AlgPur extends Algorithm {
    void algPur(String keyword) {
        // dr logic
        if (strOp.hasNameAfter(keyword, "goods")) {
            dr = StrOp.nameAfterKey + " a/c";
        } else {
            dr = "Purchase a/c";
        }
        // cr logic 
        if (strOp.has("credit")) {
            if (!StrOp.name.equals("")) {
                cr = StrOp.name+" a/c";
            }
             else {
                cr = "Credit a/c";
            }

        } else {
            cr = "Cash a/c";
        }
        Journal.setJournal(dr, cr, cmt);
    }
}
