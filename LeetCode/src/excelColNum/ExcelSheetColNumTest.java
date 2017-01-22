package excelColNum;

public class ExcelSheetColNumTest {
	public static void main(String[] args) {
		String Col = "aca";
		
		double ColNum = Solution.ExcelColNum(Col);
		
		System.out.println("The column number is " + ColNum);
	}
}
