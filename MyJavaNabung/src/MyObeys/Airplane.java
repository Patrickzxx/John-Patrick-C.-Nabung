package MyObeys;

//Base class representing a general airplane
public class Airplane {

 // Encapsulated fields (private)
 private String model;
 private int capacity;

 // Constructor to initialize the model and capacity
 public Airplane(String model, int capacity) {
     this.model = model;
     this.capacity = capacity;
 }

 // Method that can be overridden (polymorphism)
 public void fly() {
     System.out.println(model + " is flying with " + capacity + " capacity.");
 }

 // Getter for model
 public String getModel() {
     return model;
 }

 // Setter for model
 public void setModel(String model) {
     this.model = model;
 }

 // Getter for capacity
 public int getCapacity() {
     return capacity;
 }

 // Setter for capacity
 public void setCapacity(int capacity) {
     this.capacity = capacity;
 }
}
