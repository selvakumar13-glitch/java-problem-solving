package Day18;
import java.util.HashMap;

public class HashMinMark {
    public static void main(String[] args) {
        HashMap<String, Integer> markList = new HashMap<>();

        markList.put("Ram", 56);
        markList.put("Raju", 86);
        markList.put("Radha", 96);
        markList.put("Anu", 76);

        int min = Integer.MAX_VALUE;
        String studentName = "";

        for (String name : markList.keySet()) {
            int mark = markList.get(name);

            if (mark < min) {
                min = mark;
                studentName = name;
            }
        }

        System.out.println("Student Name: " + studentName);
        System.out.println("Minimum Mark: " + min);
    }
}