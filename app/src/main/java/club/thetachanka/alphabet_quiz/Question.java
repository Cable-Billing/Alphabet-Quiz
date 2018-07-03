package club.thetachanka.alphabet_quiz;

import java.util.ArrayList;
import java.util.Random;

public class Question {
    Alphabet alphabet;
    ArrayList<String> questions;
    String currentQuestion;

    /**
     * Constructor for the Question class
     * Initialises: alphabet, questions and the currentQuestion
     */
    public Question() {
        alphabet = new Alphabet();
        questions = new ArrayList<>();
            questions.add("a word ending int 'ing'");                   questions.add("something made of wood");
            questions.add("a fruit");                                   questions.add("a pet's name");
            questions.add("a children's toy");                          questions.add("something found in the kitchen");
            questions.add("a female's name");                           questions.add("something you would find in the garden");
            questions.add("a street name");                             questions.add("a foreign capital city");
            questions.add("a country");                                 questions.add("a book of the Bible");
            questions.add("a Bible name");                              questions.add("a place in the Bible");
            questions.add("a title of a book");                         questions.add("a TV series");
            questions.add("a word containing 'oo'");                    questions.add("a word containing 'll'");
            questions.add("something you would find in the shed");      questions.add("a tool");
            questions.add("a part of the body");                        questions.add("a part of a car");
            questions.add("a colour");                                  questions.add("a piece of furniture");
            questions.add("a word containing a 'j'");                   questions.add("a musical instrument");
            questions.add("something you would find in the office");    questions.add("a drink");
            questions.add("an element");                                questions.add("a metal");
            questions.add("a liquid");                                  questions.add("an animal");
            questions.add("a Mammal");                                  questions.add("an aquatic animal");
            questions.add("a vegetable");                               questions.add("a model of car");
            questions.add("a board game");                              questions.add("something you would find in a classroom");
            questions.add("a sport");                                   questions.add("a video game");
            questions.add("an unhealthy snack");                        questions.add("something you would find in a forest");
            questions.add("a song");                                    questions.add("a singer");
            questions.add("a famous composer");                         questions.add("a hobby");
            questions.add("something that you would find on a farm");   questions.add("a word ending in 'ion'");
            questions.add("a word containing 'ch'");                    questions.add("a word containing 'sh'");
        currentQuestion = "Name " + questions.get(new Random().nextInt(questions.size())) + " starting with ";
    }

    /**
     * Picks a random Question from the question ArrayList and appends a letter to the end
     * @return String
     */
    public String nextQuestion() {
        currentQuestion = "Name " + questions.get(new Random().nextInt(questions.size())) + " starting with ";
        return currentQuestion + alphabet.randomLetter();
    }

    /**
     * Uses the same Question as before but with a new letter appended to the end
     * @return String
     */
    public String repeatQuestion() {
        return currentQuestion + alphabet.randomLetter();
    }
}
