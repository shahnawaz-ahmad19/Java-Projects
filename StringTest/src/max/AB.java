package max;

public class AB {
	public void checkSPL(String s)
	{    
		 int l = 0; int d = 0; int spl = 0;
		 char[] t=s.toCharArray();
		 for(Character c:t)
		 {
			 if (Character.isLetter(c))
			 {
				 l++;
			 }else if (Character.isDigit(c)) {
				 d++;
				
			}else  {
				spl++;
				
			}
		 }
		 System.out.println("Letter "+ l +" Digit "+d+" SPL "+spl);
		
	}
	
	public void reverse(String s)
	{
		
	}
	
	public void spaceCount(String s)
	{
		
	}
	
	public void removeMultipleSpaceFromSingleSpace(String s)
	{
		
	}
	
	public void reverseWord(String s)
	{
		
	}
	
	public void checkRepeatedChar(String s)
	{
		
	}
	
	public void changeCase(String s)
	{
		
	}
	
	public static void main(String[] args) {
//		String s = "Shaan is a good boy";
		String s = "ra&2mk";
		  AB ab = new AB();
		  ab.checkSPL(s);
		  
	}

}
