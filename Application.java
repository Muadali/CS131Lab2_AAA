package CS131Lab2;


public class Application {
	
	public static void main(String[] args) {
	
		
		Wizard wiz1 =new Wizard ( );
		Wizard wiz2 =new Wizard ( );
		Wizard wiz3 =new Wizard ( );
		Wizard wiz4 =new Wizard ( );
		Wizard wiz5 =new Wizard ( );
		
		
		System.out.println("Wizard name: " + wiz1.getName());
		System.out.println("Wizard key: " + wiz2.getKey());
		System.out.println("Wizard health: " + wiz3.getHealth());
		System.out.println("Wizard locked: " + wiz4.isLocked());
		
		
		
		System.out.println(wiz5.toString());
	
	
	}//end main

}//end class
