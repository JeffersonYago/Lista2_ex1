package controller;

public class MultiController {

	public MultiController() {
		super ();
	}
	public int MultiRec (int a, int b) {
		if (a == 0) {
			return 0;
		}else {
			return b + MultiRec(a-1, b);
		}
		
	}
}
