package Interfacepractice.Bank;

class Bank {
    private int AccountNu;
    private String Name;
    private double Balance;

    public void setAccountNu(int AccountNu) {
        this.AccountNu = AccountNu;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setBalance(double Balance) {
        this.Balance = Balance;
    }

    public int getAccountNu() {
        return AccountNu;
    }

    public String getName() {
        return Name;
    }

    public double getBalance() {
        return Balance;
    }

    @Override

    public String toString() {
        return "AccountNumber:-" + getAccountNu() + "\n ACC Holder Name:-" + getName() + "\n Available balance:-" + getBalance();
    }


}