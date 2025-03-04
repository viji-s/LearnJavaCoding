package Programs;

public class SumOfArray {
int a=10;
int b=20;
static int c=30;

public void m1() {
	System.out.println(a +" "+ b+ " "+ c);
	int[] ar= {24,68,99,80,89,890};
    int arr=sumOfArray(ar, 0);
   // System.out.println(arr);
}
	
	public static void sumOfArray(int[] a , int sum) {

		//int[] arr= {2,4,6,7,8};
		for(int i=0; i<a.length;i++) {
			 sum = sum + a[i];
		}
		System.out.println(sum);
	
	}
	
	public static void searchSpecificNumberInArray(int[] a , int b) {
		int count=1;
		for(int i=0;i<a.length;i++) {
			if(a[i]==b) {
				System.out.println("Value is found "+ a[i]+" "+ "in iteration" +count);
				break;
			}
			else {
				System.out.println("Value is not found in iteration" +count);
				count++;
			}
		}		
		
		
	}
	public static void main(String[] args) {
		int[] a= {100,200,300,400,500};
		//SumOfArray.sumOfArray(a, 0);
		new SumOfArray().m1();
		//SumOfArray.searchSpecificNumberInArray(a, 400);
	}

}
