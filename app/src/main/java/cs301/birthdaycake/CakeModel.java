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


    public CakeModel getCakeModel() {
        return cakeModel;
    }


}
