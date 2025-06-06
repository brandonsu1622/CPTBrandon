import arc.*;


public class MultipleChoiceTest{

//stray kids test
	public static void quiz1(Console con){ 
		TextInputFile straykids = new TextInputFile("straykids.txt"); 
		
		//array 
		
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
		con.println("total questions" +intquestions); 
	}
			



}
