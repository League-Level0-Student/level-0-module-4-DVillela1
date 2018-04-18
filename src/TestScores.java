import javax.swing.JOptionPane;

public class TestScores {

	public static void main(String[] args) {

		String score = JOptionPane
				.showInputDialog("How did you do on your latest test?\nSpecify out of 100. (DO NOT INPUT x/100!).");
		double abc = Double.parseDouble(score);

		if (abc <= 100 && abc >= 80) {
			JOptionPane.showMessageDialog(null, "Wow, you must have studied (hard) for that test!");
		} else if (abc <= 70 && abc >= 60) {
			JOptionPane.showMessageDialog(null, "You could've done better. Did you even study?");
		} else if (abc <= 60 && abc >= 50) {
			JOptionPane.showMessageDialog(null, "Better than nothing.");
		} else if (abc <= 50 && abc >= 40) {
			JOptionPane.showMessageDialog(null, "I predict that you are getting grounded!");
		} else if (abc <= 40) {
			JOptionPane.showMessageDialog(null, "...");
		}
	}
}
