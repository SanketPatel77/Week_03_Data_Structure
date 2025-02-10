package runtimeanalysis.comparedsforsearch;

import java.util.HashSet;

/**
 * Class to perform search in a HashSet.
 * Time Complexity: O(1) on average - Constant time lookup.
 */
public class HashSetSearch {

    //Searches for a target element in a HashSet.

    public static boolean search(HashSet<Integer> set, int target) {
        return set.contains(target);
    }
}
