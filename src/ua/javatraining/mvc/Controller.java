package ua.javatraining.mvc;

import java.util.Scanner;

public class Controller {

    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void processUser() {
        Scanner sc = new Scanner(System.in);
        view.printMessage(View.LETS_PLAY + "from " + model.getMinNumber() + " to " + model.getMaxNumber());
        while (model.getUserNumber() != model.getUnknownNumber()) {
            model.setUserNumber(inputIntValueWithScannerAndDiapason(sc));
            view.printMessage(model.Result());
        }
    }

    //validator
    public int inputIntValueWithScannerAndDiapason (Scanner sc) {
        int res = 0;

        while (true) {
            while (! sc.hasNextInt()) {
                view.printMessage(View.WRONG_INPUT + "from " + model.getMinNumber() + " to " + model.getMaxNumber());
                sc.next();
            }
            if ((res = sc.nextInt()) <= model.getMinNumber() || res >= model.getMaxNumber()) {
                view.printMessage(View.WRONG_INPUT + "from " + model.getMinNumber() + " to " + model.getMaxNumber());
                continue;
            } break;
        }
        return res;
    }

}
