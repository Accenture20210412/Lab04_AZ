package dp.co;

public abstract class FileSystemElement {
	public String name;
	public FileSystemElement parent;
	public boolean rename(String newName){
		this.name = newName;
		return true;
	}
	public abstract boolean remove();
	public abstract boolean move();
	public abstract void print();
	
}
