import javax.swing.JOptionPane;

public class Greeter_Nikhil {
public static void main(String[] args) {
	
	String name=JOptionPane.showInputDialog("What's your name?");
	JOptionPane.showMessageDialog(null, "hi "+ name);
}
}
