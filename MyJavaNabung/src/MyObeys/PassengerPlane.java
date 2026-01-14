package MyObeys;

//Subclass of Airplane
public class PassengerPlane extends Airplane {

 // Extra field specific to passenger planes
 private int numberOfCrew;

 // Constructor: uses super to call the superclass constructor
 public PassengerPlane(String model, int capacity, int numberOfCrew) {
     super(model, capacity); // Call parent constructor
     this.numberOfCrew = numberOfCrew;
 }

 // Override fly() method (Polymorphism)
 @Override
 public void fly() {
     System.out.println(getModel() + " is flying with " + getCapacity() +
             " passengers and " + numberOfCrew + " crew members.");
 }

 // Getter for numberOfCrew
 public int getNumberOfCrew() {
     return numberOfCrew;
 }

 // Setter for numberOfCrew
 public void setNumberOfCrew(int numberOfCrew) {
     this.numberOfCrew = numberOfCrew;
 }
}
