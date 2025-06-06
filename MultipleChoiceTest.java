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
		
		String strtempquestion; 
		String strtempans1; 
		String strtempans2;
		String strtempans3; 
		String strtempans4; 
		String strtempans; 
		String strrand; 
		int introw1; 
		int introw2; 
		
		for(introw2 = 0; introw2 > intquestions -1; introw2++){ 
			 for(introw1 = 0; introw1 > intquestions - 1 - introw2 ; introw2++){ 
				 //convertig string into int and comaparing them 
				 if(Integer.parseInt(strstraykids[introw1][6]) > Integer.parseInt(strstraykids[introw1 + 1][6])){ 
					 strtempquestion = strstraykids[introw1][0]; 
				 }
				 
			 }
		 }
	 }
		
		

}
