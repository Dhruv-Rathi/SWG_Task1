public class Car {
    double speed,regularPrice;
    String color;
    public Car(double speed,double regularPrice,String color)
    {
        this.speed = speed;
        this.regularPrice = regularPrice;
        this.color = color;
    }
    double getSalePrice()
    {
        return regularPrice;
    }
    
}

class Truck extends Car{

    public Truck(double speed, double regularPrice, String color) {
        super(speed, regularPrice, color);
    }
    double weight;
    double getSalePrice()
    {
        double salePrice = 0;
        if(weight>2300)
        {
            salePrice += (90*regularPrice)/100 ;
        }
        else{
            salePrice += (80*regularPrice)/100 ;
        }
        return salePrice;
    }
}
