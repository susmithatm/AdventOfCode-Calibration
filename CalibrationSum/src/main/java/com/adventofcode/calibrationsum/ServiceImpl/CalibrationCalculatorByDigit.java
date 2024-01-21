package com.adventofcode.calibrationsum.ServiceImpl;

import java.util.ArrayList;
import java.util.List;

import static java.lang.System.exit;

public class CalibrationCalculatorByDigit {
    public int getCalibrationSumByDigit(List<String> input) {
        List<String> digitsInString = new ArrayList<String>();
        for (String line : input) {
            StringBuilder numberBuilder = new StringBuilder();
            for (char c : line.toCharArray()) {
                if (Character.isDigit(c)) {
                    numberBuilder.append(c);
                }
            }
            String nums = numberBuilder.toString();
            int size = nums.length();
            if(size != 0) {
                StringBuilder transformedNumBuilder = new StringBuilder();
                if (size == 1) {
                    transformedNumBuilder.append(nums.charAt(0)).append(nums.charAt(0));
                } else {
                    transformedNumBuilder.append(nums.charAt(0)).append(nums.charAt(size - 1));
                }
                digitsInString.add(transformedNumBuilder.toString());
            } else
            {
                continue;
            }
        }

        int[] numArray = digitsInString.stream().mapToInt(x -> Integer.parseInt(x)).toArray();
        int sum = 0;
        for (int q = 0; q < numArray.length; q++) {
            sum += numArray[q];
        }
        System.out.println("Calibration Sum is: " + sum);
        return sum;
    }
}

