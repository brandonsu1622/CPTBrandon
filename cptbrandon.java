//Brandon Su 
//Multiple Choice quiz
//Version 3.16 
//last edit: June 12th 2025 

import arc.*; 
import java.awt.image.*;
import java.awt.Color;


public class cptbrandon{ 
		//global variables 
		static String strname = ""; 
		static boolean blncheat = false;
		static String strquiz = ""; 
	public static void main(String [] args){ 
		Console con = new Console("Multiple choice", 1280, 720); 	
		// Main Screen
		while(true){
			
			//background
			con.clear();
			BufferedImage imgbackground = con.loadImage("background.png");
			con.drawImage(imgbackground,0 ,0);
			
			con.repaint();
		//main menu 

			con.drawString("Welcome to Multiple Choice", 280, 50);
			
			con.drawString("What would you like to do?", 450, 120);
			
			con.drawString("Play Game", 480, 320);
			
			con.drawString("Leaderboard", 480, 400); 

			con.drawString("Help", 480, 480);
			
			con.drawString("Add Quiz", 480, 560);
			
			con.drawString("Quit", 480, 640); 
			
			con.repaint(); 
			
		
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
						strname = con.readLine();
						con.clear();
						
						con.println("Hello " + strname);
						con.sleep(1000);
						
						 

						int intX = 120;
						
						while(quizes.eof() == false){
							con.drawString(quizes.readLine(), intX, 300);
							intX += 300;
					
							
						}
					con.println("what quiz would you like to play?"); 
					con.println("for newly added quizes just type the name of the new quiz"); 
					String strquiz = con.readLine(); 
					
	
		// accessing the added quiz
		String filename = strquiz + ".txt";
	boolean fileExists = true;

		try{
			TextInputFile file = new TextInputFile(filename);
			} catch (Exception e) {
			fileExists = false;
			}

if (fileExists) {
		TextInputFile newquiz = new TextInputFile(filename);
		System.out.println("able to access "+filename); 
		con.clear(); 
		con.drawImage(imgbackground, 0, 0);
		//basic array 
		String strquiz2 [][];

		
		//variables
		String strquestion = ""; 
		String stranswer1 = ""; 
		String stranswer2 = ""; 
		String stranswer3 = ""; 
		String stranswer4 = ""; 
		String stranswer = ""; 
		String strname = ""; 
		
		//Initializing variables 
		
		int intquestions = 0; 
		int intcorrectanswer = 0; 
		int intnum = 0; 
		double dblavg = 0; 
		
		
		//counting number of questions
		
		while(newquiz.eof() == false){
			
			strquestion = newquiz.readLine(); 
			stranswer1 = newquiz.readLine(); 
			stranswer2 = newquiz.readLine(); 
			stranswer3 = newquiz.readLine(); 
			stranswer4 = newquiz.readLine(); 
			stranswer = newquiz.readLine(); 
			
			intquestions += 1; 
		} 
		newquiz.close(); 	
	
		//making an array 
		
		TextInputFile quiz = new TextInputFile(filename);
		strquiz2 = new String [intquestions][7];
		for (int introw = 0; introw < intquestions; introw++) {
			String strrandnum;  
			
			//rows and columns 
			
			for(introw = 0; introw < intquestions; introw++){ 
				
				strrandnum = Integer.toString((int)(Math.random() * 100 + 1));
				
				strquiz2[introw][0] = quiz.readLine(); 
				strquiz2[introw][1] = quiz.readLine(); 
				strquiz2[introw][2] = quiz.readLine(); 
				strquiz2[introw][3] = quiz.readLine(); 
				strquiz2[introw][4] = quiz.readLine(); 
				strquiz2[introw][5] = quiz.readLine(); 
				strquiz2[introw][6] = strrandnum; 
			}
		}
		
		newquiz.close(); 	
		
		
		//bubble sort 
		 quiz = new TextInputFile(filename);
		
		
		//temperory variables 
		String strtempquestion; 
		String strtempans1; 
		String strtempans2;
		String strtempans3; 
		String strtempans4; 
		String strtempans; 
		String strrand; 
		int introw1; 
		int introw2; 
		
		for(introw2 = 0; introw2 < intquestions - 1; introw2++) {
			
			for(introw1 = 0; introw1 < intquestions - 1 - introw2; introw1++) { 
				 //convertig string into int and comaparing them 
				 
				 if(Integer.parseInt(strquiz2[introw1][6]) > Integer.parseInt(strquiz2[introw1 + 1][6])){
					 
					 
					 strtempquestion = strquiz2[introw1][0];
					 strtempans1 = strquiz2[introw1][1]; 
					 strtempans2 = strquiz2[introw1][2];  
					 strtempans3 = strquiz2[introw1][3]; 
					 strtempans4 = strquiz2[introw1][4];
					 strtempans = strquiz2[introw1][5];
					 strrand = strquiz2[introw1][6];
					 
					 strquiz2[introw1][0] = strquiz2[introw1 + 1][0];
					 strquiz2[introw1][1] = strquiz2[introw1 + 1][1]; 
					 strquiz2[introw1][2] = strquiz2[introw1 + 1][2];  
					 strquiz2[introw1][3] = strquiz2[introw1 + 1][3]; 
					 strquiz2[introw1][4] = strquiz2[introw1 + 1][4];
					 strquiz2[introw1][5] = strquiz2[introw1 + 1][5];
					 strquiz2[introw1][6] = strquiz2[introw1 + 1][6];
					
					 strquiz2[introw1 + 1][0] = strtempquestion;				
					 strquiz2[introw1 + 1][1] = strtempans1; 
					 strquiz2[introw1 + 1][2] = strtempans2; 
					 strquiz2[introw1 + 1][3] = strtempans3; 
					 strquiz2[introw1 + 1][4] = strtempans4; 
					 strquiz2[introw1 + 1][5] = strtempans; 
					 strquiz2[introw1 + 1][6] = strrand; 
					 
				 }  
			 }
		 }
		 //printing the tests
		 int intloop; 
		 
		 //printing the answers 
		 
		 for(intloop = 0; intloop < intquestions; intloop++){
			 dblavg = ((double) intcorrectanswer /(double) intquestions) * 100;
			 con.println(strname + "  "+filename+"   " + dblavg + "%");
			 con.println("Question " + strquiz2[intloop][0]); 
			 con.println("A. " + strquiz2[intloop][1]);
			 con.println("B. " + strquiz2[intloop][2]);
			 con.println("C. " + strquiz2[intloop][3]);
			 con.println("D. " + strquiz2[intloop][4]);

			 stranswer = con.readLine();
			 
			 //checking the answer 
			 if(stranswer.equalsIgnoreCase(strquiz2[intloop][5])) {
				intcorrectanswer++;
				con.println("Correct!");
			} else {
					con.println("Wrong! The correct answer was " + strquiz2[intloop][5]);
				}
				
				
			con.sleep(1000);
			con.clear(); 
		 }
			dblavg = ((double) intcorrectanswer /(double) intquestions) * 100;
			con.println("You got " + intcorrectanswer + "/" + intquestions + " correct.");
			con.println("Score: " + dblavg + "%");

			System.out.println("able to run new quiz");  
							for (introw1 = 0; introw1 < intquestions; introw1++) {
								for (introw2 = 0; introw2 < 6; introw2++) {
								String line = quiz.readLine();
							if (line == null) {
								System.out.println("File ended unexpectedly at question " + (introw1+1));
							break;
							}
						strquiz2[introw1][introw2] = line;
						
						}
						strquiz2[introw1][6] = Integer.toString((int)(Math.random() * 100 + 1));
						}
						
			//leaderboard
			TextOutputFile leaderboard = new TextOutputFile("leaderboard.txt", true); 
			
			leaderboard.println(strname); 
			leaderboard.println(strquiz); 
			leaderboard.println(dblavg); 
			
			//result screen 
			con.println("Final Results: ");
			con.println("Name:       " +strname);
			con.println("Test type: 	    "+strquiz);
			con.println("Win Percentage: " + dblavg + "%");
					
			con.sleep(2000);
			con.println("Thanks for playing!");
			con.println("Return back to main menu(yes or no)?");
			String strback = con.readLine();
			if(strback.equalsIgnoreCase("yes")){
				con.clear();
			}
			con.clear();
					}	 
						//accessing the quizes
						//stray kids quiz
					
					if(strquiz.equalsIgnoreCase("straykids")){
							TextInputFile straykids = new TextInputFile(strquiz);
							con.clear();  
							con.drawImage(imgbackground, 0, 0);
							
							MultipleChoiceTest.quiz1(con);
							System.out.println("able to print straykids quiz"); 
							break;			
						}
						//animals quiz 
						
						if(strquiz.equalsIgnoreCase("animals")){
							TextInputFile straykids = new TextInputFile(strquiz);
							con.clear();  
							con.drawImage(imgbackground, 0, 0);
							
							MultipleChoiceTest.quiz2(con);
							System.out.println("able to print animals quiz");
							break;  
						}
						if(strquiz.equalsIgnoreCase("arcane")){
							TextInputFile straykids = new TextInputFile(strquiz);
							con.clear();  
							con.drawImage(imgbackground, 0, 0);
							
							MultipleChoiceTest.quiz3(con);
							System.out.println("able to print arcane quiz"); 
							break; 
						}
						
						if(strquiz.equalsIgnoreCase("valorant")){
							TextInputFile valorant = new TextInputFile(strquiz);
							con.clear();  
							con.drawImage(imgbackground, 0, 0);
							
							MultipleChoiceTest.quiz4(con);
							System.out.println("able to print valorant quiz"); 
							break; 
							
							
							
						} 
					
				}
			
				//leaderboard screen 
				
				else if(intMouseX >= 500 && intMouseX <= 780 && intMouseY >= 400 && intMouseY <= 450){
						TextInputFile leaderboard = new TextInputFile("leaderboard.txt");
						
						con.clear(); 
						con.drawImage(imgbackground, 0,0); 
						
						System.out.println("able to access leaderboard"); 
						
						//variables
						String strname; 
						String stravg; 
						String strtest; 
						int intcount = 0; 
						
						con.println("this is the leaderboard"); 
						con.println("Name:   |Test Type:   |Winning Average:    "); 
						con.println("________________________________________________"); 
						
						while(leaderboard.eof() == false){
							strname = leaderboard.readLine(); 
							strtest = leaderboard.readLine(); 
							stravg = leaderboard.readLine(); 
							intcount += 1; 
							
						}
						leaderboard.close(); 
						
						String strleaderboard[][];
						strleaderboard = new String[intcount][3]; 
						
						leaderboard = new TextInputFile("leaderboard.txt");  
						while(leaderboard.eof() == false){
							int introw;  
							
							for(introw = 0; introw < intcount; introw++){ 
								
								strleaderboard[introw][0] = leaderboard.readLine(); 
								strleaderboard[introw][1] = leaderboard.readLine(); 
								strleaderboard[introw][2] = leaderboard.readLine(); 
							}
						}
						
			String strnames;
			String strtests; 
			String straccuracy; 
			int introw1; 
			int introw2;  
						
			//bubble sorting the leaderboard from highest to lowest 
			
			for(introw2 = 0; introw2 < intcount - 1; introw2++) {
				for(introw1 = 0; introw1 < intcount - 1 - introw2; introw1++) { 
					
					if(Double.parseDouble(strleaderboard[introw1][2]) < Double.parseDouble(strleaderboard[introw1 + 1][2])){
						
						strnames = strleaderboard[introw1][0];
						strtests = strleaderboard[introw1][1]; 
						straccuracy = strleaderboard[introw1][2]; 
						
						strleaderboard[introw1][0] = strleaderboard[introw1 + 1][0];  
						strleaderboard[introw1][1] = strleaderboard[introw1 + 1][1]; 
						strleaderboard[introw1][2] = strleaderboard[introw1 + 1][2]; 
						
						strleaderboard[introw1 + 1][0] = strnames; 
						strleaderboard[introw1 + 1][1] = strtests; 
						strleaderboard[introw1 + 1][2] = straccuracy; 
						
					}
				}
			}
			
			int intloop; 
			
			//printing all the records from the tests
			for(intloop = 0; intloop < intcount; intloop++){
							con.println(strleaderboard[intloop][0] + "	|" + strleaderboard[intloop][1] + "	|" + strleaderboard[intloop][2]);
						
						}
						con.println(); 
						con.println("Press any key if you want to go back to main menu.");
						char chrback = con.getChar();
						con.clear();
						
						break; 
					}
					
					
			//help screen
			
			else if(intMouseX >= 500 && intMouseX <= 780 && intMouseY >= 480 && intMouseY <= 530){
				
				con.clear(); 
				con.drawImage(imgbackground, 0, 0);
				
				//debug 
				System.out.println("able to access help menu"); 
				
				con.println("---Help Menu---"); 
				con.sleep(1000);
				con.println("How to play: "); 
				con.sleep(1000); 
				con.println("choose any quiz you want to play"); 
				con.sleep(1000); 
				con.println("after choosing the quiz start answering with the corresponding letter answer"); 
				con.sleep(1000); 
				con.println("The person with the highest accuracy will be 1st in the leaderboard");
				con.sleep(1000);
				con.println("Try your best and aim for the top.");
				con.sleep(1000);
				con.println("Otherwise, have fun!!!");
				
				con.println("Press any key if you want to go back to main menu.");
				char chrback = con.getChar();
				con.clear();
				
				break;
			}
			//adding the add quiz menu 
			else if (intMouseX >= 500 && intMouseX <= 780 && intMouseY >= 560 && intMouseY <= 610) {
				con.clear();
				con.drawImage(imgbackground, 0, 0);
				//debugging
				
				System.out.println("able to access the add quiz menu"); 
				
				//asking and reading quiz name
				con.println("----add new quiz---"); 
				con.println("enter quiz name(no spaces, it will be saved as a .txt file)"); 
				strquiz = con.readLine();
				TextOutputFile newquiz = new TextOutputFile(strquiz + ".txt"); 
				 
				
				//asking for number of questions 
				con.println("how many questions well the quiz have: "); 
				int intquestions = Integer.parseInt(con.readLine()); 
				
				for(int intcount = 1; intcount <= intquestions; intcount++){ 
					con.println("enter question: "); 
					String strquestion = con.readLine(); 
					con.println("enter answer A: "); 
					String stroptA = con.readLine(); 
					con.println("enter answer B: "); 
					String stroptB = con.readLine(); 
					con.println("enter answer C: "); 
					String stroptC = con.readLine(); 
					con.println("enter answer D: "); 
					String stroptD = con.readLine(); 
					con.println("enter the actual answer(A, B, C, or D): "); 
					String strcorrectanswer = con.readLine().toLowerCase();
					
					//saving answers to new quiz 
					newquiz.println(strquestion);
					newquiz.println(stroptA);
					newquiz.println(stroptB);
					newquiz.println(stroptC);
					newquiz.println(stroptD);
					newquiz.println(strcorrectanswer);
				} 
				newquiz.close(); 
				
				//putting the quiz into quizes.txt
				TextOutputFile updateQuizList = new TextOutputFile("quizes.txt", true);
				updateQuizList.println(strquiz);
				updateQuizList.close();
				
				con.println("quiz succesfully added!"); 
				con.println("press any key to return to main menu"); 
				char chrback = con.getChar();
						con.clear();
						
						break; 					
			}
			// The Quit Screen of the Math Training Game
					else if(intMouseX >= 500 && intMouseX <= 780 && intMouseY >= 640 && intMouseY <= 690){ 
						
						con.clear();
						con.drawImage(imgbackground, 0, 0);
						
						// Debugging
						System.out.println("Able to access Quit Menu");	
						
						con.println("Thank you for playing! See you next time!");
						con.sleep(3000);
						con.closeConsole();
						
					}
					
					
				}
			}
		}
	}
}
