public class Account {
    int accNo = 123456;
    int balance =1243;
    public Account(){
        System.out.println("AccNo:"+accNo+"and balance:"+balance);
    }
    public void Account(int accNo,int balance){
        System.out.println("AccNo:"+accNo+"and balance:"+balance);
    }
    public int Account(){
        return accNo;
    }
    public static void main(String[] args) {
        Account ac  = new Account();
        ac.Account(7890,500);
        System.out.println(ac.Account());
    }
}
