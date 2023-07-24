public class AlgPad extends Algorithm {

    void algPad(String keyword) {
        // dr logic
        if (strOp.hasNameAfter(keyword)) {
            dr = StrOp.nameAfterKey + " a/c";
        } else {
            dr = StrOp.name + " a/c";
        }
        // cr logic
        if (strOp.has("credit")) {
            if (!StrOp.name.equals("")) {
                cr = StrOp.name + " a/c";
            } else {
                cr = "Credit a/c";
            }

        } else {
            cr = "Cash a/c";
        }
        Journal.setJournal(dr, cr, cmt);
    }
}
