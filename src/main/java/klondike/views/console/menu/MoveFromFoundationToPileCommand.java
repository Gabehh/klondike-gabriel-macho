package klondike.views.console.menu;

import klondike.controllers.MoveController;
import klondike.models.Error;
import klondike.models.Suit;
import klondike.views.console.Message;

public class MoveFromFoundationToPileCommand extends Command {

    public MoveFromFoundationToPileCommand(MoveController moveController) {
        super(CommandTitle.FOUNDATION2PILE_COMMAND.getTitle(), moveController);
    }

    @Override
    protected Error move() {
        Suit suit = SuitReader.read();
        int pileIndex = PileReader.readIndex(Message.DESTINATION.getMessage());
        return this.moveController.moveFromFoundationToPile(suit, pileIndex);
    }
}
