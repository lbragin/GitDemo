import java.sql.SQLException;

public class ExceptionsDemo {

	public static void main(String[] args) throws SQLException {
		Account acc = new Account();
		acc.withdraw(100);

	}

}
