public class test {
    public static void main(String[] args) {
        Month month = Month.JAN; // Access to enum
        int result = month.myMethod(); // Call myMethod without an argument
        System.out.println(result); // Print the result
    }
}

enum Month {
    JAN(20), FEB(30), MAR(40), APR(50), MAY(60);
    private int days;

    // Constructor to set the value of 'days'
    private Month(int days) {
        this.days = days;
    }

    public int myMethod() {
        return days; // Return the 'days' value associated with the enum constant
    }
}
