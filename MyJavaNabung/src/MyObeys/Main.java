package MyObeys;

//Main class to test everything
public class Main {
 public static void main(String[] args) {

     // Create a generic airplane object
     Airplane genericPlane = new Airplane("Generic Jet", 150);
     genericPlane.fly(); // Calls base method

     // Create a passenger plane object
     PassengerPlane passengerPlane = new PassengerPlane("Boeing 777", 396, 12);
     passengerPlane.fly(); // Calls overridden method in PassengerPlane

     // Create a military plane object
     MilitaryPlane fighterJet = new MilitaryPlane("F-22 Raptor", 1, true);
     fighterJet.fly(); // Calls overridden method in MilitaryPlane

     // Use polymorphism with base class reference
     Airplane polyPlane;

     polyPlane = passengerPlane;
     polyPlane.fly(); // Still calls PassengerPlane's fly()

     polyPlane = fighterJet;
     polyPlane.fly(); // Calls MilitaryPlane's fly()
 }
}
