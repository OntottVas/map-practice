import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String, String> ovodaiJelek = new HashMap<>();
        ovodaiJelek.put("Geree", "autó");
        ovodaiJelek.put("Peti", "vitorlás hajó");
        ovodaiJelek.put("Kompadre", "lufi");

        System.out.println(ovodaiJelek);

        ovodaiJelek.remove("Geree");

        System.out.println(ovodaiJelek.get("Peti"));

        System.out.println(ovodaiJelek.keySet());

        System.out.println(ovodaiJelek.values());

        System.out.println(ovodaiJelek.entrySet());
        System.out.println(ovodaiJelek);

        System.out.println(ovodaiJelek.get("Geree"));

        ovodaiJelek.put("Geree", "autó");
        ovodaiJelek.replace("Geree", "repülő");


        Map<String, Integer> heightMap = new HashMap<>();
        heightMap.put("Shrek", 225);
        heightMap.put("Optimus Prime", 9000);
        heightMap.put("Sziporka", 131);
        heightMap.put("Csuporka", 134);
        heightMap.put("Puszedli", 123);
        heightMap.put("X-Professzor", 185);
        heightMap.put("Mohó Jojó", 152);

        System.out.println(heightMap.values());

        Integer maxHeight = Integer.MIN_VALUE;
        for (Integer integer : heightMap.values()) {
            if (maxHeight < integer) {
                maxHeight = integer;
            }
        }
        System.out.println(maxHeight);

        for (Map.Entry<String, Integer> entry : heightMap.entrySet()) {
            if (maxHeight == entry.getValue()) {
                System.out.println(entry.getKey());
            }
        }

        Integer minHeight = Integer.MAX_VALUE;
        for (Integer integer : heightMap.values()) {
            if(minHeight > integer) {
                minHeight = integer;
            }
        }
        System.out.println(minHeight);

        for (var entry : heightMap.entrySet()) {
            if(minHeight == entry.getValue()) {
                System.out.println(entry);
            }
        }

        // TODO egy ciklussal megoldani!!!


        heightMap.replace("Sziporka", (heightMap.get("Sziporka") + 1));
        System.out.println(heightMap.get("Sziporka"));


        Map<String, List<Integer>> grades = new HashMap<>();
        List<Integer> aliceGrades = new ArrayList<>();
        aliceGrades.add(5);
        aliceGrades.add(2);
        aliceGrades.add(1);
        grades.put("Alice", aliceGrades);

        List<Integer> bobGrades = new ArrayList<>();
        bobGrades.add(4);
        bobGrades.add(3);
        grades.put("Bob", bobGrades);

        grades.put("Charlie", Arrays.asList(1,5,4,4,3));

    }

}
