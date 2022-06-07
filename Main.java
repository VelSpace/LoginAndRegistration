public class Main {
    public static void main(String[] args) {

        //create instance for id and password class
        IdAndPasswords idAndPasswords = new IdAndPasswords();

        LogIn logIn = new LogIn(idAndPasswords.getLoginInfo());

    }
}
