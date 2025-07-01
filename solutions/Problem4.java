import java.util.*;

public class Problem4 {
    public static void main(String[] args) {
        
        int[] numbers = {1, 2, 8, 9, 12, 46, 76, 82, 15, 20, 30};

        Map<Integer, Integer> countMap = new LinkedHashMap<>();

        for (int i = 1; i <= 9; i++) {
            countMap.put(i, 0);
        }

        for (int key = 1; key <= 9; key++) {
            for (int num : numbers) {
                if (num % key == 0) {
                    countMap.put(key, countMap.get(key) + 1);
                }
            }
        }

        System.out.println("Output:");
        System.out.println(countMap);
    }
}
