public class Handler {
    boolean displayRightNavigation;
    boolean displayContinueAheadNavigation;
    boolean displayCurrentStreet;
    boolean displayFirstSpeedLimit;
    boolean displaySecondSpeedLimit;
    boolean displayFirstWarning ;
    boolean displaySecondWarning ;
    boolean displayCurrentDirection;
    boolean displayTurnRight; 
    boolean displayTurnLeft ;
    boolean showSpeed;


    /* Mutator methods */

    public void setDisplayRightNavigation(boolean displayRightNavigation) {
        this.displayRightNavigation = displayRightNavigation;
    }

    public void setDisplayContinueAheadNavigation(boolean displayContinueAheadNavigation) {
        this.displayContinueAheadNavigation = displayContinueAheadNavigation;
    }

    public void setDisplayCurrentStreet(boolean displayCurrentStreet) {
        this.displayCurrentStreet = displayCurrentStreet;
    }

    public void setDisplayFirstSpeedLimit(boolean displayFirstSpeedLimit) {
        this.displayFirstSpeedLimit = displayFirstSpeedLimit;
    }

    public void setDisplaySecondSpeedLimit(boolean displaySecondSpeedLimit) {
        this.displaySecondSpeedLimit = displaySecondSpeedLimit;
    }

    public void setDisplayFirstWarning(boolean displayFirstWarning) {
        this.displayFirstWarning = displayFirstWarning;
    }


    public void setDisplaySecondWarning(boolean displaySecondWarning) {
        this.displaySecondWarning = displaySecondWarning;
    }

    public void setDisplayCurrentDirection(boolean displayCurrentDirection) {
        this.displayCurrentDirection = displayCurrentDirection;
    }

    public void setDisplayTurnRight(boolean displayTurnRight) {
        this.displayTurnRight = displayTurnRight;
    }


    public void setDisplayTurnLeft(boolean displayTurnLeft) {
        this.displayTurnLeft = displayTurnLeft;
    }


    public void setShowSpeed(boolean showSpeed) {
        this.showSpeed = showSpeed;
    }


    /* Accessor methods */

    public boolean isDisplayRightNavigation() {
        return displayRightNavigation;
    }

    public boolean isDisplayContinueAheadNavigation() {
        return displayContinueAheadNavigation;
    }

    public boolean isDisplayCurrentStreet() {
        return displayCurrentStreet;
    }

    public boolean isDisplayFirstSpeedLimit() {
        return displayFirstSpeedLimit;
    }

    public boolean isDisplaySecondSpeedLimit() {
        return displaySecondSpeedLimit;
    }

    public boolean isDisplayFirstWarning() {
        return displayFirstWarning;
    }

    public boolean isDisplaySecondWarning() {
        return displaySecondWarning;
    }

    public boolean isDisplayTurnRight() {
        return displayTurnRight;
    }

    public boolean isDisplayTurnLeft() {
        return displayTurnLeft;
    }

    public boolean isShowSpeed() {
        return showSpeed;
    }

    public boolean isDisplayCurrentDirection() {
        return displayCurrentDirection;
    }


}
