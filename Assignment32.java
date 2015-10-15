import javax.swing.JOptionPane;
public class Assignment32 {
	public static void main(String[] args) {
		final int limit = 2;
		int AccTrial = 0;
		int trial = 0;
		int PassTrial = 0;
		int i = 0;
		String[] CorrectUsername = {"Ntad1", "Ntad2", "Ntad3"};
		String[] CorrectPassword ={ "Lockers", "Lockerss", "Lockersss"};;
		String[] choices = {"Admin", "Student", "Staff"};
		String Username = JOptionPane.showInputDialog(null,"Enter Username", "Log In", 
                JOptionPane.INFORMATION_MESSAGE);
		while(trial < limit)
		{
		while(i < CorrectUsername.length)
		
			if(CorrectUsername[i].equals(Username))
			{
				String Password = JOptionPane.showInputDialog(null,"Enter Password", "Log In", 
		                JOptionPane.INFORMATION_MESSAGE);
				while(PassTrial < limit){
					if(CorrectPassword[i].equals(Password))
					{
					JOptionPane.showMessageDialog(null, "Welcome USERNAME");
					String AccountType = (String)JOptionPane.showInputDialog(null,"Select Type of Account", "Account type", 
			                 JOptionPane.INFORMATION_MESSAGE, null, choices, choices[2]);
					while(AccTrial < limit)
					{
						if(choices[i].equals(AccountType))
						{
						switch(AccountType){
						case  "Admin":
							JOptionPane.showMessageDialog(null, "Admin:Welcome!You can update and read file");
							break;
						case  "Student":
							JOptionPane.showMessageDialog(null, "Student:Welcome!You can only read file");
							break;
						case  "Staff":
							JOptionPane.showMessageDialog(null, "Stuff:Welcome!You can update, read, add, delete file");
							break;	
						}System.exit(0);
					}else{
						AccTrial++;	
					AccountType = (String)JOptionPane.showInputDialog(null,"Wrong AccountType Select Type of Account", "Account type", 
			                 JOptionPane.INFORMATION_MESSAGE, null, choices, choices[2]);
					}	
					}
				}
				else
				{
					PassTrial++;
				Password = JOptionPane.showInputDialog(null,"Enter Password", "Try again", 
		                JOptionPane.INFORMATION_MESSAGE);
				}
				}
				JOptionPane.showMessageDialog(null, "Contact Administrator");
				System.exit(0);	
			} 
			else 
				{
					i++;	
				}
			trial++;
			Username = JOptionPane.showInputDialog(null,"Enter Username", "Try Again", 
			                JOptionPane.INFORMATION_MESSAGE);
		}
		
		JOptionPane.showMessageDialog(null, "Invalid Username");
		System.exit(0);	
	}
}
