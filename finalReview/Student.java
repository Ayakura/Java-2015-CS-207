package finalReview;

import java.io.*;
import java.util.ArrayList;

//public class Student
//{
//  private String name;
//  private ArrayList<Integer> quiz = new ArrayList();
//  
//  public Student(String n)
//  {
//    this.name = n;
//  }
//  
//  public void addQuiz(int points)
//  {
//    this.quiz.add(Integer.valueOf(points));
//  }
//  
//  public int getTotalScore()
//  {
//    int total = 0;
//    for (int i = 0; i < this.quiz.size(); i++) {
//      total += ((Integer)this.quiz.get(i)).intValue();
//    }
//    return total;
//  }
//  
//  public double getAverageScore()
//  {
//    return getTotalScore() * 1.0D / this.quiz.size();
//  }
//  
//  public static void main(String[] args)
//  {
//    Student john = new Student("John");
//    
//    john.addQuiz(90);
//    john.addQuiz(100);
//    john.addQuiz(10);
//    
//    System.out.println(john.getTotalScore());
//    System.out.println(john.getAverageScore());
//  }
//}

public class Student {
	private String firstName;
	private String lastName;
	private int [ ] hwScores = new int [3];
	
	public Student (String first, String last)
	{
		firstName = first;
		lastName = last;
		}
	public void setScore (int hwNumber, int score)
	{
		hwScores [hwNumber - 1] = score;
		} // end void setScore
	public String toString( ){
		return ( firstName + " " + lastName + " " + getAverageScore( ));
		} // end toString
	public double getAverageScore( ){
		double sum = 0.0 ;
		for (int i = 0; i < hwScores.length; i++ ) {
			sum = sum + hwScores[i] ;
			} // end for i
		return (sum/hwScores.length) ;
		} // end double getAverageScore
	public static void main (String [ ] args) {
		Student s1 = new Student ("Nicole", "Bruck");
		Student s2 = new Student ("Devon", "Eilers");
		s1.setScore (1, 90);
		s1.setScore (2, 80);
		s1.setScore (3, 70);
		s2.setScore (1, 70);
		s2.setScore (2, 60);
		s2.setScore (3, 50);
		System.out.println (s1);
		System.out.println (s2);
		Student s3;
		s3 = s1; s1 = s2; s2 = s3;
		System.out.println (s1);
		System.out.println (s2);
		System.out.println (s3);
		} // end main
	} // end class Student
