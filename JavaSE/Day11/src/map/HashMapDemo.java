package map;
import java.util.*;
import java.util.Map.Entry;
public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<String,String> map=new HashMap<>();
		map.put(null,null);
		map.put("apple","苹果");
		map.put("sport","足球");
		map.put("car","宝马汽车");
		map.put("country","中国");
		System.out.println("现在map集合中共有键值对："+map.size());
		System.out.println("删除之前：key为sport的元素值："+map.get("sport"));
		map.remove("sport"); 
		System.out.println("删除之后：key为sport的元素值："+map.get("sport"));
		System.out.println("包括key为car的键值对吗？"+map.containsKey("car"));
		System.out.println("包括key为animal的键值对吗？"+map.containsKey("animal"));
		System.out.println("包括value为\"宝马汽车\"的键值对吗？"+map.containsValue("宝马汽车"));
		Set<String> keys=map.keySet();   // 获取所有的key
		System.out.println("所有的key是：");
		for(String key:keys){
			System.out.print(key+"  ");
		}
		System.out.println();
		System.out.println("所有的value是：");
		Collection<String> values=map.values();
		for(String value:values){
			System.out.print(value+"  ");
		}
		System.out.println();
		System.out.println("*********遍历整个map集合**************");
		Set<Map.Entry<String, String>> entrySet = map.entrySet();
		for(Map.Entry<String, String> me:entrySet){
			System.out.println(me.getKey()+"========>"+me.getValue());
		}

	}

}
