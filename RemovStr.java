//import java.util.*;

public class RemovStr {
    static String[] strArr;
    static String[] src;

    
    RemovStr() {
        setRemovSrc();
        strArr=X.strArr;
    }
    

    void setRemovSrc(){
        src=Files.getUnwanted();
    }

    void setRemovSrc(String[] s){
        src=s;
    }

    static String subStr(String str, String sub) {
        if (str.indexOf(sub) >= 0) {

            str = str.replace(sub, "");

        }
        return str;
    }

    static void atIndex(String[] s, int ind) {
        for (int i = ind; i < X.arrLen - 1; i++) {
            s[i] = s[i + 1];
        }
        X.arrLen--;
    }

    void unwanted() {
        setRemovSrc();
        for (int i = 0; i < X.arrLen; i++) {
            if (srcHasComplete(strArr[i])) {
                atIndex(strArr, i--);
            }
        }
    }

    /* 
    void setSrcFromFile() {
        try {
            Scanner sc = new Scanner(Files.rem);
            while (sc.hasNextLine()) {
                src = sc.nextLine().split(" ");
            }
            sc.close();
        } catch (Exception e) {
            System.out.println("Error in setSrcFromFile() while reading");
        }
    }

    void setSrcToLine(String[] sr, int getLine) {
        try {
            Scanner sc = new Scanner(Files.rem);
            int lineNo = 1;
            while (sc.hasNextLine()) {
                if (lineNo == getLine) {
                    sr = sc.nextLine().split(" ");
                }
                if (lineNo > getLine)
                    break;
                lineNo++;
            }
            sc.close();
        } catch (Exception e) {
            System.out.println("Error in setSrcToLine() while trying to read line " + getLine);
        }

    }
    */

    //supporting method for unwanted()
    boolean srcHasComplete(String s) {
        for (int i = 0; i < src.length; i++) {
            if (s.equals(src[i])) {
                return true;
            }
        }
        return false;
    }

    //supporting method for unwanted()
    boolean srcHas(String s) {
        for (int i = 0; i < src.length; i++) {
            if (s.indexOf(src[i]) >= 0) {
                return true;
            }
        }
        return false;
    }
}
