/**
 * @author Tanya Kalianda
 * Bank Account GUI
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class BankAccountGUI  extends JFrame
{
	ArrayList<BankAccount> bankAccounts;
	final double OVER_DRAFT_FEE = 15;
	final double RATE = 0.0025;
	final double TRANSACTION_FEE = 1.5;
	final double MIN_BAL = 300;
	final double MIN_BAL_FEE = 10;
	final int FREE_TRANSACTIONS = 10;
	int accNum = -1;
	
	public BankAccountGUI()
	{
		bankAccounts = new ArrayList<BankAccount>();
		setTitle("Bank Account");
		setBounds(100,100,500,400);
		setLayout(null);
		
		JLabel name = new JLabel();
		name.setBounds(50,50,100,50);
		name.setText("Name: ");
		add(name);
		
		JTextField nameBox = new JTextField();
		nameBox.setBounds(100, 50, 100, 50);
		add(nameBox);
		
		JLabel accountType = new JLabel();
		accountType.setBounds(50, 110, 100, 50);
		accountType.setText("Account Type: ");
		add(accountType);
		
		String[] accounts = {"", "Checking Account", "Savings Account"};     
		JComboBox accountTypeBox = new JComboBox(accounts);
		accountTypeBox.setBounds(150,110,150,50);
		add(accountTypeBox);
		
		JLabel balance = new JLabel();
		balance.setBounds(50, 170, 100, 50);
		balance.setText("Initial Balance: ");
		add(balance);
		
		JTextField balanceBox = new JTextField();
		balanceBox.setBounds(150, 170, 100, 50);
		add(balanceBox);
		
		JButton createAccount = new JButton();
		createAccount.setBounds(50, 250, 150, 50);
		createAccount.setText("Create Account");
		createAccount.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				String selected = (String) accountTypeBox.getSelectedItem();
				String nameAccount = nameBox.getText();
				Double balanceAccount = Double.parseDouble(balanceBox.getText());
				
				if (selected.equals("Checking Account"))
				{
					bankAccounts.add(new CheckingAccount(nameAccount, balanceAccount, OVER_DRAFT_FEE, TRANSACTION_FEE, FREE_TRANSACTIONS));
					createAccount.setText("Account Created");
				}
				else if (selected.equals("Savings Account"))
				{
					bankAccounts.add(new SavingsAccount(nameAccount, balanceAccount, RATE, MIN_BAL, MIN_BAL_FEE));
					createAccount.setText("Account Created");
				}
				else
				{
					createAccount.setText("Error - invalid input");
				}
			}
		});
		add(createAccount);
		
		
		JButton displayAccount = new JButton();
		displayAccount.setBounds(300,250,150,50);
		displayAccount.setText("Display Accounts");
		displayAccount.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				System.out.print("Your Accounts: " + bankAccounts.toString());
				displayAccount.setText("Account Displayed");
				balanceBox.setText("");
				nameBox.setText("");
			}
		});
		add(displayAccount);
		
		
		
		setVisible(true);
		setDefaultCloseOperation(this.EXIT_ON_CLOSE);
				
	}
	
	
	public static void main(String[] args)
	{
		new BankAccountGUI();  
	}
}
