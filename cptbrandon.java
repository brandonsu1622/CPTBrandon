import arc.*; 
import java.awt.image.*;
import java.awt.Font;
import java.awt.Color;


public class cptbrandon{ 
		//global variables 
		static String strname = ""; 
		static boolean blncheat = false;
	public static void main(String [] args){ 
		Console con = new Console("Multiple choice", 1280, 720); 	
		// Main Screen of the Multiple Choice Game
		while(true){
			
			// Creating a background image
		
		//main menu 

		
		while(true){ 
			con.drawString("Welcome to Multiple Choice", 280, 50);
			
			con.drawString("What would you like to do?", 450, 120);
			
			con.drawString("Play Game", 480, 320);

			con.drawString("Leaderboard", 480, 400);
			
			con.drawString("Help", 480, 480);
			
			con.drawString("Quit", 480, 560);
			break;
		}
		System.out.println("Able to display to main screen");			
			
		//Mouse iput 
		
		while(true){
				if(con.currentMouseButton() == 1) {
					// Finding the location of the mouse if it pressed one of the buttons on the screen
					int intMouseX = con.currentMouseX();
					int intMouseY = con.currentMouseY();				
					// The Play Game Screen 
					if(intMouseX >= 400 && intMouseX <= 780 && intMouseY >= 320 && intMouseY <= 370){
						TextInputFile quizes = new TextInputFile("quizes.txt");
						
						con.clear();
					}
				}
			}
	
	}
}
}
