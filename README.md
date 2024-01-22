# AdventOfCode-CalibrationService
Calculate Calibration Sum - Task from Advent Of Code 2023

Derived Solutions for Advent Of Code Year 2023, Day 1, 2 Tasks:

First Task was to identify Digits from each String input from the List of Strings and Find the Calibration Sum according to the description.
This is Implemented in Class CalibrationCalculatorByDigit.

Second Task was to identify both Digits and "Numbers in Words", for example, one, two, three,..etc. from each String input from the List of Strings and Find the Calibration Sum according to the description. This is Implemented in the Class CalibrationCalculatorByPattern.

Wrapped the Solution as a Java 17 SpringBootApplication built with Maven and is pushed to the Repository here.

Junit Test Cases for the First Solution is Implemented in the Test Class, CalibrationCalculatorDigitTest.

WORKFLOW:
Controler Class, CalibrationController -> Service Class, CalibrationService -> Service Implementation Classes, CalibrationCalculatorByDigit and CalibrationCalculatorByPattern

REST API:
Implementation of CalibrationCalculatorByDigit (Advent of Code, Year 2023, Day 1, Task 1);
http://localhost:8080/calibration-sum/digit

Implementation of CalibrationCalculatorByPattern (Advent of Code, Year 2023, Day 1, Task 2);
http://localhost:8080/calibration-sum/pattern

POST http://localhost:8080/calibration-sum/digit
Body:
Content-Type: text/plain
SampleInput: https://adventofcode.com/2023/day/1/input
Response:
{
    "calibrationSum": 56397
}

POST http://localhost:8080/calibration-sum/pattern
Body:
Content-Type: text/plain
SampleInput: https://adventofcode.com/2023/day/1/input
Response:
{
    "calibrationSum": 55701
}
