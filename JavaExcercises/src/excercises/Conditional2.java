package excercises;

public class Conditional2 {
	
	public static void main(String[] args) {
		Sum1(0 , 7, false);
	}
	
	public static void Sum1(int x, int y, boolean z) {
	if (x == 0) {
		System.out.println(y);
	}
	else if (y == 0) {
	System.out.println(x);
	}
	else if (z == true){
		System.out.println(x * y);
	}
	else {
		System.out.println(x + y);
	}
}
}