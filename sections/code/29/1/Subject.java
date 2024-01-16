package com.javapatterns.observer;
public interface Subject {
  //调用这个方法注册\登记一个新的观察者对象
  public void attach(Observer observer);
  //调用这个方法删除一个已经登记的观察者对象
  public void detach(Observer observer);
  //调用这个方法通知所有登记过的观察者对象
  void notifyObservers();
}
