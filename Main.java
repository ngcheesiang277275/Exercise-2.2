
public class Main {
	public static void main(String[] args) {
		Student student1 = new Student();
		student1.printStudent("Lisa", 2, 4.0);
		student1.printFinancialStatement(3000, 2500);
		student1.printCourse(6, 20);
		student1.printMerit(135.5, 30);
				
		
		Student student2 = new Student(); 
		student2.printStudent("Louis", 5, 3.5);
		student2.printFinancialStatement(2450, 3000);
		student2.printCourse(7, 22);
		student2.printMerit(355.5, 51.5);	
	}

}
