package by.itstep.vikvik.megashopproject.controller;

import by.itstep.vikvik.megashopproject.util.exceptions.BasketFileNotFoundException;

public class Main extends Object {

    public static void main(String[] arg) throws BasketFileNotFoundException {
        ControllerSimpleFactory.ControllerType type = ControllerSimpleFactory.ControllerType.FIRST;

        AbstractController controller = ControllerSimpleFactory.getController(type);
        controller.justDoIt();

    }
}
