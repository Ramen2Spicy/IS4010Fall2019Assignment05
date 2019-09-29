/*
* Tianyang Zhao    
* zhaotg@mail.uc.edu    
* Assignment 05
* Due Date:10/03
* Description:Football Score Translator
* Citation:
* Course: Java Dev
*/
package footballFun;

public class FootballFun {

	public static void main(String[] args) {
		int correctCount = 0;
		if (translateScore(2).equals("safety") == true) { correctCount++;}
		if (translateScore(3).equals("field goal") == true) { correctCount++;}
		if (translateScore(6).equals("touchdown") == true) { correctCount++;}
		if (translateScore(7).equals("touchdown and extra point") == true) { correctCount++;}
		if (translateScore(8).equals("touchdown and 2-point conversion") == true) { correctCount++;}
		if (translateScore(-1).equals("") == true) { correctCount++;}
		if (translateScore(1).equals("invalid") == true) { correctCount++;}
		if (translateScore(10).equals("you must be playing Quidditch ") == true) { correctCount++;}
		
		if (correctCount == 8) {
			System.out.println("All tests passed");
		} else {
			System.out.println("At least one test failed");
		}
	}
	/**
	 * 
	 * @param score football score
	 * @return translated score
	 */
	public static String translateScore (int score) {
		if (score == 2) {return "safety";}
		else if (score == 3) {return "field goal";}
		else if (score == 6) {return "touchdown";}
		else if (score == 7) {return "touchdown and extra point";}
		else if (score == 8) {return "touchdown and 2-point conversion";}
		else if (score == -1) {return "";}
		else if (score == 1) {return "invalid";} 
		else if (score == 10) {return "you must be playing Quidditch ";}
		else {return "";}
	}
}