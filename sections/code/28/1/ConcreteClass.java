public class ConcreteClass extends AbstractClass {
  protected void doOperation1() {
    System.out.println("doOperation1();");
  }
  protected void doOperation2() {
    System.out.println("doOperation2();");
  }
  //The following should not happen:
  //doOperation3();
}
