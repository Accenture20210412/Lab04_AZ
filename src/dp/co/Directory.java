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
		if(fileSystemElement.canBeAddedTo(this)) {
			fileSystemElement.parent = this;
			elements.add(fileSystemElement);
		}
		else {
			System.out.println("Nie udalo sie dodac do folderu");
		}
	}

	@Override
	public void print(String tabs){
		System.out.println(tabs+"+"+name);
		tabs+="   ";
		for(FileSystemElement e : elements){
			e.print(tabs);
		}
	}

	@Override
	public boolean canBeAddedTo (Directory directory) {
		if(directory==this) {
			return false;
		}
		return true;
	}

}
