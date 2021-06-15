import java.lang.invoke.VarHandle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import javax.lang.model.util.ElementScanner14;

import devices.Application;
import devices.Car;
import devices.Device;
import devices.Phone;

public class Human{
    String test;
    VarHandle AnimalPet;
    private double salary;
    double oldsalary = 0;
    private double cash;
    private int defaultcarnum;

    List<String> test1 = new ArrayList<String>();
    private Car mojeauto;
    public List<Car> garage = new ArrayList<Car>();
    private Phone myphone;


    public Human(double salary, double cash, Car mojeauto, Phone myphone) {
        super();
        this.salary = salary;
        this.cash = cash;
        this.mojeauto = mojeauto;
        this.myphone = myphone;
        this.defaultcarnum = 5;
        this.garage.add(mojeauto);
    }

    public Human(List<Car> auto)
    {
        for (Car car : garage) 
        {
            ///this.garage.add(auto);
        }
    }

    public void GetSalary()
    {
        System.out.println("Poprzednia wypłata to: " + oldsalary+ ", Obecna to: "+ this.salary);
    }

    public void SetSalary(double newsalary)
    {
        
        if (newsalary == 0 || newsalary < 0) 
        {
            System.out.println("Nie Poprawna wartość!");
        }else 
        {
            oldsalary = salary;
            this.salary = newsalary;
            System.out.println("Nowa wypłata o wartośći: "+ newsalary +" Została wysłana do Systemu księgowego. \nWymagany jest odbiór aneksu do umowy od Pani Hani z kadr. \nZus i US zostały poinformowane o zmianie wypłaty!");
        }
    }

    public void GetCar()
    {
        if(mojeauto == null)
        {
            System.out.println("Nie ma auta");
        }else
        {
            mojeauto.toString();
        }
        
    }

    public void SetCar(Car auto)
    {
        double x = auto.price / 12;

        if(garage.size() <= defaultcarnum)
        {

            if (this.cash > auto.price) 
            {
                System.out.println("Kupiłeś właśnie samochód za gotówkę!");
                garage.add(auto);
            }else if(this.cash > x)
            {
                System.out.println("Kupiłeś auto na kredyt");
                garage.add(auto);
            }
        }else
        {
            System.out.println("Za mało miejsca w garażu");
        }
    }

    public String toString()
    {
        return Double.toString(this.salary);
    }


    public void SetCash(double amount)
    {
        this.cash = amount;
    }
    public double GetCash()
    {
        return this.cash;
    }
    
    public Phone GetPhone()
    {
        return myphone; 
    }

    public void SetPhone(Phone x)
    {
        this.myphone = x;
    }

    public void CarsCost()
    {
        double suma = 0;
        for (Car car : garage) {
            car.price += suma;
        }
    }

    public void Apptest(int index)
    {
        if(myphone.installedApps.contains(myphone.installedApps.get(index)))
        {
            System.out.println("Masz już tą apkę!");
        }else
        {
            System.out.println("Instaluję apkę!"+ myphone.allApps.get(index));
            myphone.InstallApp(index);
        }

    }
}
