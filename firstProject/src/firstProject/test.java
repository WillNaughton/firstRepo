package firstProject;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("THIS IS MOSTLY FAKE");
		System.out.println(" ");
		
		String lastName = "Naughton";
		String firstName = "William";
		String lastName1 = "Naughton";
		String firstName1 = "Dean";
		
		short age = 14;
		short ageK = 23;
		
		int idW = 007;
		int idK = 001;
		
		long age1 = 2849453327894563476L;
		long id = 1000045262976247077L;
		
		boolean takingPromineo = true;
		boolean takingPromineoD = false;
		boolean takingPromineoK = true;
		
		float william = 11.26f;	
		float dean = 00.03f;
		float kirsten = 1325.62f;
		
		char willLetter = 'O';
		char deanLetter = 'W';
		char kirstenLetter = 'W';
		
		byte willNum = 7;	
		byte deanNum = 9;	
		byte kirstenNum = 9;
		
		double timesTheySaidYesD = 0.03;
		double timesTheySaidYesK = 4.27;

		
		System.out.println(lastName + ", " + firstName + " " + age);
		System.out.println("ID: " + idW);
		System.out.println("AGE " + age);
		
		if(takingPromineo == true)
		{ System.out.println("TAKING PROMINEO: YES");
		}
		
		System.out.println("MONEY: " + william + " Dollar(s)");
		System.out.println("FAV LETTER: " + willLetter);
		System.out.println("FAV NUM" + willNum);
		System.out.println(" ");
		System.out.println(lastName1 + ", " + firstName1);
		System.out.println("ID: " + id);
		System.out.println("AGE " + age1);
		if(takingPromineoD == true)
		{ System.out.println("TAKING PROMINEO: YES");
		}else {
			System.out.println("TAKING PROMINEO: NO");
		}
		System.out.println("MONEY: " + dean + " Dollar(s)");
		System.out.println("FAV LETTER: " + deanLetter);
		System.out.println("FAV NUM " + deanNum);
		System.out.println("TIMES THEY SAID YES TO WILL: " + timesTheySaidYesD);
		System.out.println(" ");
		String lastName2 = "Naughton";
		String firstName2 = "Kirsten";
		System.out.println(lastName2 + ", " +
		firstName2);
		System.out.println("ID: " + idK);
		System.out.println("AGE " + ageK);
		if(takingPromineoK == true)
		{ System.out.println("TAKING PROMINEO: YES");
		}		System.out.println("MONEY: " + kirsten + " Dollar(s)");
		System.out.println("FAV LETTER: " + kirstenLetter);
		System.out.println("FAV NUM " + kirstenNum);
		System.out.println("TIMES THEY SAID YES TO WILL: " + timesTheySaidYesK);

	}

}
