package ru.odybo;

class Animal {
  
  public String toString(){
    return "животное";
  }
}

// put this class in different Dog.java file
public class Dog extends Animal {

  public String type;
  private String color;
  private int age;

  Dog(){
    this.type = "Дворняга";
    this.age = 1;
  }

  Dog(String sType){
    this.type = sType;
    this.age = 2;
  }

  Dog(int iAge){
    this.age = iAge;
  }

  public void display() {
    System.out.println("Моя порода: " + this.type);
  }

  public String getType(){
    return "Порода: " + this.type;
  }

}


