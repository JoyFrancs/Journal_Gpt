public class Verify {
    boolean hasOneTransaction(){
        String[] key =Files.getinLine(3);
        StrOp strOp = new StrOp();
        boolean result =false;

            for(int j=0;j<key.length;j++){
                if(strOp.hasComplete(key[j])){
                    if(!result) result=true;
                    else return false;
                }
            }
            return result;
        
    }
}
