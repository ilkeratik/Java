import java.util.Scanner;

public class sekilliisimyazma {

	public static void main(String[] args) {
		
		Scanner scn=new Scanner(System.in);
		System.out.println("Kelimeyi girin");
		String al=scn.nextLine();
		int i,j,uzun=0,puan=0;
		uzun=al.length();
		while(uzun%12!=0) {
			al=al+"*";
			uzun=al.length();
		}
		uzun=al.length();
		
		char reis[]=new char[uzun];
		reis=al.toCharArray();
		for(i=0;i<uzun/4;i++) {
			for(j=0;j<uzun/4;j++) {
				if(i==0||i==uzun/4-1||j==0) {
					System.out.print(reis[puan]+" ");
					puan++;
				}
				else if(j==uzun/4-1) {
					if(i==1) {
						System.out.print(reis[uzun-1]+" ");
					}
					else {
						System.out.print(reis[uzun+1-i]+" ");
					}	
				}
				else {
					System.out.print("  "); 
				}
			}
			System.out.println();
		}
	
	}
}
