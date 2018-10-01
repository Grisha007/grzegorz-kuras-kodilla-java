package com.kodilla.rps;

public class RockPaperScissors {
    private String playerName = "";
    private String playerWeapon = "";
    private String computerWeapon = "";
    private int roundsNumber = 0;
    private int currentRound = 0;
    private int playerScore = 0;
    private int computerScore = 0;

    public void theGame() {
        playerName = UserDialog.getUsername();
        UserDialog.sayHello(playerName);
        UserDialog.mainMenu();
        roundsNumber = UserDialog.rounds();
        while (currentRound < roundsNumber) {
            UserDialog.weapons();
            playerWeapon = UserDialog.playerWeaponChoice();
            computerWeapon = UserDialog.computerWeaponChoice();
            calculatorWinner(playerWeapon, computerWeapon);
            currentRound++;

            UserDialog.showStatistics(currentRound, roundsNumber, playerScore, computerScore);
        }
        UserDialog.showFinalWinner(playerScore, computerScore);
    }

    public void calculatorWinner(String playerWeapon, String computerWeapon) {
        String winner = "";
        if (playerWeapon.equals("ROCK") && computerWeapon.equals("SCISSORS")) {
            winner = "PLAYER";
            playerScore++;
        } else if (playerWeapon.equals("SCISSORS") && computerWeapon.equals("ROCK")) {
            winner = "COMPUTER";
            computerScore++;
        } else if (playerWeapon.equals("SCISSORS") && computerWeapon.equals("PAPER")) {
            winner = "PLAYER";
            playerScore++;
        } else if (playerWeapon.equals("PAPER") && computerWeapon.equals("SCISSORS")) {
            winner = "COMPUTER";
            computerScore++;
        } else if (playerWeapon.equals("PAPER") && computerWeapon.equals("ROCK")) {
            winner = "PLAYER";
            playerScore++;
        } else if (playerWeapon.equals("ROCK") && computerWeapon.equals("PAPER")) {
            winner = "COMPUTER";
            computerScore++;
        } else if (playerWeapon.equals(computerWeapon)) {
            winner = "DRAW";
            playerScore++;
            computerScore++;
        }
        UserDialog.showWinner(winner);
    }
}
