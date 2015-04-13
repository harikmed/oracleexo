package pac;

import javax.swing.JFrame;

public class Fenetre extends JFrame{
	
	public Fenetre() {
		setBounds(100, 100, 300, 300);
		setVisible(true);
		setLocationRelativeTo(null);
		
		
	}
	
	public static void main(String[] args) {
		Fenetre f=new Fenetre();
	}
	
public void afficher(){
	this.setSize(400, 400);
this.setVisible(true);
}

}
