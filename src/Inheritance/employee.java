package Inheritance;

public class employee
{
    private String firstName;
    private String lastName;
    private String SSN;

    public employee(){}

    public employee(String firstName, String lastName, String SSN)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.SSN = SSN;
    }

    public String toString() {
        return ("Employee Name: " + firstName + " " + lastName +
                " SSN: " + SSN);
    }

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String LastName)
    {
        this.lastName = LastName;
    }

    public String getSSN()
    {
        return SSN;
    }

    public void setSSN(String SSN)
    {
        this.SSN = SSN;
    }
}

