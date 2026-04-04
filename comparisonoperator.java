public class comparisonoperator {
    public static void main(String[] args){

int x = 5;
    int y = 7;
    System.out.println(x == y); // returns false because 5 is not equal to 3


    boolean isLoggedIn = true;
    
    boolean isAdmin = false;

    System.out.println("Regular user: " + (isLoggedIn && !isAdmin));
    System.out.println("Has access: " + (isLoggedIn || isAdmin));
    System.out.println("Not logged in: " + (!isLoggedIn));



    }
    
}
