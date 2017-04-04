package topic7;

public class Student extends Person{
	
	String id= "0098";
	String schoolName ="KSHRD";
	String name;
	
	private Address address;
	
	
	public Student(){
		//super();
		System.out.println("student contructor");
	}
	
	
	public void setAddress(Address add){
		this.address=add;
	}
	
	public Address getAddress(){
		return this.address;
	}
	
	public void setId(String id){
		this.id=id;
	}
	public void setSchoolName(String name){
		this.schoolName=name;
	}
	
	public void setName(String sname){
		super.name=sname;	
		
	}
	public void display(){
		super.print();
	}
	
	void print(){
		
		System.out.println("Id :"+id + "SchoolName: "+schoolName);
	}

}
