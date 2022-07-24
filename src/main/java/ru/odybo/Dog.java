package ru.odybo;

class Animal {
}

// put this class in different Dog.java file
public class Dog extends Animal {

  public String type;

  Dog(){
    this.type = "Дворняга";
  }

  Dog(String sType){
    this.type = sType;
  }

  public void display() {
    System.out.println("I am a dog.");
  }

  public String toStrig(){
    return "Тип собаки: " + this.type;
  }

}


