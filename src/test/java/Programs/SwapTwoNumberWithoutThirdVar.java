package Programs;

public class SwapTwoNumberWithoutThirdVar {

	public static void swapNumbers(int a ,int b) {
		b=b+a;
		a=b-a;
		b=b-a;
		System.out.print(a +"    "+ b);
		
		
	}
	public static void main(String[] args) {
		SwapTwoNumberWithoutThirdVar.swapNumbers(1, 2);
	}

}
