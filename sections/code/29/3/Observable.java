package java.util;
public class Observable {
  private boolean changed = false;
  private Vector obs;
  //构造子,用零个观察者构造一个被观察者
  public Observable() { obs = new Vector(); }
  //将一个观察者加到观察者聚集上面
  public synchronized void addObserver(Observer o) {
    if (o == null) throw new NullPointerException();
    if (!obs.contains(o)) {
      obs.addElement(o);
    }
  }
  //将一个观察者对象从观察者聚集上删除
  public synchronized void deleteObserver(Observer o) {
    obs.removeElement(o);
  }
  //相当于notifyObservers(null)
  public void notifyObservers() { notifyObservers(null); }
  /**
   * 若本对象有变化(那时hasChanged方法会返回true)
   * 调用本方法通知所有登记的观察者,即调用它们的update()方法,
   * 传入参数this和arg作为参数
   */
  public void notifyObservers(Object arg) {
    //临时存放当前的观察者的状态,参见备忘录模式
    Object[] arrLocal;
    synchronized (this) {
      if (!changed)   return;
      arrLocal = obs.toArray();
      clearChanged();
    }
    for (int i = arrLocal.length-1; i >= 0; i--)
      ((Observer)arrLocal[i]).update(this, arg);
  }
  //将观察者聚集清空
  public synchronized void deleteObservers() { obs.removeAllElements(); }
  //将“已变化”设为true
  protected synchronized void setChanged() { changed = true; }
  //将已变化重置为false
  protected synchronized void clearChanged() { changed = false; }
  //检测本对象是否已变化
  public synchronized boolean hasChanged() { return changed; }
  //返回被观察对象的观察者总数
  public synchronized int countObservers() { return obs.size(); }
}
