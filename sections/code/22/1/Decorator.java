public class Decorator implements Component {
  private Component component;
  public Decorator(Component component) {
    this.component = component;
  }
  /* 实现业务方法，委派给构件*/
  public void sampleOperation() { component.sampleOperation(); }
}
