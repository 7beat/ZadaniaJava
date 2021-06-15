package creatures;
public abstract class Animal implements Feedable{
    
    final String spieces;
    private double weight;

    public Animal(String spieces) {
        super();
        this.spieces = spieces;

        switch (spieces) {
            case "Dog":
                this.weight = 5;
                break;
            case "Cat":
                this.weight = 4;
                break;
            case "Monkey":
                this.weight = 3;
                break;
            default:
                break;
        }

    }

    public void feed()
    {
        weight++;
    }

    public void takeforwalk()
    {
        if (weight<1) 
        {
            System.out.println("Zwierze umrze");    
        } else if (weight< 1.5)
        {
            System.out.println("Zwierze bedzie słabe");
        } else
        {
            weight--;
        }

    }

    public void GetWeight()
    {
        //return this.weight;
        System.out.println(this.weight);
    }
    
}
