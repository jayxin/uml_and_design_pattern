import java.util.Vector;
import java.util.Enumeration;
abstract public class Subject {
  //这个聚集保存了所有对观察者对象的引用
  private Vector observersVector = new java.util.Vector();
  //调用这个方法登记一个新的观察者对象
  public void attach(Observer observer) {
    observersVector.addElement(observer);
    System.out.println("Attached an observer.");
  }
  //调用这个方法删除一个已经登记过的观察者对象
  public void detach(Observer observer) {
    observersVector.removeElement(observer);
  }
  //调用这个方法通知所有登记过的观察者对象
  public void notifyObservers() {
    java.util.Enumeration enumeration = observers();
    while (enumeration.hasMoreElements()) {
      System.out.println("Before notifying");
    ((Observer)enumeration.nextElement()).update();
    }
  }
  //这个方法给出观察者聚集的Enumeration对象
  public Enumeration observers() {
    return ((java.util.Vector) observersVector.clone()).elements();
  }
}
