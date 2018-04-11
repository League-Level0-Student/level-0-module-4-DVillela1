import javax.swing.JOptionPane;

public class TestScores {

	public static void main(String[] args) {

		String score = JOptionPane.showInputDialog(
				"How did you do on your latest test?\nPlease specify out of 10. Ex: 5 (Don't input '/10') ");
		int abc = Integer.parseInt(score);

		if (abc == 10 || abc == 9) {
			JOptionPane.showMessageDialog(null, "Wow, you must have studied hard for that test!");
		} else if (abc == 8 || abc == 7) {
			JOptionPane.showMessageDialog(null, "You could've done better. Did you even study?");
		} else if (abc == 6 || abc == 5) {
			JOptionPane.showMessageDialog(null, "Better than nothing.");
		} else if (abc == 4 || abc == 3) {
			JOptionPane.showMessageDialog(null, "Sadly, it wasn't out of 5 :(");
		} else if (abc == 2 || abc == 1) {
			JOptionPane.showMessageDialog(null, "At least you didn't get 0.");
		} else if (abc == 0) {
			JOptionPane.showMessageDialog(null, "...");
		}
	}
}
