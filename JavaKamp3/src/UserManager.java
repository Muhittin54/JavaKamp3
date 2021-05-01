public class UserManager {
	public void login(User user) {
		System.out.println("Sayin " + user.getFullName() + " Giris Yapildi.");
	}
	public void logout(User user) {
		System.out.println("Sayin " + user.getFullName() + " Cikis Yapildi.");
	}
	
	public void add(User user) {
		System.out.println("Sayin " + user.getFullName() + " Kaydiniz Yapildi.");
	}

	public void update(User user) {
		System.out.println("Sayin " + user.getFullName() + " Guncellemeniz Yapildi.");
	}

	public void delete(User user) {
		System.out.println("Sayin " + user.getFullName() + " Hesap Silme Isleminiz Yapildi.");
	}
}