package arraylinkedlist;

public class myArrayList {
	public Object[] objs = new Object[3];
	int size = 0;

	public static void main(String[] args) {
		myArrayList myArray = new myArrayList();
		myArray.set(0, "david");
		myArray.set(1, "jonathan");
		myArray.set(2, "brian");
		myArray.append("bobby");

		myArray.remove(0);
		System.out.println(myArray.get(0));
		System.out.println(myArray.objs.length);
		myArray.remove(0);
		System.out.println(myArray.objs.length);
		// myArray.set(12, "tooHigh");
	}

	public int Size() {
		return this.size;
	}

	public Object get(int index) {
		return this.objs[index];
	}

	public void set(int index, Object obj) {
		try {
			if (objs[index] == null) {
				size++;
			}
			this.objs[index] = obj;
			return;
		} catch (IndexOutOfBoundsException i) {
			System.out.println(i);
		}

	}

	public void expand() {
		Object[] objs_new = new Object[this.objs.length * 2];
		for (int i = 0; i < this.objs.length; i++) {
			objs_new[i] = this.objs[i];
		}
		this.objs = objs_new;
	}

	public void expand(int expandTo) {
		Object[] objs_new = new Object[expandTo];
		for (int i = 0; i < this.objs.length; i++) {
			objs_new[i] = this.objs[i];
		}
		this.objs = objs_new;
	}

	public boolean append(Object obj) {
		if (this.size < this.objs.length) {
			this.objs[size] = obj;
			this.size++;
			return true;
		} else if (this.size == this.objs.length) {
			expand(this.objs.length * 2); // should this have .this?
			this.objs[size] = obj;
			this.size++;
			return true;
		} else {
			return false;
		}
	}

	public Object remove(int index) {
		Object toRemove = this.objs[index];
		if (this.objs[index] == null) {
			System.out.println("this index is empty.  please pass a valid index.");
		} else {
			this.objs[index] = null;
			System.out.println(toRemove);
		}
		return toRemove;
	}

}