//alg for paid
public class AlgPad extends Algorithm {

    void algPad(String keyword) {
        addCmt("being paid"+((keyword.equals("paid"))?"":keyword));
        // dr logic
        if (strOp.hasNameAfter(keyword)) {
            dr = StrOp.nameAfterKey + " a/c";
        } else {
            dr = StrOp.name + " a/c";
        }
        // cr logic
        if (strOp.has("credit")) {
            if (!StrOp.name.equals("")) {
                addCmt(" to "+StrOp.name);
                cr = StrOp.name + " a/c";
            } else {
                addCmt(" by credit");
                cr = "Credit a/c";
            }

        } else {
            addCmt(" cash");
            cr = "Cash a/c";
        }
        Journal.setJournal(dr, cr, cmt);
    }
}
