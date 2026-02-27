public class booleansdatatypes {
    public static void main(String[] args){



        boolean isServerRunning = true;

        System.out.println(isServerRunning);
        
    





        int age = 19;
        boolean canVote = age >= 18;

        System.out.println(canVote);



         boolean hasLicense = true;
        boolean hasHelmet = false;

        boolean allowedToRide = hasLicense && hasHelmet;

        System.out.println(allowedToRide);
    


        
        boolean hasID = false;
        boolean hasGatePass = true;

        boolean entryAllowed = hasID || hasGatePass;

        System.out.println(entryAllowed);








    }
}
