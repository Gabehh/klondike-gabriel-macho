package klondike.views.console;

public enum Message {
    NUMBER_TAG("#number"),
    SUIT_TAG("#suit"),
    FOUNDATION_TAG("#foundation"),
    GAME_TITLE("*********************KLONDIKE*********************"),
    GAME_END("**************************************************"),
    STOCK_TITLE("STOCK: "),
    WASTE_TITLE("WASTE: "),
    FOUNDATIONS_TITLE("FOUNDATIONS: "),
    PILES_TITLE("PILES:"),
    FOUNDATION_TITLE(FOUNDATION_TAG.getMessage() + ": "),
    EMPTY("empty"),
    FACE_DOWN("XXXX"),
    CARD_FORMAT(NUMBER_TAG.getMessage()  + " of " + SUIT_TAG.getMessage() ),
    RESUME("Do you want to resume?"),
    TITLE_TAG("#title"),
    READ_PILE_INDEX("Choose the " + TITLE_TAG.getMessage()  + " pile number(1-7): "),
    DESTINATION("destination"),
    ORIGIN("origin"),
    READ_NUMBER_OF_CARDS("How many cards do you want to move?: "),
    READ_SUIT("Choose a suit (H/D/C/P): "),
    INVALID_MOVE("Invalid move");
    private String message;
    Message(String message) {
        this.message = message;
    }
    public String getMessage() {
        return this.message;
    }
}
