package cs301.birthdaycake;

// Strictly data containing class that contains information about the current state of the cake.


public class CakeModel {

    public boolean candlesLit;
    public int numCandles;
    public boolean hasFrosting;
    public boolean hasCandles;

    private CakeModel cakeModel;

    public CakeModel(){
        candlesLit = true;
        numCandles = 2;
        hasFrosting = true;
        hasCandles = true;
    }


    //creating all the getters below

    public CakeModel getCakeModel() {
        return cakeModel;
    }

    public boolean getCandlesLit(){
        return candlesLit;
    }

    public int getNumCandles(){
        return numCandles;
    }

    public boolean getHasCandles() {
        return hasCandles;
    }

    public boolean getHasFrosting() {
        return hasFrosting;
    }


}
