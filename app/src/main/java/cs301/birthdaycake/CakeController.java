package cs301.birthdaycake;

//this class will be controlling the operations on the cak and will determine what will appear in the cakeView

public class CakeController {

    private CakeView cakeView;
    private CakeModel cakeModel;

    public CakeController(CakeView view){
        cakeView = view;
        cakeModel = cakeView.getCakeModel();
    }



}
