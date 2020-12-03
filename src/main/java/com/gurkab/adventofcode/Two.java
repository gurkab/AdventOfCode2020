package com.gurkab.adventofcode;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Two {

    public Integer solvePartOne() throws FileNotFoundException {
        Integer answer = 0;
        final List<String> input = new ArrayList<String>();
        File file = new File("src/main/resources/2.input");
        Scanner scanner = new Scanner(file);
        while (scanner.hasNext()) {
            input.add(scanner.nextLine());
        }

        for (String s : input) {
            if (isPasswordValidPartOne(s)) {
                answer++;
            }
        }

        return answer;
    }

    public boolean isPasswordValidPartOne(String input) {
        int min = Integer.parseInt(input.split(" ")[0].split("-")[0]);
        int max = Integer.parseInt(input.split(" ")[0].split("-")[1]);
        String requirement = input.split(" ")[1].replaceAll(":","");
        String password = input.split(" ")[2];
        int count = 0;
        for (int i =0; i < password.toCharArray().length; i++) {
            if (Character.toString(password.toCharArray()[i]).equals(requirement)) {
                count++;
            }
        }

        return count >= min && count <= max;
    }

    public Integer solvePartTwo() throws FileNotFoundException {
        Integer answer = 0;
        final List<String> input = new ArrayList<String>();
        File file = new File("src/main/resources/2.input");
        Scanner scanner = new Scanner(file);
        while (scanner.hasNext()) {
            input.add(scanner.nextLine());
        }

        for (String s : input) {
            if (isPasswordValidPartTwo(s)) {
                answer++;
            }
        }

        return answer;
    }

    public boolean isPasswordValidPartTwo(String input) {
        int position1 = Integer.parseInt(input.split(" ")[0].split("-")[0]);
        int position2 = Integer.parseInt(input.split(" ")[0].split("-")[1]);
        String requirement = input.split(" ")[1].replaceAll(":","");
        String password = input.split(" ")[2];

        if (Character.toString(password.toCharArray()[position1 - 1]).equals(requirement) && Character.toString(password.toCharArray()[position2 - 1]).equals(requirement)) {
            return false;
        } else return Character.toString(password.toCharArray()[position1 - 1]).equals(requirement) || Character.toString(password.toCharArray()[position2 - 1]).equals(requirement);
    }

}
