import java.util.Random;

public class Checkpoint {

	public static void main(String[] args) {
		
	int r = new Random().nextInt(4);
	
	switch (r) {
	case 0: 
		System.out.println("something");
		break;
	
	case 1: 
		System.out.println(":)))))))");
		break;
	
	case 2: 
		System.out.println(":)");
		break;

	case 3:
		System.out.println("different response");
		break;
	
	case 4:
		System.out.println("hi");
		break;
	}
	
	}
}
