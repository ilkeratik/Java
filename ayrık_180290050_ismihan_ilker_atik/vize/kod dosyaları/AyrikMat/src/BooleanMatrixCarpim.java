import java.util.Scanner;

public class BooleanMatrixCarpim {//bu program ile hem boolean matrix carpimini hemde diger uygun matrixleri carpabiliriz hýzlý calýsmasý adýna carpým adýmýnda sadece boolean carpýma uygun sadelestirmeler yaptým.

	static int m,k,n;// m x k ve k x n matrix boyutlarý
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		
		System.out.println("m deðeri:");//inputlarý alýyoruz
		m= scan.nextInt();
		System.out.println("k deðeri:");
		k= scan.nextInt();
		System.out.println("n deðeri:");
		n= scan.nextInt();
		
		int A[][] = new int[m][k];//boyutlara göre matrixler oluþturuluyor
		int B[][] = new int[k][n];
		
		for(int i=0; i<m;i++) {// A dizisi elemanlarý alýnýyor.
			for(int j=0; j<k;j++) {
				System.out.println("A["+i+"]["+j+"].Dizi elemanýný girin:");
				int sayi=scan.nextInt();
				A[i][j]=sayi;
			}
        	
        }
		for(int i=0; i<k;i++) {// B dizisi elemanlarý alýnýyor.
			for(int j=0; j<m;j++) {
				System.out.println("B["+i+"]["+j+"].Dizi elemanýný girin:");
				int sayi=scan.nextInt();
				B[i][j]=sayi;
			}
			
        }
		int carpim[][]=new int [m][n],sonuc=0;
		
		for(int u=0; u<n; u++) {
            for(int i=0; i<m; i++) {
            	
                carpim[i][u]=0;
                for(int j=0; j<k; j++) {
                	//aþaðýdaki þart ve operatorünü temsil eder yani sadece 1*1 durumunda 1 olur.
                	if(A[i][j]*B[j][u]==1) {//veya operatörüne göre ikisinden birininin 1 yeterli, o yüzden 1 yakalayýnca sonuç 1 olacak yoksa 0 kalacak
                		carpim[i][u]=1;
                	}
                }
            }
        }
		
		for(int i=0;i<m;i++) {//AxB carpim matrix sonucu yazdýrýlýyor
			for(int j=0; j<n; j++) {
				System.out.print(carpim[i][j]+" ");
			}
			System.out.println();
		}
		
	}
	

}
