package ab;

import java.util.Scanner;

public class DADA {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Name");
		String n = s.nextLine();
		System.out.println("Enter Address");
		String ad = s.nextLine();
		System.out.println("Enter Age");
		int ag = Integer.parseInt(s.nextLine());
		User u = new User();
		u.setName(n);
		u.setAddress(ad);
		u.setAge(ag);
		CheckAdhar checkadhar = new CheckAdhar();
		checkadhar.generateAdhar(u);
		
	}

}
