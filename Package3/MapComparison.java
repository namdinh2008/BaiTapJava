import java.util.Hashtable;
import java.util.HashMap;
import java.util.Map;

public class MapComparison {
    public static void main(String[] args) {

        Hashtable<Integer, String> hashtable = new Hashtable<>();
        HashMap<Integer, String> hashMap = new HashMap<>();

        hashtable.put(1, "One");
        hashtable.put(2, "Two");
        hashMap.put(1, "One");
        hashMap.put(2, "Two");

        hashMap.put(null, "Null Key");
        hashMap.put(3, null);

        System.out.println("Hashtable:");
        for (Map.Entry<Integer, String> entry : hashtable.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }

        System.out.println();

        System.out.println("HashMap:");
        for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
    }
}
