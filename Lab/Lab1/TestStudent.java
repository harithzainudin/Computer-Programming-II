package question2;

public class TestStudent {
	public static void main(String[] args) {
	Student[] stdArray = new Student[4];
	
	Student s1= new Student(1198100, "Ghazali Ali", "Computer Science", "Freshman");
	stdArray[0] = s1;
	
	Student s2= new Student(1057840, "Abdul Rahman", "Multimedia", "Junior");
	stdArray[1] = s2;
			
	Student s3= new Student(1001198, "Abdul Majid", "Network", "Senior");
	stdArray[2] = s3;
	
	Student s4= new Student(1002063, "Zainab", "Software Engineering", "Sophomore");
	stdArray[3] = s4;
	
	}//end of main method
}//end of public class TestStudent
