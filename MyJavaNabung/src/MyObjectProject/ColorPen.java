package MyObjectProject;

public class ColorPen {
    public static void main(String[] args) {
        // Create a new BallPen object
        BallPen myPen = new BallPen("Pilot", "Blue", "Ballpoint", false, 50);

        // Print details of the pen
        myPen.printDetails();
        
        // Write with the pen
        myPen.write();
        
        // Toggle cap (uncap the pen)
        myPen.toggleCap();
        
        // Try writing again
        myPen.write();

        // Refill the pen
        myPen.refill();
        
        // Write again after refilling
        myPen.write();

        // Print final details
        myPen.printDetails();
    }
}
