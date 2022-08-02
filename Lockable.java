package CS131Lab2;

public interface Lockable {

		
		void setKey(int key);

		void lock(int key);

		
		void unlock(int key);

		
		boolean isLocked();
		
	
	

}//end interface
