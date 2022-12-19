package max;

import java.util.Scanner;

public class CL {
	public static void main(String[] args) {
		//Hard coding
//		int uid = 10;
//		String name = "Rizwee";
//		String add = "Noida";
//		String phone = "88888998";
		
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter uid");
		int uid = Integer.parseInt(s.nextLine());
		System.out.println("Enter name ");
		String name = s.nextLine();
		System.out.println("Enter Address");
		String add = s.nextLine();
		System.out.println("Enter Phone");
		String phone = s.nextLine();
		
		UserDAO userDAO = new UserDAO();
		if(userDAO.insert(uid, name, add, phone))
		{
			System.out.println("Successful");
		}  
	 	else
		{
			System.out.println("Failed");
		}
	}
	
	

}
