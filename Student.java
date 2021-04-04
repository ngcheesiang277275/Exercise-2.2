
public class Student {
	
	String name;
	int semester;
	double gpa;
	double charge;
	double paid;
	int numSubj;
	int creditHr;
	double act;
	double achievement;

	
	void printStudent(String name, int semester, double gpa) {
		System.out.println("-----Student's Info-----");
		System.out.printf("%-10s: %s%n", "Name", name);
		System.out.printf("%-10s: %d%n", "Semester" , semester);
		System.out.printf("%-10s: %.1f%n%n", "GPA" , gpa);
	}

	void printFinancialStatement(double charge, double paid) {
		double balance = paid - charge;
		
		System.out.println("---Student's Financial Statement---");
		System.out.printf("%-10s: %.2f%n","Charge", charge);
		System.out.printf("%-10s: %.2f%n","Payment", paid);
		System.out.printf("%-10s: %.2f%n","Balance", balance);
		
		if(balance >= 0)
			System.out.println(">>>The fee is fully paid.\n");
		else
			System.out.println(">>>Unfortunately, the fee is not fully paid.\nNeed assistance? Hotline: 012-345-6789.\n");

	}
	
	void printCourse(int numSubj, int creditHr) {
		System.out.println("-------Academic-------");
		System.out.printf("%-31s: %d%n", "Number of subject registered" , numSubj);
		System.out.printf("%-31s: %d%n%n", "Total credit hour" , creditHr);
	}
	
	void printMerit(double act, double achievement){
		System.out.println("---Participation in Activity/Merit---");
		System.out.printf("%-31s: %.1f%n", "Activities participated", act);
		System.out.printf("%-31s: %.1f%n","Achievement/Awards", achievement);
		System.out.printf("%-31s: %.1f%n%n%n%n", "Total merit", (act+achievement));
	}
	
	
	}
