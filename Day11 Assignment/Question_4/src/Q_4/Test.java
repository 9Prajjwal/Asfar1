package Q_4;

public class Test implements Intr {

	@Override
	public int[] display(int p) {
		// TODO Auto-generated method stub
		int a = 0;
		int[] array = new int[p];
		for(int i=2;i<=p;i++) {
			int count = 0;
			for(int j = 1;j<=i;j++) {
				if(i%j == 0) {
					count++;
				}
			}
			if(count == 2) {
				array[a] = i;
				a++;
			}
		}
		
		System.out.println(array);
		return array;
	}

}
