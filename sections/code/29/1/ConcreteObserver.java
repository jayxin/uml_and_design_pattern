public class ConcreteObserver implements Observer {
  public void update() { //调用这个方法会更新自己
    System.out.println("I am notified.");
  }
}
