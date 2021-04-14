package dp.co;

public abstract class FileSystemElement {
	public String name;
	public Directory parent;
	public boolean rename(String newName){
		this.name = newName;
		return true;
	}
	public boolean remove() {
		if (parent!=null) {
			parent.fileSystemElements.remove(this);
			return true;
		}
		return false;
	}

	public boolean move(Directory directory) {
		if(directory == null || directory == this)
			return false;

		if (parent!=null){
			parent.fileSystemElements.remove(this);
		}
		directory.add(this);

		return true;
	}

	public void print() {
		/*Directory parent = this.parent;
		String tabs = "";
		while(parent != null) {
			tabs += "   ";
			parent = parent.parent;
		}*/
		System.out.println(name);
	}
	
}
