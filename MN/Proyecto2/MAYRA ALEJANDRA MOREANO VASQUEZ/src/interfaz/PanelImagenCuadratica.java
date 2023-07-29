package interfaz;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class PanelImagenCuadratica extends JPanel {
    
	private static final long serialVersionUID = 1L;
	
	private JLabel imagen;
    
    public PanelImagenCuadratica () {

		TitledBorder borde = BorderFactory.createTitledBorder("Fórmula general cuadrática:");
		setBorder(borde);
		borde.setTitleColor(Color.BLUE);
    	
    	ImageIcon icono= new ImageIcon("data/imagenes/ImagenCuadratica2.png");
        imagen = new JLabel();
        imagen.setIcon(icono);
        add(imagen);
        
    }

}
