package devices;

import java.util.ArrayList;
import java.util.List;

public class Phone extends Device {


    static final String adress = "WWW.TEST.PL";
    static final String protocol = "test";
    static final float defversion = 1.1f;

    Application app1 = new Application("Facebook", 1.0f, 100);
    Application app2 = new Application("Twitter", 2.3f, 150);
    Application app3 = new Application("ZombieShooter", 0.4f, 50);

    public List<Application> installedApps = new ArrayList<Application>();
    public List<Application> allApps = new ArrayList<Application>();



    public Phone(String marka, String model, int yearOfProduction, double price) {
        super(marka, model, yearOfProduction, price);
        this.installedApps.add(app1);
        this.allApps.add(app1);
        this.allApps.add(app2);
        this.allApps.add(app3);

    }

    @Override
    public void TurnOn() {
        System.out.println("BEEP BEEP");
        
    }


    public void InstallAnnApp(String name)
    {

    }
    public void InstallAnnApp(String name, float version)
    {

    }
    public void InstallAnnApp(String name, float version, String server)
    {

    }
    public void InstallAnnApp(List applist)
    {

    }

    public void InstallAnnApp(URL strona) 
    {

    }

    public void InstallApp(int index)
    {       
        installedApps.add(allApps.get(index));    
    }
}
