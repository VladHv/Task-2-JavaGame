package ua.javatraining.mvc;

public class View {

    public static final String LETS_PLAY = "Guess the number ";
    public static final String NUMBER_LESS = "My number is less. ";
    public static final String NUMBER_GREATER = "My number is greater. ";
    public static final String WRONG_INPUT = "Unacceptable value. Please, input only required number ";
    public static final String DIAPASON = "Try next range of numbers - ";
    public static final String GUESS = "Hooray! My hidden number: ";
    public static final String ATTEMPTS = "\nAmount of your correct attempts: ";

    public void printMessage (String message) {
        System.out.println(message);
    }

    public void printMessage (int message) {
        System.out.println(message);
    }

}
