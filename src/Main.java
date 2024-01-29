//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        try {
            System.out.println(checkUserData("tiger", "set", "set"));
            System.out.println(checkUserData("tiger", "set", "set"));
            System.out.println(checkUserData("tiger", "", "1"));
        } catch (WrongLoginException | WrongPasswordException e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Exit program");
        }
    }


    public static boolean checkUserData(String login, String Password, String CheckPassword) {
        if (!cheсkValidString(login) || login.length() > 20 || login.isEmpty()) {
            throw new WrongLoginException("Incorrect Login");
        }
        if (!cheсkValidString(Password) || Password.length() > 20
                || Password.isEmpty() || !Password.equals(CheckPassword)) {
            throw new WrongPasswordException("Incorrect Password");
        }
        return true;
    }

    public static boolean cheсkValidString(String string){
        for (char str : string.toCharArray()){
            if (!validString(str)){
                return false;
            }
        }
        return true;
    }

    public static boolean validString(char s){
        return (s >= 65 && s <= 90) ||
                (s >= 97 && s <= 122) ||
                (s >= 48 && s <= 57) || s == 95;
    }
}