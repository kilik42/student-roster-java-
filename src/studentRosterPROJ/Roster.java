/**
 * 
 */
package studentRosterPROJ;

import java.util.ArrayList;



/**
 * @author marvinevins
 *
 */
public class Roster {

	static ArrayList<Student> myStudent = new ArrayList<>();
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Roster.add("1", " john", " daniels", "jason@yahoo.com", 20, 90, 80,45);
		Roster.add("2", " dan",  " bloom", "dan@yahoo.com", 10, 30, 90, 60);
		Roster.add("3", " jude", " blan", "dinoyahoocom", 90, 50, 80, 80);
		Roster.add("4", " john", " dagro",  "mon@yahoocom", 30, 50, 80, 90);
		Roster.add("5", " dune",  " dude", "dune@yahoo.com", 30, 50, 80, 50);
		print_all();

		
		print_invalid_emails("dinoyahoocom");
		print_invalid_emails("mon@yahoocom");
		print_average_grade("3");
//		print_average_grade("5");
//		print_average_grade("2");
//		print_average_grade("3");
//		print_average_grade("4");
//		print_average_grade("5");
		remove("2");
		remove("4");
		print_all();
		
	}
	
	public static void add(String studentId, String firstName, String lastName, String emailAddress, int age, double grade1, double grade2, double grade3){
		double[] arrayOfGrades = {grade1, grade2, grade3};
		Student newStudent = new Student(studentId, firstName, lastName,  emailAddress, age, arrayOfGrades );
		myStudent.add(newStudent);
		
	}
	
	public static void remove(String studentId){
		//Student newStudent = new Student(studentID, firstName, emailAddress, age, arrayOfGrades );
//		studentId = studentId;
//		myStudent.remove(studentId);
		for (int i = 0; i < myStudent.size(); i++){
			String id = myStudent.get(i).getStudentId();
			if(id.equals(studentId)){
				myStudent.remove(i);
				System.out.println("Id : %s not found");
				return;
			}
		}
	}
	
	  public static void print_all() {
		  for(int i = 0; i < myStudent.size() ; i++){
	    		//get each book and call the print method
	    		myStudent.get(i).print();
	    	}
	  }
	  
	  public static void print_average_grade(String studentID) {
		//loop through arraylist called mystore
	    	for (Student s : myStudent){
	    		//calculate the average
	    		double average = (s.getArrayOfGrades()[0] + s.getArrayOfGrades()[1])/2.0;
	    		System.out.println(" your average is : " + average);
	    		System.out.println(" studentId: \t "+ s.getStudentId()+ " \tAvgGrade: \t " + average);
	    		
	    	}
	  }

	  public static void print_invalid_emails(String emailAddr){
		  //note I googled how to compare strings if it contains a character
		  // I used the following site for reference but did not copy https://stackoverflow.com/questions/15730134/java-opposite-of-contains-does-not-contain
		  for (Student s: myStudent){
				  if (s.getEmailAddress().equals(emailAddr)){
					  if(!(s.getEmailAddress().contains("@")) && !(s.getEmailAddress().contains(".")) && !(s.getEmailAddress().contains(" "))){
						  System.out.println("invalid email address: " + s.getEmailAddress());
					  }
					  else{
						  System.out.println(" your email address is "+ s.getEmailAddress());
					  }
		          }
				  
		}
		  
	  }
}
