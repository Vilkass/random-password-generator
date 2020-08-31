package Main;


public class Main {
	
	
	
	public static void main(String[] args) {
		
		PasswordGenerator passGenerator = new PasswordGenerator();
		int passwordLength = passGenerator.getSymbolLocation();
		int NUMBER_LOCATION = passGenerator.getSymbolLocation();
		int SPECIAL_LOCATION = passGenerator.getSymbolLocation();
		char randomNum = passGenerator.getRandomNum();
		char randomSpecialChar = passGenerator.getRandomChar();
		
		
		while(SPECIAL_LOCATION == NUMBER_LOCATION || NUMBER_LOCATION > passwordLength || SPECIAL_LOCATION > passwordLength) {
			SPECIAL_LOCATION = passGenerator.getSymbolLocation();
			NUMBER_LOCATION = passGenerator.getSymbolLocation();
		}
		char[] password = new char[passwordLength+1];
		
		
		password[NUMBER_LOCATION] = randomNum;
		password[SPECIAL_LOCATION] = randomSpecialChar;
		for(int i = 0; i < password.length; i++) {
			if(NUMBER_LOCATION == i || SPECIAL_LOCATION == i) {
				continue;
			}
			else {
				password[i] = passGenerator.getRandomLetter();
			}
			
		}
		
		
		System.out.println("Random Password Generated");
		System.out.println(password);

		
		
	}

	
	
	
	
}
