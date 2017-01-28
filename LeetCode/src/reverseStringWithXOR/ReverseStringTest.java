package reverseStringWithXOR;

import enumTest.Directions;

public class ReverseStringTest {
    public static void main(String[] args) {
        char num1 = 'C';
        char num2 = 'D';
        
        String str = "Leveal";
        
        
        num1 = (char) (num1 ^ num2);
        num2 = (char) (num2 ^ num1);
        num1 = (char) (num1 ^ num2);
        
        
        String result = ReverseString.ReverseString(str);
        System.out.println("Result is " + result);
       
        int[] intArr = {-2, -1, 0, 4, 9, 23, 27};
        
        ReverseString.ReverseIntArr(intArr);
        
        
        /**
         * Test on enums
         */
        Directions dir = Directions.SOUTH;
        //when the enum is called, the constructor is called automatically 
        // to assign String value to the constants
        System.out.println(dir.getDirectionCode());
        System.out.println(dir.ordinal());
    }
}
