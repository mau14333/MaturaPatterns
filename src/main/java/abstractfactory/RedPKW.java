package abstractfactory;

/**
 * Created by Michi on 08.05.2015.
 */
public class RedPKW extends PKW {
    @Override
    public void display() {
        super.display();
        System.out.println("^It's red.");
    }
}
