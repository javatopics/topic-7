package topic7;

public abstract class Abstract1 extends Abstract2 {

	public abstract void Output();
	
	public int getAge(){
		return 20;
	}
	
	@Override
	public void showAbstract() {
		System.out.println("implemet in abstract class");
	}
	
}
