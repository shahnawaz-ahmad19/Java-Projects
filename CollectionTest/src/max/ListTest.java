package max;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
	public String getDetail()
	{
		return "shahnawaz, 9871328558, Hyderabad";
		
	}
	
	public User getUserDetail()
	{
		User user = new User();
		user.setName("Shaan");
		user.setAddress("Secundrabad");
		user.setPhone("9871328558");
		return user;
		
	}
	
	public List<User> getAllUserDetail()
	{
		List<User> l= new ArrayList<User>();
		User user = new User();
		user.setName("Seraj");
		user.setAddress("Hyderabad");
		user.setPhone("8676987132");
		l.add(user);
		
		User user1 = new User();
		user1.setName("Shams");
		user1.setAddress("Telangana");
		user1.setPhone("8676987187");
		l.add(user1);
		
		User user2 = new User();
		user2.setName("Farheen");
		user2.setAddress("Samastipur");
		user2.setPhone("8676980002");
		l.add(user2);
		return l;
		
	}

}
