//import java.util.Arrays;
//import java.util.Scanner;

//import java.util.Arrays;

public class StrOp {
    static String line;
    static String name = "";

    int amt;

    void getString(String s) {
        line = s.trim();
    }

    String[] getStrArr() {
        lowCase();
        return splitLine();
    }

    void lowCase() {
        line = line.toLowerCase();
    }

    String[] splitLine() {
        return line.split(" ");
    }

    boolean hasOneAmt(String[] s) {
        boolean oneAmt = false;
        for (int i = 0; i < X.arrLen; i++) {
            String tmp = s[i];

            tmp = RemovStr.subStr(tmp, "rs.");
            tmp = RemovStr.subStr(tmp, "rs");
            
            tmp = (RemovStr.subStr(tmp, ","));
            tmp = (RemovStr.subStr(tmp, "."));

            try {
                if ( Character.isDigit(tmp.charAt(0))) {
                    int l = Integer.parseInt(tmp);
                    amt = l;
                    RemovStr.atIndex(s, i);
                    
                    if(!oneAmt)
                     oneAmt=true;
                    else 
                     return false;

                     setAmt();
                    //return true;
                }
            } catch (Exception e) {
            }
        }

        return oneAmt;
    }

    boolean getName() {
        String[] tmp = {};
        if (Files.hasLine(2)) {
            tmp = Files.getinLine(2);
            //System.out.println("tmp= " + Arrays.toString(tmp));
        }

        boolean continuos = true, nameGot = false;
        a: for (int i = 0; i < X.arrLen; i++) {
            for (int j = 0; j < tmp.length; j++) {
                //System.out.println("str1 =" + X.strArr[i] + " str2= " + tmp[j]);
                if (strRelated(X.strArr[i], tmp[j])) {
                   // System.out.println(X.strArr[i] + " is equal to " + tmp[j]);
                    if (nameGot) {
                        continuos = false;
                        break a;
                    }

                    continue a;
                }
            }
            if (continuos) {
                if(nameGot) name+=" ";
                name = name + X.strArr[i];
                nameGot = true;
            }
        }
        if(name.length()==1){
            name="";
            return false;
        }
        return true;
    }

    void setAmt() {
        X.amt = this.amt;
    }

    boolean strRelated(String s, String s2) {
        if (s.length() >= s2.length()) {
            if (s.indexOf(s2) >= 0) {
                return true;
            }
            if (s2.indexOf(s) >= 0) {
                return true;
            }
        }
        return false;
    }

}
