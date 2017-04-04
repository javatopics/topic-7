package topic7;

public class Demo {

	public static void main(String[] args) {
		
		/*Student stu=new Student();
		stu.age=99;
		
		Programmer pro=new Programmer();
		*/
		
		/*MultipleTest m=new MultipleTest();
		//m.print1();
		//m.print2();
		
		Interface1 in = new MultipleTest();
		in.print1();*/
		
		//test hierarchical inheritance 
		/*Person p=null;
		
		p=new Student();
		p.print();
		
		//employee
		p=new Employee();
		p.print();
		
		p=new Programmer();
		p.print();
		//p.show();
		
		Programmer pro=new Programmer();
		pro.show();*/
		
		//has a 
		
		/*Student stu=new Student();
		System.out.println("------create student object-----------");
		Address add=new Address();
		add.city="PP";
		add.country="cambodia";
		stu.setAddress(add);
		System.out.println("------set student address-----------");
		System.out.println("------get student address-----------");
		System.out.println(stu.getAddress().city);
		System.out.println(stu.getAddress().country);*/
		
		//test Keyword super
		Student s=new Student();
		
		//abstract class
		
		TestAbstract t=new TestAbstract();
		//System.out.println(t.getAge());
		//t.showAbstract();
		
		Abstract1 abt1 = new TestAbstract();
		abt1.Output();
		abt1.showAbstract();
		//abt1.showAbstract();
		
		
		Programmer pro=new Programmer();
		
	}
}
