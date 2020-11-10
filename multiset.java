
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class multiset {

	public static void main(String[] args) {
		
		Map<String,Integer> map1=new HashMap<String,Integer>();//key ve tekrar sayýsýný birlikte store etmek için hashmap uygun bir yapý olduðundan onu kullanýyorum
		Map<String,Integer> map2=new HashMap<String,Integer>();
		
		map1.put("a", 3);//verileri yazýyoruz
		map1.put("b", 2);
		map1.put("c", 1);
		
		map2.put("a", 2);
		map2.put("b", 3);
		map2.put("d", 4);
		
        hesap(map1,map2);
	}
	
	public static void hesap(Map<String,Integer> map1,Map<String,Integer> map2) {
		Map<String,Integer> Birlesim=new HashMap<String,Integer>();//her bir operatör için yeni küme oluþturuyoruz 
		Map<String,Integer> Kesisim=new HashMap<String,Integer>();
		Map<String,Integer> Fark=new HashMap<String,Integer>();
		Map<String,Integer> Toplam=new HashMap<String,Integer>();
		
		//map1 kontrol
		for (String str : map1.keySet()) {
			if (map1.get(str)==null) {//nullpointer exception engellemek amaclý
				map1.put(str, 0);
			}
			if (map2.get(str)==null) {
				map2.put(str, 0);
			}
			
			int toplam=map1.get(str)+map2.get(str);//oluþturduðumuz denklemlerin hesaplamasýný yapýyoruz.(powerpointte dosyasýnda formulleri var).
			int bir=Math.max(map1.get(str),map2.get(str));
			int kes=Math.min(map1.get(str),map2.get(str));
			int fark=map1.get(str)-map2.get(str);
			if(fark<0)
				fark=0;
			
		Birlesim.put(str, bir );//elemanlarý mapa yerleþtiriyoruz
		Kesisim.put(str, kes);
		Fark.put(str, fark);
		Toplam.put(str,toplam);
		
		}
		
		//map2 kontrol
		//bunu iki kere yapmamýzýn sebebi bir kümede olup diðerinde olmayan elemanlarý da iþleme dahil etmektir.
		//iki map'i birleþtirirsek veri kaybý oluyor(o verileri kullanmamýz da gerekiyor) o yüzden böyle yaptým
		for (String str : map2.keySet()) {
			if (map1.get(str)==null) {
				map1.put(str, 0);
			}
			if (map2.get(str)==null) {
				map2.put(str, 0);
			}
			
			int toplam=map1.get(str)+map2.get(str);//oluþturduðumuz denklemlere göre kümelere atama yapýyoruz.
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
		//Birleþim kümesi yazdýrýlýyor.
		System.out.print("AUB={");
		for (String key : Birlesim.keySet()) {
			if(Birlesim.get(key)!=0)
			System.out.print(Birlesim.get(key)+"."+key+",");
			}
		System.out.println("}");
		//Kesisim kümesi yazdýrýlýyor.
		System.out.print("AnB={");
		for (String key : Kesisim.keySet()) {
			if(Kesisim.get(key)!=0)
			System.out.print(Kesisim.get(key)+"."+key+",");
			}
		System.out.println("}");
		//Fark kümesi yazdýrýlýyor.
		System.out.print("A-B={");
		for (String key : Fark.keySet()) {
			if(Fark.get(key)!=0)
			System.out.print(Fark.get(key)+"."+key+",");
			}
		System.out.println("}");
		//Toplam kümesinin yazdýrýlýyor.
		System.out.print("A+B={");
		for (String key : Toplam.keySet()) {
			if(Toplam.get(key)!=0)
			System.out.print(Toplam.get(key)+"."+key+",");
			}
		System.out.println("}");
	}
	

}
