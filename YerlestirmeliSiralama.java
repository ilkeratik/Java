import java.util.Scanner;

public class YerlestirmeliSiralama {
	
	static int n;
	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("N de�eri:");
		n= scan.nextInt();
		
        int dizi[] = new int[n];
        
        for(int i=0; i<n;i++) {
        	System.out.println("Dizi eleman�n� girin:");
        	int sayi=scan.nextInt();
        	dizi[i]=sayi;
        }
        dizi=yerlestirme(dizi);//fonksiyon �a�r�l�r ve dizi k���kten b�y��e s�ralanm�� hale getirilir.
        
        for(int i=0; i<n;i++) {//S�ralanm�� dizi yazd�r�l�r.
        	System.out.print(dizi[i]+" ");
        }
        

	}
	
	public static int[] yerlestirme(int dizi[]) {
		
		n=dizi.length;
		for (int i=1; i<n; ++i)
        {
            int sayi = dizi[i];
            int j = i-1;
 
            while (j>=0 && dizi[j] > sayi)//Eleman� tutup, sondan ba�a do�ru di�er elemanlarla kar��la�t�r�r, kendinden k���k de�er bulana kadar devam eder
            {
                dizi[j+1] = dizi[j];
                j = j-1;
            }
            dizi[j+1] = sayi;//kendinden k���k olan say�y�n sa��na yerle�ir.
        }
		
		return dizi;
	}

}
