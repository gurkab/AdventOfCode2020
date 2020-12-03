package com.gurkab.adventofcode;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigDecimal;
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

    public BigDecimal solvePartTwo() throws FileNotFoundException {
        final List<String> input = new ArrayList<String>();
        File file = new File("src/main/resources/3.input");
        Scanner scanner = new Scanner(file);
        while (scanner.hasNext()) {
            input.add(scanner.nextLine());
        }

        int firstRightCounter = 1;
        int firstTreeCounter = 0;
        int secondRightCounter = 3;
        int secondTreeCounter = 0;
        int thirdRightCounter = 5;
        int thirdTreeCounter = 0;
        int fourthRightCounter = 7;
        int fourthTreeCounter = 0;
        int fifthRightCounter = 1;
        int fifthTreeCounter = 0;
        int mapWidth = input.get(0).length();
        for (int i = 1; i < input.size(); i++) {
            if (Character.toString(input.get(i).toCharArray()[firstRightCounter % mapWidth]).equals("#")) {
                firstTreeCounter++;
            }
            firstRightCounter = firstRightCounter + 1;
            if (Character.toString(input.get(i).toCharArray()[secondRightCounter % mapWidth]).equals("#")) {
                secondTreeCounter++;
            }
            secondRightCounter = secondRightCounter + 3;
            if (Character.toString(input.get(i).toCharArray()[thirdRightCounter % mapWidth]).equals("#")) {
                thirdTreeCounter++;
            }
            thirdRightCounter = thirdRightCounter + 5;
            if (Character.toString(input.get(i).toCharArray()[fourthRightCounter % mapWidth]).equals("#")) {
                fourthTreeCounter++;
            }
            fourthRightCounter = fourthRightCounter + 7;
            if (i%2 == 0) {
                if (Character.toString(input.get(i).toCharArray()[fifthRightCounter % mapWidth]).equals("#")) {
                    fifthTreeCounter++;
                }
                fifthRightCounter = fifthRightCounter + 1;
            }
        }

        return new BigDecimal(firstTreeCounter)
                .multiply(new BigDecimal(secondTreeCounter)
                        .multiply(new BigDecimal(thirdTreeCounter)
                                .multiply(new BigDecimal(fourthTreeCounter)
                                        .multiply(new BigDecimal(fifthTreeCounter)))));
    }
}
