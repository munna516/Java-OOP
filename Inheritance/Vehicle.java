package Inheritance;

public class Vehicle {
   String color;
   int weight;

   Vehicle(String c, int w) {
      color = c;
      weight = w;
   }

   void attribute() {
      System.out.println("Color : " + color);
      System.out.println("Weight : " + weight);
   }
}

class Car extends Vehicle {
   int gear;

   Car(String c, int w, int g) {
      super(c, w);
      gear = g;
   }
   void attribute()
   {
      super.attribute();
      System.out.println("Gear : "+gear);
   }
}
