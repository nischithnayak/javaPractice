public class AcessModifiers {
    public static void main(String[] args) {
        BankAccount myaccount=new BankAccount();
        myaccount.username="Nischith";
        myaccount.setPassword("abcd");
    }
}
class BankAccount{
    String username;
    private String password;
    void setPassword(String pwd){
        password=pwd;
    }
}
