
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {

    public int[] intersection(int[] firstInput, int[] secondInput) {
        Set<Integer> presentInFirstInput = new HashSet<>();
        for (int num : firstInput) {
            presentInFirstInput.add(num);
        }

        List<Integer> intersection = new ArrayList<>();
        for (int num : secondInput) {
            if (presentInFirstInput.contains(num)) {
                intersection.add(num);
                presentInFirstInput.remove(num);
            }
        }

        return listToArray(intersection);
    }

    private int[] listToArray(List<Integer> list) {
        int[] result = new int[list.size()];
        int index = 0;
        for (int n : list) {
            result[index++] = n;
        }
        return result;
    }
}
