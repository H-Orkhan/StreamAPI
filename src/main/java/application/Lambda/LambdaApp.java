package application.Lambda;

//But it is working only when interface has 1 abstract method
public class LambdaApp {
    public static void main(String[] args) {
        Cab cab = () -> {
            System.out.println("Car");
        };

    }
}
