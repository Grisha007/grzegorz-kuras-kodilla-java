package com.kodilla.rps;

import java.util.Random;
import java.util.Scanner;
import static java.lang.Character.toUpperCase;

public class RockPaperScissors {
    private int computerWeaponNumber = 0;
    private int playerWeaponNumber = 0;
    private int rounds = 0;
    private int playerPoints = 0;
    private int computerPoints = 0;
    private String computerWeapon = "";
    private String playerWeapon = "";
    private String playerName = "";
    private String winner = "";
    private char playerDecision = '\0';

    public RockPaperScissors() {

    }

    public void theGame(Scanner scanner, Random random) {
        System.out.println("!!!WELCOME TO ROCK PAPER SCISSORS GAME!!!");
        System.out.println();
        System.out.print("Enter your name: ");
        playerName = scanner.nextLine();
        System.out.println();
        System.out.println("Welcome " + playerName);
        System.out.println();

        System.out.println("MENU:");
        System.out.println();
        System.out.println("S - start game");
        System.out.println("X - exit again");
        System.out.println();
        System.out.print("Enter S/X: ");
        playerDecision = toUpperCase(scanner.next().charAt(0));
        System.out.println();

        if (playerDecision == 'S') {
            System.out.println("Let is battle begin!\n");
        } else if (playerDecision == 'X') {
            System.out.println("Good bye!");
            System.exit(0);
        } else {
            System.out.println("Error occured"); //Tutaj zmienic, ze zly wybor, wybierz raz jeszcze i wrocic do opcji wyboru
        }

        System.out.print("Enter number of rounds: ");
        rounds = scanner.nextInt();
        System.out.println();

        while(playerPoints <= rounds || computerPoints <= rounds){ //Warunek do poprawy
            System.out.println("List of weapons: ");
            System.out.println();
            System.out.println("1. ROCK");
            System.out.println("2. PAPER");
            System.out.println("3. SCISSORS");
            System.out.println();

            System.out.print("Choose your weapon by enter 1, 2 or 3: ");
            playerWeaponNumber = scanner.nextInt();

            if (playerWeaponNumber == 1) {
                playerWeapon = "ROCK";
            } else if (playerWeaponNumber == 2) {
                playerWeapon = "PAPER";
            } else if (playerWeaponNumber == 3) {
                playerWeapon = "SCISSORS";
            } else {
                playerWeapon = "WEAPON IS NOT IN PLAYER ASSORTMENT!";
            }

            System.out.println();
            System.out.println("Player weapon: " + playerWeapon);
            System.out.println();

            computerWeaponNumber = random.nextInt(3) + 1;

            if (computerWeaponNumber == 1) {
                computerWeapon = "ROCK";
            } else if (computerWeaponNumber == 2) {
                computerWeapon = "PAPER";
            } else if (computerWeaponNumber == 3) {
                computerWeapon = "SCISSORS";
            } else {
                computerWeapon = "WEAPON IS NOT IN COMPUTER ASSORTMENT!";
            }

            System.out.println("Computer weapon: " + computerWeapon);
            System.out.println();

            if (playerWeapon.equals("ROCK") && computerWeapon.equals("SCISSORS")) {
                winner = "PLAYER";
                System.out.println("The winner is PLAYER\n");
            } else if (playerWeapon.equals("SCISSORS") && computerWeapon.equals("ROCK")) {
                winner = "COMPUTER";
                System.out.println("The winner is COMPUTER\n");
            } else if (playerWeapon.equals("SCISSORS") && computerWeapon.equals("PAPER")) {
                winner = "PLAYER";
                System.out.println("The winner is PLAYER\n");
            } else if (playerWeapon.equals("PAPER") && computerWeapon.equals("SCISSORS")) {
                winner = "COMPUTER";
                System.out.println("The winner is COMPUTER\n");
            } else if (playerWeapon.equals("PAPER") && computerWeapon.equals("ROCK")) {
                winner = "PLAYER";
                System.out.println("The winner is PLAYER\n");
            } else if (playerWeapon.equals("ROCK") && computerWeapon.equals("PAPER")) {
                winner = "COMPUTER";
                System.out.println("The winner is COMPUTER\n");
            } else if (playerWeapon.equals(computerWeapon)) {
                winner = "DRAW";
                System.out.println("It is a DRAW!\n");
            } else {
                System.out.println("Game status: ERROR! - Inappropriate weapon number has been choosen! Please try again.\n");
            }

            if (winner.equals("PLAYER")) {
                playerPoints++;
                System.out.println("Player points: " + playerPoints);
                System.out.println("Computer points: " + computerPoints);
                System.out.println();
            } else if (winner.equals("COMPUTER")) {
                computerPoints++;
                System.out.println("Player points: " + playerPoints);
                System.out.println("Computer points: " + computerPoints);
                System.out.println();
            } else if (winner.equals("DRAW")) {
                playerPoints++;
                computerPoints++;
                System.out.println("Player points: " + playerPoints);
                System.out.println("Computer points: " + computerPoints);
                System.out.println();
            } else {
                System.out.println("Error occured!");
                System.out.println();
            }

            if(playerPoints > computerPoints && playerPoints == rounds){
                System.out.println("Player WINS!");
            }

            if(computerPoints > playerPoints && computerPoints == rounds){
                System.out.println("Computer WINS!");
            }

            if(playerPoints == computerPoints && playerPoints == rounds && computerPoints == rounds){
                System.out.println("It is a DRAW!");
            }
        }
    }
}
