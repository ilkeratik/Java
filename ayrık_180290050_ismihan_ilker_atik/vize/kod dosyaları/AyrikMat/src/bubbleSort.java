import java.util.Scanner;

public class bubbleSort {
	
	static int n;
	public static void main(String args[]) { 
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("N deðeri:");
		n= scan.nextInt();
		
        int dizi[] = new int[n];
        
        for(int i=0; i<n;i++) {
        	System.out.println("Dizi elemanýný girin:");
        	int sayi=scan.nextInt();
        	dizi[i]=sayi;
        }
        dizi=kabarcik(dizi);//fonksiyon çaðrýlýr ve dizi küçükten büyüðe sýralanmýþ hale getirilir.
        
        for(int i=0; i<n;i++) {//Sýralanmýþ dizi yazdýrýlýr.
        	System.out.println(dizi[i]+" ");
        }
        
        
        
    }
	
	public static int[] kabarcik(int dizi[]) {
		
		n=dizi.length;
		for(int i=0;i<n-1;i++) {//Küçükten büyüðe sýralar
        	for (int j = 0; j < n-i-1; j++) 
                if (dizi[j] > dizi[j+1]) //Kontrol ifadesi, eðer eleman kendinden sonraki sýradaki elemandan büyük ise yer deðiþtirirler.
                { 
                    //küçük olan hep üste doðru çýkar sýrayla tüm dizi sýralanýnca en üstte olur.
                    int temp = dizi[j]; 
                    dizi[j] = dizi[j+1]; 
                    dizi[j+1] = temp; 
                }
        }
		return dizi;
	}
}
