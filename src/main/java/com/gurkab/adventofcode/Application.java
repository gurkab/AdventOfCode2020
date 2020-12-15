package com.gurkab.adventofcode;

import java.io.FileNotFoundException;

public class Application {

    public static void main(String[] args) throws FileNotFoundException {
        One one = new One();
        System.out.println(one.solvePartOne());
        System.out.println(one.solvePartTwo());
        Two two = new Two();
        System.out.println(two.solvePartOne());
        System.out.println(two.solvePartTwo());
        Three three = new Three();
        System.out.println(three.solvePartOne());
        System.out.println(three.solvePartTwo());
        Four four = new Four();
        System.out.println(four.solvePartOne());
    }

}
