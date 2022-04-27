package task.landingpage.foodka;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;


public class NavergaAFoodka implements Task {



    @Override
    public <T extends Actor> void performAs(T actor) {

    }

    public static NavergaAFoodka navegaraFoodka(){
        return new NavergaAFoodka();
    }
}
