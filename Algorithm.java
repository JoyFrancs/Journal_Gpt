import java.util.Arrays;

public class Algorithm extends AlgoMap {

    String dr = "", cr = "", cmt = "";
    StrOp strOp = new StrOp();

    int algNo;
    String keyword;

    boolean find() {
        boolean result = false;
        for (int i = 0; i < X.arrLen; i++) {
            Integer integer = map.get(X.strArr[i]);
            if (integer != null) {
                
                if (result) {
                    result = false;
                    break;
                }
                algNo = integer.intValue();
                keyword = X.strArr[i];
                result = true;
            }
        }
        return result;
    }

    void execute() {
        switch (algNo) {
            case 1:
                //System.out.println(keyword + " is redirected to sales algorithm");
                new AlgSold().algSold(keyword);
                break;
            case 2:
                //System.out.println(keyword + " is redirected to capital algorithm");
                new AlgCap().algCap(keyword);
                break;
            case 3:
                //System.out.println(keyword + " is redirected to deposit algorithm");
                new AlgDep().algDep(keyword);
                break;
            case 4:
                //System.out.println(keyword + " is redirected to purchase algorithm");
                new AlgPur().algPur(keyword);
                break;
            case 5:
                //System.out.println(keyword + " is redirected to paid algorithm");
                new AlgPad().algPad(keyword);
                break;
            case 6:
                //System.out.println(keyword + " is redirected to received algorithm");
                new AlgRec().algRec(keyword);
                break;
            case 7:
                //System.out.println(keyword + " is redirected to return algorithm");
                new AlgRet().algRet(keyword);
                break;
            case 8:
                //System.out.println(keyword + " is redirected to settled algorithm");
                new AlgSet().algSet(keyword);
                break;
            default:
                System.out.println("error in key values of key " + keyword);
        }
    }

    void addCmt(String s) {
        cmt = cmt + s;
    }

}

class AlgRet extends Algorithm {
    void algRet(String keyword) {
        addCmt("being returned "+(strOp.hasNameAfter(keyword)?StrOp.nameAfterKey:""));
        if (!X.inp.split(" ")[0].equalsIgnoreCase(StrOp.name)) {
            // dr logic
            //System.out.println("Str input =" + X.inp);
            if (strOp.has("Credit")) {
                dr = "Credit a/c";
            } else if (strOp.has("cash") || StrOp.name.isEmpty()) {
                dr = "Cash a/c";
            } else {
                addCmt(" to "+StrOp.name );
                dr = StrOp.name + " a/c";
            }
            // cr logic
            
            if (strOp.has("goods")) {
                cr = "Purchase Return a/c";
                
            } else {
                cr = "Return a/c";
            }
            
        } else {

            // dr logic
            dr = "return sales a/c";

            // cr logic
            if (strOp.has("Credit")) {
                cr = "Credit a/c";
            } else if (strOp.has("cash") || StrOp.name.isEmpty()) {
                cr = "Cash a/c";
            } else {
                addCmt(" to "+StrOp.name );
                cr = StrOp.name + " a/c";
            }

        }
        Journal.setJournal(dr, cr, cmt);
    }
}

class AlgSet extends Algorithm {
    void algSet(String keyword) {
        // cmt begin
        addCmt("being settled");

        // dr logic
        dr = "Cash a/c";

        // dr logic
        if (StrOp.name.isEmpty()) {
            dr = "Settlement a/c";
        } else {
            dr = StrOp.name + " a/c";
            addCmt(" to " + StrOp.name);
        }
        
        Journal.setJournal(dr, cr, cmt);
    }
}