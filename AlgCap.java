public class AlgCap extends Algorithm{
    void algCap(String keyword){
        addCmt("being "+((keyword.equals("capital"))?"started":keyword)+" business");
        //dr logic:
        if(strOp.has("credit")){
            dr="Credit a/c";
        }
        else {
            dr="Cash a/c";
        }

        //cr logic:
        if(!StrOp.name.isEmpty()){
            cr=StrOp.name+"'s ";
        }
        cr=cr+"Capital a/c";

        Journal.setJournal(dr, cr, cmt);
    }
}
