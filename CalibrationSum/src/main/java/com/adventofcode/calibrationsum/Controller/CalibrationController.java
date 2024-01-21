package com.adventofcode.calibrationsum.Controller;

import com.adventofcode.calibrationsum.DTO.CalibrationResponse;
import com.adventofcode.calibrationsum.Service.CalibrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.Arrays;
import java.util.List;

@RestController
public class CalibrationController {
    @Autowired
    CalibrationService calibrationService;
    @PostMapping("calibration-sum/digit")
    public ResponseEntity<CalibrationResponse> getCalibrationSumDigit(@RequestBody String input)
    {
        String[] inputArray = input.split("\n");
        List<String> inputList = Arrays.asList(inputArray);
        return calibrationService.getCalibrationSumDigit(inputList);
    }
    @PostMapping("calibration-sum/pattern")
    public ResponseEntity<CalibrationResponse> getCalibrationSumPattern(@RequestBody String input)
    {
        String[] inputArray = input.split("\n");
        List<String> inputList = Arrays.asList(inputArray);
        return calibrationService.getCalibrationSumPattern(inputList);
    }
}
