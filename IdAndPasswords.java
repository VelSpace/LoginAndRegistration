import java.util.HashMap;

public class IdAndPasswords {

    HashMap<String,String> logInInfo = new HashMap<>();

    IdAndPasswords(){

        logInInfo.put("velspace01","11235813");
        logInInfo.put("Bro","bro");
        logInInfo.put("HelloWorld","world");
    }
    protected HashMap getLoginInfo(){
        return logInInfo;
    }

 }
