package sort;

public class sortTest {
	private sortable sorter;
	
	public void setSortable(sortable sortable) {
		this.sorter = sortable;
	}
	
	public void doSort(int[] array) {
		System.out.println(sorter.getClass());
		sorter.sort(array);
	}
}
