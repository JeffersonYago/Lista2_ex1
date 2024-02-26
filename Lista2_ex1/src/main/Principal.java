package main;

import controller.MultiController;

public class Principal {

	public static void main(String[] args) {
		MultiController mc = new MultiController();
		int a = 12;
		int b = 12;
		int Res = mc.MultiRec(a, b);
		System.out.println(Res);
	}

}
