package ChapterTwo;

public class AccountHolderTest {
    public static void main(String[] args) {
        AccountHolder accountHolder = new AccountHolder();
        accountHolder.setName("Oluchi");

        AccountHolder accountHolder2 = new AccountHolder("Mercy");


        System.out.println(accountHolder.getAccountName());
        System.out.println(accountHolder2.getAccountName());
    }
}
