package com.gurkab.adventofcode;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Four {

    public Integer solvePartOne() throws FileNotFoundException {
        final List<String> input = new ArrayList<String>();
        File file = new File("src/main/resources/4.input");
        Scanner scanner = new Scanner(file);
        int index = 0;
        while (scanner.hasNext()) {
            if (scanner.nextLine().length() == 0) {
                System.out.println("length 0!");
                index++;
                continue;
            }
            String existingString = "";
            try {
                existingString = input.get(index);
            } catch (Exception ignored) {}
            System.out.println(existingString);
            System.out.println(" ");
            System.out.println(scanner.nextLine());
            input.add(new StringBuilder().append(existingString).append(" ").append(scanner.nextLine()).toString());
            index++;
            System.out.println("made it to end index is " + index);
        }

        System.out.println(input);

        return null;

    }
}
