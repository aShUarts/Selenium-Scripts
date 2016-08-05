import java.sql.SQLException;

/*End To End Provisioning Flow From adding Customer through CRM, Closure and Add To Provisioning*/

public class ACreationNprovisioning {

	
	public static void main(String[] args) throws SQLException {
	
		StaffLogin.Slogin();
		NavigatetoCRM.NCRM();
		AddCustomer.CustomerAdd();
		PreAccount.PAccount();
		Provisioning.ACProvision();

	}

}
