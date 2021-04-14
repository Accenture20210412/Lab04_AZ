package dp.co;


import java.util.ArrayList;
import java.util.List;

public class Directory extends FileSystemElement {
	public List<FileSystemElement> fileSystemElements;
	
	public Directory(String name) {
		this.name = name;
		this.fileSystemElements = new ArrayList<>();
	}

	public void add(FileSystemElement fileSystemElement) {
		fileSystemElement.parent = this;
		fileSystemElements.add(fileSystemElement);
	}


}
