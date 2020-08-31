package Main;

public class PasswordGenerator {
	
	RandomNumber randomNumber = new RandomNumber();
	private int PASSWORD_MIN = 7;
	private int PASSWORD_MAX = 16;
	
	private char randomNum[] = {'0','1','2','3','4','5','6','7','8','9'};
	private char randomChar[] = {'!','@','#','$','%','^','&','*','-','+'};
	private char randomLetter[] = {'z','x','c','v','b','n','m','a','s','d','f','g','h','j','k','l','q','w','e','r','t','u','i','o','p','Z','X','C','V','B','N','M','A','S','D','F','G','H','J','K','L','Q','W','E','R','T','Y','U','I','O','P'};
	
	public int getSymbolLocation() {
		return ((int) (randomNumber.getRandomNumber()*(PASSWORD_MAX - PASSWORD_MIN) + PASSWORD_MIN));
	}
	
	public char getRandomNum() {
		return randomNum[(int)(randomNumber.getRandomNumber()*10)];
	}
	
	
	public char getRandomChar() {
		return randomChar[(int)(randomNumber.getRandomNumber()*10)];
	}
	public char getRandomLetter() {
		return randomLetter[(int)(randomNumber.getRandomNumber()*51)];
		
	}
	
	
}
