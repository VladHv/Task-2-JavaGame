package ua.javatraining.mvc;

import java.util.ArrayList;
import java.util.List;

public class Model {


    private int attempts = 0;
    private int maxNumber = 100;
    private int minNumber = 0;
    private int userNumber;
    private final int unknownNumber = minNumber + (int)Math.floor(Math.random() * (maxNumber - minNumber));

    private List <Integer> allUserNumbers = new ArrayList<>();


    public int getUnknownNumber (){
        return  unknownNumber;
    }

    public int getMaxNumber() {
        return maxNumber;
    }

    public int getMinNumber() {
        return minNumber;
    }

    public int getUserNumber() {
        return userNumber;
    }

    public void setUserNumber(int userNumber) {
        this.userNumber = userNumber;
    }

    public String Result() {
        attempts++;
        allUserNumbers.add(userNumber);
        if (userNumber > unknownNumber) {
            maxNumber = userNumber;
            return View.NUMBER_LESS + View.USER_NUMBERS + allUserNumbers + ". " + View.DIAPASON + "from " + minNumber + " to " + maxNumber;
        } else if (userNumber < unknownNumber) {
            minNumber = userNumber;
            return View.NUMBER_GREATER + View.USER_NUMBERS + allUserNumbers + ". " + View.DIAPASON + "from " + minNumber + " to " + maxNumber;
        } else {
            return View.GUESS + unknownNumber + View.ATTEMPTS + attempts  + View.USER_NUMBERS + allUserNumbers;
        }
    }

}
