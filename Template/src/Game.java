public abstract class Game {

    public final void play(int numberOfPlayers) {
        // a template method specifying a generic game
        initializeGame(numberOfPlayers);
        int playerInTurn = 0;
        while (!endofgame()) {
            playSingleTurn(playerInTurn);
            playerInTurn = ++playerInTurn % numberOfPlayers;
        }
        displayWinner();
    }

    public abstract void initializeGame(int numberOfPlayers);
    public abstract boolean endofgame();
    public abstract void playSingleTurn(int player);
    public abstract void displayWinner();
}