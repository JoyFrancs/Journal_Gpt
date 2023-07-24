//import java.util.Arrays;
//import java.util.Scanner;

//import java.util.Arrays;

public class StrOp implements StringOperations {
    static String line;
    static String name = "";
    static String nameAfterKey = "";
    int amt;

    boolean hasNameAfter(String key, String ignore) {
        boolean result = false;
        int lineNo = 3;
        int i;
        for (i = 0; i < X.arrLen - 1; i++) {
            if (X.strArr[i].equals(key)) { // comparing the key to the string array
                nameAfterKey = getName(lineNo, i+1, true);
                //System.out.println(nameAfterKey+" not related to "+ignore+" "+(!strRelated(nameAfterKey,ignore)));
                if (!strRelated(nameAfterKey,ignore) && !nameAfterKey.isEmpty())
                    result = true;
                break;
            }
        }
        // System.out.println(" name after key:" + key + " = " + nameAfterKey);
        return result;
    }

    boolean hasNameAfter(String key){
        return hasNameAfter(key,"1");
    }

    String getName(int lineNo, int start, boolean strictCheck) {
        String name = new String();

        String[] tmp = {};
        if (Files.hasLine(lineNo)) {
            tmp = Files.getinLine(lineNo);
            // System.out.println("tmp= " + Arrays.toString(tmp));

            boolean continuos = true, nameGot = false;
            a: for (int i = start; i < X.arrLen; i++) {
                for (int j = 0; j < tmp.length; j++) {
                     //System.out.println("str1 =" + X.strArr[i] + " str2= " + tmp[j]);
                    if (X.strArr[i].equals(tmp[j])) {
                        // System.out.println(X.strArr[i] + " is equal to " + tmp[j]);
                        if (nameGot) {
                            continuos = false;
                            break a;
                        }

                        continue a;
                    }
                }
                if (continuos) {
                    if (nameGot)
                        name += " ";
                    name = name + X.strArr[i];
                    nameGot = true;

                    // to remove the name from the array
                    RemovStr.atIndex(i);
                    i--;
                }
            }
        }

        return name;
    }

    

    public boolean hasComplete(String s) {
        for (int i = 0; i < X.arrLen; i++) {
            if (s.equals(X.strArr[i])) {
                return true;
            }
        }
        return false;
    }

    // supporting method for unwanted()
    public boolean has(String s) {
        for (int i = 0; i < X.arrLen; i++) {
            if (s.indexOf(X.strArr[i]) >= 0) {
                return true;
            }
        }
        return false;
    }

    public void getString(String s) {
        line = s.trim();
    }

    public String[] getStrArr() {
        lowCase();
        return splitLine();
    }

    public void lowCase() {
        line = line.toLowerCase();
    }

    public String[] splitLine() {
        return line.split(" ");
    }

    public boolean hasOneAmt(String[] s) {
        boolean oneAmt = false;
        for (int i = 0; i < X.arrLen; i++) {
            String tmp = s[i];

            tmp = RemovStr.subStr(tmp, "rs.");
            tmp = RemovStr.subStr(tmp, "rs");

            tmp = (RemovStr.subStr(tmp, ","));
            tmp = (RemovStr.subStr(tmp, "."));

            try {
                if (Character.isDigit(tmp.charAt(0))) {
                    int l = Integer.parseInt(tmp);
                    amt = l;
                    RemovStr.atIndex(i);

                    if (!oneAmt)
                        oneAmt = true;
                    else
                        return false;

                    setAmt();
                    // return true;
                }
            } catch (Exception e) {
            }
        }

        return oneAmt;
    }

    public boolean getName() {
        String[] tmp = {};
        if (Files.hasLine(2)) {
            tmp = Files.getinLine(2);
            // System.out.println("tmp= " + Arrays.toString(tmp));
        }

        boolean continuos = true, nameGot = false;
        a: for (int i = 0; i < X.arrLen; i++) {
            for (int j = 0; j < tmp.length; j++) {
                // System.out.println("str1 =" + X.strArr[i] + " str2= " + tmp[j]);
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
                if (nameGot)
                    name += " ";
                name = name + X.strArr[i];
                nameGot = true;

                // to remove the name from the array
                RemovStr.atIndex(i);
                i--;
            }
        }
        if (name.length() == 1) {
            name = "";
            return false;
        }
        return true;
    }

    public void setAmt() {
        X.amt = this.amt;
    }

    public boolean strRelated(String s, String s2) {
        if (s.length() >= s2.length()) {
            //System.out.println("cond1"+(s.indexOf(s2) >= 0) +" cond2:"+(s2.indexOf(s) >= 0));
            if (s.indexOf(s2) >= 0) {
                return true;
            }
            if (s2.indexOf(s) >= 0) {
                return true;
            }
            else if(s.equals(s2)){
                return true;
            }
        }
        return false;
    }
    
    void printMain() {
        System.out.println("\nMain array: [");
        for (int i = 0; i < X.arrLen; i++) {
            System.out.print(X.strArr[i] + " ");
        }
        System.out.println("]");
    }

}
