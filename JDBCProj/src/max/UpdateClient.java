package max;

public class UpdateClient {
	public static void main(String[] args) {
		UserDAO userDAO    = new	UserDAO();
		if(userDAO.update("7762093569", 4, "Dehradoon".toUpperCase()))
		{
			System.out.println("Updated Successfully");
		}
		else
		{
			System.out.println("Failed");
		}
		
	}

}
