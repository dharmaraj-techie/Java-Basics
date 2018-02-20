package package1;
public class Parent extends Ancestor {
	 
	protected void display(String s){
		 System.out.println("hi i am your Parent "+s);
	 }
	
	void parentMethod(){
		System.out.println("this Parent specific method");
	}
}
