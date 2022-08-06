package CS131Lab2;

/**
 * This class represents a Lockable, 
 * @author Abdifatah Abdi
 * @version 0.1
 * Programming lab 2
 * Summer 2022
 *
 */

//single line comment
/*
 * Multiple line comment
 */
public interface Lockable {

		/**
		* setKey() method
		*/
		void setKey(int key);

		
		/**
		* lock() method
		*/
		void lock(int key);

		/**
		* unlock() method
		*/
		void unlock(int key);

		/**
		* isLocked() method
		*/
		boolean isLocked();
		
	
	

}//end interface
