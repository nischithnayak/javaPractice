import java.util.ArrayList;
import java.util.Arrays;

public class p1 {
    public static void main(String[] args) {
        ArrayList<Integer> arr1 = new ArrayList<>(Arrays.asList(1, 5, 10, 20, 40, 80));
        ArrayList<Integer> arr2 = new ArrayList<>(Arrays.asList(6, 7, 20, 80, 100));
        ArrayList<Integer> arr3 = new ArrayList<>(Arrays.asList(3, 4, 15, 20, 30, 70, 80, 120));

        System.out.println(commonArr(arr1, arr2, arr3));
    }

    public static ArrayList<Integer> commonArr(ArrayList<Integer> arr1, ArrayList<Integer> arr2, ArrayList<Integer> arr3) {
        ArrayList<Integer> result = new ArrayList<>();
        int i = 0, j = 0, k = 0;

        while (i < arr1.size() && j < arr2.size() && k < arr3.size()) {
            int a = arr1.get(i);
            int b = arr2.get(j);
            int c = arr3.get(k);

            if (a == b && b == c) {
                if (result.isEmpty() || result.get(result.size() - 1) != a) {
                    result.add(a);
                }
                i++;
                j++;
                k++;
            } else {
                int min = Math.min(a, Math.min(b, c));
                if (a == min) i++;
                if (b == min) j++;
                if (c == min) k++;
            }
        }

        if (result.isEmpty()) {
            result.add(-1);
        }

        return result;
    }
}
