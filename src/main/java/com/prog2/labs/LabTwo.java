package com.prog2.labs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author adinashby
 *
 */

public class LabTwo {

	/**
	 * Write your test code below in the main (optional).
	 *
	 */
	public static void main(String[] args) {
            List<Integer> list = Arrays.asList(1, 3, 5, 2, 8);
        List<String> list2 = Arrays.asList("22 3 43 12 16");
        List<Integer> list2a = Arrays.asList(22, 3, 43, 12, 16);
        List<String> words = Arrays.asList("atom", "saga", "Veil", "aim", "wave", "live", "actual", "ant");

        System.out.println("Result for Average :" + averageValue(list));
        System.out.println("Result for Capitalization: " + convertToUpperCase(words));
        System.out.println("Result for Word Finding: " + filterStrings(words));
        System.out.println("Result for Labeling Numbers: " + commaSeparatedStrings(list2a));
    }

    /**
     * Please refer to the README file for question(s) description
     */
    public static Double averageValue(List<Integer> list) {
        return list.stream()
                .mapToDouble(x -> x)
                .average()
                .orElse(Double.NaN);
    }

    public static List<String> convertToUpperCase(List<String> list) {
        return list.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
    }

    public static List<String> filterStrings(List<String> list) {
        return list.stream()
                .filter(x -> x.startsWith("a") && x.length() == 3)
                .collect(Collectors.toList());
    }

    public static String commaSeparatedStrings(List<Integer> list) {
        String joinedString = list
                .stream()
                .map(x -> x % 2 == 0 ? "e" + Integer.toString(x) : "o" + Integer.toString(x))
                .collect(Collectors.joining(","));
        
        return joinedString;
    }
}