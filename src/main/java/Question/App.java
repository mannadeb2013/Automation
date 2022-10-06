package Question;

import java.util.Scanner;

public class App {
public static void main(String[] args) {
	String q1= "what color are Apples?\n"
               + "(a)red/grenn\n(b)Orange\n(c)Magenta\n";
	String q2 = "What color are banana?\n"
			    + "(a)red\n(b)green\n(c)yellow\n";
	String q3 = "what is the color of strawberry?\n"
			    + "(a)black\n(b)red\n(c)orange\n";
	question1 [] questions = {
			new question1(q1,"a"),
			new question1(q2,"c"),
			new question1(q3,"b")
			
	};
	taketest(questions);
	
}
public static void taketest(question1[]questions) {
	int score=0;
	Scanner keyboardinput = new Scanner(System.in);
	for (int i=0;i<questions.length;i++) {
		System.out.println(questions[i].prompt);
		String answer = keyboardinput.nextLine();
		if(answer.equals(questions[i].answer)) {
			score++;
		}
	}System.out.println("you got"+score+"/"+questions.length);
	
}
}
