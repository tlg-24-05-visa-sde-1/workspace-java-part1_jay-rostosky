package misc.test;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

class MapTest {

    public static void main(String[] args) {
        Map<String,Double> gpaMap = new HashMap<>();  // K is String, V is Double

        gpaMap.put("breana", 3.6);
        gpaMap.put("douglas", 1.87);
        gpaMap.put("amir", 3.8);
        gpaMap.put("tayo", 3.4);
        gpaMap.put("daiyron", 3.7);
        gpaMap.put("coty", 1.6);

        dump(gpaMap);
        System.out.println();

        System.out.println("breana's gpa was: " + gpaMap.get("breana"));
        System.out.println();

        // print all gpas that are 3.5 or greater
        Collection<Double> gpaValues = gpaMap.values();

        for (Double gpaValue : gpaValues) {
            if (gpaValue >= 3.5) {
                System.out.println(gpaValue);
            }
        }
        System.out.println();

        // print the names of those with a gpa >= 2.0
        for (var entry : gpaMap.entrySet()) {
            if (entry.getValue() >= 2.0) {
                System.out.println(entry.getKey() + " has a gpa of " + entry.getValue());
            }
        }
    }

    private static void dump(Map<String,Double> map) {
        for (var entry : map.entrySet()) {
            System.out.println(entry.getKey() + " | " + entry.getValue());
        }
    }
}