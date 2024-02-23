import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the name of the ballet dancer:");
        String balletDancerName = scanner.nextLine();

        System.out.println("Enter the name of the hip hop dancer:");
        String hiphopDancerName = scanner.nextLine();

        System.out.println("Enter the name of the dance group:");
        String danceGroupName = scanner.nextLine();

        Dancer balletDancer = new Dancer(balletDancerName);
        Dancer hiphopDancer = new Dancer(hiphopDancerName);

        DanceStyle balletStyle = new Ballet();
        DanceStyle hiphopStyle = new HipHop();

        DanceGroup danceGroup = new DanceGroup(danceGroupName, List.of(balletDancer, hiphopDancer));

        System.out.println("Choose the dance style:");
        System.out.println("1. Ballet");
        System.out.println("2. Hip Hop");

        int choice = scanner.nextInt();

        DanceStyle selectedStyle = choice == 1 ? balletStyle : hiphopStyle;

        System.out.println("Performing dance style: " + selectedStyle.getName());
        System.out.println(balletDancer.performDance(selectedStyle));
        System.out.println(hiphopDancer.performDance(selectedStyle));

        scanner.close();
    }
}

