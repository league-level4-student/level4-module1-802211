package _05_Enum_Stuff;

import javax.swing.JOptionPane;

public class _00_Horoscope {
	// 1. Create an enum in a separate file called Zodiac that contains a category
	// for
	// all 12 zodiac signs.

	// 2. Write a method that takes in a Zodiac enum object and uses a JOPtionPane
	// to display
	// a different horoscope based on the Zodiac's state.
	// Zodiac Z = Zodiac.AQUARIUS;
	void Zzzodiac(Zodiac Z) {
		switch (Z) {
		case AQUARIUS:
			JOptionPane.showMessageDialog(null, "Aquarius");
			break;

		case PISCES:
			JOptionPane.showMessageDialog(null, "Pisces");
			break;

		case TAURUS:
			JOptionPane.showMessageDialog(null, "Taurus");
			break;

		case ARIES:
			JOptionPane.showMessageDialog(null, "Aries");
			break;

		case GEMINI:
			JOptionPane.showMessageDialog(null, "Gemini");
			break;

		case CANCER:
			JOptionPane.showMessageDialog(null, "Cancer");
			break;

		case LEO:
			JOptionPane.showMessageDialog(null, "Leo");
			break;

		case VIRGO:
			JOptionPane.showMessageDialog(null, "Virgo");
			break;

		case LIBRA:
			JOptionPane.showMessageDialog(null, "Libra");
			break;

		case SCORPIO:
			JOptionPane.showMessageDialog(null, "Scorpio");
			break;

		case SAGITTARIUS:
			JOptionPane.showMessageDialog(null, "Sagittarius");
			break;

		case CAPRICORN:
			JOptionPane.showMessageDialog(null, "Capricorn");
			break;

		}
	}

	// 3. Make a main method to test your method
	public static void main(String[] args) {
Zodiac test1 = Zodiac.TAURUS;
Zodiac test2 = Zodiac.LEO;
if(test1 == Zodiac.TAURUS) {
	System.out.println("CORRECT!!!!!");
}
if(test2 == Zodiac.LEO) {
	System.out.println("CORRECT AGAIN!!!!!");
}
	}
}
