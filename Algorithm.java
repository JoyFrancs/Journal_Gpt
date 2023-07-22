public class Algorithm extends AlgoMap {

    String dr="",cr="",cmt="";
    StrOp strOp=new StrOp();

    int algNo;
    String keyword;
    
    boolean find(){
        for(int i=0;i<X.arrLen;i++){
            Integer integer = map.get(X.strArr[i]);
            if(integer!=null){
                algNo= integer.intValue();
                keyword=X.strArr[i];
                return true;
            }
        }
        return false;
    }

    void execute(){
        switch(algNo){
            case 1:
            System.out.println(keyword+" is redirected to sales algorithm");
            new AlgSold().algSold(keyword);
            break;
            case 2:
            System.out.println(keyword+" is redirected to capital algorithm");
            new AlgCap().algCap(keyword);
            break;
            case 3:
            System.out.println(keyword+" is redirected to deposit algorithm");
            new AlgDep().algDep(keyword);
            break;
            case 4:
            System.out.println(keyword+" is redirected to purchase algorithm");
            new AlgPur().algPur(keyword);
            break;
            default:
            System.out.println("error in key values of key "+keyword);
        }
    }

}
