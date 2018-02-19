
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println("This is main class ");
			
			OuterClass outerClassObject = new OuterClass();
			outerClassObject.outerClassMethod();
	}
}

 class OuterClass{
	public void outerClassMethod(){
		System.out.println("This is outer class");
	}
}

