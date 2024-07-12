public class userBankAccount{
    private  Double accounBalance = 0.0;

    protected  Double getAccounBalance() {
        return accounBalance;
    }

    protected void depositAmount(int accounBalance) {
        this.accounBalance += accounBalance;
    }

    protected void withdrawAmount(int accounBalance) {
        this.accounBalance -= accounBalance;
    }
}
