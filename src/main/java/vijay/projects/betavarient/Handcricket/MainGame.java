package vijay.projects.betavarient.Handcricket;

public class MainGame {

    private long playerScore, systemScore;
    private boolean playerChoice;

    private SystemUtility systemUtility;

    public long getPlayerScore() {
        return playerScore;
    }

    public void setPlayerScore(long playerScore) {
        this.playerScore = playerScore;
    }

    public long getSystemScore() {
        return systemScore;
    }

    public void setSystemScore(long systemScore) {
        this.systemScore = systemScore;
    }

    public boolean getPlayerChoice() {
        return playerChoice;
    }

    public SystemUtility getSystemUtility() {
        return systemUtility;
    }

    public void setPlayerChoice(boolean playerChoice) {
        this.playerChoice = playerChoice;
    }

    public MainGame() {
        playerScore = 0;
        systemScore = 0;
        systemUtility = new SystemUtility();
    }

    public void userFirstBatting() {
        int userBatting = 0;
        while(true) {
            userBatting = getSystemUtility().getUserInput();
            if (!getSystemUtility().isOut(getSystemUtility().systemOutput(),userBatting)) {
                setPlayerScore(getPlayerScore() + userBatting);
                continue;
            }
            break;
        }

        int systemBatting = 0;
        while(true) {
            systemBatting = getSystemUtility().systemOutput();
            if(!getSystemUtility().isOut(systemBatting, getSystemUtility().getUserInput())) {
                setSystemScore(getSystemScore() + systemBatting);
                continue;
            }
            break;
        }
        getSystemUtility().getWinner(getSystemScore(),getPlayerScore());
    }

    public void systemFirstBatting() {
        int systemBatting = 0;
        while(true) {
            systemBatting = getSystemUtility().systemOutput();
            if(!getSystemUtility().isOut(systemBatting, getSystemUtility().getUserInput())) {
                setSystemScore(getSystemScore() + systemBatting);
                continue;
            }
            break;
        }

        int userBatting = 0;
        while(true) {
            userBatting = getSystemUtility().getUserInput();
            if (!getSystemUtility().isOut(getSystemUtility().systemOutput(),userBatting)) {
                setPlayerScore(getPlayerScore() + userBatting);
                continue;
            }
            break;
        }
    }

    public static void main(String[] args) {

        MainGame mainGame = new MainGame();
        SystemUtility systemUtility = new SystemUtility();

        if(systemUtility.toss()) {
            mainGame.setPlayerChoice(systemUtility.getUserChoice());
        } else {
            mainGame.setPlayerChoice(!systemUtility.systemChoice());
        }
        if (mainGame.getPlayerChoice()) {
            mainGame.userFirstBatting();
        } else {
            mainGame.systemFirstBatting();
        }
    }
}
