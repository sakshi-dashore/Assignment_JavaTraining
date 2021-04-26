package com.interfaceassignment;

public class Utility {

	static void printAll(Printable[] p) {

		for (Printable printable : p) {
			printable.print();
		}
	}
}
