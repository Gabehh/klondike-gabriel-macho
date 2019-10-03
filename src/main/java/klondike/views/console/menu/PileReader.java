package klondike.views.console.menu;

import klondike.utils.ClosedInterval;
import klondike.utils.IO;
import klondike.views.console.Message;

public class PileReader {

    public static int readIndex(String title) {
        return IO.readInt(Message.READ_PILE_INDEX.getMessage().replace(Message.TITLE_TAG.getMessage(), title), new ClosedInterval(1, 7)) - 1;
    }
}
