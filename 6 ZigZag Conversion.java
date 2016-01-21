/*其实每个zigzag是2*m-2个字符,m是结果的行的数量。
接下来就是对于每一行先把往下走的那一列的字符加进去，然后有往上走的字符再加进去即可。
时间复杂度是O(n),空间复杂度是O(1)*/
public class Solution {
    public String convert(String s, int numRows) {
        if(s == null || s.length()==0 || numRows <=0) return "";  
        if(numRows == 1 || s.length() == 1) return s;  
        String res = "";  
        int size = 2*numRows-2;  
        for(int i=0;i<numRows;i++) {  
            for(int j=i;j<s.length();j+=size) {  
                res= res.concat(String.valueOf(s.charAt(j)));  
                if(i!=0 && i!=numRows-1 && j+size-2*i<s.length())  
                    res = res.concat(String.valueOf(s.charAt(j+size-2*i)));  
            }                     
        }  
        return res; 
    }
}

/*用StringBuilder更快哟
public String convert(String s, int nRows) {  
    if(s == null || s.length()==0 || nRows <=0)  
        return "";  
    if(nRows == 1)  
        return s;  
    StringBuilder res = new StringBuilder();  
    int size = 2*nRows-2;  
    for(int i=0;i<nRows;i++)  
    {  
        for(int j=i;j<s.length();j+=size)  
        {  
            res.append(s.charAt(j));  
            if(i!=0 && i!=nRows-1 && j+size-2*i<s.length())  
                res.append(s.charAt(j+size-2*i));  
        }                  
    }  
    return res.toString();  
}*/
