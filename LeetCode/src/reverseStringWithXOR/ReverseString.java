package reverseStringWithXOR;

public class ReverseString {
    
    public static String ReverseString(String str2rev) {
        char[] strArr = str2rev.toCharArray();
        
        int start = 0;
        int end = strArr.length - 1;
        
        while(start < end) {
            strArr[start] =(char) (strArr[start] ^ strArr[end]);
            strArr[end] = (char) (strArr[end] ^ strArr[start]);
            strArr[start] =(char) (strArr[start] ^ strArr[end]);
            
            start++;
            end--;
            
        }
        
        String result = new String(strArr);
        
        return new String(result);
    }
}
