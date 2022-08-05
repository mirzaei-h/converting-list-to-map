package com.collection;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TopFrequentCharacters {
    public static void main(String[] args) {

        List<String> inputList = Arrays.asList("x", "x", "x", "z", "y", "z", "z", "y", "z", "y", "z");
        System.out.println("Input List: "+ inputList);

        Map<String, Long> resultMap =  inputList.stream().sorted().collect(Collectors.groupingBy
                        (Function.identity(), Collectors.counting()));

        System.out.println("result Map: "+ resultMap);

    }
}