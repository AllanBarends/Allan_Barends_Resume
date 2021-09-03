import java.util.Scanner;

public class Poised {
    public static void main(String[] args) {

        // Declaring variables.
        int projectNumber;
        String projectName;
        String building;
        String address;
        String erfNumber;
        double totalFee;
        double amountPaid;
        String deadline;

        // Create 'personType' .
        String person = "Contractor";


        // Introduction message to the program.
        System.out.println("Welcome to the Poised Menu.");


        // User input to fill in details of project
        // Project number.
        System.out.println("\nPlease enter the project number: ");
        Scanner input1 = new Scanner(System.in);
        projectNumber = input1.nextInt();


        // Create project name,building type, address and erf number.
        System.out.println("Please enter the project name: ");
        Scanner input2 = new Scanner(System.in);
        projectName = input2.nextLine();

        System.out.println("Please enter the building type: ");
        Scanner input3 = new Scanner(System.in);
        building = input3.nextLine();

        System.out.println("Physical address for the project: ");
        Scanner input4 = new Scanner(System.in);
        address = input4.nextLine();

        System.out.println("Enter the ERF number: ");
        Scanner input5 = new Scanner(System.in);
        erfNumber = input5.nextLine();

        // total fee for the project.
        System.out.println("The total fee charged for the project: ");
        Scanner input6 = new Scanner(System.in);
        totalFee = input6.nextDouble();

        // The deposit amount paid to date
        System.out.println("Total amount paid to date: ");
        Scanner input7 = new Scanner(System.in);
        amountPaid = input7.nextDouble();

        // Deadline for the project
        System.out.println("Please enter the project deadline: ");
        Scanner input8 = new Scanner(System.in);
        deadline = input8.nextLine();

        // New project created
        ProjectDetails createProject = new ProjectDetails(projectNumber, projectName, building, address, erfNumber,
                totalFee, amountPaid, deadline);
        System.out.println("Your project was successfully crated.");

        // The DisplayProject() method to display the new project.
        System.out.println(createProject.DisplayProject());

        // Menu with options to edit, update, finalise or exit.
        System.out.println("""

                Please choose a number option from the menu below:\s

                1. Edit existing projects
                2. Update contractor details
                3. Finalise the project
                4. Exit program""");


        Scanner input = new Scanner(System.in);
        int inputChoice = input.nextInt();


        //  if-else statement to check condition to loop
        if (inputChoice == 1) {
            // The choice of either editing the due date or the amount paid to date.
            System.out.println("""
                    Would you like to:
                    1. Edit the project due date or
                    2. Edit the total amount paid of the fee to date?
                    Please choose either 1 or 2""");

            // Choice is stored in the 'choiceEdit' variable.
            Scanner choice = new Scanner(System.in);
            int choiceEdit = choice.nextInt();

            if (choiceEdit == 1) {
                //New due date for project
                System.out.println("\nPlease enter a new due date for the project: ");
                Scanner date = new Scanner(System.in);

                // deadline variable for new due date.
                deadline = date.nextLine();

                // the new due date to be display.
                ProjectDetails projectEdit = new ProjectDetails(projectNumber, projectName, building, address,
                        erfNumber, totalFee, amountPaid, deadline);
                System.out.println(projectEdit.DisplayProject());

            } else if (choiceEdit == 2)

                // enter a new amount paid to date.
                System.out.println("\nEnter the new total amount of the fee paid to date: ");
            Scanner amount = new Scanner(System.in);

            // amountPaid variable store the new value.
            amountPaid = amount.nextDouble();

            // New project object created, updated amount paid to date.
            ProjectDetails projectEdit2 = new ProjectDetails(projectNumber, projectName, building, address,
                    erfNumber, totalFee, amountPaid, deadline);
            System.out.println(projectEdit2.DisplayProject());
        } else if (inputChoice == 2) {
            // Enter the contractor's details to update the information.
            System.out.println("\nEnter the contractor's name to confirm their details: ");
            Scanner nameEdit = new Scanner(System.in);
            String name = nameEdit.nextLine();

            System.out.println("\nEnter the contractor's new contact number: ");
            Scanner newNumber = new Scanner(System.in);
            int number = newNumber.nextInt();

            System.out.println("\nPlease enter the contractor's new email address: ");
            Scanner newEmail = new Scanner(System.in);
            String email = newEmail.nextLine();

            System.out.println("\nPlease enter the contractor's new physical address: ");
            Scanner newAddress = new Scanner(System.in);
            address = newAddress.nextLine();

            // New person object created with the updated details for the contractor.
            PersonDetails contractorEdit = new PersonDetails(person, name, number, email, address);

            // Successful message printed out
            System.out.println("Details for contractor have been update successfully. \n");
            System.out.println(contractorEdit.DisplayPerson());

        }

    }
}
