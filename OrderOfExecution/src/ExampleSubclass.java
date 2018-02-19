
public class ExampleSubclass extends Example {
  public static int step_3 = step(3);
  {step(8);}
  public int step_8 = step(9);
  
  {step(10);}
  
  static {
    step(4);
  }
  
  { step(11);}
  public ExampleSubclass() {
    step(13);
  }
 
  {step(12);}

  public static void main(String[] args) {
    step(5);
    new ExampleSubclass();
    step(14);
  }
}
