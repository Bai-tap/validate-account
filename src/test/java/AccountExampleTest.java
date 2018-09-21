public class AccountExampleTest {
    public static final String[] validAccount = {"long9_", "heroooo2", "_1haiba"};
    public static final String[] invalidAccount = {"LOng", "Hero@@", "MayThichGi"};

    private static AccountExample accountExample;

    public static void main(String[] args) {
        accountExample = new AccountExample();
        for (String account : validAccount) {
            boolean isvalid = accountExample.validate(account);
            System.out.println("Account " + account + " is " + isvalid);
        }

        for (String account : invalidAccount) {
            boolean isvalid = accountExample.validate(account);
            System.out.println("Account " + account + " is " + isvalid);
        }
    }
}