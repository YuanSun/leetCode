package reverseStringWithXOR;

public class ReverseString {
    public enum Day {
    	SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
    }
	
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
    
    // See if it works for int type
    public static void ReverseIntArr (int[] intArr) {
    	int start = 0;
    	int end = intArr.length - 1;
    	
    	System.out.print("Before reverse, the array is ");
    	for (int i = 0; i < intArr.length; i++)
    		System.out.print(intArr[i] + " ");
    	System.out.println("");
    	
    	while(start < end) {
    		intArr[start] = intArr[start] ^ intArr[end];
    		intArr[end] = intArr[end] ^ intArr[start];
    		intArr[start] = intArr[start] ^ intArr[end];
    		
    		start++;
    		end--;
    	}
    	
    	System.out.print("After reverse, the array is ");
    	for (int i = 0; i < intArr.length; i++)
    		System.out.print(intArr[i] + " ");
    	System.out.println("");
    }
    
   
}
