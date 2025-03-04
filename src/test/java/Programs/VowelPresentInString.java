package Programs;

public class VowelPresentInString {

	public static void checkVowelInString(String str) {
	  char[] a = str.toCharArray();
	  for(int i=0;i<a.length-1;i++) {
		  if(a[i]=='a' ||a[i]=='e' ||a[i]=='i' ||a[i]=='o' ||a[i]=='u') {
			  System.out.print(String.valueOf(i).toCharArray());
			  
		  }
	  }
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VowelPresentInString.checkVowelInString("viji");
	}

}
