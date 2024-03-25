import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LIS {
    public static List<Integer> LIS(List<Integer> sequence) {
        if (sequence == null || sequence.isEmpty()) {
            System.out.println("É necessario ao menos um número");
            return Collections.emptyList();
        }

        int n = sequence.size();
        int[] lengths = new int[n];
        int[] indices = new int[n];
        Arrays.fill(lengths, 1);

        int maxIndex = 0;
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (sequence.get(i) > sequence.get(j)) {
                    if (lengths[j] + 1 > lengths[i]) {
                        lengths[i] = lengths[j] + 1;
                        indices[i] = j;
                    }
                }
            }
            if (lengths[i] > lengths[maxIndex]) {
                maxIndex = i;
            }
        }

        List<Integer> result = new ArrayList<>();
        while (maxIndex != 0) {
            result.add(0, sequence.get(maxIndex));
            maxIndex = indices[maxIndex];
        }
        result.add(0, sequence.get(maxIndex));

        return result;
    }

    public static List<Integer> LIS1(List<Integer> sequence1) {
        if (sequence1 == null || sequence1.isEmpty()) {
            System.out.println("É necessario ao menos um número");
            return Collections.emptyList();
        }

        int n = sequence1.size();
        int[] lengths = new int[n];
        int[] indices = new int[n];
        Arrays.fill(lengths, 1);

        int maxIndex = 0;
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (sequence1.get(i) > sequence1.get(j)) {
                    if (lengths[j] + 1 > lengths[i]) {
                        lengths[i] = lengths[j] + 1;
                        indices[i] = j;
                    }
                }
            }
            if (lengths[i] > lengths[maxIndex]) {
                maxIndex = i;
            }
        }

        List<Integer> result = new ArrayList<>();
        while (maxIndex != 0) {
            result.add(0, sequence1.get(maxIndex));
            maxIndex = indices[maxIndex];
        }


        return result;
    }
}

