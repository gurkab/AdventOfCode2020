package com.gurkab.adventofcode;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Three {

    public Integer solvePartOne() throws FileNotFoundException {
        final List<String> input = new ArrayList<String>();
        File file = new File("src/main/resources/3.input");
        Scanner scanner = new Scanner(file);
        while (scanner.hasNext()) {
            input.add(scanner.nextLine());
        }

        int rightCounter = 3;
        int treeCounter = 0;
        int mapWidth = input.get(0).length();
        for (int i = 1; i < input.size(); i++) {
            if (Character.toString(input.get(i).toCharArray()[rightCounter%mapWidth]).equals("#")) {
                treeCounter++;
            }
            rightCounter=rightCounter+3;
        }

        return treeCounter;
    }
}
