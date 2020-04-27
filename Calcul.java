package formation;

import javax.swing.JFrame;

public class calculUI {



	
	JFrame mafenetre=new JFrame("Ma calculatrice")
	JLabel lbl1=new JLabel("Nombre1");	
	JLabel lbl2=new JLabel("Nombre2");
	JTextField txt1=new JTextField(10); 
	
			
	public void graphique() {

		mafenetre.setVisible(true);
		
		}
	
	public static void main(String[] args) {
		
		CalculUI ui=new CalculUI();
		ui.graphique();
	}
	
}