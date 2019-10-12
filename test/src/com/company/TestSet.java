package com.company;


import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TestSet {

    public static void main(String[] args) {

        // Set deonstration using HashSet
        Set<String> hash_Set = new HashSet<String>();
        hash_Set.add("Dasuni");
        hash_Set.add("Chee");
        hash_Set.add("Hasanthi");
        hash_Set.add("Limesha");
        hash_Set.add("Chee");
        hash_Set.add("Limesha");
        hash_Set.add("Chee");
        hash_Set.add("Sajina");
        System.out.print("Set output without the duplicates");

        System.out.println(hash_Set);

        // Set deonstration using TreeSet
        System.out.print("Sorted Set after passing into TreeSet");
        Set<String> tree_Set = new TreeSet<String>(hash_Set);
        System.out.println(tree_Set);
    }

}
