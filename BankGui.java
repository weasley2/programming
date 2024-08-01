//bringing in Java functions
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;
public class BankGui implements ActionListener//class BankGUI is created for the gui
{   
    //naming the frame's constituent parts
    private int pinNO;
    private int withdrawalAmt;
    private boolean hasWithdrawn;
    private String dateOfWithdrawal;
    private int CardId;
    private int  balanceamount;
    private String clientname;
    private String issuerbank;
    private String bankaccount;
    private int CVCno;
    private double creditlimit;
    private double interestrate;
    private String expirationdate;
    private int graceperiod;
    private boolean isgranted;
    private JFrame frame;
    private JLabel bank,debit,credit,CardIddb,clientnamedb,issuerbankdb,
    bankaccountdb,balanceamountdb,setpindb,CardId2db,
    withdrawaldatedb,withdrawalamountdb,pinnodb,
    CardIdcd,clientnamecd,expirationdatecd,
    cvcnumcd,creditlimitcd,CardId3cd,issuerbankcd,
    bankaccountcd,balanceamountcd,graceperiodcd,
    interestratecd;
    private JComboBox withdrawalDateComboBox, expirationDateComboBox;//Adding combox 
    private JButton b1adddb,b2addcd,b3withdraw,b4setcd,b5cancelcd,b6displaydb,b7cleardb,b8displaycd,b9clearcd;
    private JTextField T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,
    T12,T13,T14,T15,T16,T17,T18,T19,T20;
    private JPanel panel;
    ArrayList<Bank_card>cards=new ArrayList<Bank_card>();
    public BankGui() 
    {
        cards = new ArrayList<Bank_card>();
        //JFrame and JPanel is created
        frame = new JFrame("Bank_Gui");
        panel = new JPanel();
        frame = new JFrame();
        panel.setLayout(null);
        //Creating JLabels
        bank=new JLabel("Welcome to Sunrise Bank");
        credit=new JLabel("CREDIT CARD");
        debit=new JLabel("DEBIT CARD");
        CardIddb = new JLabel("Card ID");
        clientnamedb = new JLabel("Client Name");
        issuerbankdb= new JLabel("Issuer Bank");
        bankaccountdb=new JLabel("Bank Account");
        balanceamountdb=new JLabel("Balance Amount");
        setpindb=new JLabel("Set Pin");
        CardId2db=new JLabel("Card ID");
        withdrawaldatedb=new JLabel("Withdrawal Date");
        withdrawalamountdb = new JLabel("Withdrawal Amount");
        pinnodb=new JLabel("Pin No");
        CardIdcd=new JLabel("Card ID");
        clientnamecd=new JLabel("Client name");
        issuerbankcd=new JLabel("Issuer Bank");
        cvcnumcd= new JLabel("CVC number");
        expirationdatecd=new JLabel("Expiration Date");
        CardIdcd=new JLabel("Card ID");
        CardId3cd=new JLabel("Card ID");
        creditlimitcd = new JLabel("Credit limit");
        bankaccountcd = new JLabel("Bank account");
        balanceamountcd = new JLabel("Balance amount");
        graceperiodcd = new JLabel("Grace period");
        interestratecd = new JLabel("Interest rate");
        b1adddb = new JButton("Add a debit card");//buttons are created
        b2addcd= new JButton("Add a credit card");
        b3withdraw = new JButton("Withdraw");
        b4setcd = new JButton("Set credit limit");
        b5cancelcd= new JButton("Cancel card");
        b6displaydb = new JButton("Display");
        b7cleardb = new JButton("Clear");
        b8displaycd=new JButton("Display");
        b9clearcd= new JButton("Clear");
        //Creating text fields
        T1 = new JTextField();
        T2 = new JTextField();
        T3 = new JTextField();
        T4 = new JTextField();
        T5 = new JTextField();
        T6 = new JTextField();
        T7 = new JTextField();  
        T8 = new JTextField();
        T9 = new JTextField();
        T10 = new JTextField();
        T11 = new JTextField();
        T12 = new JTextField();
        T13 = new JTextField();
        T14 = new JTextField();
        T15 = new JTextField();
        T16 = new JTextField();
        T17 = new JTextField();
        T18 = new JTextField();
        T19 = new JTextField();
        T20 = new JTextField();
       //arraying the combobox attribute values
        String[] dates = {"2010-01-01","2011-07-15","2012-11-30","2013-04-12","2014-12-05","2015-06-21","2016-09-14","2017-12-01","2018-08-23","2019-05-17","2020-02-29","2021-11-11","2022-07-06","2023-04-18"};
        withdrawalDateComboBox = new JComboBox(dates);
        expirationDateComboBox = new JComboBox(dates);
       //size of the J components
        bank.setBounds(444,0,250,20);
        debit.setBounds(421,28,84,20);
        CardIddb.setBounds(162,48,64,22);
        T1.setBounds(238,48,126,24);
        clientnamedb.setBounds(131,87,105,20);
        T2.setBounds(241,86,126,32);
        issuerbankdb.setBounds(141,127,95,20);
        T3.setBounds(238,133,129,30);
        bankaccountdb.setBounds(100,178,120,20);
        T4.setBounds(238,178,133,22);
        balanceamountdb.setBounds(109,219,124,20);
        T5.setBounds(238,219,136,22);
        setpindb.setBounds(138,260,66,20);
        T6.setBounds(238,254,136,22);
        CardId2db.setBounds(550,48,73,24);
        T7.setBounds(636,48,115,22);
        withdrawaldatedb.setBounds(516,100,112,20);
        withdrawalDateComboBox.setBounds(636,95,121,22);
        withdrawalamountdb.setBounds(511,146,117,20);
        T8.setBounds(640,142,126,22);
        pinnodb.setBounds(533,192,72,20);
        T9.setBounds(640,189,130,22);
        b1adddb.setBounds(257,289,136,22);
        b1adddb.setBackground(Color.white);
        b6displaydb.setBounds(97,291,117,22);
        b6displaydb.setBackground(Color.white);
        b3withdraw.setBounds(577,240,125,22);
        b3withdraw.setBackground(Color.white);
        b7cleardb.setBounds(403,286,120,22);
        b7cleardb.setBackground(Color.white);
        
        credit.setBounds(435,323,129,20);
        CardIdcd.setBounds(131,355,95,26);
        T10.setBounds(233,355,180,22);
        clientnamecd.setBounds(125,401,96,20);
        T11.setBounds(233,399,180,22);
        interestratecd.setBounds(119,451,102,20);
        T12.setBounds(233,443,180,22);
        issuerbankcd.setBounds(475,355,96,20);
        T13.setBounds(577,349,180,22);
        cvcnumcd.setBounds(475,392,89,20);
        T14.setBounds(577,392,180,22);
        bankaccountcd.setBounds(470,433,99,20);
        T15.setBounds(577,435,180,22);
        balanceamountcd.setBounds(119,497,115,20);
        T16.setBounds(233,491,180,22);
        expirationdatecd.setBounds(463,475,113,20);
        expirationDateComboBox.setBounds(577,478,180,22);
        CardId3cd.setBounds(345,576,54,21);
        T17.setBounds(396,576,180,22);
        graceperiodcd.setBounds(295,615,100,20);
        T18.setBounds(396,615,180,22);
        creditlimitcd.setBounds(307,653,88,20);
        T19.setBounds(396,654,180,22);
        b4setcd.setBounds(742,582,160,22);
        b4setcd.setBackground(Color.white);
        
        b2addcd.setBounds(345,530,136,22);
        b2addcd.setBackground(Color.white);
        b8displaycd.setBounds(512,530,104,22);
        b8displaycd.setBackground(Color.white);
        b9clearcd.setBounds(683,631,74,22);
        b9clearcd.setBackground(Color.white);
        b5cancelcd.setBounds(605,582,120,22);
        b5cancelcd.setBackground(Color.white);
        //JComponents are added in panel
        panel.add(bank);
        panel.add(debit);
        panel.add(credit);
        panel.add(CardIddb);
        panel.add(clientnamedb);
        panel.add(issuerbankdb);
        panel.add(setpindb);
        panel.add(CardId2db);
        panel.add(withdrawaldatedb);
        panel.add(withdrawalamountdb);
        panel.add(CardIdcd);
        panel.add(clientnamecd);
        panel.add(issuerbankcd);
        panel.add(cvcnumcd);
        panel.add(creditlimitcd);
        panel.add(bankaccountdb);
        panel.add(balanceamountdb);
        panel.add(pinnodb);
        panel.add(bankaccountcd);
        panel.add(balanceamountcd);
        panel.add(expirationdatecd);
        panel.add(CardId3cd);
        panel.add(graceperiodcd);
        panel.add(interestratecd);
        panel.add(T1);
        panel.add(T2);
        panel.add(T3);
        panel.add(T4);
        panel.add(T5);
        panel.add(T6);
        panel.add(T7);
        panel.add(T8);
        panel.add(T9);
        panel.add(T10);
        panel.add(T11);
        panel.add(T12);
        panel.add(T13);
        panel.add(T14);
        panel.add(T15);
        panel.add(T16);
        panel.add(T17);
        panel.add(T18);
        panel.add(T19);
        panel.add(T20);
        panel.add(b1adddb);
        panel.add(b2addcd);
        panel.add(b3withdraw);
        panel.add(b4setcd);
        panel.add(b5cancelcd);
        panel.add(b6displaydb);
        panel.add(b7cleardb);
        panel.add(b8displaycd);
        panel.add(b9clearcd);
        //ActionListener is being setted
        b1adddb.addActionListener(this);
        b2addcd.addActionListener(this);
        b3withdraw.addActionListener(this);
        b5cancelcd.addActionListener(this);
        b4setcd.addActionListener(this);
        b6displaydb.addActionListener(this);
        b7cleardb.addActionListener(this);
        b8displaycd.addActionListener(this);
        b9clearcd.addActionListener(this);
        panel.add(withdrawalDateComboBox);
        panel.add(expirationDateComboBox);
        panel.setBackground(Color.pink);
        panel.setLayout(null);
        panel.setVisible(true);
        panel.setSize(1000,800);
        //Panel is aaded to JFrame
        frame.add(panel);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setSize(1000,800);
        frame.setResizable(false);
    }
    public static void main(String[]args)
    {
        //The bankgui class creates a new instance.
        new BankGui();
       
    }
    public void actionPerformed(ActionEvent e)//The method that is invoked whenever a user engages with the GUI is this one.
    {
        //When pressed, this button checks to see if the text field has been cleared.
        if(e.getSource()==b7cleardb) 
        {
            JOptionPane.showMessageDialog(frame,"Your form has been submitted successfully","TitleBar",JOptionPane.INFORMATION_MESSAGE);
            T1.setText("");
            T2.setText("");
            T3.setText("");
            T4.setText("");
            T5.setText("");
            T6.setText("");
            T7.setText("");
            T8.setText("");
            T9.setText("");
        }
        if(e.getSource()==b9clearcd)//This B9 clear debit button verifies if the field is empty after being pressed.
        {
            JOptionPane.showMessageDialog(frame,"Your form has been submitted successfully","TittleBar",JOptionPane.INFORMATION_MESSAGE);
            T10.setText("");
            T11.setText("");
            T12.setText("");
            T13.setText("");
            T14.setText("");
            T15.setText("");
            T16.setText("");
            T17.setText("");
            T18.setText("");
            T19.setText("");
            T20.setText("");


        }
        if (e.getSource() == b1adddb)//This B9 clear debit button verifies if the field is empty after being pressed.
        {
            if(T1.getText().isEmpty()||
            T2.getText().isEmpty()||
            T3.getText().isEmpty()||
            T4.getText().isEmpty()||
            T5.getText().isEmpty()||
            T6.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "Please complete all the blank forms.", "Error",
                JOptionPane.ERROR_MESSAGE);
            }
            else
            {
                try{
                    //Change the input values' data types to the proper ones.
                    int CardIddb = Integer.parseInt(T1.getText());
                    String clientnamedb = T2.getText();
                    String issuerbankdb = T3.getText();
                    String bankaccountdb = T4.getText();
                    int balanceamountdb= Integer.parseInt(T5.getText());
                    int setpindb = Integer.parseInt(T6.getText());
                    int repeat = 0;
                   
                    if(cards.size() == 0){// this determines if the lists do not contain a debit_card.
                        Debit_card dcard1 = new Debit_card(balanceamountdb,CardIddb,bankaccountdb,issuerbankdb,clientnamedb,setpindb);
                        cards.add(dcard1);
                        JOptionPane.showMessageDialog(null, "successfully entered your debit card information.","SUCCESS",
                        JOptionPane.INFORMATION_MESSAGE);
                    }
                   
                    else{
                        for(Bank_card debitc : cards){
                            if(debitc instanceof Debit_card){
                                Debit_card dcardO = (Debit_card) debitc;
                                if(dcardO.getCardId() == CardIddb){
                                    repeat = repeat + 1;
                                }
                            }
                        }
                        if(repeat == 0)//Adding a new debit_card that isn't already on the list and creating a new one.
                        {
                            Debit_card dcard2 = new Debit_card(balanceamountdb,CardIddb,bankaccountdb,issuerbankdb,clientnamedb,setpindb);
                            cards.add(dcard2);
                            JOptionPane.showMessageDialog(null, "successfully entered your debit card information.","SUCCESS",
                            JOptionPane.INFORMATION_MESSAGE);
                                }
                        else{
                            //Error message is shown using a dialouge box
                        JOptionPane.showMessageDialog(null,  "Debit card already exists," ,"Error",
                                    JOptionPane.ERROR_MESSAGE);
                        }
                    }
                   
                }catch(NumberFormatException ex){
                    JOptionPane.showMessageDialog(null, "Invalid input detected.", "Error",//Error message is shown using a dialouge box
                    JOptionPane.ERROR_MESSAGE);
                }
            }
        }
       //This block of code handles the action when the withdraw button is clicked
        if(e.getSource() == b3withdraw){//t first verifies that all necessary information has been provided; if not, an error message is displayed.
            String dates = (String) withdrawalDateComboBox.getSelectedItem();
            if (T7.getText().isEmpty() || T8.getText().isEmpty() ||
               T9.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, " Fill in all the details .", "Error",
                JOptionPane.ERROR_MESSAGE);
            }
            else{
                try{
                    int CardId2db = Integer.parseInt(T7.getText());
                    int withdrawalamountdb = Integer.parseInt(T8.getText());
                    int pinnodb = Integer.parseInt(T9.getText());
                    int loop = 0;
                    //If a match is made, the withdrawal amount is verified as genuine, and if it is, a new DebitCard object is created with the updated balance and added to the list of cards.
                    for(Bank_card debitc1 : cards){
                            if(debitc1 instanceof Debit_card){
                                Debit_card dcard2 = (Debit_card) debitc1;
                                if(dcard2.getCardId() == CardId2db){
                                    loop = loop + 1;
                                    if(dcard2.getPinNumber() == pinnodb){
                                        if(debitc1.getBalanceAmount() >= withdrawalamountdb){////It then displays a success message with the details of the transaction.
                                            dcard2.withdraw(withdrawalAmt,dateOfWithdrawal,pinNO);
                                            cards.add(dcard2);
                                            String Data = "CardId : "+ CardId2db+ " " + "\nPin Number :"+pinnodb + " " +
                                                          "\nWithdraw Amount :" + withdrawalamountdb + " " + "\nTime :" + dates;
                                            //debitc1.setBalanceAmount(debitc1.getBalanceAmount() - withdrawalamountdebit);
                                            JOptionPane.showMessageDialog(null,Data + "\nSuccessfully withdrawn money.", "SUCESS",
                                            JOptionPane.INFORMATION_MESSAGE);
                                        }
                                        else{
                                            JOptionPane.showMessageDialog(null,"InsuFficient Balance.", "ERROR",//An error notice is displayed if the pin number or card identification don't match.
                                            JOptionPane.ERROR_MESSAGE);
                                        }
                                    }
                                    else{
                                        JOptionPane.showMessageDialog(null,"Pin number doesn't match.", "ERROR",
                                        JOptionPane.ERROR_MESSAGE);
                                    }
                                }
                            }
                    }
                    if(loop == 0){
                        JOptionPane.showMessageDialog(null,"Card ID doesn't exist.", "ERROR",
                        JOptionPane.ERROR_MESSAGE);
                    }
                }
               
                catch(NumberFormatException ex){
                    JOptionPane.showMessageDialog(null, "Invalid input detected.", "Error",
                    JOptionPane.ERROR_MESSAGE);
                }
            }
        }
       //Debit_Card details are displayed
        if (e.getSource() == b6displaydb){
            String dates = (String)withdrawalDateComboBox.getSelectedItem();
           
            if(cards.size() == 0){//Check if card list is empty
                JOptionPane.showMessageDialog(null,"Please Enter the values before displaying them.", "ERROR",
                JOptionPane.ERROR_MESSAGE);
            }
            else{
                for(Bank_card Debit_card2 : cards){
                    if(Debit_card2 instanceof Debit_card){
                        Debit_card dcard3 = (Debit_card) Debit_card2;
                        dcard3.display();
                        String clientnamecd = dcard3.getClientName();
                        int CardIdcd = dcard3.getCardId();
                        double balanceamountcd = dcard3.getBalanceAmount();
                        int pinnocd = dcard3.getPinNumber();
                        String issuerbankcd = dcard3.getIssuerBank();
                        String bankaccountcd = dcard3.getBankAccount();
                           
                        String value1 = "Card ID : "+CardIdcd + "\nClient Name : " + clientnamecd + "\nIssuer Bank : " + issuerbankcd + "\nBalance Amount : " + balanceamountcd +
                        "\nBank Account : " + bankaccountcd  + "\nPin Number : " + pinnocd +"\nWithdraw Amount : "+dcard3.getWithdrawalamount()+
                                                                "\nWithdraw Date : "+ dates+ "\n" ;
                           
                        String value2 = "Card ID : "+CardIdcd + "\nClient Name : " + clientnamecd + "\nIssuer Bank : " + issuerbankcd + "\nBalance Amount : " + balanceamountcd +
                        "\nBank Account : " + bankaccountcd + "\nPin Number : " + pinnocd + "\n" ;
                        if(dcard3.getHasWithdrawn() == true){//Verify the card's withdrawal history and present it as such.
                            JOptionPane.showMessageDialog(null,"Debit Card.\n" + value1 , "Display",
                            JOptionPane.INFORMATION_MESSAGE);
                        }
                        else{
                            JOptionPane.showMessageDialog(null,"Debit Card.\n" + value2 + "\n", "Display",
                            JOptionPane.INFORMATION_MESSAGE);
                        }
                    }
                }
            }
        }
       //ADD details of Credit_Card
        if (e.getSource() == b2addcd)
        {
            String dates = (String) expirationDateComboBox.getSelectedItem();
            if(T10.getText().isEmpty()||
            T11.getText().isEmpty()||
            T12.getText().isEmpty()||
            T13.getText().isEmpty()||
            T14.getText().isEmpty()||
            T15.getText().isEmpty()||
            T16.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "Please fill all the empty forms.", "Error",
                JOptionPane.ERROR_MESSAGE);
            }
            else
            {
                try{
                    int CardIdcd = Integer.parseInt(T10.getText());
                    String clientnamecd = T11.getText();
                    int interestratecd = Integer.parseInt(T12.getText());
                    String issuerbankcd= T13.getText();
                    int cvcnumcd = Integer.parseInt(T14.getText());
                    String bankaccountcd = T15.getText();
                    int balanceamountcd = Integer.parseInt(T16.getText());
                    int repeaT2 = 0;
                    //Credit_card
                    if(cards.size() == 0){
                        Credit_card ccard = new Credit_card( CardIdcd,clientnamecd,issuerbankcd,bankaccountcd,balanceamountcd,cvcnumcd,interestratecd,
                        expirationdate);
                        cards.add(ccard);
                        JOptionPane.showMessageDialog(null, "Succesfully added your Credit card details.", "Success",
                        JOptionPane.INFORMATION_MESSAGE);
                    }
                   
                    else{
                        for(Bank_card creditc1 : cards){
                            if(creditc1 instanceof Credit_card){
                                Credit_card ccard = (Credit_card) creditc1;
                                if(ccard.getCardId() == CardIdcd){
                                    repeaT2 = repeaT2 + 1;
                                }
                            }
                        }
                        if(repeaT2 == 0){
                            Credit_card ccard1 = new Credit_card( CardIdcd,clientnamecd,issuerbankcd,bankaccountcd,balanceamountcd,cvcnumcd,interestratecd,
                            expirationdate);
                            cards.add(ccard1);
                            JOptionPane.showMessageDialog(null, "Succesfully added your Credit card details.", "Success",
                            JOptionPane.INFORMATION_MESSAGE);
                                }
                        else{
                            JOptionPane.showMessageDialog(null, "Credit card already exist.", "ERROR",
                            JOptionPane.ERROR_MESSAGE);
                        }
                    }  
                }catch(NumberFormatException ex){
                   JOptionPane.showMessageDialog(null, "wrong input.", "ERROR",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
        }
       //This code determines whether the "b4setcredit" button is the event's source.
        if(e.getSource() == b4setcd){ //If so, it retrieves the chosen item from the combination box for the expiration date and makes additional checks.
            String dates = (String) expirationDateComboBox.getSelectedItem();//An error warning appears if the text fields t17, t18, and t19 are empty.
            if(T17.getText().isEmpty() || T18.getText().isEmpty() ||
               T19.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "Please fill in all the details .", "Error",
                JOptionPane.ERROR_MESSAGE);
            }
            else{//Otherwise, the program attempts to convert the input values from the three tables (t17, t18, and t19) into integers and doubles.
                try{
                    int CardId3cd= Integer.parseInt(T17.getText());
                    double creditlimitcd = Double.parseDouble(T19.getText());
                    int graceperiodcd = Integer.parseInt(T18.getText());
                    int loop = 0;
                    if(cards.size() == 0){//It determines whether the "cards" list has any elements after a successful parse. If not, a notice with an error is shown.

                        JOptionPane.showMessageDialog(null,"Please enter some value before setting credit limit.", "ERROR",
                        JOptionPane.ERROR_MESSAGE);
                    }
                   
                    else{//It iterates over each "BankCard" object in the list to identify a matching "CreditCard" object if there are elements in the "cards" list.
                        for(Bank_card creditc2 : cards){
                                if(creditc2 instanceof Credit_card){
                                    Credit_card ccard2 = (Credit_card) creditc2;
                                    if(ccard2.getCardId() == CardId3cd){
                                        loop = loop + 1;
                                        if(ccard2.getBalanceAmount() * 2.5 >= creditlimitcd){
                                            ccard2.setcreditLimit(creditlimitcd,graceperiodcd);
                                            String Data = "CardId : "+CardId3cd+ " " + ccard2.getisgranted() +
                                                          " " + "\nTime :" +dates;
                                            JOptionPane.showMessageDialog(null,Data + "\nSuccessfully Set Credit Limit.", "SUCESS",
                                            JOptionPane.INFORMATION_MESSAGE);
                                        }
                                        else{
                                            JOptionPane.showMessageDialog(null,"Your Credit cannot be issued.", "ERROR",
                                            JOptionPane.ERROR_MESSAGE);
                                        }
                                    }
                                }
                        }
                        if (loop == 0){
                            JOptionPane.showMessageDialog(null,"Your Card ID doesn't match any of the Card ID in our database.", "ERROR",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        }
                    }
               
                catch(NumberFormatException ex){
                    JOptionPane.showMessageDialog(null,"Please enter an appropriate value.", "ERROR",
                    JOptionPane.ERROR_MESSAGE);
                }
            }
        }
       //When the user presses the "display credit" or "cancel credit" button, this section of code is activated.
        if (e.getSource() == b8displaycd){//The information for each created credit card is shown if the "display credit" button is clicked.
            String dates = (String) expirationDateComboBox.getSelectedItem();  
            if(cards.size() == 0){
                JOptionPane.showMessageDialog(null,"Please Enter the values before displaying them.", "ERROR",
                JOptionPane.ERROR_MESSAGE);
            }
            else{//If not, iterate over each card and display its information.
                try{
                    for(Bank_card creditc3: cards){
                        if(creditc3 instanceof Credit_card){
                            Credit_card ccard3 = (Credit_card) creditc3;
                           //Display the credit card details.
                            ccard3.display();
                            //Obtain numerous details regarding the credit card.
                           
                            String clientnamecd = ccard3.getClientName();
                            int CardIdclient = ccard3.getCardId();
                            double balanceamountcd = ccard3.getBalanceAmount();
                            String issuerbankcd = ccard3.getIssuerBank();
                            String bankaccountcd = ccard3.getBankAccount();
                            int cvcnumcd =  ccard3.getcvcNumber();
                            double creditlimitcd = ccard3.getcreditLimit();
                            int graceperiodcd = ccard3.getgracePeriod();
                            double interestratecd = ccard3.interestRate();
                            boolean isgrantedcd = ccard3.getisgranted();
                           
                            String value1 = "Card ID : "+CardIdclient + "\nClient Name : " + clientnamecd + "\nIssuer Bank : " + issuerbankcd + "\nBalance Amount : " + balanceamountcd +
                                            "\nBank Account : " + bankaccountcd + "\nGrace Period : " + graceperiodcd + "\nCredit Limit : " + creditlimitcd;
                           
                            String value2 = "Card ID : "+CardIdclient + "\nClient Name : " + clientnamecd+ "\nIssuer Bank : " + issuerbankcd + "\nBalance Amount : " + balanceamountcd +
                                            "\nBank Account : " + bankaccountcd + "\nCVC Number : " + cvcnumcd + "\nInterest Rate : " + interestratecd +
                                            "\nExpiration Date : "+dates+ "\nIs Granted : " + isgrantedcd ;
                            if(ccard3.getisgranted() == true){
                                JOptionPane.showMessageDialog(null,"Credit Card.\n" + value1 , "Display",
                                JOptionPane.INFORMATION_MESSAGE);
                            }
                            else{
                                JOptionPane.showMessageDialog(null,"Credit Card.\n" + value2 + "\n", "Display",
                                JOptionPane.INFORMATION_MESSAGE);
                            }
                        }
                    }
                }
                catch(NumberFormatException ex){
                   JOptionPane.showMessageDialog(null, "Please enter the correct value.", "Error",
                    JOptionPane.ERROR_MESSAGE);
                }
            }
        }
       
        if (e.getSource() == b5cancelcd)
        {
            if(T10.getText().isEmpty()||
            T11.getText().isEmpty()||
            T12.getText().isEmpty()||
            T13.getText().isEmpty()||
            T14.getText().isEmpty()||
            T15.getText().isEmpty()||
            T16.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "To proceed fill all the empty forms in the credit card .", "Error",
                JOptionPane.ERROR_MESSAGE);
            }
            else
            {
                try{
                    int CardId = Integer.parseInt(T10.getText());
                    int loop = 0;
                    //Credit_card
                    if(cards.size() == 0){
                        JOptionPane.showMessageDialog(null, "Please create a credit card first.", "Error",
                        JOptionPane.ERROR_MESSAGE);
                    }
                   
                    else{
                        for(Bank_card creditc4 : cards){//cycle through the credit card list
                            if(creditc4 instanceof Credit_card){
                                Credit_card ccard4 = (Credit_card) creditc4;
                                if(creditc4.getCardId() == CardId){
                                    loop = loop  + 1;
                                    ccard4.cancelcredit_card();
                                    JOptionPane.showMessageDialog(null, "Credit card is canceled Successfully.", "Success",
                                    JOptionPane.INFORMATION_MESSAGE);
                                }
                            }
                        }
                        if(loop == 0){
                            JOptionPane.showMessageDialog(null, "There doesn't exist credit card.", "Error",
                            JOptionPane.ERROR_MESSAGE);//If the card ID does not match any credit cards, display an error message using JOptionPane.ERROR_MESSAGE);
                        }
                    }  
                }catch(NumberFormatException ex){
                    JOptionPane.showMessageDialog(null, " Enter the correct value.", "Error",
                    JOptionPane.ERROR_MESSAGE);//If the input is not a number, display an error message.
                }
            }
        }
    }
}