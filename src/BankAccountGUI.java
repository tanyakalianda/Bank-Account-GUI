/**
 * @author Tanya Kalianda
 * Bank Account GUI
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class BankAccountGUI  extends JFrame
{
	public BankAccountGUI()
	{
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
		
		String[] accounts = {"", "Checking Account", "Savings Account"};     //creates an array and initializes values (or could do String[] accounts = new String[2];
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
				if (selected.equals("Checking Account"))
				{
					private static int nextAccNum;
					private String name;
					private int accNum;
					private double balance;
					
					public CheckingAccount() 
					{
						name = nameBox.getText();
						accNum = nextAccNum;
						balance = (int) balanceBox.getText();
						nextAccNum++;
					}
				}
				else if (selected.equals("Savings Account"))
				{
					
				}
				else
				{
					//JLabel.setText("Invalid Input")
				}
			}
		});
		add(createAccount);
		
		JLabel label = new JLabel();
		label.setBounds(300,250,100,50);
		label.setText("Label");
		add(label);
		
		
		
		setVisible(true);
		setDefaultCloseOperation(this.EXIT_ON_CLOSE);
				
	}
	
	
	public static void main(String[] args)
	{
		new BankAccountGUI();  
	}
}
