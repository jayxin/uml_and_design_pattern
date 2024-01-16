package com.javapatterns.observer;
import java.util.Vector;
import java.util.Enumeration;
public class ConcreteSubject implements Subject {
  private Vector observersVector = new java.util.Vector();
  public void attach(Observer observer) { //注册
    observersVector.addElement(observer);
  }
  public void detach(Observer observer) {
    observersVector.removeElement(observer);
  }
  public void notifyObservers() {
    java.util.Enumeration enumeration = observers();
    while (enumeration.hasMoreElements()) {
      ((Observer)enumeration.nextElement()).update();
    }
  }
  public Enumeration observers() {
    return ((java.util.Vector) observersVector.clone()).elements();
  }
}
