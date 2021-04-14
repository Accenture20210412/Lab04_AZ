package dp.co;
import java.util.ArrayList;
import java.util.List;

//zmiana na abstract class aby w jednym miejscu implementowac powtarzajace sie
//w File & Directory metody oraz powtarzajace sie pola
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
	//to do: zabezpieczyc rekurencje
	public void print(String tabs){
		System.out.println(tabs+"+"+name);
		tabs+="   ";
		for(FileSystemElement e : elements){
			e.print(tabs);
		}
	}

	@Override
	//zabezpieczenie by nie dalo sie dodac do dodawanego pliku
	public boolean canBeAddedTo (Directory directory) {
		if(directory==this) {
			return false;
		}
		//to do: sprawdzic dla wszystkich elementow wewnatrz dodawanego
		return true;
	}

}
