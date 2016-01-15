public class Solution {
    public String addBinary(String a, String b) {
        String s= "";
        int t= a.length() - b.length();
        if (t >= 0) {
            for (int i= 0; i < t; i++)
                b= "0" + b;
        } else {
            for (int i= 0; i < (0-t); i++)
                a= "0" + a;
        }
        t= 0;
        for (int i= a.length()-1 ; i >= 0; i--) {
            if (t == 1) {
                if (a.charAt(i) == '1' && b.charAt(i) == '1') {
                    s= "1" + s;
                    t= 1;
                } else if (a.charAt(i) == '0' && b.charAt(i) == '0') {
                    s= "1" + s;
                    t= 0;
                } else {
                    s= "0" + s;
                    t= 1;
                }
            } else {
                if (a.charAt(i) == '1' && b.charAt(i) == '1') {
                    s= "0" + s;
                    t= 1;
                } else if (a.charAt(i) == '0' && b.charAt(i) == '0') {
                    s= "0" + s;
                    t= 0;
                } else {
                    s= "1" + s;
                    t= 0;
                }
            }
        }
        if (t == 1) s= "1" + s;
        return s;
    }
}
