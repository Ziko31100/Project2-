package PrepareView;
/*
Create a Class Car that would have the following fields: carPrice and color
        and method calculateSalePrice() which should be returning a price of the
        car.
        Create 2 sub classes: Sedan and Truck. The Truck class has a field as weight
        and has its own implementation of calculateSalePrice() method in which
        returned price is calculated as following: if weight>2000 then returned price
        car should include 10% discount, otherwise 20% discount.
        The Sedan class has field as length and also does it is own implementation
        of calculateSalePrice(): if length of sedan is >20 feet then returned car price
        should include 5% discount, otherwise 10% discount

 */

public  class car {
    double carPrice;
 private    String color;

 car(int carPrice,String color){
     this.carPrice=carPrice;
     this.color=color;
 }
  public  double calculateSalePrice(){
      return carPrice;
  }

}
class Sedan extends car {
    int length;

    Sedan(int carPrice, String color, int length) {
        super(carPrice, color);
        this.length = length;

    }

    @Override
    public double calculateSalePrice() {
        if (this.length < 20) {
            double total = this.carPrice - (this.carPrice * 0.05);
            return total;
        }else{
            double total=this.carPrice-(this.carPrice*0.10);
            return total;
        }
    }
}

class Truck extends car{
    double weight;
    Truck(int carPrice,String color,double weight){
      super(carPrice,color);
      this.weight=weight;
    }

    public double calculateSalePrice(){
        if(this.weight>2000){
            double total=this.carPrice-(this.carPrice*0.10) ;
        return total;
        }else{
            double total=this.carPrice-(this.carPrice*0.20);
            return total;
        }
    }
}

class testCar{
    public static void main(String[] args) {
        car c=new Sedan(200,"blue",12);
        System.out.println(c.calculateSalePrice());
car t=new Truck(100,"black",1000);
        System.out.println(t.calculateSalePrice());




    }
}


