package klondike.views.console.menu;

import klondike.models.Suit;
import klondike.utils.IO;
import klondike.views.console.Message;

public class SuitReader {

    public static Suit read() {
        char initial = IO.readChar(Message.READ_SUIT.getMessage(), Suit.initials());
        return Suit.find(initial);
    }
}
