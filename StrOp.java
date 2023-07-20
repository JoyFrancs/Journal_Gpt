//import java.util.Arrays;
//import java.util.Scanner;

//import java.util.Arrays;

public class StrOp implements StringOperations{
    static String line;
    static String name = "";

    int amt;

    public boolean hasComplete(String s) {
        for (int i = 0; i < X.arrLen; i++) {
            if (s.equals(X.strArr[i])) {
                return true;
            }
        }
        return false;
    }

    //supporting method for unwanted()
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
                    RemovStr.atIndex(s, i);

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
            if (s.indexOf(s2) >= 0) {
                return true;
            }
            if (s2.indexOf(s) >= 0) {
                return true;
            }
        }
        return false;
    }

    public String[] getAccounts() {
        String[] ac = {}, acName = {};
        String[] acc = { "empty", "empty" };
        int lineN0 = 3;
        if (Files.hasLine(lineN0)) {
            ac = Files.getinLine(lineN0);
            if (Files.hasLine(lineN0 + 1))
                acName = Files.getinLine(lineN0 + 1);
        }

        // System.out.println("Line 3= "+Arrays.toString(ac));
        // System.out.println("Line 4= "+Arrays.toString(acName));

        if (ac.length == acName.length) {

            for (int i = 0; i < X.arrLen; i++) {
                for (int j = 0; j < ac.length; j++) {
                    // System.out.println("main string: "+X.strArr[i]+" cmp 2 "+ac[j]);
                    if (X.strArr[i].equals(ac[j])) {
                        if (acc[0].equals("empty"))
                            acc[0] = acName[j] + " a/c";
                        else
                            acc[1] = acName[j] + " a/c";
                        break;
                    }
                }
                if (!acc[1].equals("empty"))
                    return acc;
            }
            if (acc[1].equals("empty"))
                acc[1] = name + " a/c";

        } else {
            System.out.println("File Source reference are unequal");
        }

        return acc;
    }

}
