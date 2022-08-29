package _04_int._1_riddler;

import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0



public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
int score = 0;

		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
String input = JOptionPane.showInputDialog("I am an odd number. Take away a letter and I become even. What number am I?");


		// 4. If they got the answer right, pop up "correct!" and increase the score by one
if (input.equals("7")){
	JOptionPane.showMessageDialog(null,"correct!" );
	score += 1;
}
		// 5. Otherwise, say "wrong" and tell them the answer
else {
	JOptionPane.showMessageDialog(null,"wrong" );
}
		// 6. Add some more riddles
  String candle = JOptionPane.showInputDialog("I'm tall when I'm young and I'm short when I'm old. What am I?");

  if (candle.equals("a candle")){
		JOptionPane.showMessageDialog(null,"correct!" );
		score += 1;
	}
  else {
	  JOptionPane.showMessageDialog(null,"wrong" );
  }
  String mushroom = JOptionPane.showInputDialog("What kind of room has no doors or windows?");
  if (mushroom.equals("a mushroom")){
		JOptionPane.showMessageDialog(null,"correct!" );
		score += 1;
	}
  else {
	  JOptionPane.showMessageDialog(null,"wrong" );
  }
  
  String marry = JOptionPane.showInputDialog("He has married many women, but has never been married. Who is he?");
  if (marry.equals("a priest")){
		JOptionPane.showMessageDialog(null,"correct!" );
		score += 1;
  }
  else {
	  JOptionPane.showMessageDialog(null,"wrong" );
  }
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
		// 2. Make a pop up to show the score.
  
		JOptionPane.showMessageDialog(null, score );
	
	}
}

