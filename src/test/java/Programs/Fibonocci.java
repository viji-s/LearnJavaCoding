package Programs;

public class Fibonocci {
	
	public static void fib(int prev, int cur , int n) {
		for(int i=1;i<=n;i++) {
			int fib=prev +cur;
			System.out.println(fib);
			cur=prev;
			prev=fib;
			
		}
	}

	public static void main(String[] args) {
		Fibonocci.fib(0, 1, 50);
	}

}
