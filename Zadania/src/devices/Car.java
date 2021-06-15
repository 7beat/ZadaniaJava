package devices;

import java.util.ArrayList;
import java.util.List;

public abstract class Car extends Device{

    public Car(String marka, String model, int yearOfProduction, double price) {
        super(marka, model, yearOfProduction, price);

    }

    List<String> lista = new ArrayList<String>();


    public String toString()
    {
        return marka + " " + model + " " +  yearOfProduction;
    }

    abstract public void Refuel();

    @Override
    public void TurnOn() {
        System.out.println("WRRRM");
        
    }

}
