package devices;


public abstract class Device{
    public final String marka;
    public int yearOfProduction;
    final String model;
    public double price;
    
    public Device(String marka, String model, int yearOfProduction, double price) {
        super();
        this.marka = marka;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
        this.price = price;
    }

    public abstract void TurnOn();

    public String toString()
    {
        return marka +" "+model+" "+ yearOfProduction;
    }

    public double GetPrice()
    {
        return this.price;
    }


}
