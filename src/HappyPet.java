import javax.swing.JOptionPane;

public class HappyPet {

	// 2. Add the following variable to the next line: static int happinessLevel =
	// 0;

	static int happinessLevel = 0;

	static int pet;

	static int task;

	// this will be used to store the happiness of your pet

	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store their answer in
		// a variable

		pet = JOptionPane.showOptionDialog(null, "Which of the three pets would you like?", "Pet",
				JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, null,
				new String[] { "Dog", "Cat", "Rabbit" }, null);

		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!

		// 3. Use showOptionDialog to ask the user what they want to do to make their
		// pet happy
		// (eg: cuddle, food, water, take a walk, groom, clean up poop).
		// Make sure to customize the title and question too.
		task = JOptionPane.showOptionDialog(null,
				"Which of the three options would you \nlike to do to make your pet happy?", "Title", 0,
				JOptionPane.INFORMATION_MESSAGE, null,
				new String[] { "Give it Food", "Give it Water", "Give it Treats" }, null);

		// 5. Use user input to call the appropriate method created in step 4.

		if (task == 0) {
			givingFood();
		} else if (task == 1) {
			givingWater();
		} else if (task == 2) {
			givingTreats();
		}
		// 6. If you determine the happiness level is large enough, tell the
		// user that he loves his pet and use break; to exit for loop.

	}

	// 4. Create methods to handle each of your user selections.
	// Each method should create a pop-up with the pet's response (eg. cat might
	// purr when pet),
	// and INCREMENT the pet's happiness Level.

	public static void givingFood() {

		if (pet == 0 || pet == 1 || pet == 2) {
			happinessLevel += 5;
		}
	}

	public static void givingWater() {

		if (pet == 0 || pet == 1 || pet == 2) {
			happinessLevel += 5;
		}
	}

	public static void givingTreats() {

		if (pet == 0 || pet == 1 || pet == 2) {
			happinessLevel += 10;
		}
	}
}