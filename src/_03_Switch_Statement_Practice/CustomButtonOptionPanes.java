package _03_Switch_Statement_Practice;

import javax.swing.JOptionPane;

public class CustomButtonOptionPanes {
	public static void main(String[] args) {
		String[] options = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };

		int input = JOptionPane.showOptionDialog(null, "Choose a day of the week", "Custom Buttons", 0, -1, null,
				options, 0);

		String choice = options[input];

		// use a switch statement to do something cool for each option
		switch (input) {
		case (0):
			System.out.println("It's not " + options[input]);
			break;
		case (1):
			System.out.println(" :( \n :( \n :( \n " + options[input]);
			break;
		case (2):
			System.out.println("It's not " + options[input]);
			break;
		case (3):
			System.out.println("It's " + options[input]);
			break;
		case (4):
			System.out.println("It's not " + options[input]);
			break;
		case (5):
			System.out.println(":) :) :)" + options[input]);
			break;
		case (6):
			System.out.println(options[input] + "!!!!! " + options[input] + "!!!!! "+ options[input] + "!!!!! "+ options[input] + "!!!!! "+ options[input] + "!!!!! ");
			break;
		}
	}
}
