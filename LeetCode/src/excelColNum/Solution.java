package excelColNum;

public class Solution {
	public static double ExcelColNum(String Col) {
		Col = Col.toUpperCase();
		double num = 0;
		int length = Col.length(); 
		for (int i = 0; i < length; i++)
			num = (num + (Col.charAt(length - i - 1) - 'A' + 1) * Math.pow(26, i));		
	 	return num;
	}
}
