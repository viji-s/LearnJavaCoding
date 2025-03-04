package Programs;

public class CharacterRepetionCountInString {
	
	public static void CountCharacterInString(String str ,char find) {
		int startFrom=0;
		int count=0;
		for(;;) {
		int index=str.indexOf(find, startFrom);
				if(index>0) {
					count ++;
					startFrom =index + 1;
				}
				
				else {
					System.out.println("Character o not found");
					break;
				}
			
		}
		System.out.println("In the String: "+ str);   
		System.out.println("The 'e' character has come "+ count + " times"); 
		
	}
	public static void main(String[] args) {
		CharacterRepetionCountInString.CountCharacterInString("welcome to java" , 'o');
		
	}

}
