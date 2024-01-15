package com.javapatterns.flyweight.coffeeshop;
public class Table {
  private int number; //桌子号码
  public Table(int number) { //构造函数
    this.number = number;
  }
  public void setNumber(int number) {
    this.number = number;
  }
  public int getNumber() { return number; }
}
