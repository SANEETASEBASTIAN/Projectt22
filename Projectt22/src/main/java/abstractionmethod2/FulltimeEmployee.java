package abstractionmethod2;



public class FulltimeEmployee extends Employee {
	@Override
	
	public  void calculateSalary(){
		int salary =100;
		int total=salary*8;
		System.out.println("Salary for fulltime employee is "+total);
	}
public static void main(String args[]) {

	Employee ab= new Contractor();
	ab.calculateSalary();
	
	Employee b= new FulltimeEmployee();
	b.calculateSalary();
}
}
