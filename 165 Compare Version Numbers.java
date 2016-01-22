public class Solution {
    public int compareVersion(String version1, String version2) {
        int i, j; int a= 0; int b= 0;
        for (i= 0; i < version1.length(); i++){
            if (version1.charAt(i) == '.') {
                a= Integer.parseInt(version1.substring(0,i)); 
                break;
            } else if (i == version1.length()-1) { //注意边界处理
                a= Integer.parseInt(version1); 
                break;
            }
        }
        for (j= 0; j < version2.length(); j++){
            if (version2.charAt(j) == '.') {
                b= Integer.parseInt(version2.substring(0,j)); 
                break;
            } else if (j == version2.length()-1) {
                b= Integer.parseInt(version2); 
                break;
            }
        }
        if (a > b) return 1;
        else if (a < b) return -1;
        else if ((version1.length() == 0 || i == version1.length()-1) && j < version2.length()-1) //注意各种情况，长度不同、空串处理
            return compareVersion("", version2.substring(j+1));
        else if (i < version1.length()-1 && (version2.length() == 0 ||j == version2.length()-1))
            return compareVersion(version1.substring(i+1), "");
        else if (i < version1.length()-1 && j < version2.length()-1)
            return compareVersion(version1.substring(i+1), version2.substring(j+1));
        else return 0;
    }
}
