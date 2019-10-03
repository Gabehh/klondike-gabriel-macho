package klondike.views;
import klondike.controllers.MoveController;
import klondike.controllers.ResumeController;
import klondike.controllers.StartController;
import klondike.utils.YesNoDialog;
import klondike.views.console.GameView;
import klondike.views.console.Message;
import klondike.views.console.menu.PlayMenu;

public class View {

    private PlayMenu playMenu;
    protected StartController startController;
    protected MoveController moveController;
    protected ResumeController resumeController;

    public View(StartController startController, MoveController moveController, ResumeController resumeController) {
        this.startController = startController;
        this.moveController = moveController;
        this.resumeController = resumeController;
        this.playMenu = new PlayMenu(this.moveController);
    }

    public void interact() {
        boolean resume;
        do {
            this.start();
            boolean finished;
            do {
                this.move();
                finished = moveController.isGameFinished();
            } while (!finished);
            resume = this.resume();
            if (resume) resumeController.resume();
        } while (resume);
    }


    protected void start() {
        new GameView(this.startController).writeln();
    }


    protected void move() {
        this.playMenu.execute();
        new GameView(this.moveController).writeln();
    }


    protected boolean resume() {
        return new YesNoDialog().read(Message.RESUME.getMessage());
    }
}
