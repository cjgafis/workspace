package interfaz;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GridBagLayoutExample 
{
	public static void main(String[] args) 
	{
		JFrame frame = new JFrame("GridBagLayout Example");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 200);

		JPanel panel = new JPanel(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();

		for (int i = 1; i <= 6; i++) 
		{
			gbc.gridx = (i - 1) % 2;
			gbc.gridy = (i - 1) / 2;
			gbc.fill = GridBagConstraints.BOTH;
			gbc.weightx = 1;
			gbc.weighty = 1;
			panel.add(new JButton("Button " + i), gbc);
		}

		frame.add(panel);
		frame.setVisible(true);
	}
}
