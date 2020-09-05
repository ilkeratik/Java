import java.util.Scanner;

public class YerlestirmeliSiralama {
	
	static int n;
	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("N deðeri:");
		n= scan.nextInt();
		
        int dizi[] = new int[n];
        
        for(int i=0; i<n;i++) {
        	System.out.println("Dizi elemanýný girin:");
        	int sayi=scan.nextInt();
        	dizi[i]=sayi;
        }
        dizi=yerlestirme(dizi);//fonksiyon çaðrýlýr ve dizi küçükten büyüðe sýralanmýþ hale getirilir.
        
        for(int i=0; i<n;i++) {//Sýralanmýþ dizi yazdýrýlýr.
        	System.out.print(dizi[i]+" ");
        }
        

	}
	
	public static int[] yerlestirme(int dizi[]) {
		
		n=dizi.length;
		for (int i=1; i<n; ++i)
        {
            int sayi = dizi[i];
            int j = i-1;
 
            while (j>=0 && dizi[j] > sayi)//Elemaný tutup, sondan baþa doðru diðer elemanlarla karþýlaþtýrýr, kendinden küçük deðer bulana kadar devam eder
            {
                dizi[j+1] = dizi[j];
                j = j-1;
            }
            dizi[j+1] = sayi;//kendinden küçük olan sayýyýn saðýna yerleþir.
        }
		
		return dizi;
	}

}
