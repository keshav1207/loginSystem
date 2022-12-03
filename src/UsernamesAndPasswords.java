import java.util.HashMap;

public class UsernamesAndPasswords {
    HashMap<String,String>  database = new HashMap<>();

    UsernamesAndPasswords(){
        database.put("keshav","lovetoeatkfc");
        database.put("kisnorbo", "lovetodance");
    }

    protected HashMap getData (){
        return database;
    }

}
