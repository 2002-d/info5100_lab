package moonRoverProject;

public class State {
    protected String name = "NULL";
    protected String subState = "NULL";


    State() {}
public Boolean pressRightPedal(int numOfTimesPressed) {
        return false;
    }
    
protected void pressRightPedalForTime(int numOfSecondsPressed) {}


    protected Boolean pressLeftPedal(int numOfTimesPressed) {
        return false;
    }


    protected Boolean pressLeftPedalForTime(int numOfSecondsPressed) {
        return false;
    }


    protected void voidPressLeftPedalForTime(int numOfSecondsPressed) {}


}
