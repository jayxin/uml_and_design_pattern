//重构的最后结果
public abstract class AbstractClass {
  public void bigMethod() {
    step1();
    step2();
    newMethod();
  }
  private final void step1() {/*原来的代码块1*/}
  private final void step2() {/*原来的代码块2*/}
  protected abstract void newMathod();
}

public class ConcreteClass extends AbstractClass {
  public void newMethod() {/*原来的代码块3*/}
}

public class ConcreteClass2 extends AbstractClass {
  public void newMethod() {/*原来的代码块4*/}
}

public class ConcreteClass3 extends AbstractClass {
  public void newMethod() {/*原来的代码块5*/}
}
