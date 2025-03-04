package Programs;

public class SwapTwoNumber {
	
	public static void  SawpingNumbersWihoutUisngThirdVariable(int a , int b) {
		 a=a+b;
		 b=a-b;
		 a=a-b;
		 System.out.print(a + " "+b);
		
	}
	
	public static void swapingTwoNumberWithThirdVariable(int a ,int b) {
		int c=a;
		a=b;
		b=c;
		System.out.print(a + " "+b);
	}
	
	public static void main(String[] args) {
		
		SwapTwoNumber.SawpingNumbersWihoutUisngThirdVariable(45, 7);
		SwapTwoNumber.swapingTwoNumberWithThirdVariable(35,51);
	}

}
