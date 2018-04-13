package map;
import java.util.*;
import java.util.Map.Entry;
public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<String,String> map=new HashMap<>();
		map.put(null,null);
		map.put("apple","ƻ��");
		map.put("sport","����");
		map.put("car","��������");
		map.put("country","�й�");
		System.out.println("����map�����й��м�ֵ�ԣ�"+map.size());
		System.out.println("ɾ��֮ǰ��keyΪsport��Ԫ��ֵ��"+map.get("sport"));
		map.remove("sport"); 
		System.out.println("ɾ��֮��keyΪsport��Ԫ��ֵ��"+map.get("sport"));
		System.out.println("����keyΪcar�ļ�ֵ����"+map.containsKey("car"));
		System.out.println("����keyΪanimal�ļ�ֵ����"+map.containsKey("animal"));
		System.out.println("����valueΪ\"��������\"�ļ�ֵ����"+map.containsValue("��������"));
		Set<String> keys=map.keySet();   // ��ȡ���е�key
		System.out.println("���е�key�ǣ�");
		for(String key:keys){
			System.out.print(key+"  ");
		}
		System.out.println();
		System.out.println("���е�value�ǣ�");
		Collection<String> values=map.values();
		for(String value:values){
			System.out.print(value+"  ");
		}
		System.out.println();
		System.out.println("*********��������map����**************");
		Set<Map.Entry<String, String>> entrySet = map.entrySet();
		for(Map.Entry<String, String> me:entrySet){
			System.out.println(me.getKey()+"========>"+me.getValue());
		}

	}

}
