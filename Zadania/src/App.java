import java.util.Scanner;

import creatures.Animal;

import java.util.ArrayList;
import java.util.List;

import devices.Car;
import devices.Device;
import devices.Diesel;
import devices.Electric;
import devices.LPG;
import devices.Phone;

public class App implements Sellable{
    public static void main(String[] args) throws Exception {
        Scanner myObj = new Scanner(System.in);
        Diesel auto1 = new Diesel("BMW", "X6", 2021, 500000);
        Electric auto2 = new Electric("Tesla", "ModelS", 2021, 400000);
        LPG auto3 = new LPG("Skoda", "Fabia", 2015, 80000);
        Diesel auto4 = new Diesel("Audi", "Q8", 2019, 600000);
        Phone apple = new Phone("Apple", "11", 2020, 3000);
        Phone samsung = new Phone("Samsung", "S20", 2019, 2500);
        Human human = new Human(3000, 3000000, auto1, apple);
        human.garage.add(auto4);
        Human human2 = new Human(10000, 50000, auto3, samsung);
        human2.garage.add(auto2);

        while (true) 
        {
            System.out.println("1. Zmień wypłatę");
            System.out.println("2. Pokaż garaż");
            System.out.println("3. Wyświetl pieniądze");
            System.out.println("4. Kup auto!");

            int wybor = myObj.nextInt();

            switch (wybor) {
                case 1:
                    System.out.println("Podaj nową wartość wypłaty: ");
                    int newsalary = myObj.nextInt();
                    human.SetSalary(newsalary);

                    break;
                case 2:

                    for (Car car : human.garage) {
                        System.out.println(car.toString());
                    }
                    break;
                case 3:
                    human.GetCash();

                    break;
                case 4:
                    System.out.println("Sprzedający ma: ");
                    for (Car car : human2.garage) {
                        System.out.println(car.toString());
                    }
                    System.out.println("Wybierz auto!");
                    int wybor2 = myObj.nextInt();
                    wybor2--;

                    if(wybor2 >= human2.garage.size())
                    {
                        System.out.println("Nieprawidłowy Index!");
                        wybor2 = 0;
                    }else
                    {
                        CarSell(human, human2, human2.garage.get(wybor2).GetPrice(), wybor2);
                        System.out.println(wybor2);
                        wybor2 = 0;
                    }break;
                case 5:
                {
                    System.out.println("Jaką apkę chcesz zainstalować: ");
                    System.out.println("1. Facebook\n2.Twitter\nZombieShooter");
                    wybor2 = myObj.nextInt();
                    wybor2--;
                    human.Apptest(wybor2);
                    wybor2 = 0;

                }

                    break;
                default:
                    myObj.close(); // na wyjściu aby zabezpieczyć
                    break;
            }
        }

    }


    public static void test(Human buyer, Human seller, double price)
    {
        if (seller.GetPhone() != null && buyer.GetCash() > price) 
        {
            System.out.println("Kupiłeś właśnie"+ seller.GetPhone().marka +" za "+price);
            buyer.SetPhone(seller.GetPhone());
            seller.SetPhone(null);
            buyer.SetCash(buyer.GetCash()- price);
            seller.SetCash(seller.GetCash() + price);
        }
    }


    public static void CarSell(Human buyer, Human seller, double price, int wybor)
    {
        int index = wybor;
        if (seller.garage.get(index) != null && buyer.GetCash() > price) 
        {
            Car auto = seller.garage.get(index);
            System.out.println(auto.toString());
            buyer.SetCar(seller.garage.get(index));
            seller.garage.remove(index);
            buyer.SetCash(buyer.GetCash()- price);
            seller.SetCash(seller.GetCash()+ price);
        }else
        {
            System.out.println("ERROR");
        }

    }

}

