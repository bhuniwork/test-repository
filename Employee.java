public class Employee
{
    private String name;
    private String number;
    private String date;

    public Employee (String name, String number, String date) {
        setName(name);
        setNumber(number);
        setDate(date);
    }

    public void setName (String name) {
        this.name = name;
    }

    public void setNumber (String number) {
        this.number = number;
    }

    public void setDate (String date) {
        this.date = date;
    }

    public String getName () {
        return name;
    }

    public String getNumber () {
        return number;
    }

    public String getDate () {
        return date;
    }
}