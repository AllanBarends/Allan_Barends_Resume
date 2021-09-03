public class PersonDetails {
    // Attribute variables for use in class.
    String person;
    String fullname;
    int number;
    String email;
    String address;

    // Creating constructor method for new person.
    public PersonDetails(String personType, String name, int number, String email, String address) {

        this.person = personType;
        this.fullname = name;
        this.number = number;
        this.email = email;
        this.address = address;

    }
    // Returns the string 'output' with person's details.
    public String DisplayPerson() {

        System.out.println(person + " details are as follows: \n");
        String output = "Title: " + person;
        output += "\nName: " + fullname;
        output += "\nNumber: " + number;
        output += "\nEmail Address: " + email;
        output += "\nPhysical Address: " + address;

        return output;
    }
}
