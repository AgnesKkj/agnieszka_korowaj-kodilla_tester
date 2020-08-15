public class Application {
    private String name;
    private double age;
    private double height;

    public Application(String name, double age, double height){
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public double getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    public void compareValues() {
        if(this.name == null) {
            return;
        }

        if(this.age > 30 && this.height > 160) {
            System.out.println("User is older than 30 and higher then 160cm");
        }
        else {
            System.out.println("User is younger than 30 or lower than 160cm");
        }
    }

    public static void main(String[] args) {

        //String name = "Adam";
        //double age = 40.5;
        //double height = 178;

        Application adam = new Application("Adam", 40.5, 178);

        /*if (name != null) {
            if (age > 30 && height > 160) {
                System.out.println("User is older than 30 and higher then 160cm");
            } else {
                System.out.println("User is younger than 30 or lower than 160cm");
            }*/

        adam.getName();
        adam.getAge();
        adam.getHeight();
        adam.compareValues();

        }
    }

