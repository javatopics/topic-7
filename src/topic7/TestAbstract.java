package topic7;

public class TestAbstract extends Abstract1{
	

	@Override
	public void Output() {
		
		System.out.println("overrided method output()");
	}
	
	@Override
	public void showAbstract() {
		super.showAbstract();
		System.out.println("implemet in child class");
	
	}
	
}
