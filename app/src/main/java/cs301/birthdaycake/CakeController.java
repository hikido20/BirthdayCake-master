package cs301.birthdaycake;

public class CakeController {
    private CakeView CakeView;
    private CakeModel CakeModel;

    public CakeController(CakeView view){
        CakeView = view;
        CakeModel = CakeView.getCakeModel();


    }
}
