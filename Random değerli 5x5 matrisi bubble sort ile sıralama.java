package ilk;

public class PPo {

	public static void main(String[] args) {
		int[][] dizi=new int[5][5];
		int i,j,k,art;
		boolean u;
		
		for(i=0;i<5;i++) {
			for(j=0;j<5;j++) {
				dizi[i][j]=(int) (Math.random()*1000);
			}
		}
		System.out.println("NORMAL D�Z�");
		for(i=0;i<5;i++) {
			for(j=0;j<5;j++) {
				System.out.print(dizi[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		for(i=0;i<5;i++) {
			for(j=1;j<5;j++) {
				for(k=0;k<4;k++) {
					u=dizi[i][j]<dizi[i][k];
					if(u) {
						art=dizi[i][j];
						dizi[i][j]=dizi[i][k];
						dizi[i][k]=art;
						
					}
				}
			}
		}
		System.out.println("K���KTEN B�Y��E SIRALANMI� D�Z�");
		for(i=0;i<5;i++) {
			for(j=0;j<5;j++) {
				System.out.print(dizi[i][j]+" ");
			}
			System.out.println();
		}
	}
}
