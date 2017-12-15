/**
 * This class is main class for run mine-sweeper game.
 * 
 * @author Hayato Kawai
 */
public class Main implements Runnable {

	GUI gui = new GUI();

	public static void main() {
		new Thread(new Main()).start();
	}

	/* run the game */
	public void run() {
		gui.setVisible(true);
		while (true) {
			gui.repaint();
			if (gui.resetter == false) {
				gui.checkVictory();
			}
		}
	}
}
