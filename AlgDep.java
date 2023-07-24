public class AlgDep extends Algorithm{
    void algDep(String keyword){
        addCmt("being deposited");
        //dr logic:
        if(strOp.hasNameAfter("bank")){
            dr=StrOp.nameAfterKey;
        }
        else{
            addCmt(" into bank");
            dr="Bank a/c";
        }

        //cr logic:
        cr="Cash a/c";

        Journal.setJournal(dr,cr,cmt);
        
    }
}
