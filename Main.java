import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Robot Types
        // Create and populate a list of robot types
        ArrayList<String> robotTypes = new ArrayList<>();
        robotTypes.add("Unipedal");
        robotTypes.add("Bipedal");
        robotTypes.add("Quadrupedal");
        robotTypes.add("Arachnid");
        robotTypes.add("Radial");
        robotTypes.add("Aeronautical");

        // Tasks
        // Create and populate a list of tasks with their descriptions and durations
        ArrayList<Task> tasks = new ArrayList<>();
        tasks.add(new Task("do the dishes", 1000));
        tasks.add(new Task("sweep the house", 3000));
        tasks.add(new Task("do the laundry", 10000));
        tasks.add(new Task("take out the recycling", 4000));
        tasks.add(new Task("make a sammich", 7000));
        tasks.add(new Task("mow the lawn", 20000));
        tasks.add(new Task("rake the leaves", 18000));
        tasks.add(new Task("give the dog a bath", 14500));
        tasks.add(new Task("bake some cookies", 8000));
        tasks.add(new Task("wash the car", 20000));

        // Collect robot details from the user in a loop
        while (true) {
            // Check if there are any tasks left
            if (tasks.isEmpty()) {
                System.out.println("There are no more tasks left to be done. Exiting the program");
                System.exit(0);
            }
            // Prompt the user to enter the robot's name
            System.out.println("Enter the robot's name: ");
            String name = scanner.nextLine();

            // Prompt the user to enter the robot type
            String type = "";
            boolean validType = false;
            while (!validType) {
                // Display available robot types
                System.out.println("Available robot types: " + robotTypes);
                System.out.println("Enter the robot type from the above list: ");
                type = scanner.nextLine();

                // Check if the entered type is valid
                if (type.equals("Unipedal") || type.equals("Bipedal") || type.equals("Quadrupedal")
                        || type.equals("Arachnid") || type.equals("Radial") || type.equals("Aeronautical")) {
                    validType = true;
                } else {
                    System.out.println("Please choose a type from the list.");
                }
            }

            // Create a robot instance with the provided name and type
            Robot robot = new Robot(name, type);

            // Assign and perform five random tasks
            for (int i = 0; i < 5; i++) {
                robot.performTasks(tasks);
            }

            // Ask the user if they want to create another robot
            boolean validResponse = false;
            while (!validResponse) {
                System.out.println("Would you like to create another robot? (Yes or No)");
                String userAnswer = scanner.nextLine().trim();

                // Check the user's response and act accordingly
                if (userAnswer.equalsIgnoreCase("Yes")) {
                    validResponse = true;
                } else if (userAnswer.equalsIgnoreCase("No")) {
                    System.out.println("Exiting the program.");
                    System.exit(0);
                } else {
                    System.out.println("Sorry try again.");
                }
            }
        }
    }
}
