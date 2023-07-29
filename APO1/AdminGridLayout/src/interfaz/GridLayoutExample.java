package interfaz;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GridLayoutExample 
{
	public static void main(String[] args) 
	{
		JFrame frame = new JFrame("GridLayout Example");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 200);

		JPanel panel = new JPanel(new GridLayout(3, 2));
		for (int i = 1; i <= 6; i++) 
		{
			panel.add(new JButton("Button " + i));
		}

		frame.add(panel);
		frame.setVisible(true);
	}
}