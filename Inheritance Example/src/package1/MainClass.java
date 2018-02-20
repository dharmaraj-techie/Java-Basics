package package1;

import package2.ClassA;

public class MainClass {

	public static void main(String[] args) {
		
		Parent parent = new Parent();
		parent.display();
		parent.display("sdkjhfjd");
		
	
	Ancestor parentReferedAncestor = new Parent();
	

	parentReferedAncestor.display();
	//parentReferedAncestor.display("dkjfhgljds");//error
			
	}
}
