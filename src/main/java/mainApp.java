
	
import java.sql.SQLException;
import java.util.Scanner;
import DAO.ImenikDAOImpl;
import DAO.ImenikDAOInterface;
import DAO.Korisnik;

public class mainApp {

	public static void main(String[] args) throws SQLException {
		Scanner input = new Scanner(System.in);

		Korisnik korisnik = new Korisnik();
		ImenikDAOInterface imena = new ImenikDAOImpl();

		System.out.println("\n.............................................\n" + "Dobrodosli i hvala sto koristite nas imenik"
						 + "\n..............................................\n");
		System.out.println("Molimo izaberite jednu od ponudenih opcija: " + "\n 1. Registracija novog korisnika "
				+ "\n 2. Ulogujte se na vas racun");

		System.out.println("..................................................");

		int izbor = input.nextInt();

		switch (izbor) {

		case 1:
			korisnik.addUser();
			break;

		case 2:
			Scanner input1 = new Scanner(System.in);
			System.out.println("Molimo unesite vas username: ");
			
			String username = input1.nextLine();
			System.out.println("Molimo unesite vas password: ");
			String password = input1.nextLine();

			if (username.equals(username) && password.equals(password)) {
				System.out.println("Uspjesno ste se ulogovali: ");
			} else {
				System.out.println("Molimo pokusajte ponovo: ");
				break;
			}

			System.out.println("******************************************");

			System.out.println("1. Da bi dodali novog korisnika.");
			System.out.println("2. Da bi azurirali korisnika.");
			System.out.println("3. Da bi izbrisali korisnika.");

			System.out.println("*******************************************");

			int unos1 = input.nextInt();
			switch (unos1) {

			case 1:
				imena.add(korisnik);
				break;

			case 2:
				imena.edit(korisnik);
				break;

			case 3:
				imena.delete();
				break;

			}
		}
	}
}
