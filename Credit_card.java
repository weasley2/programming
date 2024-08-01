public class Credit_card extends Bank_card
 {
    //creating fields
    private int cvcNumber;
    private double creditLimit;
    private double interestRate;
    private String expirationDate;
    private int gracePeriod;
    private boolean isgranted;
    // constructor is created as credit_card having six parameters
    public Credit_card(int cardId, String clientName, String issuerBank, String bankAccount, int balanceAmount, int cvcNumber,
    double interestRate, String expirationDate)
    {
      super(balanceAmount, cardId,bankAccount,issuerBank);
      super.setClientName(clientName);
      this.cvcNumber = cvcNumber;
      this.interestRate = interestRate;
      this.expirationDate = expirationDate;
      this.isgranted = false;
    }
    //using getter method for cvcNumber,creditLimit.interestRate,expirationDate,gracePeriod,isgranted
    public int getcvcNumber() 
    {
      return this.cvcNumber;
    }

    public double getcreditLimit()
    {
      return this.creditLimit;
    }

    public double interestRate()
    {
      return this.interestRate;
    }

    public String getexpirationDate()
    {
      return this.expirationDate;
    }

    public int getgracePeriod()
    {
      return this.gracePeriod;
    }

    public boolean getisgranted()
    {
      return this.isgranted;
    }

    //using setter method forcreditLimit,

    public void setcreditLimit(double creditLimit, int gracePeriod)
    {
      if (creditLimit <= 2.5 * getBalanceAmount()) 
      {
        this.creditLimit = creditLimit;
        this.gracePeriod = gracePeriod;
        this.isgranted = true;
      } else {
        System.out.print("credit is not granted");
      }

    }
    //creating cancel credit_card
    public void cancelcredit_card()
    {
        this.cvcNumber=0;
        this.creditLimit=0;
        this.gracePeriod=0;
        this.isgranted=false;
    }
    //displaying credit_card
    @Override
    public void display() 
    {
      if (isgranted == true) 
      {
        super.display();
        System.out.println("The credit limit is =" + creditLimit);
        System.out.println("The grace period is =" + gracePeriod);
        System.out.println("The interest rate is =" + interestRate);
        System.out.println("The expiration date is =" + expirationDate);
        System.out.println("The cvc number is =" + cvcNumber);
      } else
      {
        
        System.out.println("credit has not been granted");
        System.out.println("The interestRate is =" + interestRate);
        System.out.println("The expirationDate is =" + expirationDate);
        System.out.println("The cvcNumber is =" + cvcNumber);

      }

    }

  }