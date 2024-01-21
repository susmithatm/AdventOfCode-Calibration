package com.adventofcode.calibrationsum.ServiceImpl;

import java.util.*;
import java.util.function.Function;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class CalibrationCalculatorByPattern {

    private static final String[] patterns = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    private static final Map<String, Pattern> PATTERNS = Arrays.stream(patterns)
            .collect(Collectors.toMap(Function.identity(), Pattern::compile));
    public int getCalibrationSumByPattern(List<String> input) {
        List<String> numPatternsInString = new ArrayList<String>();
        for(String line:input)
        {
            Map<Integer,String> matchedPatterns = new HashMap<>();
            StringBuilder numberBuilder = new StringBuilder();

            for (Map.Entry<String, Pattern> entry : PATTERNS.entrySet()) {
                Matcher m = entry.getValue().matcher(line);
                while(m.find())
                {
                    //System.out.println("Found pattern '" + entry.getKey() + "' at index: " + m.start());
                    matchedPatterns.put(m.start(),entry.getKey());
                }
            }
            Map<Integer,String> sortedMap = new TreeMap<>(matchedPatterns);
            for (Map.Entry<Integer, String> entry : sortedMap.entrySet()) {
                //System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
                switch(entry.getValue())
                {
                    case "1":
                    case "one":
                        numberBuilder.append("1");
                        break;
                    case "2":
                    case "two":
                        numberBuilder.append("2");
                        break;
                    case "3":
                    case "three":
                        numberBuilder.append("3");
                        break;
                    case "4":
                    case "four":
                        numberBuilder.append("4");
                        break;
                    case "5":
                    case "five":
                        numberBuilder.append("5");
                        break;
                    case "6":
                    case "six":
                        numberBuilder.append("6");
                        break;
                    case "7":
                    case "seven":
                        numberBuilder.append("7");
                        break;
                    case "8":
                    case "eight":
                        numberBuilder.append("8");
                        break;
                    case "9":
                    case "nine":
                        numberBuilder.append("9");
                        break;
                    default:
                        System.out.println("Pattern doesnt match");
                }
            }
            String nums = numberBuilder.toString();
            int size=nums.length();
            StringBuilder transformedNumBuilder = new StringBuilder();
            if(size==1)
            {
                transformedNumBuilder.append(nums.charAt(0)).append(nums.charAt(0));
            }
            else
            {
                transformedNumBuilder.append(nums.charAt(0)).append(nums.charAt(size-1));
            }
            numPatternsInString.add(transformedNumBuilder.toString());
        }
        int[] numArray = numPatternsInString.stream().mapToInt(x -> Integer.parseInt(x)).toArray();
        int sum = 0;
        for(int q=0;q<numArray.length;q++)
        {
            sum+=numArray[q];
        }
        return sum;
    }
}