public class Print extends Thread {
    static void arr(String[] s){
        for(String i:s){
            System.out.print(i+" ");
        }
        //System.out.println();
    }

    static void arr(String[] s, int ind){
        for(int i=0;i<ind;i++){
            System.out.print(s[i]+" ");
        }
        //System.out.println();
    }

    static void msg(String s){
        try{
            for(int i=0;i<s.length();i++){
                System.out.print(s.charAt(i));
                Thread.sleep(25);
            }
        }
        catch(Exception e){
            System.out.println("Exception in Print.java in txt");
        }
    }
}
