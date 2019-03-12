package ilk;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Atw {

	public static void main(String[] args) {
		int k,a,c=1;
		k=Integer.parseInt(JOptionPane.showInputDialog(null,"Sayiyi gir"));
		for(a=1;a<=k;a++) {
			c*=a;
		}
		JOptionPane.showMessageDialog(null,"Sayinin faktöriyeli: "+c);
	}

}
