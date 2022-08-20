package _03_if_else._2_remarkable;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

import javax.swing.JOptionPane;

public class Remarkable {
public static void main(String[] args) {

		// 1. Save something remarkable about each person in a variable.
 String jane = "jane can do a backflip";
 String jack = "jack is good at basketball";
 String emily = "emily is very smart";
 String anderson = "anderson is good at art";


		// 2. Ask the user to enter a name. Store their answer in a variable.
 String remarkable = JOptionPane.showInputDialog("enter a name");
   
		// 3. In a pop-up, tell the user what is remarkable about that person. 
if (remarkable.equals("jane")) {
	JOptionPane.showMessageDialog(null,jane );
}
if (remarkable.equals("jack")) {
	JOptionPane.showMessageDialog(null,jack );
}
if (remarkable.equals("emily")) {
	JOptionPane.showMessageDialog(null,emily );
}
if (remarkable.equals("anderson")) {
	JOptionPane.showMessageDialog(null,anderson );
}
}
	}


