package chapter25;

public class MyArrayList<E> extends MyAbstractList<E> {
	public static final int INITIAL_CAPACITY = 16;
	private E[] data = (E[])new Object[INITIAL_CAPACITY];
	
	public MyArrayList() {};
	
	public MyArrayList(E[] objects) {
		for (int i = 0; i < objects.length; i++) {
			add(objects[i]);
		}
	}

	@Override
	public void add(int index, E e) {
		ensureCapacity();
		
		for (int i = size - 1; i >= index; i--) {
			data[i + 1] = data[i];
		}
		
		data[index] = e;
		
		size++;
	}

	@Override
	public void clear() {
		data = (E[])new Object[INITIAL_CAPACITY];
		size = 0;
	}

	@Override
	public boolean contains(E e) {
		for (int i = 0; i < data.length; i++) {
			if (e.equals(data[i])) {
				return true;
			}
		}
		return false;
	}

	@Override
	public E get(int index) {
		return data[index];
	}

	@Override
	public int indexOf(E e) {
		for (int i = 0; i < data.length; i++) {
			if (e.equals(data[i])) {
				return i;
			}
		}
		return -1;
	}

	@Override
	public int lastIndexOf(E e) {
		for (int i = data.length - 1; i >= 0; i--) {
			if (e.equals(data[i])) {
				return i;
			}
		}
		return -1;
	}

	@Override
	public E remove(int index) {
		E e = data[index];
		
		for (int j = index; j < size - 1; j++) {
			data[j] = data[j + 1];
		}
		
		data[size - 1] = null;
		
		size --;
		
		return e;
	}

	@Override
	public Object set(int index, E e) {
		E old = data[index];
		data[index] = e;
		return old;
	}
	
	private void ensureCapacity() {
		if (size >= data.length) {
			E[] newData = (E[])(new Object[size * 2 +1]);
			System.arraycopy(data, 0, newData, 0, size);
			data = newData;
		}
	}
	
	public String toString() {
		
		return super.toString();
	}
}
