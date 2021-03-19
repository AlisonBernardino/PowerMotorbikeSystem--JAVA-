package app01Classes;

public class dataInsertion {
    public boolean validateUser(String user, String password){
        if(user.equals("admin")&& password.equals("admin")){
            return true;
        }else{
            return false;
        }
    }
}
