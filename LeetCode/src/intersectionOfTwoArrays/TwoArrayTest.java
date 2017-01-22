package intersectionOfTwoArrays;

import java.util.ArrayList;
import java.util.Arrays;

public class TwoArrayTest {
	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 2, 1));
		ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(2, 3, 2));
		
		TwoArray<Integer> result = new TwoArray<Integer>(list1, list2);
		
		System.out.println("Intersection is " + result.Intersection().toString());
		System.out.println("Union is " + result.Union().toString());
	}

}
