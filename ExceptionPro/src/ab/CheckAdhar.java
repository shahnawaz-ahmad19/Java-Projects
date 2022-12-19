package ab;

public class CheckAdhar {
	UserDTO userDTO = new UserDTO();
	public void generateAdhar(User u)
	{
		if(u.getName().length()>2)
		{
			String nn = u.getName();
			userDTO.setName("Mr " +nn.substring(0,1).toUpperCase()+nn.substring(1).toLowerCase());
		}
		else 
		{
			userDTO.setName("Invalid Name");
		}
		userDTO.setAddress(u.getAddress().toLowerCase());
		
		if(u.getAge() >= 18 && u.getAge() <=60)
		{
			
		}
		 
	}
	

}
