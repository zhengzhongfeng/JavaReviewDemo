package edu.gdin.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class MapDemoTest {
	//使用keySet来访问map
	public static void getMapValuesByKeySet(Map<String, String> m){
		Set<String> keySet = m.keySet();
		Iterator<String> it = keySet.iterator();
		while(it.hasNext()){
			String key = it.next();
			String value = m.get(key);
			System.out.println(key+":"+value);
		}
	}
	
	//使用entrySet来访问Map中的数据
	public static void getMapValueByEntrySet(Map<String, String> m){
		Set<Entry<String, String>> entrySet = m.entrySet();
		Iterator<Entry<String, String>> it = entrySet.iterator();
		while(it.hasNext()){
			Entry<String,String> entry =  it.next();
			String key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key+":"+value);
		}
	}
	
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("01", "aaa");
		map.put("02", "bbb");
		map.put("03", "ccc");
		
		getMapValuesByKeySet(map);
		
		getMapValueByEntrySet(map);
	}
	
}
