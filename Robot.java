import java.util.List;
import java.util.Random;

public class Robot {
    // Instance variables to store the name and type of the robot
    private String name;
    private String type;

    // Constructor to initialize the robot with a name and type
    public Robot(String name, String type) {
        this.name = name;
        this.type = type;
    }

    // Method to perform a random task from the list of tasks
    public void performTasks(List<Task> tasks) {
        // Create an instance of Random to generate a random index
        Random random = new Random();
        // Get a random index within the bounds of the tasks list
        int randomIndex = random.nextInt(tasks.size());
        // Get the description of the task at the random index
        Task task = tasks.get(randomIndex);
        // Print a message indicating the robot is starting the task
        System.out.println(name + " is starting to " + task.getDescription() + "...");

        // Simulate the task duration using Thread.sleep()
        try {
            Thread.sleep(task.getEta());
        } catch (InterruptedException e) {
            // Handle the exception if the sleep is interrupted
            System.out.println("Task interrupted: " + task.getDescription());
        }

        // Remove the task from the list after it is completed
        tasks.remove(randomIndex);
        // Print a message indicating the task has been completed
        System.out.println(name + " has completed the task: " + "\"" + task.getDescription() + "\"" + " in "
                + task.getEta() + " milliseconds." + ".\n");
    }

}
