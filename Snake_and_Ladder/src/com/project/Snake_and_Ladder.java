package com.project;

    import java.util.Hashtable;
    import java.util.Random;
    import java.util.Scanner;

    public class Snake_and_Ladder {

        static Random random = new Random();
        static Scanner scanner = new Scanner(System.in);
        //Hashtable <Name, player position>
        static Hashtable<String, Integer> playerData = new Hashtable<>();

        static void setPlayerData() {
            playerData.put("Player 1", 0);
            playerData.put("Player 2", 0);
        }

        static int dice() {
            System.out.print("Roll the Dice (True/False) ? "); //Player Event to roll the dice or skip the turn
            boolean playerEvent = scanner.nextBoolean();
            if (playerEvent) {
                int roll = random.nextInt(6) + 1;
                System.out.print("You got - " + roll + "\n");
                return roll;
            } else {
                System.out.println("Chance Passed!!");
                return 0;
            }
        }

        static int gameEvent() {
            return random.nextInt(3);
        }

        static void posUpdate(String playerName, int move, int option) {
            switch (option) {
                case 0 -> System.out.println("No Move.");
                case 1 -> {
                    System.out.println("Game Event: Ladders");
                    if (getPos(playerName) + move > 100) {
                        System.out.println("Cant move further till you get exactly 100");//Player can't move further
                    } else {
                        System.out.println("LADDERS. Move Ahead " + move + " steps.");
                        playerData.computeIfPresent(playerName, (key, val) -> val + move);
                    }
                }
                case 2 -> {
                    if (getPos(playerName) <= 0) {
                        System.out.println("SNAKES. You are back to 0. Lol.");//Player can't move below 0.
                        resetPos(playerName);  // Set instead of get. Make a new Variable<========================
                    } else {
                        System.out.println("SNAKES. Go back " + move + " steps.");
                        playerData.computeIfPresent(playerName, (key, val) -> val - move);
                    }
                }
            }
        }

        static void resetPos(String name) {
            playerData.put(name, 0);
        }

        static int getPos(String name) {
            return playerData.get(name);
        }

        public static void main(String[] args) throws InterruptedException {
            System.out.println("Welcome To Snakes and Ladders!!");
            Thread.sleep(1000);
            setPlayerData();
            int dice1 = 0;
            int dice2 = 0;
            int playerChance = 0;

            while (getPos("Player 1") != 100 && getPos("Player 2") != 100) {
                switch (playerChance) {
                    case 0 -> {
                        System.out.println("Player 1's turn.");//PLayer One Turn
                        int move = dice();
                        dice1++;
                        Thread.sleep(1000);
                        int eventOption = gameEvent();
                        posUpdate("Player 1", move, eventOption);
                        System.out.println("You are at " + getPos("Player 1"));
                        System.out.println("==================================");
                        playerChance += 1;//Passing the Chance
                    }
                    case 1 -> {
                        System.out.println("Player 2's turn.");//PLayer Two Turn
                        int move = dice();
                        dice2++;
                        Thread.sleep(1000);
                        int eventOption = gameEvent();
                        posUpdate("Player 2", move, eventOption);
                        System.out.println("You are at " + getPos("Player 2"));
                        System.out.println("==================================");
                        playerChance -= 1;//Passing the Chance
                    }
                }
                Thread.sleep(1000);
            }
            if (getPos("Player 1") == 100) {
                System.out.println("Player 1 Won!");
                System.out.println("Dice rolls : " + dice1);
            } else if (getPos("Player 2") == 100) {
                System.out.println("Player 2 Won!");
                System.out.println("Dice rolls : " + dice2);
            }
        }
    }