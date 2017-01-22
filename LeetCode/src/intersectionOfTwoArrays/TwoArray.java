package intersectionOfTwoArrays;

import java.util.ArrayList;

public class TwoArray<T> {
	private ArrayList<T> nums1;
	private ArrayList<T> nums2;
	
	public TwoArray(ArrayList<T> nums1, ArrayList<T> nums2) {
		this.nums1 = nums1;
		this.nums2 = nums2;
	}
	
	public ArrayList<T> Intersection() {
		ArrayList<T> intersection = new ArrayList<>();
		
		for(T t : nums1) {
			if(nums2.contains(t))
				intersection.add(t);
		}
		
		return intersection;
	}
	
	public ArrayList<T> Union() {
		ArrayList<T> theUnion = new ArrayList<>();
		theUnion.addAll(nums1);
		for (T t : nums2) {
			if(!nums1.contains(t))
				theUnion.add(t);
		}
		return theUnion;
	}
}
