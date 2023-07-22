public class AlgDep extends Algorithm{
    void algDep(String keyword){
        //dr logic:
        if(strOp.hasNameAfter("bank")){
            dr=StrOp.nameAfterKey;
        }
        else{
            dr="Bank a/c";
        }

        //cr logic:
        cr="Cash a/c";

        Journal.setJournal(dr,cr,cmt);
        
    }
}
