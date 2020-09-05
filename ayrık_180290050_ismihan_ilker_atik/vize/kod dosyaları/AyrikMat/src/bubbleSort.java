import java.util.Scanner;

public class bubbleSort {
	
	static int n;
	public static void main(String args[]) { 
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("N de�eri:");
		n= scan.nextInt();
		
        int dizi[] = new int[n];
        
        for(int i=0; i<n;i++) {
        	System.out.println("Dizi eleman�n� girin:");
        	int sayi=scan.nextInt();
        	dizi[i]=sayi;
        }
        dizi=kabarcik(dizi);//fonksiyon �a�r�l�r ve dizi k���kten b�y��e s�ralanm�� hale getirilir.
        
        for(int i=0; i<n;i++) {//S�ralanm�� dizi yazd�r�l�r.
        	System.out.println(dizi[i]+" ");
        }
        
        
        
    }
	
	public static int[] kabarcik(int dizi[]) {
		
		n=dizi.length;
		for(int i=0;i<n-1;i++) {//K���kten b�y��e s�ralar
        	for (int j = 0; j < n-i-1; j++) 
                if (dizi[j] > dizi[j+1]) //Kontrol ifadesi, e�er eleman kendinden sonraki s�radaki elemandan b�y�k ise yer de�i�tirirler.
                { 
                    //k���k olan hep �ste do�ru ��kar s�rayla t�m dizi s�ralan�nca en �stte olur.
                    int temp = dizi[j]; 
                    dizi[j] = dizi[j+1]; 
                    dizi[j+1] = temp; 
                }
        }
		return dizi;
	}
}
