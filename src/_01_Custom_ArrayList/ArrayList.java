package _01_Custom_ArrayList;

@SuppressWarnings("unchecked")

public class ArrayList <T>{
	T[] list;
	public ArrayList() {
		list = (T[])new Object[0];
	}
	
	public T get(int loc) throws IndexOutOfBoundsException {
		
		
		//\\//\\!!!>>| |START HERE| |<<!!!//\\//\\
		
		return list[loc];
	}
	
	public void add(T val) {
		T[] newList = (T[])new Object[list.length + 1];
		
		newList[list.length] = val;
		 
		for(int i = 0; i< list.length; i++) {
			newList[i] = list[i];
		}
		
		list = newList;
	}
	
	public void insert(int loc, T val) throws IndexOutOfBoundsException {
		T[]VeryNewList = (T[])new Object[list.length + 1];

		
		for(int i = 0; i<VeryNewList.length; i++) {
			
			if(i<loc) {
				VeryNewList[i] = list[i];
			}
			else if(i>loc) {
				VeryNewList[i] = list[i-1];
			}
			else {
				VeryNewList[loc] = val;			
			}
			}
		list = VeryNewList;
		
		
	}
	
	public void set(int loc, T val) throws IndexOutOfBoundsException {
		list[loc] = val;
	}
	
	public void remove(int loc) throws IndexOutOfBoundsException {
		T[] NewArray = (T[])new Object[list.length - 1];
		for(int i = 0; i<list.length; i++) {
			if(i<loc) {
				NewArray[i] = list[i];
			}
			else if(i> loc) {
				NewArray[i-1] = list[i];
			}
			else {
				
			}
		}
		list = NewArray;
	}
	
	public boolean contains(T val) {
		boolean con = false;
		for(int i = 0; i<list.length; i++) {
			if(list[i] == val) {
				con = true;
			}
			else{
		}
			}
		return con;
	}
	
	public int size() {
		return list.length;
	}
}