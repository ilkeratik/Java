package ilk;

import javax.swing.JOptionPane;

public class sifresor {

	public static void main(String[] args) {
		String oh="a5www1";
		String s1;
		JOptionPane.showMessageDialog(null,"Yetkiniz yok �ifre girin!");
		do {
		s1=JOptionPane.showInputDialog(null,"�ifre:",2).toString();
		System.out.println();
		
		
		if(s1.equals(oh))
			JOptionPane.showMessageDialog(null,"Giri� ba�ar�l�");
		else
			JOptionPane.showMessageDialog(null,"�ifre yanl�� tekrar deneyin");
			
		}while(!s1.equals(oh));
		
	}

}
