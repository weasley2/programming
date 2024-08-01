public class Debit_card extends Bank_card
 {
  //creating fields 
  private int pinNumber;
  private int withdrawalamount;
  private String dateofWithdrawl;
  private boolean hasWithdrawn;
  //constructor is created as Debit_card having six parameters
  public Debit_card(int balanceAmount, int cardId, String bankAccount, String issuerBank, String ClientName, int pinNumber)
  {
    super(balanceAmount, cardId, bankAccount, issuerBank);
    //assigning client name,pin number,dateofwithdrawl,haswithdrawn
    super.setClientName(ClientName);
    this.pinNumber = pinNumber;
    this.hasWithdrawn = false;
  }
  //getter method for pin number,withdrawlamount,dateofwithdrawl,haswithdrawn
  public int getPinNumber()
  {
    return this.pinNumber;
  }

  public int getWithdrawalamount()
  {
    return this.withdrawalamount;
  }

  public String getDateofWithdrawl() 
  {
    return this.dateofWithdrawl;
  }

  public boolean getHasWithdrawn()
  {
    return this.hasWithdrawn;
  }

  //setter method for pin number,withdrawlamount,dateof withdrawl,haswithdrawn

  public void setWithdrawlAmount(int withdrawlAmount)
  {
    this.withdrawalamount = withdrawlAmount;
  }

  public void withdraw(int withdrawlAmount, String dateofWithdrawl, int pinNumber) 
  {
    if (this.pinNumber == pinNumber)
    {
      if (getBalanceAmount() >= withdrawalamount)
      {
        System.out.println("the amount is withDrawn");
        this.hasWithdrawn = true;
        setBalanceAmount(getBalanceAmount() - withdrawlAmount);
      } else if (getBalanceAmount() < withdrawlAmount) 
      {
        System.out.println("insufficient amount");
      }

    } else {
      System.out.println("Invalid pin number");
      this.hasWithdrawn = false;
    }

  }
  //displaying Debit_card
  @Override

  public void display()
  {
    System.out.println(this.pinNumber + " " + this.withdrawalamount + " " + this.dateofWithdrawl);
    super.display();
    if (hasWithdrawn = false)
    {
      System.out.println("getBalanceAmount =" + super.getBalanceAmount());
    }

  }
}