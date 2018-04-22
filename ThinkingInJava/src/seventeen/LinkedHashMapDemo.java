package seventeen;

import net.mindview.util.CountingMapData;

import java.util.LinkedHashMap;

import static net.mindview.util.Print.print;

/*p487*/
public class LinkedHashMapDemo {
    public static void main(String[] args) {
        LinkedHashMap<Integer,String> linkedMap = new LinkedHashMap<Integer, String>(new CountingMapData(9));
        print(linkedMap);
        linkedMap = new LinkedHashMap<Integer, String>(16,0.75f,true);
        linkedMap.putAll(new CountingMapData(9));
        print(linkedMap);
        for (int i = 0; i < 6; i++)
            linkedMap.get(i);
        print(linkedMap);
        linkedMap.get(0);
        print(linkedMap);

    }
}
