public class Car {
    int speed,regularPrice;
    String color;
    public Car(int speed,int regularPrice,String color)
    {
        this.speed = speed;
        this.regularPrice = regularPrice;
        this.color = color;
    }
    int getSalePrice()
    {
        return regularPrice;
    }
    
}

class Truck extends Car{

    public Truck(int speed, int regularPrice, String color) {
        super(speed, regularPrice, color);
    }
    int weight;
    int getSalePrice()
    {
        int salePrice = 0;
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
