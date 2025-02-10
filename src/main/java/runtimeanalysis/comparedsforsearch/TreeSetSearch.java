package runtimeanalysis.comparedsforsearch;

import java.util.TreeSet;

/**
 * Class to perform search in a TreeSet.
 * Time Complexity: O(log N) - Logarithmic time lookup.
 */
public class TreeSetSearch {

    //Searches for a target element in a TreeSet.

    public static boolean search(TreeSet<Integer> set, int target) {
        return set.contains(target);
    }
}
