package devices;

public class Application {
    public String name;
    private float version;
    private double cena;

    public Application(String name, Float version, double cena) {
        super();
        this.name = name;
        this.version = version;
        this.cena = cena;
    }

    @Override
    public String toString() {
        return this.name +" \nWersja: "+ this.version +" \nCena: "+ this.cena;
    }
    
}
