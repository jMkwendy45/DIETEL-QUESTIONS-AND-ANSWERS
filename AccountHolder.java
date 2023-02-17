package ChapterTwo;

public class AccountHolder {
    private String accountName;

    public AccountHolder(){
    }
    public AccountHolder(String accountName) {
        this.accountName = accountName;
    }

    public void setName(String name){
        this.accountName = name;
        // accountName Oluchi
        // accountName  is now Mercy
    }

    public String getAccountName(){
        return accountName;
    }
}
