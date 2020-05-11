
public interface OnePlayerGame {
	void makePlay(String aPlay);
	boolean validPlay(String check);
	boolean playOver();
	String stateOfGame();
}
