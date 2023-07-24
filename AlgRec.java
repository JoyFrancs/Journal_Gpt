public class AlgRec extends Algorithm {
    //handles received,withdrew,drew ,withdraw,withdrawn

    void algRec(String keyword){
        addCmt("being "+keyword);
        //dr logic
        if(strOp.has("credit")){
            if(!StrOp.name.isEmpty()){
                dr="Credit a/c";
            }
            else{
                dr=StrOp.name+" a/c";
            }
        }
        else{
            addCmt(" cash");
            dr="Cash a/c";
        }
        //cr logic
        if(strOp.hasNameAfter(keyword)){        //for conditions like received commission
            cr=StrOp.name+" ";
            cr=cr+StrOp.nameAfterKey+" a/c";
        }
        else if(keyword.equals("withdraw")||keyword.equals("withdrawn")||keyword.equals("withdrew")||keyword.equals("drew")){
            cr="Bank a/c";
        }
        else{
            cr=StrOp.name+" a/c";
        }
        Journal.setJournal(dr, cr, cmt);
    }
}
