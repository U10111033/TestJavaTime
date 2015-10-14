import java.awt.*;
import javax.swing.*;
import java.time.*;

/**U10111033, Computer science 4, Hsueh_Hsin Lu*/

public class TestJavaTime extends JFrame {
  public TestJavaTime() {
	LocalDate today = LocalDate.now();  
	// Create panel p1 for the buttons and set GridLayout
    JPanel p1 = new JPanel();
    p1.add(new JTextField("Now is " + today.toString()),BorderLayout.CENTER);
    add(p1, BorderLayout.CENTER);
    
  }

  /** Main method */
  public static void main(String[] args) {
	TestJavaTime frame = new TestJavaTime();
    frame.setTitle("Calculator");
    frame.setSize(250, 300);
    frame.setLocationRelativeTo(null); // Center the frame
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
   
  }
}
