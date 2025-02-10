package runtimeanalysis.comparedsforsearch;

import java.util.HashSet;
import java.util.TreeSet;

/**
 * Class to compare search performance in Array, HashSet, and TreeSet.
 */
public class SearchComparison {

    public static void main(String[] args) {
        int dataSize = 1_000_000; // Define dataset size
        int target = dataSize - 1; // Target element to search

        // Generate test data
        int[] array = new int[dataSize];
        HashSet<Integer> hashSet = new HashSet<>();
        TreeSet<Integer> treeSet = new TreeSet<>();

        for (int i = 0; i < dataSize; i++) {
            array[i] = i;
            hashSet.add(i);
            treeSet.add(i);
        }

        // Measure search time for Array (O(N))
        long startTime = System.currentTimeMillis();
        boolean foundInArray = ArraySearch.search(array, target);
        long endTime = System.currentTimeMillis();
        System.out.println("Array Search (O(N)) - Time: " + (endTime - startTime) + " ms, Found: " + foundInArray);

        // Measure search time for HashSet (O(1))
        startTime = System.currentTimeMillis();
        boolean foundInHashSet = HashSetSearch.search(hashSet, target);
        endTime = System.currentTimeMillis();
        System.out.println("HashSet Search (O(1)) - Time: " + (endTime - startTime) + " ms, Found: " + foundInHashSet);

        // Measure search time for TreeSet (O(log N))
        startTime = System.currentTimeMillis();
        boolean foundInTreeSet = TreeSetSearch.search(treeSet, target);
        endTime = System.currentTimeMillis();
        System.out.println("TreeSet Search (O(log N)) - Time: " + (endTime - startTime) + " ms, Found: " + foundInTreeSet);
    }
}
