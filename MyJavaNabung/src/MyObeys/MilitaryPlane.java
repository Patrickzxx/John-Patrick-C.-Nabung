package MyObeys;

//Another subclass of Airplane
public class MilitaryPlane extends Airplane {

 // Extra field for military use
 private boolean hasWeapons;

 // Constructor
 public MilitaryPlane(String model, int capacity, boolean hasWeapons) {
     super(model, capacity);
     this.hasWeapons = hasWeapons;
 }

 // Override fly() method (Polymorphism)
 @Override
 public void fly() {
     String weaponStatus = hasWeapons ? "armed" : "unarmed";
     System.out.println(getModel() + " (military) is flying " + weaponStatus + 
         " with capacity " + getCapacity());
 }

 // Getter for hasWeapons
 public boolean hasWeapons() {
     return hasWeapons;
 }

 // Setter for hasWeapons
 public void setHasWeapons(boolean hasWeapons) {
     this.hasWeapons = hasWeapons;
 }
}
