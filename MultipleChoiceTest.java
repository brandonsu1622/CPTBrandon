import arc.*;


public class MultipleChoiceTest{
	public static void main(String [] args){ 
		Console con = new Console(); 
	}
		
		

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
			 con.println("Question" + (intloop + 1)); 
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
		 }
		 
		 dblavg = ((double) intcorrectanswer / intquestions) * 100;
		 con.println("You got " + intcorrectanswer + "/" + intquestions + " correct.");
		 con.println("Score: " + dblavg + "%");
	 }
		
		

}
