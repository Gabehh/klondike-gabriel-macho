package klondike.views.console.menu;

import klondike.controllers.MoveController;
import klondike.models.Error;
import klondike.models.Suit;
import klondike.views.console.Message;

public class MoveFromPileToFoundationCommand extends Command {

    public MoveFromPileToFoundationCommand(MoveController moveController) {
        super(CommandTitle.PILE2FOUNDATION_COMMAND.getTitle(), moveController);
    }

    @Override
    protected Error move() {
        int pileIndex = PileReader.readIndex(Message.ORIGIN.getMessage());
        Suit suit = SuitReader.read();
        return this.moveController.moveFromPileToFoundation(pileIndex, suit);
    }
}
