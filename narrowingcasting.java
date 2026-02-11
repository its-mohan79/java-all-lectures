public class narrowingcasting {
    public static void main(String[] args){


double mydouble = 9.78d;
int myint = (int) mydouble;
System.out.println(mydouble);
System.out.println(myint);




 int score = 65;
        char grade = (char) score;   // int → char (narrowing)
        

        System.out.println(grade);




           double salary = 45890.75;
        int finalSalary = (int) salary;   // narrowing

        System.out.println(finalSalary);




    }
    
}
