public class Bank_card
 {
  //creating fields
  private int cardId;
  private String clientName;
  private String issuerBank;
  private String bankAccount;
  private int balanceAmount;
  //constructor is created as Bank_card having four parameters
  public Bank_card(int BalanceAmount, int cardId, String bankAccount, String issuerBank)
  {
    this.clientName = "";
    this.balanceAmount = BalanceAmount;
    this.cardId = cardId;
    this.bankAccount = bankAccount;
    this.issuerBank = issuerBank;
  }
  //using getter method for cardId,balanceAmount,bankAccount,issuerBank,clientName
  public int getCardId()
  {
    return this.cardId;
  }

  public int getBalanceAmount()
  {
    return this.balanceAmount;
  }

  public String getBankAccount() 
  {
    return this.bankAccount;
  }

  public String getIssuerBank()
  {
    return this.issuerBank;
  }

  public String getClientName() 
  {
    return this.clientName;
  }

  //creating setter method for clientName,BalanceAmount
  public void setClientName(String clientName)
  {
    this.clientName = clientName;
  }

  public void setBalanceAmount(int BalanceAmount)
  {
    this.balanceAmount = balanceAmount;
  }

  //displaying bank_card
  public void display() 
  {
    if (this.clientName.equals("")) 
    {
      System.out.println("client name is not assigned");

    } else
    {
      System.out.println("cardId=" + cardId);
      System.out.println("balanceAmount=" + balanceAmount);
      System.out.println("cardId=" + cardId);
      System.out.println("bankAccount=" + bankAccount);
      System.out.println("issuerBank=" + issuerBank);
    }
  }
}
