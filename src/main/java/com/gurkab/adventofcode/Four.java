package com.gurkab.adventofcode;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Four {

    public Integer solvePartOne() throws FileNotFoundException {
        int answer = 0;
        List<String> fileInput = new ArrayList<String>();
        List<List<String>> input = new ArrayList<>();
        File file = new File("src/main/resources/4.input");
        Scanner scanner = new Scanner(file);
        while (scanner.hasNext()) {
            fileInput.add(scanner.nextLine());
        }
        int index = 0;
        for (String line : fileInput) {
            if (line.length() == 0) {
                index++;
                continue;
            }
            for (String field : line.split(" ")) {
                try {
                    input.get(index).add(field);
                } catch (IndexOutOfBoundsException ignored) {
                    input.add(new ArrayList<>());
                    input.get(index).add(field);
                }
            }
        }

        for (List<String> list : input) {
            String evaluate = "";
            for (String field : list) {
                evaluate = new StringBuilder().append(evaluate).append(" ").append(field).toString();
            }
            if (evaluate.contains("byr:") && evaluate.contains("iyr:") && evaluate.contains("eyr:") && evaluate.contains("hgt:") && evaluate.contains("hcl:") && evaluate.contains("ecl:") && evaluate.contains("pid:")) {
                answer ++;
            }
        }

        return answer;
    }

    public Integer solvePartTwo() throws FileNotFoundException {
        int answer = 0;
        List<String> fileInput = new ArrayList<String>();
        List<List<String>> input = new ArrayList<>();
        File file = new File("src/main/resources/4.input");
        Scanner scanner = new Scanner(file);
        while (scanner.hasNext()) {
            fileInput.add(scanner.nextLine());
        }
        int index = 0;
        for (String line : fileInput) {
            if (line.length() == 0) {
                index++;
                continue;
            }
            for (String field : line.split(" ")) {
                try {
                    input.get(index).add(field);
                } catch (IndexOutOfBoundsException ignored) {
                    input.add(new ArrayList<>());
                    input.get(index).add(field);
                }
            }
        }

        mainLoop: for (List<String> list : input) {
            String evaluate = "";
            for (String field : list) {
                evaluate = new StringBuilder().append(evaluate).append(" ").append(field).toString();
            }
            if (evaluate.contains("byr:") && evaluate.contains("iyr:") && evaluate.contains("eyr:") && evaluate.contains("hgt:") && evaluate.contains("hcl:") && evaluate.contains("ecl:") && evaluate.contains("pid:")) {
                for (String field : list) {
                    String fieldType = field.split(":")[0];
                    String fieldValue = field.split(":")[1];
                    switch (fieldType) {
                        case "byr":
                            if (fieldValue.length() == 4 && (Integer.parseInt(fieldValue) >= 1920 && Integer.parseInt(fieldValue) <= 2002)) {
                                break;
                            }
                            continue mainLoop;
                        case "iyr":
                            if (fieldValue.length() == 4 && (Integer.parseInt(fieldValue) >= 2010 && Integer.parseInt(fieldValue) <= 2002)) {
                                break;
                            }
                            continue mainLoop;
                        case "eyr":
                            if (fieldValue.length() == 4 && (Integer.parseInt(fieldValue) >= 2020 && Integer.parseInt(fieldValue) <= 2030)) {
                                break;
                            }
                            continue mainLoop;
                    }
                }
            }
        }



        return null;
    }
}
