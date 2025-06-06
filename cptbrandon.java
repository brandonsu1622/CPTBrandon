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
		// Main Screen
		while(true){
			
			//background
			con.clear();
			BufferedImage imgbackground = con.loadImage("Background.png");
			con.drawImage(imgbackground,0 ,0);
			
			con.repaint();
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
					int intMouseX = con.currentMouseX();
					int intMouseY = con.currentMouseY();				
					// The Play Game Screen 
					if(intMouseX >= 400 && intMouseX <= 780 && intMouseY >= 320 && intMouseY <= 370){
						TextInputFile quizes = new TextInputFile("quizes.txt");
						
						con.clear();
						
					con.clear();
						con.drawImage(imgbackground, 0, 0);
						
						// User inputting their names
						con.println("Please enter your name: ");
						String strname = con.readLine();
						con.clear();
						
						con.println("Hello " + strname+" what quiz would you like to do?");
						con.sleep(1000);
						
						
						con.drawString("Return to Main Menu", 510, 575);

						int intX = 120;
						
						while(quizes.eof() == false){
							con.drawString(quizes.readLine(), intX, 420);
							intX += 300;
						}
					con.println("what quiz would you like to play?"); 
					String strquiz = con.readLine(); 
					strquiz+=".txt";
					
						//accessing the quizes
						//stray kids quiz
						
						if(strquiz.equalsIgnoreCase("straykids")){
							TextInputFile straykids = new TextInputFile(strquiz);
							con.clear();  
							con.drawImage(imgbackground, 0, 0);
							String strtemp; 
							String strquestion[]; 
							int intnumrand = 0; 
							while(straykids.eof() == false){ 
								strtemp = straykids.readLine(); 
								intnumrand = intnumrand + 1; 
							}
							straykids.close(); 
							con.println("The stray kids quiz has "+intnumrand+" questions"); 
								
								
								
						}
							
							
					}
				}
			}
		}
	}
}
