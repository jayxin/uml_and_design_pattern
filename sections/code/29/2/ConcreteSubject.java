public class ConcreteSubject extends Subject {
  private String state;
  //调用这个方法更改主题的状态
  public void change(String newState) {
    state = newState;
    this.notifyObservers();
  }
}
