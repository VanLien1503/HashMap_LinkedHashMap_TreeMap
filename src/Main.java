import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Map<String,Integer> hasMap =new HashMap<>();
        hasMap.put("Vũ",27);
        hasMap.put("Hiệp",28);
        hasMap.put("Phú",25);
        hasMap.put("Hưng",29);
        hasMap.put("Sơn",26);
        System.out.println("Display entries in hashMap");
        System.out.println(hasMap+"\n");
        //Tạo TreeMap để lưu key theo thứ tự giảm dần
        Map<String,Integer> treeMap=new TreeMap<>(hasMap);
        Map<String,Integer> linkedHashMap = new LinkedHashMap<>(16,0.75f,true);
        linkedHashMap.put("Vũ",27);
        linkedHashMap.put("Hiệp",28);
        linkedHashMap.put("Phú",25);
        linkedHashMap.put("Hưng",29);
        linkedHashMap.put("Sơn",26);
        System.out.println("\nThe age for " + "Lewis is " + linkedHashMap.get("Lewis"));
    }


}
