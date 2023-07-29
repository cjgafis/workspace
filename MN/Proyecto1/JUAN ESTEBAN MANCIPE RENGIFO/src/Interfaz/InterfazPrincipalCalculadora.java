package Interfaz;


import java.awt.BorderLayout;  



import javax.swing.JFrame;
import javax.swing.JOptionPane;

import mundo.Operacion;

public class InterfazPrincipalCalculadora extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private PanelDatos paneldatos;
	private PanelOperaciones paneloperaciones;
   
    
    
    public InterfazPrincipalCalculadora () {
    setTitle("Teoría del error");
    setSize (500, 300);
    setVisible(true);
    setResizable(true);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setLayout(new BorderLayout () );
    
    paneldatos = new PanelDatos ();
    add(paneldatos,BorderLayout.CENTER);
    
    paneloperaciones = new PanelOperaciones (this);
    add(paneloperaciones, BorderLayout.SOUTH); 
   
}
    public void reiniciar() {
		
		paneldatos.reiniciar();
		
		
	}
    public  void promedioDeLasMedidas()
    {
    	if(!paneldatos.getTxtMedidas().isEmpty()) {
    		String medidas = paneldatos.getTxtMedidas();
    		String [] medidas2 = medidas.split("_"); 
    		double [] medidas3 = new double [medidas2.length];
    		for (int i=0; i<medidas2.length;i++) {
    			
    			medidas3 [i] = Double.parseDouble(medidas2[i]); 
    		}
    		Operacion op = new Operacion(medidas3);
    		try {
    			double promedio = op.promedioDeLasMedidas(medidas3);
    		    paneldatos.setTxtMp(promedio);
    			
    		}
    		catch (Exception e) {
    			
    			JOptionPane.showMessageDialog(this, e.getMessage());
    			
    			
    		}
    	}
    	else 
    	{
    		
    		JOptionPane.showMessageDialog(this, "No hay Medidas para Calcular Promedio");
    		
    	}
    }
    	public  void medidaMasLejana()
        {
        	if(!paneldatos.getTxtVv().isEmpty()&& !paneldatos.getTxtMedidas().isEmpty()) {
        		double Vv= Double.parseDouble(paneldatos.getTxtVv());
        		String medidas = paneldatos.getTxtMedidas();
        		String [] medidas2 = medidas.split("_"); 
        		double [] medidas3 = new double [medidas2.length];
        		for (int i=0; i<medidas2.length;i++) 
        		{
        			
        			medidas3 [i] = Double.parseDouble(medidas2[i]); 
        		}
        		Operacion op = new Operacion (Vv,medidas3);
        		try {
        			double mMl = op.medidaMasLejana();
        		    paneldatos.setTxtMl(mMl);
        			
        		}
        		catch (Exception e) {
        			
        			JOptionPane.showMessageDialog(this, e.getMessage());
        			
        			
        		}
        	}
        	else 
        	{
        		
        		JOptionPane.showMessageDialog(this, "Es Necesario ingresar Valorverdadero(Vv) y Medidas");
        		
        	}
        	
        	
        	
    	
    }
    	
    	public  void errorAbsoluto()
        {
    		if( !paneldatos.getTxtMedidas().isEmpty()&&!paneldatos.getTxtVv().isEmpty()){
        		
        		double Vv=Double.parseDouble(paneldatos.getTxtVv());
        		String medidas = paneldatos.getTxtMedidas();
        		String [] medidas2 = medidas.split("_"); 
        		double [] medidas3 = new double [medidas2.length];
        		for (int i=0; i<medidas2.length;i++) 
        		{
        			
        			medidas3 [i] = Double.parseDouble(medidas2[i]); 
        		}
        		Operacion op = new Operacion (Vv,medidas3);
        		try {
        			double pEa = op.errorAbsoluto();
        		    paneldatos.setTxtEa(pEa);
        			
        		}
        		catch (Exception e) {
        			
        			JOptionPane.showMessageDialog(this, e.getMessage());
        			
        			
        		}
        	}
        	else 
        	{
        		
        		JOptionPane.showMessageDialog(this, "No hay Valores de medida o valor verdadero");
        		
        	}
        }
    		public  void errorRelativo()
            {
    			if( !paneldatos.getTxtEa().isEmpty()){
            		double Vv= Double.parseDouble(paneldatos.getTxtVv());
            		String medidas = paneldatos.getTxtMedidas();
            		String [] medidas2 = medidas.split("_"); 
            		double [] medidas3 = new double [medidas2.length];
            		for (int i=0; i<medidas2.length;i++) 
            		{
            			
            			medidas3 [i] = Double.parseDouble(medidas2[i]); 
            		}
            		Operacion op = new Operacion (Vv,medidas3);
            		try {
            			double pEr = op.errorRelativo();
            		    paneldatos.setTxtEr(pEr);
            			
            		}
            		catch (Exception e) {
            			
            			JOptionPane.showMessageDialog(this, e.getMessage());
            			
            			
            		}
            	}
    			else 
            	{
            		
            		JOptionPane.showMessageDialog(this, "Para hallar ErrorRelativo(Er) se necesita Error Absoluto(Ea)");
            		
            	}
            }
    		public  void porcentajeErrorExactitud()
            {
    			if( !paneldatos.getTxtEr().isEmpty()){
            		double Vv= Double.parseDouble(paneldatos.getTxtVv());
            		String medidas = paneldatos.getTxtMedidas();
            		String [] medidas2 = medidas.split("_"); 
            		double [] medidas3 = new double [medidas2.length];
            		for (int i=0; i<medidas2.length;i++) 
            		{
            			
            			medidas3 [i] = Double.parseDouble(medidas2[i]); 
            		}
            		Operacion op = new Operacion (Vv,medidas3);
            		try {
            			double pEe = op.porcentajeErrorExactitud();
            		    paneldatos.setTxtEe(pEe);
            			
            		}
            		catch (Exception e) {
            			
            			JOptionPane.showMessageDialog(this, e.getMessage());
            			
            			
            		}
            		
            	}
    			else 
            	{
            		
            		JOptionPane.showMessageDialog(this, "Para hallar error de exactitud (Ee) se necesita error relativo (Er) ");
            		
            	}
            }
    			public  void exactitudDeMedida()
                {
        			if( !paneldatos.getTxtEe().isEmpty()){
                		double Vv= Double.parseDouble(paneldatos.getTxtVv());
                		String medidas = paneldatos.getTxtMedidas();
                		String [] medidas2 = medidas.split("_"); 
                		double [] medidas3 = new double [medidas2.length];
                		for (int i=0; i<medidas2.length;i++) 
                		{
                			
                			medidas3 [i] = Double.parseDouble(medidas2[i]); 
                		}
                		Operacion op = new Operacion (Vv,medidas3);
                		try {
                			double pE = op.exactitudDeMedida();
                		    paneldatos.setTxtE(pE);
                			
                		}
                		catch (Exception e) {
                			
                			JOptionPane.showMessageDialog(this, e.getMessage());
                			
                			
                		}
                	}
        			else 
                	{
                		
                		JOptionPane.showMessageDialog(this, "Para hallar Exactitud(%E), se necesita ErrorDeExactitud(Ee)");
                		
                	}
                }
        			
        			public  void porcentajePrecision()
                    {
            			if( !paneldatos.getTxtMp().isEmpty()&& !paneldatos.getTxtMl().isEmpty()){
                    		double Vv= Double.parseDouble(paneldatos.getTxtVv());
                    		String medidas = paneldatos.getTxtMedidas();
                    		String [] medidas2 = medidas.split("_"); 
                    		double [] medidas3 = new double [medidas2.length];
                    		for (int i=0; i<medidas2.length;i++) 
                    		{
                    			
                    			medidas3 [i] = Double.parseDouble(medidas2[i]); 
                    		}
                    		Operacion op = new Operacion (Vv,medidas3);
                    		try {
                    			double pEp = op.porcentajePrecision();
                    		    paneldatos.setTxtEp(pEp);
                    			
                    		}
                    		catch (Exception e) {
                    			
                    			JOptionPane.showMessageDialog(this, e.getMessage());
                    			
                    			
                    		}
                    	}
            			else 
                    	{
                    		
                    		JOptionPane.showMessageDialog(this, "Para hallar ErrorDePrecision (%Ep) Se necesita hallar Mp y Ml anteriormente");
                    		
                    	}
                    }
            			public  void precision()
                        {
                			if( !paneldatos.getTxtEp().isEmpty()){
                        		double Vv= Double.parseDouble(paneldatos.getTxtVv());
                        		String medidas = paneldatos.getTxtMedidas();
                        		String [] medidas2 = medidas.split("_"); 
                        		double [] medidas3 = new double [medidas2.length];
                        		for (int i=0; i<medidas2.length;i++) 
                        		{
                        			
                        			medidas3 [i] = Double.parseDouble(medidas2[i]); 
                        		}
                        		Operacion op = new Operacion (Vv,medidas3);
                        		try {
                        			double pP = op.precision();
                        		    paneldatos.setTxtP(pP);
                        			
                        		}
                        		catch (Exception e) {
                        			
                        			JOptionPane.showMessageDialog(this, e.getMessage());
                        			
                        			
                        		}
                        	}
                			else 
                        	{
                        		
                        		JOptionPane.showMessageDialog(this, "Para hallar Precisión (%P), Se necesita Hallar Error de precisión (%Ep) anteriormente");
                        		
                        	}
            }
    		
            	
            
        


    	
    	

    public static void main(String[]args) {
    	InterfazPrincipalCalculadora miHP= new InterfazPrincipalCalculadora();
    	miHP.setVisible(true);
    }
    }
