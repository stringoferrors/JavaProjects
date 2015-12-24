/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author u6027576
 */
// Assessment task 2 - INST1002 - 2015/16

/*
 * This file contains an ExamScores class, with various methods
 *
 * The code for some of these methods has been removed
 *
 * Some sections of the ExamScores class are marked DO NOT EDIT; the testing software relies on the 
 * presence of these sections, so please do not alter them

 * The file also has a class called 'Problem', containing a main method; this can be run to 
 * test the use of the ExamScores class, but should not be edited
 *
 * You should only alter the parts that are marked 'THIS CODE MUST BE WRITTEN OR ADAPTED'
 
 * methods for which the content must be modified or added:

 *		ExamScores() constructor method
 *		getMean() 
 *		getMin()
 *		getMax()
 *		getTotalMerit)
 *		getMeritMark()
 *		setMeritMark()
 *		binBar()
 
 * Notes 
 * 1) All method names and return types should be left as currently shown
 * 2) Class names should be left as currently shown
 * 3) Code should be laid out so that it is readable, with appropriate indenting and spacing
 * 4) Variable names should be meaningful
 * 5) Comments should explain briefly what your code is doing
 
 */


import java.text.DecimalFormat;

public class Problem {

	public static void main(String[] args) {

		// DO NOT EDIT
		
		// NOTHING IN THE MAIN METHOD SHOULD BE ALTERED
		
		// THIS ALLOWS YOU TO TEST YOUR CODE - THE PROGRAM WILL RUN, BUT WILL NOT GIVE CORRECT RESULTS UNTIL
		// YOU MAKE CHANGES TO THE EXAMSCORES CLASS
	
		// Create a new examScores object
		
		final int NUM_STUDENTS = 50;
		
		// Create an ExamScores object for a class of students
		ExamScores myScores = new ExamScores(NUM_STUDENTS);

		// Check an arbitrary student just after creating the ExamScores object
		System.out.println("\tStudent 10 mark is: " + myScores.getStudentMark(10));
		System.out.println("\tStudent 10 mark is valid?: " + myScores.isStudentMarkValid(10));
		System.out.println();
		
		
		// populate with random results
		// actual tests will be done with known data
		for (int student = 0; student < NUM_STUDENTS; student++) {
			myScores.setStudentMark(student,(int)(Math.random()*100));
		}



		
		// report some results

		// How many students are there - using getNumStudents() method
		System.out.println("\tNumber of students was: " + myScores.getNumStudents());
		
		// Re-test the same individual student:
		// Is the mark for student 10 valid?
		System.out.println("\tStudent 10 mark is valid: " + myScores.isStudentMarkValid(10));
		

		System.out.println();

		System.out.println("\tMinimum score was: " + myScores.getMin());
		System.out.println("\tMaximum score was: " + myScores.getMax());
		System.out.println("\n\tMean score was: " + myScores.getMean());
		System.out.println("\n\tNumber who passed: " + myScores.getTotalPassed());
		System.out.println("\tNumber with merit: " + myScores.getTotalMerit());
		System.out.println("\tNumber who failed: " + (NUM_STUDENTS - myScores.getTotalPassed()));
		
		System.out.println("\n\tScores bar chart");
		System.out.println(myScores.barChart());
		
		// change the passmark and the merit mark, then repeat
		myScores.setPassMark(50);
		myScores.setMeritMark(75);
		
		System.out.println("\n\tPassmark changed to: " + myScores.getPassMark());
		
		System.out.println("\n\tNumber who passed: " + myScores.getTotalPassed());
		System.out.println("\tNumber with merit: " + myScores.getTotalMerit());
		System.out.println("\tNumber who failed: " + (NUM_STUDENTS - myScores.getTotalPassed()));
		
	}
}

class ExamScores {

	//class variables
	private int passMark=0;
	private int meritMark=100;

	//student scores
	private int[] studentScores;
	
	// Constructor
	public ExamScores(int classSize) {
	
		// THIS CODE MUST BE WRITTEN OR ADPATED

		// This method should set default values of pass mark as 40, and merit mark as 70
		passMark = 40;
		meritMark = 70;
		// This method should set all marks to have an initial value of -1
		
		
		// An array for marks - do not edit this line
		studentScores = new int[classSize];
	
		// Setting starting values for each mark
		for (int i = 0; i < classSize; i++) {
			setStudentMark(i,-1);
		}
	
		//return ;
	}

	//Getters and setters for class members
	
	// DO NOT EDIT
	public void setPassMark(int mark) {
		passMark=mark;
	}

	// DO NOT EDIT
	public int getPassMark() {
		return passMark;
	}
	
	
	public void setMeritMark(int mark) {
		// THIS CODE MUST BE WRITTEN OR ADAPTED
		// This should update the private variable that holds the threshold for getting a merit
		meritMark=mark;
		
	}

	public int getMeritMark() {
		// THIS CODE MUST BE WRITTEN OR ADAPTED
		
		// This should return the private variable that holds the threshold for getting a merit
		
		// Currently return a dummy value
		return meritMark;
	}
	
	// DO NOT EDIT
	// can't be changed, so no equivalent setter
	public int getNumStudents() {
		return studentScores.length;
	}
	
	
	// getting and setting marks
	

	// DO NOT EDIT
	// Set a grade for a specific student
	public void setStudentMark(int studentNum, int mark) {
		studentScores[studentNum] = mark;
	}

	//
	/*
	 * Return a score for a given student
	 */
	public int getStudentMark(int studentNum) {
		return studentScores[studentNum];
	}
	 
	// check student mark is valid
	public boolean isStudentMarkValid(int studentNum) {
		// THIS CODE MUST BE WRITTEN OR ADAPTED

		// This method should return true if the mark for the student indicated by studentNum is between 0 and 100 inclusive, or false otherwise
                if (studentScores[studentNum] > -1 && studentScores[studentNum] < 100) {
                    return true;
                }
                else
                    return false;
		// Currently returns a dummy value
		
		
	}

	/*
	 * Methods for analysing the results
	 */
	
	public double getMean() {
		// THIS CODE MUST BE WRITTEN OR ADAPTED

		// The method should determine the mean value of all marks (as a double), and return it
		/*
		1) create sum variable = 0 /
		in a loop: loop over all students /
		2) getStudentMark() /
		3) add student mark to sum /
		after loop divide by getNumStudents
		
		loop over all students
		*/
		// Currently returns a dummy value (which can't be right) to make the example work
                
                int totalScore = 0;

                for (int i = 0; i < getNumStudents(); i++) {
                    int marks = getStudentMark(i);
                totalScore += marks;
                }
                
                int average = totalScore/getNumStudents();
		return average;
		
		
		
	}

	public int getMin() {
		// THIS CODE MUST BE WRITTEN OR ADAPTED

		// The method should determine the lowest value in the scores array, and return i
                int j;
                boolean flag = true;   // set flag to true to begin first pass
                int temp;   //holding variable

                while ( flag )
                {
                       flag= false;    //set flag to false awaiting a possible swap
                       for( j=0;  j < studentScores.length -1;  j++ )
                       {
                              if ( studentScores[ j ] < studentScores[j+1] )   // change to > for ascending sort
                              {
                                      temp = studentScores[ j ];                //swap elements
                                      studentScores[ j ] = studentScores[ j+1 ];
                                      studentScores[ j+1 ] = temp;
                                     flag = true;              //shows a swap occurred  
                             } 
                       } 
                } 

		// return a dummy value (which can't be right) to make the example work
                return studentScores[getNumStudents() - 1];
	}

	public int getMax() {
		// THIS CODE MUST BE WRITTEN OR ADAPTED
	int j;
                boolean flag = true;   // set flag to true to begin first pass
                int temp;   //holding variable

                while ( flag )
                {
                       flag= false;    //set flag to false awaiting a possible swap
                       for( j=0;  j < studentScores.length -1;  j++ )
                       {
                              if ( studentScores[ j ] < studentScores[j+1] )   // change to > for ascending sort
                              {
                                      temp = studentScores[ j ];                //swap elements
                                      studentScores[ j ] = studentScores[ j+1 ];
                                      studentScores[ j+1 ] = temp;
                                     flag = true;              //shows a swap occurred  
                             } 
                       } 
                 } 
		// The method should determine the highest value in the scores array, and return it

		// return a dummy value (which can't be right) to make the example work
                return studentScores[0];
	
	}

	// How many passed?
	// DO NOT EDIT
	public int getTotalPassed() {
		int numPassed = 0;
		for (int i=0;i < studentScores.length; i++) {
			if (studentScores[i] >= getPassMark() ) {
				numPassed++;
			}
		}
		return numPassed;
	}

	// How many got a merit?
	public int getTotalMerit() {
		// THIS CODE MUST BE WRITTEN OR ADAPTED
                int merit = 0;
                for(int i = 0; i < getNumStudents() -1; i++) {
                    if (getMeritMark() < getStudentMark(i)) {
                        merit += 1;
                    }
                }
		// The method should return the number students got the merit mark or higher

		// return a dummy value to make the example work
		return merit;
	}
	
	// barChart method uses 'binBar' to draw a text-based chart showing scores in 10 mark bands
	
	// DO NOT EDIT
	public String barChart() {
		String chart = "";
		DecimalFormat pad = new DecimalFormat("000");
		for (int i = 0; i < 100; i+=10) {
			int binMin = i;
			int binMax = i+10;
			chart += "\t" + pad.format(binMin) + "-" + pad.format(binMax) + " " + binBar(binMin,binMax) + "\n";
		}
		return chart;
	}

	
	
	
	public String binBar(int binMin,int binMax) {
		// THIS CODE MUST BE WRITTEN OR ADAPTED

		// It should build a string consisting of '*' characters, with as many characters as there are
		// students with a score in the range: binMin or higher, and lower than binMax
                int retStr = 0;
		for (int i = 0; i < getNumStudents() - 1; i++) {
                    if (binMin - 1 < studentScores[i] && studentScores[i] < binMax) {
                        retStr += 1;
                    }
                    else if (binMax == 100 && studentScores[i] == 100) {
                        retStr += 1;
                    }
                }
		// The final bin should *include* values of 100
                
                String repeated ="*";
		repeated = new String(new char[retStr]).replace("\0", repeated);
		
		return repeated;
	}
        
}