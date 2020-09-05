
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class multiset {

	public static void main(String[] args) {
		
		Map<String,Integer> map1=new HashMap<String,Integer>();//key ve tekrar say�s�n� birlikte store etmek i�in hashmap uygun bir yap� oldu�undan onu kullan�yorum
		Map<String,Integer> map2=new HashMap<String,Integer>();
		
		map1.put("a", 3);//verileri yaz�yoruz
		map1.put("b", 2);
		map1.put("c", 1);
		
		map2.put("a", 2);
		map2.put("b", 3);
		map2.put("d", 4);
		
        hesap(map1,map2);
	}
	
	public static void hesap(Map<String,Integer> map1,Map<String,Integer> map2) {
		Map<String,Integer> Birlesim=new HashMap<String,Integer>();//her bir operat�r i�in yeni k�me olu�turuyoruz 
		Map<String,Integer> Kesisim=new HashMap<String,Integer>();
		Map<String,Integer> Fark=new HashMap<String,Integer>();
		Map<String,Integer> Toplam=new HashMap<String,Integer>();
		
		//map1 kontrol
		for (String str : map1.keySet()) {
			if (map1.get(str)==null) {//nullpointer exception engellemek amacl�
				map1.put(str, 0);
			}
			if (map2.get(str)==null) {
				map2.put(str, 0);
			}
			
			int toplam=map1.get(str)+map2.get(str);//olu�turdu�umuz denklemlerin hesaplamas�n� yap�yoruz.(powerpointte dosyas�nda formulleri var).
			int bir=Math.max(map1.get(str),map2.get(str));
			int kes=Math.min(map1.get(str),map2.get(str));
			int fark=map1.get(str)-map2.get(str);
			if(fark<0)
				fark=0;
			
		Birlesim.put(str, bir );//elemanlar� mapa yerle�tiriyoruz
		Kesisim.put(str, kes);
		Fark.put(str, fark);
		Toplam.put(str,toplam);
		
		}
		
		//map2 kontrol
		//bunu iki kere yapmam�z�n sebebi bir k�mede olup di�erinde olmayan elemanlar� da i�leme dahil etmektir.
		//iki map'i birle�tirirsek veri kayb� oluyor(o verileri kullanmam�z da gerekiyor) o y�zden b�yle yapt�m
		for (String str : map2.keySet()) {
			if (map1.get(str)==null) {
				map1.put(str, 0);
			}
			if (map2.get(str)==null) {
				map2.put(str, 0);
			}
			
			int toplam=map1.get(str)+map2.get(str);//olu�turdu�umuz denklemlere g�re k�melere atama yap�yoruz.
			int bir=Math.max(map1.get(str),map2.get(str));
			int kes=Math.min(map1.get(str),map2.get(str));
			int fark=map1.get(str)-map2.get(str);
			if(fark<0)
				fark=0;
			
		Birlesim.put(str, bir );
		Kesisim.put(str, kes);
		Fark.put(str, fark);
		Toplam.put(str,toplam);
		}
		//Birle�im k�mesi yazd�r�l�yor.
		System.out.print("AUB={");
		for (String key : Birlesim.keySet()) {
			if(Birlesim.get(key)!=0)
			System.out.print(Birlesim.get(key)+"."+key+",");
			}
		System.out.println("}");
		//Kesisim k�mesi yazd�r�l�yor.
		System.out.print("AnB={");
		for (String key : Kesisim.keySet()) {
			if(Kesisim.get(key)!=0)
			System.out.print(Kesisim.get(key)+"."+key+",");
			}
		System.out.println("}");
		//Fark k�mesi yazd�r�l�yor.
		System.out.print("A-B={");
		for (String key : Fark.keySet()) {
			if(Fark.get(key)!=0)
			System.out.print(Fark.get(key)+"."+key+",");
			}
		System.out.println("}");
		//Toplam k�mesinin yazd�r�l�yor.
		System.out.print("A+B={");
		for (String key : Toplam.keySet()) {
			if(Toplam.get(key)!=0)
			System.out.print(Toplam.get(key)+"."+key+",");
			}
		System.out.println("}");
	}
	

}
