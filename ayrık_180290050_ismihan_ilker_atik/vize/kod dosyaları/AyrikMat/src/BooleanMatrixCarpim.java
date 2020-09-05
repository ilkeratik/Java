import java.util.Scanner;

public class BooleanMatrixCarpim {//bu program ile hem boolean matrix carpimini hemde diger uygun matrixleri carpabiliriz h�zl� cal�smas� ad�na carp�m ad�m�nda sadece boolean carp�ma uygun sadelestirmeler yapt�m.

	static int m,k,n;// m x k ve k x n matrix boyutlar�
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		
		System.out.println("m de�eri:");//inputlar� al�yoruz
		m= scan.nextInt();
		System.out.println("k de�eri:");
		k= scan.nextInt();
		System.out.println("n de�eri:");
		n= scan.nextInt();
		
		int A[][] = new int[m][k];//boyutlara g�re matrixler olu�turuluyor
		int B[][] = new int[k][n];
		
		for(int i=0; i<m;i++) {// A dizisi elemanlar� al�n�yor.
			for(int j=0; j<k;j++) {
				System.out.println("A["+i+"]["+j+"].Dizi eleman�n� girin:");
				int sayi=scan.nextInt();
				A[i][j]=sayi;
			}
        	
        }
		for(int i=0; i<k;i++) {// B dizisi elemanlar� al�n�yor.
			for(int j=0; j<m;j++) {
				System.out.println("B["+i+"]["+j+"].Dizi eleman�n� girin:");
				int sayi=scan.nextInt();
				B[i][j]=sayi;
			}
			
        }
		int carpim[][]=new int [m][n],sonuc=0;
		
		for(int u=0; u<n; u++) {
            for(int i=0; i<m; i++) {
            	
                carpim[i][u]=0;
                for(int j=0; j<k; j++) {
                	//a�a��daki �art ve operator�n� temsil eder yani sadece 1*1 durumunda 1 olur.
                	if(A[i][j]*B[j][u]==1) {//veya operat�r�ne g�re ikisinden birininin 1 yeterli, o y�zden 1 yakalay�nca sonu� 1 olacak yoksa 0 kalacak
                		carpim[i][u]=1;
                	}
                }
            }
        }
		
		for(int i=0;i<m;i++) {//AxB carpim matrix sonucu yazd�r�l�yor
			for(int j=0; j<n; j++) {
				System.out.print(carpim[i][j]+" ");
			}
			System.out.println();
		}
		
	}
	

}
