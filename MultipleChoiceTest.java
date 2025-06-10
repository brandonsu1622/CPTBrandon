import arc.*;


public class MultipleChoiceTest{
		

//stray kids test
	public static void quiz1(Console con){ 
		TextInputFile straykids = new TextInputFile("straykids.txt"); 
		
		//basic array 
		String strstraykids [][];
		
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
		
		strname = cptbrandon.strname; 
		//counting number of questions
		
		while(straykids.eof() == false){
			
			strquestion = straykids.readLine(); 
			stranswer1 = straykids.readLine(); 
			stranswer2 = straykids.readLine(); 
			stranswer3 = straykids.readLine(); 
			stranswer4 = straykids.readLine(); 
			stranswer = straykids.readLine(); 
			
			intquestions += 1; 
		} 
		straykids.close(); 	
	
		//making an array 
		
		straykids = new TextInputFile("straykids.txt"); 
		strstraykids = new String [intquestions][7];
		while(straykids.eof() == false){
			String strrandnum; 
			int introw; 
			
			//rows and columns 
			
			for(introw = 0; introw < intquestions; introw++){ 
				
				strrandnum = Integer.toString((int)(Math.random() * 100 + 1));
				
				strstraykids[introw][0] = straykids.readLine(); 
				strstraykids[introw][1] = straykids.readLine(); 
				strstraykids[introw][2] = straykids.readLine(); 
				strstraykids[introw][3] = straykids.readLine(); 
				strstraykids[introw][4] = straykids.readLine(); 
				strstraykids[introw][5] = straykids.readLine(); 
				strstraykids[introw][6] = strrandnum; 
			}
		}
		
		straykids.close(); 	
		
		
		//bubble sort 
		straykids = new TextInputFile("straykids.txt"); 
		//for(int intcount = 0; intcount < intquestions; intcount++){ 
			//con.println(strstraykids[intcount][0]);
		//}
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
				 
				 if(Integer.parseInt(strstraykids[introw1][6]) > Integer.parseInt(strstraykids[introw1 + 1][6])){
					 
					 
					 strtempquestion = strstraykids[introw1][0];
					 strtempans1 = strstraykids[introw1][1]; 
					 strtempans2 = strstraykids[introw1][2];  
					 strtempans3 = strstraykids[introw1][3]; 
					 strtempans4 = strstraykids[introw1][4];
					 strtempans = strstraykids[introw1][5];
					 strrand = strstraykids[introw1][6];
					 
					 strstraykids[introw1][0] = strstraykids[introw1 + 1][0];
					 strstraykids[introw1][1] = strstraykids[introw1 + 1][1]; 
					 strstraykids[introw1][2] = strstraykids[introw1 + 1][2];  
					 strstraykids[introw1][3] = strstraykids[introw1 + 1][3]; 
					 strstraykids[introw1][4] = strstraykids[introw1 + 1][4];
					 strstraykids[introw1][5] = strstraykids[introw1 + 1][5];
					 strstraykids[introw1][6] = strstraykids[introw1 + 1][6];
					
					 strstraykids[introw1 + 1][0] = strtempquestion;				
					 strstraykids[introw1 + 1][1] = strtempans1; 
					 strstraykids[introw1 + 1][2] = strtempans2; 
					 strstraykids[introw1 + 1][3] = strtempans3; 
					 strstraykids[introw1 + 1][4] = strtempans4; 
					 strstraykids[introw1 + 1][5] = strtempans; 
					 strstraykids[introw1 + 1][6] = strrand; 
					 
				 }  
			 }
		 }
		 //printing the tests
		 int intloop; 
		 
		 //printing the answers 
		 
		 for(intloop = 0; intloop < intquestions; intloop++){
			 con.println(strname + "  Straykids   " + dblavg + "%");
			 con.println("Question " + strstraykids[intloop][0]); 
			 con.println("A. " + strstraykids[intloop][1]);
			 con.println("B. " + strstraykids[intloop][2]);
			 con.println("C. " + strstraykids[intloop][3]);
			 con.println("D. " + strstraykids[intloop][4]);

			 stranswer = con.readLine();
			 
			 //checking the answer 
			 if(stranswer.equalsIgnoreCase(strstraykids[intloop][5])) {
				intcorrectanswer++;
				con.println("Correct!");
				intcorrectanswer += 1; 
			} else {
					con.println("Wrong! The correct answer was " + strstraykids[intloop][5]);
				}
				
				
			con.sleep(1000);
			con.clear(); 
		 }
			dblavg = ((double) intcorrectanswer / intquestions) * 100;
			con.println("You got " + intcorrectanswer + "/" + intquestions + " correct.");
			con.println("Score: " + dblavg + "%");

			System.out.println("able to run straykids quiz");  
							for (introw1 = 0; introw1 < intquestions; introw1++) {
								for (introw2 = 0; introw2 < 6; introw2++) {
								String line = straykids.readLine();
							if (line == null) {
								System.err.println("File ended unexpectedly at question " + (introw1+1));
							break;
							}
						strstraykids[introw1][introw2] = line;
						}
						strstraykids[introw1][6] = Integer.toString((int)(Math.random() * 100 + 1));
						}
						
				//leaderboard
			TextOutputFile leaderboard = new TextOutputFile("leaderboard.txt"); 
			
			leaderboard.println(strname); 
			leaderboard.println("straykids"); 
			leaderboard.println(dblavg); 
			
			//results sceen
			con.println("Final Results: ");
			con.println("Name:              " + strname);	
			con.println("Test type: 	    straykids");
			con.println("Win Percentage: " + dblavg + "%");
					
			con.sleep(2000);
			con.println("Thanks for playing!");
			con.println("Return back to main menu?");
			String strBack = con.readLine();
			con.clear();
			
							 
	 }
	 public static void quiz2 (Console con){ 
		TextInputFile animals = new TextInputFile("animals.txt"); 
		
		//basic array 
		String stranimals [][];
		
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
		
		strname = cptbrandon.strname; 
		//counting number of questions
		
		while(animals.eof() == false){
			
			strquestion = animals.readLine(); 
			stranswer1 = animals.readLine(); 
			stranswer2 = animals.readLine(); 
			stranswer3 = animals.readLine(); 
			stranswer4 = animals.readLine(); 
			stranswer = animals.readLine(); 
			
			intquestions += 1; 
		} 
		animals.close(); 	
	
		//making an array 
		
		animals = new TextInputFile("animals.txt"); 
		stranimals = new String [intquestions][7];
		while(animals.eof() == false){
			String strrandnum; 
			int introw; 
			
			//rows and columns 
			
			for(introw = 0; introw < intquestions; introw++){ 
				
				strrandnum = Integer.toString((int)(Math.random() * 100 + 1));
				
				stranimals[introw][0] = animals.readLine(); 
				stranimals[introw][1] = animals.readLine(); 
				stranimals[introw][2] = animals.readLine(); 
				stranimals[introw][3] = animals.readLine(); 
				stranimals[introw][4] = animals.readLine(); 
				stranimals[introw][5] = animals.readLine(); 
				stranimals[introw][6] = strrandnum; 
			}
		}
		
		animals.close(); 	
		
		
		//bubble sort 
		animals = new TextInputFile("animals.txt"); 
		//for(int intcount = 0; intcount < intquestions; intcount++){ 
			//con.println(strstraykids[intcount][0]);
		//}
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
				 
				 if(Integer.parseInt(stranimals[introw1][6]) > Integer.parseInt(stranimals[introw1 + 1][6])){
					 
					 
					 strtempquestion = stranimals[introw1][0];
					 strtempans1 = stranimals[introw1][1]; 
					 strtempans2 = stranimals[introw1][2];  
					 strtempans3 = stranimals[introw1][3]; 
					 strtempans4 = stranimals[introw1][4];
					 strtempans = stranimals[introw1][5];
					 strrand = stranimals[introw1][6];
					 
					 stranimals[introw1][0] = stranimals[introw1 + 1][0];
					 stranimals[introw1][1] = stranimals[introw1 + 1][1]; 
					 stranimals[introw1][2] = stranimals[introw1 + 1][2];  
					 stranimals[introw1][3] = stranimals[introw1 + 1][3]; 
					 stranimals[introw1][4] = stranimals[introw1 + 1][4];
					 stranimals[introw1][5] = stranimals[introw1 + 1][5];
					 stranimals[introw1][6] = stranimals[introw1 + 1][6];
					
					 stranimals[introw1 + 1][0] = strtempquestion;				
					 stranimals[introw1 + 1][1] = strtempans1; 
					 stranimals[introw1 + 1][2] = strtempans2; 
					 stranimals[introw1 + 1][3] = strtempans3; 
					 stranimals[introw1 + 1][4] = strtempans4; 
					 stranimals[introw1 + 1][5] = strtempans; 
					 stranimals[introw1 + 1][6] = strrand; 
					 
				 }  
			 }
		 }
		 //printing the tests
		 int intloop; 
		 
		 //printing the answers 
		 
		 for(intloop = 0; intloop < intquestions; intloop++){
			 con.println(strname + "  animals   " + dblavg + "%");
			 con.println("Question " + stranimals[intloop][0]); 
			 con.println("A. " + stranimals[intloop][1]);
			 con.println("B. " + stranimals[intloop][2]);
			 con.println("C. " + stranimals[intloop][3]);
			 con.println("D. " + stranimals[intloop][4]);

			 stranswer = con.readLine();
			 
			 //checking the answer 
			 if(stranswer.equalsIgnoreCase(stranimals[intloop][5])) {
				intcorrectanswer++;
				con.println("Correct!");
				intcorrectanswer += 1; 
			} else {
					con.println("Wrong! The correct answer was " + stranimals[intloop][5]);
				}
				
				
			con.sleep(1000);
			con.clear(); 
		 }
			dblavg = ((double) intcorrectanswer / intquestions) * 100;
			con.println("You got " + intcorrectanswer + "/" + intquestions + " correct.");
			con.println("Score: " + dblavg + "%");

			System.out.println("able to run animals quiz");  
							for (introw1 = 0; introw1 < intquestions; introw1++) {
								for (introw2 = 0; introw2 < 6; introw2++) {
								String line = animals.readLine();
							if (line == null) {
								System.err.println("File ended unexpectedly at question " + (introw1+1));
							break;
							}
						stranimals[introw1][introw2] = line;
						}
						stranimals[introw1][6] = Integer.toString((int)(Math.random() * 100 + 1));
						}
						
				//leaderboard 
				TextOutputFile leaderboard = new TextOutputFile("leaderboard.txt"); 
			
				leaderboard.println(strname); 
				leaderboard.println("animals"); 
				leaderboard.println(dblavg); 
				
				//results sceen
				con.println("Final Results: ");
				con.println("Name:              " + strname);	
				con.println("Test type: 	    animals");
				con.println("Win Percentage: " + dblavg + "%");
					
				con.sleep(2000);
				con.println("Thanks for playing!");
				con.println("Return back to main menu?");
				String strBack = con.readLine();
				con.clear();
			

							 
	 }
	  public static void quiz3 (Console con){ 
		TextInputFile arcane = new TextInputFile("arcane.txt"); 
		
		//basic array 
		String strarcane [][];
		
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
		
		strname = cptbrandon.strname; 
		//counting number of questions
		
		while(arcane.eof() == false){
			
			strquestion = arcane.readLine(); 
			stranswer1 = arcane.readLine(); 
			stranswer2 = arcane.readLine(); 
			stranswer3 = arcane.readLine(); 
			stranswer4 = arcane.readLine(); 
			stranswer = arcane.readLine(); 
			
			intquestions += 1; 
		} 
		arcane.close(); 	
	
		//making an array 
		
		arcane = new TextInputFile("arcane.txt"); 
		strarcane = new String [intquestions][7];
		while(arcane.eof() == false){
			String strrandnum; 
			int introw; 
			
			//rows and columns 
			
			for(introw = 0; introw < intquestions; introw++){ 
				
				strrandnum = Integer.toString((int)(Math.random() * 100 + 1));
				
				strarcane[introw][0] = arcane.readLine(); 
				strarcane[introw][1] = arcane.readLine(); 
				strarcane[introw][2] = arcane.readLine(); 
				strarcane[introw][3] = arcane.readLine(); 
				strarcane[introw][4] = arcane.readLine(); 
				strarcane[introw][5] = arcane.readLine(); 
				strarcane[introw][6] = strrandnum; 
			}
		}
		
		arcane.close(); 	
		
		
		//bubble sort 
		arcane = new TextInputFile("arcane.txt"); 
		//for(int intcount = 0; intcount < intquestions; intcount++){ 
			//con.println(strstraykids[intcount][0]);
		//}
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
				 
				 if(Integer.parseInt(strarcane[introw1][6]) > Integer.parseInt(strarcane[introw1 + 1][6])){
					 
					 
					 strtempquestion = strarcane[introw1][0];
					 strtempans1 = strarcane[introw1][1]; 
					 strtempans2 = strarcane[introw1][2];  
					 strtempans3 = strarcane[introw1][3]; 
					 strtempans4 = strarcane[introw1][4];
					 strtempans = strarcane[introw1][5];
					 strrand = strarcane[introw1][6];
					 
					 strarcane[introw1][0] = strarcane[introw1 + 1][0];
					 strarcane[introw1][1] = strarcane[introw1 + 1][1]; 
					 strarcane[introw1][2] = strarcane[introw1 + 1][2];  
					 strarcane[introw1][3] = strarcane[introw1 + 1][3]; 
					 strarcane[introw1][4] = strarcane[introw1 + 1][4];
					 strarcane[introw1][5] = strarcane[introw1 + 1][5];
					 strarcane[introw1][6] = strarcane[introw1 + 1][6];
					
					 strarcane[introw1 + 1][0] = strtempquestion;				
					 strarcane[introw1 + 1][1] = strtempans1; 
					 strarcane[introw1 + 1][2] = strtempans2; 
					 strarcane[introw1 + 1][3] = strtempans3; 
					 strarcane[introw1 + 1][4] = strtempans4; 
					 strarcane[introw1 + 1][5] = strtempans; 
					 strarcane[introw1 + 1][6] = strrand; 
					 
				 }  
			 }
		 }
		 //printing the tests
		 int intloop; 
		 
		 //printing the answers 
		 
		 for(intloop = 0; intloop < intquestions; intloop++){
			 con.println(strname + "  arcane   " + dblavg + "%");
			 con.println("Question " + strarcane[intloop][0]); 
			 con.println("A. " + strarcane[intloop][1]);
			 con.println("B. " + strarcane[intloop][2]);
			 con.println("C. " + strarcane[intloop][3]);
			 con.println("D. " + strarcane[intloop][4]);

			 stranswer = con.readLine();
			 
			 //checking the answer 
			 if(stranswer.equalsIgnoreCase(strarcane[intloop][5])) {
				intcorrectanswer++;
				con.println("Correct!");
				intcorrectanswer += 1; 
			} else {
					con.println("Wrong! The correct answer was " + strarcane[intloop][5]);
				}
				
				
			con.sleep(1000);
			con.clear(); 
		 }
			dblavg = (intcorrectanswer / intquestions) * 100;
			con.println("You got " + intcorrectanswer + "/" + intquestions + " correct.");
			con.println("Score: " + dblavg + "%");

			System.out.println("able to run arcane quiz");  
							for (introw1 = 0; introw1 < intquestions; introw1++) {
								for (introw2 = 0; introw2 < 6; introw2++) {
								String line = arcane.readLine();
							if (line == null) {
								System.out.println("File ended unexpectedly at question " + (introw1+1));
							break;
							}
						strarcane[introw1][introw2] = line;
						
						}
						strarcane[introw1][6] = Integer.toString((int)(Math.random() * 100 + 1));
						}
						
			//leaderboard
			TextOutputFile leaderboard = new TextOutputFile("leaderboard.txt"); 
			
			leaderboard.println(strname); 
			leaderboard.println("arcane"); 
			leaderboard.println(dblavg); 
			
			//result screen 
			con.println("Final Results: ");
			con.println("Name:              " + strname);
			con.println("Test type: 	    arcane");
			con.println("Win Percentage: " + dblavg + "%");
					
			con.sleep(2000);
			con.println("Thanks for playing!");
			con.println("Return back to main menu?");
			String strBack = con.readLine();
			con.clear();
							 
	 }
	  public static void quiz4 (Console con){ 
		TextInputFile valorant = new TextInputFile("arcane.txt"); 
		
		//basic array 
		String strvalorant [][];
		
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
		
		strname = cptbrandon.strname; 
		//counting number of questions
		
		while(valorant.eof() == false){
			
			strquestion = valorant.readLine(); 
			stranswer1 = valorant.readLine(); 
			stranswer2 = valorant.readLine(); 
			stranswer3 = valorant.readLine(); 
			stranswer4 = valorant.readLine(); 
			stranswer = valorant.readLine(); 
			
			intquestions += 1; 
		} 
		valorant.close(); 	
	
		//making an array 
		
		valorant = new TextInputFile("valorant.txt"); 
		strvalorant = new String [intquestions][7];
		while(valorant.eof() == false){
			String strrandnum; 
			int introw; 
			
			//rows and columns 
			
			for(introw = 0; introw < intquestions; introw++){ 
				
				strrandnum = Integer.toString((int)(Math.random() * 100 + 1));
				
				strvalorant[introw][0] = valorant.readLine(); 
				strvalorant[introw][1] = valorant.readLine(); 
				strvalorant[introw][2] = valorant.readLine(); 
				strvalorant[introw][3] = valorant.readLine(); 
				strvalorant[introw][4] = valorant.readLine(); 
				strvalorant[introw][5] = valorant.readLine(); 
				strvalorant[introw][6] = strrandnum; 
			}
		}
		
		valorant.close(); 	
		
		
		//bubble sort 
		valorant = new TextInputFile("valorant.txt"); 
		//for(int intcount = 0; intcount < intquestions; intcount++){ 
			//con.println(strstraykids[intcount][0]);
		//}
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
				 
				 if(Integer.parseInt(strvalorant[introw1][6]) > Integer.parseInt(strvalorant[introw1 + 1][6])){
					 
					 
					 strtempquestion = strvalorant[introw1][0];
					 strtempans1 = strvalorant[introw1][1]; 
					 strtempans2 = strvalorant[introw1][2];  
					 strtempans3 = strvalorant[introw1][3]; 
					 strtempans4 = strvalorant[introw1][4];
					 strtempans = strvalorant[introw1][5];
					 strrand = strvalorant[introw1][6];
					 
					 strvalorant[introw1][0] = strvalorant[introw1 + 1][0];
					 strvalorant[introw1][1] = strvalorant[introw1 + 1][1]; 
					 strvalorant[introw1][2] = strvalorant[introw1 + 1][2];  
					 strvalorant[introw1][3] = strvalorant[introw1 + 1][3]; 
					 strvalorant[introw1][4] = strvalorant[introw1 + 1][4];
					 strvalorant[introw1][5] = strvalorant[introw1 + 1][5];
					 strvalorant[introw1][6] = strvalorant[introw1 + 1][6];
					
					 strvalorant[introw1 + 1][0] = strtempquestion;				
					 strvalorant[introw1 + 1][1] = strtempans1; 
					 strvalorant[introw1 + 1][2] = strtempans2; 
					 strvalorant[introw1 + 1][3] = strtempans3; 
					 strvalorant[introw1 + 1][4] = strtempans4; 
					 strvalorant[introw1 + 1][5] = strtempans; 
					 strvalorant[introw1 + 1][6] = strrand; 
					 
				 }  
			 }
		 }
		 //printing the tests
		 int intloop; 
		 
		 //printing the answers 
		 
		 for(intloop = 0; intloop < intquestions; intloop++){
			 con.println(strname + "  arcane   " + dblavg + "%");
			 con.println("Question " + strvalorant[intloop][0]); 
			 con.println("A. " + strvalorant[intloop][1]);
			 con.println("B. " + strvalorant[intloop][2]);
			 con.println("C. " + strvalorant[intloop][3]);
			 con.println("D. " + strvalorant[intloop][4]);

			 stranswer = con.readLine();
			 
			 //checking the answer 
			 if(stranswer.equalsIgnoreCase(strvalorant[intloop][5])) {
				intcorrectanswer++;
				con.println("Correct!");
				intcorrectanswer += 1; 
			} else {
					con.println("Wrong! The correct answer was " + strvalorant[intloop][5]);
				}
				
				
			con.sleep(1000);
			con.clear(); 
		 }
			dblavg = (intcorrectanswer / intquestions) * 100;
			con.println("You got " + intcorrectanswer + "/" + intquestions + " correct.");
			con.println("Score: " + dblavg + "%");

			System.out.println("able to run valorant quiz");  
							for (introw1 = 0; introw1 < intquestions; introw1++) {
								for (introw2 = 0; introw2 < 6; introw2++) {
								String line = valorant.readLine();
							if (line == null) {
								System.out.println("File ended unexpectedly at question " + (introw1+1));
							break;
							}
						strvalorant[introw1][introw2] = line;
						
						}
						strvalorant[introw1][6] = Integer.toString((int)(Math.random() * 100 + 1));
						}
						
			//leaderboard
			TextOutputFile leaderboard = new TextOutputFile("leaderboard.txt"); 
			
			leaderboard.println(strname); 
			leaderboard.println("valorant"); 
			leaderboard.println(dblavg); 
			
			//result screen 
			con.println("Final Results: ");
			con.println("Name:              " + strname);
			con.println("Test type: 	    valorant");
			con.println("Win Percentage: " + dblavg + "%");
					
			con.sleep(2000);
			con.println("Thanks for playing!");
			con.println("Return back to main menu?");
			String strBack = con.readLine();
			con.clear();
							 
	 }
		
		

}
