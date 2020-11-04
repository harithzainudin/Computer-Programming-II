package question2;

public class Student {
	//data fields for student attributes
	int matric;
	String name, department, classification;
	
	//constructor that have argument name, department ,matric and classification and assigned to the object
	public Student(int matric, String name, String department, String classification) {
		this.matric = matric;
		this.name = name;
		this.department = department;
		this.classification = classification;
		classification = "";
	}
	
	//constructor that have no argument and assign empty strings to name, department, classification and 0 to matric
	public Student() {
		name = "";
		department = "";
		classification = "";
		matric = 0;
	}
	
	//method for set name
	void setName(String name) {
		this.name = name;
	}
	
	//method to set department
	void setDepartment(String department) {
		this.department = department;
	}
	
	//method to set classification
	void setClassification(String Classification) {
		this.classification = classification;
	}
	
	//method to set matric
	void setMatric(int matric) {
		this.matric = matric;
	}
	
	//method to get name and return name
	String getName() {
		return name;
	}
	
	//method to get department and return department
	String getDepartment() {
		return department;
	}
	
	//method to get classification and return classification
	String getClassification() {
		return classification;
	}
	
	//method to get matric and return matric
	int getMatric() {
		return matric;
	}
}//end of public class student
