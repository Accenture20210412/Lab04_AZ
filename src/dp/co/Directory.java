package dp.co;


import java.util.ArrayList;
import java.util.List;

public class Directory extends FileSystemElement {
	public List<FileSystemElement> elements;
	
	public Directory(String name) {
		this.name = name;
		this.elements = new ArrayList<>();
	}

	public void add(FileSystemElement fileSystemElement) {
		fileSystemElement.parent = this;
		elements.add(fileSystemElement);
	}

	@Override
	public void print(String tabs){
		System.out.println(tabs+"+"+name);
		tabs+="   ";
		for(FileSystemElement e : elements){
			e.print(tabs);
		}
	}

}
