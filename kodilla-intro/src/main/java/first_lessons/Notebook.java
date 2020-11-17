package first_lessons;

public class Notebook {
    //W klasie deklarujemy atrybuty bez wartości, bo te dojdą przy poszczególnych obiektach
    int weight;
    int price;
    int productionYear;

    //Zaczynamy klasę od konstruktora
    public Notebook(int weight, int price, int productionYear) {
        //obiekty będą dziedziczyć atr z bieżącej klasy
        this.weight = weight;
        this.price = price;
        this.productionYear = productionYear;

    }

    /*public void checkPrice (){
        if(this.price <= 600) {
            System.out.println("This notebook is very cheap.");
        }
        else if(this.price > 600 && this.price <= 1000) {
            System.out.println("The price is good.");
        }

        else System.out.println("This notebook is expensive.");
    }*/

    public void checkYearAndPrice() {
        if(this.productionYear >= 2018 && this.price <= 600) {
            System.out.println("This notebook is new and cheap!");
        }
        else if(this.productionYear >= 2018 && this.price > 600 && this.price <= 1000) {
            System.out.println("This notebook is new and the price is not too bad.");
        }
        else if(this.productionYear >= 2018 && this.price > 1000) {
            System.out.println("This notebook is new and expensive.");
        }
        else if(this.productionYear < 2018 && this.price <= 600) {
            System.out.println("This notebook is old but cheap.");
        }
        else if(this.productionYear < 2018 && this.price > 600 && this.price <= 1000) {
            System.out.println("This notebook is old and the price is not too bad.");
        }
        else {
            System.out.println("This notebook is too expensive for its age!");
        }
    }


    public void checkWeight() {
        if(this.weight < 1000) {
            System.out.println("This notebook is light.");
        }
        else if(this.weight >= 1000 && this.weight < 1500) {
            System.out.println("This notebook is not too heavy.");
        }
        else {
            System.out.println("This notebook is heavy.");
        }
    }


    public static void main(String[] args) {

        Notebook firstNotebook = new Notebook(600, 800, 2019);
        System.out.println(firstNotebook);
        System.out.println(firstNotebook.weight + "g" + " " + firstNotebook.price);
        firstNotebook.checkYearAndPrice();
        firstNotebook.checkWeight();

        Notebook heavyNotebook = new Notebook(2000, 1500, 2018);
        System.out.println(heavyNotebook);
        System.out.println(heavyNotebook.weight + "g" + " " + heavyNotebook.price);
        heavyNotebook.checkYearAndPrice();
        heavyNotebook.checkWeight();

        Notebook oldNotebook = new Notebook(1200, 550, 2014);
        System.out.println(oldNotebook);
        System.out.println(oldNotebook.weight + "g" + " " + oldNotebook.price);
        oldNotebook.checkYearAndPrice();
        oldNotebook.checkWeight();

    }
}
