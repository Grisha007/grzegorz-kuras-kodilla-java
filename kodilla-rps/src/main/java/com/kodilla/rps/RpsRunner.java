package com.kodilla.rps;

import java.util.Random;
import java.util.Scanner;

public class RpsRunner {
    public static void main(String[] args){
        RockPaperScissors rps = new RockPaperScissors();
        Scanner scn = new Scanner(System.in);
        Random rnd = new Random();

        rps.theGame(scn, rnd);
    }
}