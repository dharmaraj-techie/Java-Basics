
public class MainClass {
	static int i=2;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			OuterClass outerClassObject = new OuterClass();
			outerClassObject.outerClassMethod();
			outerClassObject.outerClassMethod("called from main class");
			
			OuterClass.InnerClass innerClassObj = outerClassObject.new InnerClass();
			innerClassObj.innerClassMethod();
			innerClassObj.callOuterClassMethodFromInnerClass();	
			
			OuterClass.InnerStaticClass.innerClassStaticMethod();
			
			//inner static class doesnot need any instance of the outerclass to create it
			OuterClass.InnerStaticClass innerStaticClass = new OuterClass.InnerStaticClass();
			innerStaticClass.innerClassNonStaticMethod();
	}
}

 

