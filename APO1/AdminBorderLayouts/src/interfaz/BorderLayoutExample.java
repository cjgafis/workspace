package interfaz;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class BorderLayoutExample 
{
	public static void main(String[] args) 
	{
		JFrame frame = new JFrame("BorderLayout Example");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 200);

		JPanel panel = new JPanel(new BorderLayout());
		panel.add(new JButton("Norte"), BorderLayout.NORTH);
		panel.add(new JButton("Sur"), BorderLayout.SOUTH);
		panel.add(new JButton("Este"), BorderLayout.EAST);
		panel.add(new JButton("Oeste"), BorderLayout.WEST);
		panel.add(new JButton("Centro"), BorderLayout.CENTER);

		frame.add(panel);
		frame.setVisible(true);
	}
}

