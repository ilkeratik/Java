package ilk;

public class yu {
	public static void main(String[] args) {
		int a;
		for(a=1;a<20;a++) {
			if(aer(a,a-2)) {
				System.out.println(a+" asaldir");
			}
			else {
				System.out.println(a+" asal degildir");
			}
		}
	}
public static boolean aer(int x,int y) {
			if(x<2) {
				return false;
			}
			if(y<2) {
				return true;
			}
				
			if(x%y==0) {
				return false;
			}
			return aer(x,y-1);
		}
}
