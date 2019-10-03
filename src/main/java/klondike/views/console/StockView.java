package klondike.views.console;

import klondike.controllers.Controller;

public class StockView extends CardStackView {

    public StockView(Controller controller) {
        super(controller, Message.STOCK_TITLE.getMessage());
    }

    public void writeln() {
        super.writeln(this.controller.peekStock());
    }
}
