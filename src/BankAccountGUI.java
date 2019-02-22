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
		setBounds(100,100,600,600);
		setLayout(null);
		
		JLabel name = new JLabel();
		name.setBounds(50,50,100,50);
		name.setText("Name: ");
		add(name);
		
		JTextField nameBox = new JTextField();
		nameBox.setBounds(150, 50, 100, 50);
		add(nameBox);
		
		JLabel accountType = new JLabel();
		accountType.setBounds(50, 100, 100, 50);
		accountType.setText("Account Type: ");
		add(accountType);
		
		String[] accounts = {"Checkings Account", "Savings Account"};     //creates an array and initializes values (or could do String[] accounts = new String[2];
		JComboBox accountTypes = new JComboBox(accounts);
		accountTypes.setBounds(150,100,150,50);
		add(accountTypes);
		
		JLabel balance = new JLabel();
		balance.setBounds(220, 70, 100, 50);
		balance.setText("Initial Balance: ");
		add(balance);
		
		JTextField balanceBox = new JTextField();
		balanceBox.setBounds(200, 150, 100, 50);
		add(balanceBox);
		
		JButton createAccount = new JButton();
		
		setVisible(true);
		setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		
		
	}
	
	
	public static void main(String[] args)
	{
		new BankAccountGUI();  
	}
}
