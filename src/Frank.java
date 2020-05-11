
public class Frank implements OnePlayerGame{
	private String target;
	private int playerGuesses;
	private int lettersMatched;
	
	public Frank(String newTarget){
		if (newTarget.length() == 5){
			lettersMatched = 0;
		}
		else{
			lettersMatched = 5;
		}
		playerGuesses = 0;
		target = newTarget.toLowerCase();
	}

	@Override
	public void makePlay(String aPlay) {
		playerGuesses++;
		int charMatched = 0;
		if(validPlay(aPlay)){
			for (int i = 0; i < aPlay.length(); i++){
				if (aPlay.charAt(i) == target.charAt(i)){
					charMatched++;
				}
			}
			lettersMatched = charMatched;
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
		if (charCount == 5){
			return true;
		}
		else{
			return false;
		}
	}

	@Override
	public boolean playOver() {
		if(lettersMatched == 5){
			return true;
		}
		else{
			return false;
		}
	}

	@Override
	public String stateOfGame() {
		 return ("Number of Guesses= " + playerGuesses + "   Number of Matches= " + lettersMatched); 
	}

}
