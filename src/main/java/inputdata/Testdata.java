package inputdata;

public class Testdata {
	public static String url,username,password;
	
	
	
public Testdata(String env){
	if (env.equalsIgnoreCase("QAI")){
	
		//-----QA TEST DATA-----// Set QA test data here
		 url="http://newtours.demoaut.com/mercurysignon.php";//
		 username="batman";
		 password="batman";			
	}
	
	else if (env.equalsIgnoreCase("PROD")){
		
		//-----PROD TEST DATA-----// Set PROD test data here
		 url="http://newtours.demoaut.com/mercurysignon.php";
		 username="abc";
		 password="abc";	
	}
}

}
