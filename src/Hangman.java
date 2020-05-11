
//Not finished
public class Hangman implements OnePlayerGame {
	private String target;
	private int playerGuesses;
	private int targetLength;
	
	public Hangman(String aTarget){
		playerGuesses = 0;
		target = aTarget.toLowerCase();
		targetLength = target.length(); 
	}

	@Override
	public void makePlay(String aPlay) {
		playerGuesses++;
		int correctChar = 0;
		if(validPlay(aPlay)){
			if (target.contains(aPlay)){
				correctChar++;
			}
		}
		else{
			System.out.println("NOT A VALID PLAY");
		}
		
	}

	@Override
	public boolean validPlay(String check) {
		int charCount = 0;
		for(int i = 0; i< check.length(); i++){
			if (Character.isAlphabetic(check.charAt(i)) && Character.isLowerCase(check.charAt(i))){
				charCount++;
			}
			else {
				return false;
			}
		}
		if (charCount == 1){
			return true;
		}
		else{
			return false;
		}
	}

	@Override
	public boolean playOver() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String stateOfGame() {
		// TODO Auto-generated method stub
		return null;
	}

}
