import bad.design.UserManagerService;
import datamodel.UserDetails;
import good.design.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Single Responsibility Principle.");
        //bad design code
        UserDetails userDetails = new UserDetails("Bob","bob@gmail.com");
        UserManagerService userManager = new UserManagerService();
        userManager.saveUser(userDetails);
        boolean validEmail = userManager.isValidEmail(userDetails.getEmail());
        System.out.println("Email validation check ." + validEmail);
        userManager.sendEmail(userDetails.getEmail(),"Welcome to our website!");

        //--------------------------------
        System.out.println();
        System.out.println();
        System.out.println("Good design started.....");
        //good design code
        UserDetails userDetailsGood = new UserDetails("Bob","bob@gmail.com");
        UserValidation userValidation = new UserValidation(new EmailValidation());
        UserManagerServiceRefractor userManagerServiceRefractor = new UserManagerServiceRefractor(new EmailService(), new UserRepository(),userValidation);
        String registerUsers = userManagerServiceRefractor.registerUsers(userDetailsGood);
        System.out.println(registerUsers);

        System.out.println();
        System.out.println();

        UserDetails userDetailsGood2 = new UserDetails("Bob","bob@gmailcom");
        registerUsers = userManagerServiceRefractor.registerUsers(userDetailsGood2);
        System.out.println(registerUsers);

    }
}
