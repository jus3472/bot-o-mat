public class Task {
    // Instance variables to store the description and estimated time of the task
    private String description;
    private int eta; // Time in milliseconds

    // Constructor to initialize the task with a description and estimated time
    public Task(String description, int eta) {
        this.description = description;
        this.eta = eta;
    }

    // Getter method to retrieve the description of the task
    public String getDescription() {
        return description;
    }

    // Getter method to retrieve the estimated time of the task
    public int getEta() {
        return eta;
    }
}
