package abstractDemo;

public class CustomerManager {

	BaseDatabaseManager baseDatabaseManager;
	public void add() {
		System.out.println("M��teri eklenmi�tir.");
		BaseDatabaseManager baseDatabaseManager=new OracleDatabaseManager();
		baseDatabaseManager.getData();
	}
}
