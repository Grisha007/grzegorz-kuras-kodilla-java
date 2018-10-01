package com.kodilla.rps;

import java.util.Random;
import java.util.Scanner;

import static java.lang.Character.toUpperCase;

public class UserDialog {

    public static String getUsername() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("!!!WELCOME TO ROCK PAPER SCISSORS GAME!!!");
        System.out.println();

        while (true) {
            System.out.print("Enter your name: ");
            String playerName = scanner.nextLine();
            if (playerName.length() < 2) {
                System.out.println("Wrong name!");
            } else {
                return playerName;
            }
        }
    }

    public static void sayHello(String playerName) {
        System.out.println();
        System.out.println("Welcome " + playerName);
        System.out.println();
    }

    public static boolean mainMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("MENU:");
        System.out.println();
        System.out.println("S - start game");
        System.out.println("X - exit again");
        System.out.println();
        while (true) {
            System.out.print("Enter S/X: ");
            char playerDecision = toUpperCase(scanner.next().charAt(0));
            System.out.println();

            if (playerDecision == 'S') {
                System.out.println("Let is battle begin!\n");
                return true;
            } else if (playerDecision == 'X') {
                System.out.println("Good bye!");
                System.exit(0);
            } else {
                System.out.println("Error occured");
            }
        }
    }

    public static int rounds() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter number of rounds: ");
            try {
                String s = scanner.nextLine();
                int result = Integer.parseInt(s);
                return result;
            } catch (Exception e) {
                System.out.println("Wrong data!");
            }
        }
    }

    public static void weapons() {
        System.out.println("List of weapons: ");
        System.out.println();
        System.out.println("1. ROCK");
        System.out.println("2. PAPER");
        System.out.println("3. SCISSORS");
        System.out.println();
    }

    public static String playerWeaponChoice() {
        String playerWeapon;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Choose your weapon by enter 1, 2 or 3: ");
            try {
                String s = scanner.nextLine();
                int playerWeaponNumber = Integer.parseInt(s);
                System.out.println();

                if (playerWeaponNumber == 1) {
                    playerWeapon = "ROCK";
                    System.out.println("Player weapon: " + playerWeapon);
                    return playerWeapon;
                } else if (playerWeaponNumber == 2) {
                    playerWeapon = "PAPER";
                    System.out.println("Player weapon: " + playerWeapon);
                    return playerWeapon;
                } else if (playerWeaponNumber == 3) {
                    playerWeapon = "SCISSORS";
                    System.out.println("Player weapon: " + playerWeapon);
                    return playerWeapon;
                }
            } catch (Exception e) {
                playerWeapon = "WEAPON IS NOT IN PLAYER ASSORTMENT!";
                System.out.println(playerWeapon);
            }
        }
    }

    public static String computerWeaponChoice() {
        String computerWeapon;
        Random random = new Random();
        int computerWeaponNumber = random.nextInt(3) + 1;

        if (computerWeaponNumber == 1) {
            computerWeapon = "ROCK";
            System.out.println("Computer weapon: " + computerWeapon);
            System.out.println();
            return computerWeapon;
        } else if (computerWeaponNumber == 2) {
            computerWeapon = "PAPER";
            System.out.println("Computer weapon: " + computerWeapon);
            System.out.println();
            return computerWeapon;
        } else if (computerWeaponNumber == 3) {
            computerWeapon = "SCISSORS";
            System.out.println("Computer weapon: " + computerWeapon);
            System.out.println();
            return computerWeapon;
        } else {
            computerWeapon = "WEAPON IS NOT IN COMPUTER ASSORTMENT!";
            System.out.println(computerWeapon);
            System.out.println();
            return computerWeapon;
        }
    }

    public static void showWinner(String winner) {
        System.out.println("Round winner is: " + winner);
        System.out.println();
    }

    public static void showStatistics(int currentRound, int roundsNumber, int playerScore, int computerScore) {
        System.out.println("Player points: " + playerScore);
        System.out.println("Computer points: " + computerScore);
        System.out.println();
        System.out.println("Round number " + currentRound + " of " + roundsNumber);
        System.out.println();
    }

    public static void showFinalWinner(int playerScore, int computerScore) {
        if (playerScore > computerScore) {
            System.out.println("PLAYER is the final winner!");
        } else if (computerScore > playerScore) {
            System.out.println("COMPUTER is the final winner!");
        } else {
            System.out.println("PLAYER and COMPUTER are the winners!");
        }
    }
}