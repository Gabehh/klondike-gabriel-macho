package klondike.views.console;

import klondike.controllers.Controller;

public class WasteView extends CardStackView {


    public WasteView(Controller controller) {
        super(controller, Message.WASTE_TITLE.getMessage());
    }

    public void writeln() {
        super.writeln(this.controller.peekWaste());
    }
}
