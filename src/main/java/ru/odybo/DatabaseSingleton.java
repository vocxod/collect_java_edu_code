package ru.odybo;

class Database {

  // https://www.programiz.com/java-programming/singleton
  // Singleton is a design pattern rather than a feature specific to Java. 
  // A design pattern is like our code library that includes various coding 
  // techniques shared by programmers around the world.
  //
  // First sing of SINGLETON - 
  // 1) It has a private static property of its own object class.
   private static Database dbObject;

   // 2) It has a private constructor. It blocks the creation of a class object from the outside.
   private Database() {      
   }

   // 3) This method only returns a reference to this object as a static property
   public static Database getInstance() {

      // create object if it's not already created
      if(dbObject == null) {
         dbObject = new Database();
      }

       // returns the singleton object
       return dbObject;
   }

   public void getConnection() {
       System.out.println("You are now connected to the database.");
   }
}

class DatabaseSingleton {
   public static void main(String[] args) {
     // In the Singleton approach, we can only define the value of the singleton class to access it.
      Database db1; 
      
      // refers to the only object of Database
      db1= Database.getInstance();
      
      db1.getConnection();
   }
}
