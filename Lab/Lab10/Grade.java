/**
* Author : Muhammad Harith bin Zainudin
* Matric : 192171
* Email : mhrbzd@gmail.com
* Mobile : 0193326091
* Date : 3 May 2018
* Course Code : SSK3101
* Course Name : Computer Programming II
* Semester : 2
* Session : 2017/2018
* Lab : 10 + lab test
* Description : This program is a class for calculating the marks
*/


public class Grade {
	double grammar, spelling, correctL, content,total;
	String grade;
	
	//getter for getGrammar and return grammar
	public double getGrammar() {
		return grammar;
	}
	
	//setter for setGrammar
	public void setGrammar(double grammar) {
		this.grammar = grammar;
	}
	
	//getter for getSpelling and return spelling
	public double getSpelling() {
		return spelling;
	}
	
	//setter for setSpelling
	public void setSpelling(double spelling) {
		this.spelling = spelling;
	}

	//getter for getCorrectL and return correctL
	public double getCorrectL() {
		return correctL;
	}
	
	//setter for setCorrectL
	public void setCorrectL(double correctL) {
		this.correctL = correctL;
	}

	//getter for getContent and return content
	public double getContent() {
		return content;
	}

	//setter for setContent
	public void setContent(double content) {
		this.content = content;
	}
	
	//getter for getTotal. It calculate all the score & return back the total essay score
	public double getTotal() {
		total = grammar + spelling + correctL + content;
		return total;
	}
	
	//getter for setGrade and return the grade type. it also determines the grade based on the score
	public String getGrade() {
		if (total >= 80)
			grade = "A";
		else if (total >=75 && total<80)
			grade = "A-";
		else if (total >=70 && total<75)
			grade = "B+";
		else if (total >=65 && total<70)
			grade = "B";
		else if (total >=60 && total<65)
			grade = "B-";
		else if (total >=55 && total<60)
			grade = "C+";
		else if (total >=50 && total<55)
			grade = "C";
		else if (total >=45 && total<50)
			grade = "C-";
		else if (total >=40 && total<45)
			grade = "D";
		else if (total >=35 && total<40)
			grade = "D-";
		else
			grade = "F";
		return grade;
	}
	
} //end of public class Grade
