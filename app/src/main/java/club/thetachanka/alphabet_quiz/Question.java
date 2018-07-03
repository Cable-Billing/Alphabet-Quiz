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
            questions.add("A word ending int 'ing'");                   questions.add("Something made of wood");
            questions.add("A fruit");                                   questions.add("A pet's name");
            questions.add("A children's toy");                          questions.add("Something found in the kitchen");
            questions.add("A female's name");                           questions.add("Something you would find in the garden");
            questions.add("A street name");                             questions.add("A foreign capital city");
            questions.add("A country");                                 questions.add("A book of the Bible");
            questions.add("A Bible name");                              questions.add("A place in the Bible");
            questions.add("A book's name");                             questions.add("A TV series");
            questions.add("A word containing 'oo'");                    questions.add("A word containing 'll'");
            questions.add("Something you would find in the shed");      questions.add("A tool");
            questions.add("A part of the body");                        questions.add("A part of a car");
            questions.add("A colour");                                  questions.add("A piece of furniture");
            questions.add("A word containing a 'j'");                   questions.add("A musical instrument");
            questions.add("Something you would find in the office");    questions.add("A drink");
            questions.add("An element");                                questions.add("A metal");
            questions.add("A liquid");                                  questions.add("An animal");
            questions.add("A Mammal");                                  questions.add("An aquatic animal");
            questions.add("A vegetable");                               questions.add("A model of car");
        currentQuestion = questions.get(new Random().nextInt(questions.size())) + " starting with ";
    }

    /**
     * Picks a random Question from the question ArrayList and appends a letter to the end
     * @return String
     */
    public String nextQuestion() {
        currentQuestion = questions.get(new Random().nextInt(questions.size())) + " starting with ";
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
