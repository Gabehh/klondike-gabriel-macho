package klondike.views.console;

import klondike.models.Card;
import klondike.utils.IO;

public class CardView {

    private final Card card;

    CardView(Card card) {
        this.card = card;
    }

    public void write() {
        String number = this.card.isFacedUp() ? this.card.getNumber().toString().toLowerCase() : Message.FACE_DOWN.getMessage();
        String suit = this.card.isFacedUp() ? this.card.getSuit().toString().toLowerCase() : Message.FACE_DOWN.getMessage();
        String output = Message.CARD_FORMAT.getMessage().replace(Message.NUMBER_TAG.getMessage(), number).replace(Message.SUIT_TAG.getMessage(), suit);
        IO.write(output);
    }

    public void writeln() {
        this.write();
        IO.writeln();
    }
}
