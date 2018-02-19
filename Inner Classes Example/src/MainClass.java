
public class MainClass {
	static int i=2;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println("This is main class ");
	
			OuterClass outerClassObject = new OuterClass();
			outerClassObject.outerClassMethod();
			outerClassObject.outerClassMethod("called from main class");
			
			OuterClass.InnerClass innerClassObj = outerClassObject.new InnerClass();
			innerClassObj.innerClassMethod();
			
			innerClassObj.callOuterClassMethodFromInnerClass();
		
	}
}

 

