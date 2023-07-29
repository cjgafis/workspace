package interfaz;

import java.awt.Dimension;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class BoxLayoutExample 
{
	public static void main(String[] args) 
	{
		JFrame frame = new JFrame("BoxLayout Example");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 200);

		JPanel panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

		for (int i = 1; i <= 5; i++) 
		{
			panel.add(new JButton("Button " + i));
			if (i < 5) 
			{
				panel.add(Box.createRigidArea(new Dimension(0, 5)));
			}
		}

		frame.add(panel);
		frame.setVisible(true);
	}
}
