import javax.swing.JOptionPane;

public class ChooseYourAdventure {
	public static void main(String[] args) {

		int answer2 = 0;
		JOptionPane.showMessageDialog(null,
				"You are a human. You fall in the hole and look northward. \nThere are paths leading left and right. Good luck.");

		int answer = JOptionPane.showOptionDialog(null, "Which direction will you take? Left or right?",
				"You will die.", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, null,
				new String[] { "Right", "Left" }, null);

			answer2 = JOptionPane.showOptionDialog(null,
					"You come across three more paths. Which direction will you take? Left, straight, or right?",
					"You will die.", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Right", "Straight", "Left" }, null);

		if (answer == 0 && answer2 == 0) {
			JOptionPane.showMessageDialog(null, "You get murdered and no one will remember your spirit.");
		} else if (answer == 0 && answer2 == 1) {
			JOptionPane.showMessageDialog(null,
					"You keep going on straight forever. If you look back, you'll see a wall. You eventually starve to death.");
		} else if (answer == 0 && answer2 == 2) {
			JOptionPane.showMessageDialog(null,
					"You walk and you fall into a void full of bad people. You eventually die.");
		}

		else if (answer == 1 && answer2 == 0) {
			JOptionPane.showMessageDialog(null,
					"You hallucinate and see your family as you walk along the path. You fall and hit your head. You die.");
		} else if (answer == 1 && answer2 == 1) {
			JOptionPane.showMessageDialog(null,
					"Roses are red, some paints are white, you end up dead, you should've went right.");
		} else if (answer == 1 && answer2 == 2) {
			JOptionPane.showMessageDialog(null,
					"You find a way out. Your eventually die 92 years later, due to a brain tumor.");
		}

	}
}
