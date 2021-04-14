package dp.co;

public interface FileSystemElement {

	public boolean rename(String newName);
	public boolean remove();
	public boolean move();
	public void print();
	public void add(FileSystemElement fileSystemElement);
	
}
