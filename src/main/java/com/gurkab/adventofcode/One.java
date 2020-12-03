package com.gurkab.adventofcode;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class One {

    public Integer solvePartOne() throws FileNotFoundException {
        final List<String> input = new ArrayList<String>();
        File file = new File("src/main/resources/1.input");
        Scanner scanner = new Scanner(file);
        while (scanner.hasNext()) {
            input.add(scanner.nextLine());
        }

        for (int i =0; i < input.size(); i++) {
            for (int j = 1; j < input.size(); j++) {
                if (Integer.parseInt(input.get(i)) + Integer.parseInt(input.get(j)) == 2020) {
                    return Integer.parseInt(input.get(i))*Integer.parseInt(input.get(j));
                }
            }
        }

        return null;
    }

    public Integer solvePartTwo() throws FileNotFoundException {
        final List<String> input = new ArrayList<String>();
        File file = new File("src/main/resources/1.input");
        Scanner scanner = new Scanner(file);
        while (scanner.hasNext()) {
            input.add(scanner.nextLine());
        }

        for (int i =0; i < input.size(); i++) {
            for (int j = 1; j < input.size(); j++) {
                for (int k = 2; k < input.size(); k++) {
                    if (Integer.parseInt(input.get(i)) + Integer.parseInt(input.get(j)) + Integer.parseInt(input.get(k)) == 2020) {
                        return Integer.parseInt(input.get(i))*Integer.parseInt(input.get(j))*Integer.parseInt(input.get(k));
                    }
                }
            }
        }

        return null;
    }
}
