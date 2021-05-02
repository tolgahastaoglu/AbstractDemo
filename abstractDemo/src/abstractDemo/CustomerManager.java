package abstractDemo;

public class CustomerManager {

	BaseDatabaseManager baseDatabaseManager;
	public void add() {
		System.out.println("Müşteri eklenmiştir.");
		BaseDatabaseManager baseDatabaseManager=new OracleDatabaseManager();
		baseDatabaseManager.getData();
	}
}
