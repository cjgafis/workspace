package interfaz;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class FlowLayoutExample 
{
	public static void main(String[] args) 
	{
		JFrame frame = new JFrame("FlowLayout Example");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 200);

		JPanel panel = new JPanel(new FlowLayout());
		for (int i = 1; i <= 5; i++) 
		{
			panel.add(new JButton("Button " + i));
		}

		frame.add(panel);
		frame.setVisible(true);
	}
}