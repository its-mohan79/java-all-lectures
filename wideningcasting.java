public class wideningcasting {
    public static void main(String[] args){

int myint = 9;
double mydouble = myint;
System.out.println(myint);
System.out.println(mydouble);




        int employees = 120;
        double totalEmployees = employees;   // widening casting

        System.out.println("Employees: " + employees);
        System.out.println("Total Employees (double): " + totalEmployees);



          int hoursWorked = 45;          // from attendance system
        double hourlyRate = 250.75;    // finance system

        double salary = hoursWorked * hourlyRate; // int → double (widening)

        System.out.println("Salary: " + salary);






        char grade = 'A';
        int score = grade;   // char → int (widening)

        System.out.println(score);
    





    

    }
    
}
