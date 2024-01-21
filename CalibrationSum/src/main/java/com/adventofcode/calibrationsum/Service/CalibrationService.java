package com.adventofcode.calibrationsum.Service;
import com.adventofcode.calibrationsum.ServiceImpl.CalibrationCalculatorByDigit;
import com.adventofcode.calibrationsum.ServiceImpl.CalibrationCalculatorByPattern;
import com.adventofcode.calibrationsum.DTO.CalibrationResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class CalibrationService {
    CalibrationResponse calibrationResponse = new CalibrationResponse();
    public ResponseEntity<CalibrationResponse> getCalibrationSumDigit(List<String> input)
    {
        try
        {
            CalibrationCalculatorByDigit calibrationCalculatorByDigit = new CalibrationCalculatorByDigit();
            int sum = calibrationCalculatorByDigit.getCalibrationSumByDigit(input);
            calibrationResponse.setCalibrationSum(sum);
            return new ResponseEntity<>(calibrationResponse, HttpStatus.OK);
        } catch (StringIndexOutOfBoundsException e)
        {
            System.out.println("Input cannot be NULL");
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        }

    }
    public ResponseEntity<CalibrationResponse> getCalibrationSumPattern(List<String> input)
    {
        try
        {
            CalibrationCalculatorByPattern calibrationCalculatorByPattern = new CalibrationCalculatorByPattern();
            int sum = calibrationCalculatorByPattern.getCalibrationSumByPattern(input);
            calibrationResponse.setCalibrationSum(sum);
            return new ResponseEntity<>(calibrationResponse, HttpStatus.OK);
        } catch (StringIndexOutOfBoundsException e)
        {
            System.out.println("Input cannot be NULL");
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        }
    }
}
