package studentRosterPROJ;

public class Student {
	private String studentId;
	
	private String firstName;
	private String lastName;
	private String emailAddress;
	private   int age;
	private double[] arrayOfGrades;
	
	//constructor
	public Student(String studentId, String firstName, String lastName, String emailAddress, int age, double[] arrayOfGrades) {
		super();
		this.studentId = studentId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailAddress = emailAddress;
		this.age = age;
		this.arrayOfGrades = arrayOfGrades;
		
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * @return the studentId
	 */
	public String getStudentId() {
		return studentId;
	}
	/**
	 * @param studentId the studentId to set
	 */
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the emailAddress
	 */
	public String getEmailAddress() {
		return emailAddress;
	}
	/**
	 * @param emailAddress the emailAddress to set
	 */
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	/**
	 * @return the arrayOfGrades
	 */
	public double[] getArrayOfGrades() {
		return arrayOfGrades;
	}
	/**
	 * @param arrayOfGrades the arrayOfGrades to set
	 */
	public void setArrayOfGrades(double[] arrayOfGrades) {
		this.arrayOfGrades = arrayOfGrades;
	}
	
	public void print(){
		System.out.println("student id \t "+ getStudentId()
		+ " first name is :\t" + getFirstName() + "\t" 
		+ " last name is :\t" + getLastName()  + "\t" 
		+ " email address is :\t" + getEmailAddress()  + "\t" 
		+ " age :\t" + getAge()  + "\t" 
		+ "  1st grade is:\t"+ getArrayOfGrades()[0]  + "\t" 
		+ " 2nd grade is:\t"+ getArrayOfGrades()[1] + "\t" 
        + " 3rd grade is:\t"+ getArrayOfGrades()[2]);
	}
	

}
