public class ProjectDetails {
    //Attribute variables for use in class.
    int projectNumber;
    String projectName;
    String building;
    String address;
    String erfNumber;
    double totalFee;
    double amountPaid;
    String deadline;

    // Creating constructor method for new person.
    public ProjectDetails(int projectNumber, String projectName, String buildingType,
                      String address, String erfNumber, double totalFee, double amountPaid, String deadline) {

        this.projectNumber = projectNumber;
        this.projectName = projectName;
        this.building = buildingType;
        this.address = address;
        this.erfNumber = erfNumber;
        this.totalFee = totalFee;
        this.amountPaid = amountPaid;
        this.deadline = deadline;

    }

    public ProjectDetails(int projectNumber, String projectName, String buildingType, String address, String erfNumber) {
    }

    // Returns the string 'output' with projects details.
    public String DisplayProject() {

        System.out.println("The details for project " + projectName + " are as follows: \n");
        String output = "Project Number: " + projectNumber;
        output += "\nProject Name: " + projectName;
        output += "\nBuilding Type: " + building;
        output += "\nPhysical Address: " + address;
        output += "\nERF Number: " + erfNumber;
        output += "\nProject Fee Total: R" + totalFee;
        output += "\nAmount Paid to Date: R" + amountPaid;
        output += "\nProject Deadline: " + deadline;

        return output;

    }

}
