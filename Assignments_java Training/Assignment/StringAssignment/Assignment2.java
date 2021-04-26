package Day9;

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "React is an open-source, front end, Javascript library for building user intefaces or UI components. It is maintained by Facebook and a community of indivisual developers and companies. React can be used as a base in the development of single-page applications. ";
		System.out.println("Before Replacement: ");
		System.out.println(str);
		str = str.replaceAll("React", "Angular");
		str = str.replaceAll("Facebook", "Google");
		System.out.println("After Replacement: ");
		System.out.println(str);
	}
	}


