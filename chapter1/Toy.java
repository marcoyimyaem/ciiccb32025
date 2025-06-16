package chapter1;
public class Toy {
    String name;
    String brand;
    double price;
    int quantity;

    void setPrice(double price){
        this.price = price;

    }
    public static void main(String[] args) {
        Toy toy1 = new Toy();
        toy1.name="Rage pink";
        toy1.brand="Lab vuvu";
        toy1.price=4500;
        toy1.quantity=12;
        toy1.setPrice((toy1.price*0.5));
        System.out.println(toy1.price);
    }
}
class Fruit{}
class Fruit2{}
class Fruit3{}
class Fruit4{
    public static void main(String[] args) {
        System.out.println("I am Fruit 4");
        Fruit f3 = new Fruit();
    }
}

