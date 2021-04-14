package dp.co;


import java.util.ArrayList;
import java.util.List;

public class Directory extends FileSystemElement {
	private List<FileSystemElement> fileSystemElements;
	
	public Directory(String name) {
		this.name = name;
		this.fileSystemElements = new ArrayList<>();
	}

	@Override
	public boolean remove() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean move() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void print() {
		System.out.println(name);
	}


	public void add(FileSystemElement fileSystemElement) {
		fileSystemElement.parent = this;
		fileSystemElements.add(fileSystemElement);
	}


}
