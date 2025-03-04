package Programs;

import Selenium.AmazonLoginPage;

public class HomePage extends BaseClass {
	
	double cofeePrice=50.5;
	String cofeeName = "Filter coffe";
	int a ,b=10;		
	public HomePage(int a ,int b) {
		super(a,b);
	}
	
	public void show() {
		System.out.print(cofeeName + " "+cofeePrice);
	}
	
    public static void main(String[] args) {
    	//LoginPage home = new HomePage();
      	HomePage house = new HomePage(3,5);

    }
			
}
