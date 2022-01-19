package com.bridgelabz;
import java.lang.Math;
import java.util.ArrayList;
import java.util.*;
public class DeckofCards {

        static String[] suits = {"Hearts", "Spades", "Clubs", "Diamonds"};
        static String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        static ArrayList<String> deck = new ArrayList<String>(52);
        static ArrayList<String> playerOne = new ArrayList<String>(9);
        static ArrayList<String> playerTwo = new ArrayList<String>(9);
        static ArrayList<String> playerThree = new ArrayList<String>(9);
        static ArrayList<String> playerFour = new ArrayList<String>(9);

        //    function to build the deck
        static void deckBuilder(){
            for (String suit : suits) {
                for (String rank : ranks) {
                    deck.add((rank + " of " + suit));
                }
            }
        }

        //    function to distribute the cards
        static void distributeCards(){
            int count = 0;
            Random random = new Random();
            while(count < 9){
                int cardOne = random.nextInt(deck.size());
                while(playerOne.contains(deck.get(cardOne))){
                    cardOne = random.nextInt(deck.size());
                }
                playerOne.add(deck.get(cardOne));
                deck.remove(deck.get(cardOne));

                int cardTwo = random.nextInt(deck.size());
                while(playerTwo.contains(deck.get(cardTwo))){
                    cardTwo = random.nextInt(deck.size());
                }
                playerTwo.add(deck.get(cardTwo));
                deck.remove(deck.get(cardTwo));

                int cardThree = random.nextInt(deck.size());
                while(playerThree.contains(deck.get(cardThree))){
                    cardThree = random.nextInt(deck.size());
                }
                playerThree.add(deck.get(cardThree));
                deck.remove(deck.get(cardThree));

                int cardFour = random.nextInt(deck.size());
                while(playerFour.contains(deck.get(cardFour))){
                    cardFour = random.nextInt(deck.size());
                }
                playerFour.add(deck.get(cardFour));
                deck.remove(deck.get(cardFour));
                count++;
            }
            System.out.println("Player One: ");
            System.out.println(playerOne);
            System.out.println("Player Two: ");
            System.out.println(playerTwo);
            System.out.println("Player Three: ");
            System.out.println(playerThree);
            System.out.println("Player Four: ");
            System.out.println(playerFour);
        }

        //main function
        public static void main(String[] args) {
            System.out.println("Welcome to the Deck of Cards");
            deckBuilder();
            distributeCards();
        }
    }