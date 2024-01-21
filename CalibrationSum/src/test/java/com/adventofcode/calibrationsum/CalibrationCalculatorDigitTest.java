package com.adventofcode.calibrationsum;

import com.adventofcode.calibrationsum.ServiceImpl.CalibrationCalculatorByDigit;
import org.junit.jupiter.api.Test;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CalibrationCalculatorDigitTest
{
    @Test
    void getCalibrationSumByDigit()
    {
            CalibrationCalculatorByDigit calibrationCalculatorByDigit = new CalibrationCalculatorByDigit();
            int actual = calibrationCalculatorByDigit.getCalibrationSumByDigit(List.of("one2nqninenmvnpsz874","8twofpmpxkvvdnpdnlpkhseven4ncgkbone"));
            assertEquals(actual,108);
            int actual1 = calibrationCalculatorByDigit.getCalibrationSumByDigit(List.of("23abc090","898tr21e"));
            assertEquals(actual1,101);
            int actual2 = calibrationCalculatorByDigit.getCalibrationSumByDigit(List.of("2hgjgjh","9hnmjhjm"));
            assertEquals(actual2,121);
            int actual3 = calibrationCalculatorByDigit.getCalibrationSumByDigit(List.of("1ew2","tr4"));
            assertEquals(actual3,56);
            int actual4 = calibrationCalculatorByDigit.getCalibrationSumByDigit(List.of("0"));
            assertEquals(actual4,0);
            int actual5 = calibrationCalculatorByDigit.getCalibrationSumByDigit(List.of("abcd","uiop"));
            assertEquals(actual5,0);
            int actual6 = calibrationCalculatorByDigit.getCalibrationSumByDigit(List.of("1","2"));
            assertEquals(actual6,33);
            int actual7 = calibrationCalculatorByDigit.getCalibrationSumByDigit(List.of("wert","8twofpmpncgkbone"));
            assertEquals(actual7,88);
            int actual8 = calibrationCalculatorByDigit.getCalibrationSumByDigit(List.of("abc","qwerty","545ef"));
            assertEquals(actual8,55);
            int actual9 = calibrationCalculatorByDigit.getCalibrationSumByDigit(List.of(""));
            assertEquals(actual9,0);
            //In the JSON Response of the REST API, NULL along with Status Code 400 is thrown in the above case, but here, only the Method is tested and the Method returns 0 when "" is input
    }
}