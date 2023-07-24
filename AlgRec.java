public class AlgRec extends Algorithm {
    //handles received,withdrew,drew ,withdraw,withdrawn

    void algRec(String keyword){
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
            dr="Cash a/c";
        }
        //cr logic
        if(strOp.hasNameAfter(keyword)){
            cr=StrOp.nameAfterKey+" a/c";
        }
        else{
            cr=StrOp.name+" a/c";
        }
        Journal.setJournal(dr, cr, cmt);
    }
}
