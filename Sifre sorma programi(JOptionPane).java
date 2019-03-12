package ilk;

import javax.swing.JOptionPane;

public class sifresor {

	public static void main(String[] args) {
		String oh="a5www1";
		String s1;
		JOptionPane.showMessageDialog(null,"Yetkiniz yok þifre girin!");
		do {
		s1=JOptionPane.showInputDialog(null,"Þifre:",2).toString();
		System.out.println();
		
		
		if(s1.equals(oh))
			JOptionPane.showMessageDialog(null,"Giriþ baþarýlý");
		else
			JOptionPane.showMessageDialog(null,"Þifre yanlýþ tekrar deneyin");
			
		}while(!s1.equals(oh));
		
	}

}
