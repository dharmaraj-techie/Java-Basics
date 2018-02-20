package package1;

import package2.ClassA;

public class MainClass {

	public static void main(String[] args) {
		System.out.println("Child Refered by a its own refereance variable");
		Child1 child1 = new Child1();
		child1.display();
		child1.child1Method();
		child1.parentMethod();
		child1.ancestormethod();
		
		System.out.println("\nChild Refered by a Parent refereance variable ");
		
		Parent childReferedByParent = new Child1();
		childReferedByParent.display();
		//childReferedByParent.child1Method(); //not allowed
		childReferedByParent.parentMethod();
		childReferedByParent.ancestormethod();
		
		System.out.println("\nChild Refered by a Ancestor refereance variable");
		
		Ancestor childReferedByAncestor = new Child1();
		childReferedByAncestor.display();
//		childReferedByAncestor.child1Method(); //not allowed
//		childReferedByAncestor.parentMethod(); //not allowed
		childReferedByAncestor.ancestormethod();
		
//		Child1 child = new Child2();//not allowed 
		//you can'nt refer using siblings;
		
//		Child2 child2 = (Child2)childReferedByAncestor;
//		child2.display();
		//rutime error
		
		//Child2 child2 = (Child2) new Parent();
	//run time error
		
		
		
	
			
	}
}
