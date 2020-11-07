package ilk;
import javax.swing.JOptionPane;

public class dialog {
	public static void main(String[] args) {
		String[] secenek= {" (/) "," (*) ","(+) "," (-) "};
		String s1=JOptionPane.showInputDialog(null,"1. sayiyi girin");
		
		int secim=JOptionPane.showOptionDialog(null,"islemi seç","Java",JOptionPane.YES_NO_CANCEL_OPTION,0,null,secenek,null);
		
		String s2=JOptionPane.showInputDialog(null,"2. sayiyi girin");
		
		if(secim==0)
			JOptionPane.showMessageDialog(null,"Sonuc: "+Float.parseFloat(s1)/Float.parseFloat(s2));
		if(secim==1)
			JOptionPane.showMessageDialog(null,"Sonuc: "+Float.parseFloat(s1)*Float.parseFloat(s2));
		if(secim==2)
			JOptionPane.showMessageDialog(null,"Sonuc: "+Float.parseFloat(s1)+Float.parseFloat(s2));
		if(secim==3)
			JOptionPane.showMessageDialog(null,"Sonuc: "+(Float.parseFloat(s1)-Float.parseFloat(s2)));
	
	}
}
