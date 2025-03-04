package Programs;

public class ReverseString {

	public  String stringReverse(String str) {
		char[] actual=str.toCharArray();
		System.out.print(actual);
		System.out.print(actual.length);
		StringBuilder st = new StringBuilder();
		for(int i=actual.length-1;i>=0;i--) {
		     st.append(actual[i]);
	}
	     return st.toString();

	}
	
	public String reverseStringWithoutFunc(String input) {
		String output = " ";
		for(int i=input.length()-1;i>=0;i--) {
			System.out.println(input.indexOf(i) + " " + input.charAt(i));
			output = output + input.charAt(i);
		}
		
		return output;
	}
	public static void main(String[] args) {
		ReverseString obj1 = new ReverseString();
		ReverseString obj2 = new ReverseString();
		if(obj1.toString().equals(obj2.toString())) {
			System.out.println(obj1 + " "+"is same as"+ obj2);
		}
		else {
			System.out.println(obj1.toString() + " "+"is not same as"+ obj2.toString());

		}

		String s1= "viji";
		String s2= "viji";
		String s3= new String();
		if(s1.equals(s2)) {
			System.out.println(s1 + " "+"is same as"+ s2);
		}
		else {
			System.out.println(s1 + " "+"is not same as"+ s2);

		}
		//String name=ReverseString.stringReverse("Viji");
		//System.out.print(ReverseString.reverseStringWithoutFunc("Rajeshwari"));
		//System.out.print(name);
	}
}
