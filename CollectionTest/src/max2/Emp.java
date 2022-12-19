package max2;

public class Emp implements Comparable<Emp>{
	int eid ;
	String name;
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int compareTo(Emp e) {
//		if(eid==e.getEid())
//			return 0;
//		else if (eid>e.getEid()) 
//			return 1;
//		return -1;
		
		return name.compareTo(e.getName());
	}
	

}
