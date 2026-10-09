import java.util.Scanner;

public class TrafficLight {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter traffic light color: ");
        String color = sc.nextLine();

        switch (color.toLowerCase()) {
            case "red":
                System.out.println("Stop");
                break;

            case "yellow":
                System.out.println("Slow");
                break;

            case "green":
                System.out.println("Go");
                break;

            default:
                System.out.println("Invalid color");
        }

        sc.close();
    }
}
