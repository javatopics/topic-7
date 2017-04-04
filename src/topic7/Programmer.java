package topic7;

public class Programmer implements Interface3{
	
	int bonus;
	
	public void print(){
		System.out.println("print() in Employee;");
	}
	
	
	public void show(){
		System.out.println("Bonus :" +this.bonus);
	}
	
	@Override
	public void test() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void print1() {
		// TODO Auto-generated method stub
		
	}

}
