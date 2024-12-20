package bad.design;

import datamodel.UserDetails;

public class UserManagerService {

    public void saveUser(UserDetails userDetails){
        System.out.println("UserDetails saved : " + userDetails.getName());
    }

    public  boolean isValidEmail(String email){
        String emailPattern = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$";
        java.util.regex.Pattern patternRgx = java.util.regex.Pattern.compile(emailPattern);
        java.util.regex.Matcher matcherRgx = patternRgx.matcher(email);
        return matcherRgx.matches();
    }

    public void sendEmail(String email,String message){
        System.out.println("Sending email to: " + email + " message : " + message);
    }
}
