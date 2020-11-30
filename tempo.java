package programa2A;

class tempo {
	
	public static int[] calc(int v[], int n) {
		
		int x[] = new int[n];
		
		for(int i=0;i<n;i++) {
			int temp = 0;
			for(int j=0;j<n;j++) {
				if(i!=j) {
					temp += Math.abs(j-i) * 2 * v[j];
				}
			}
			
			x[i] = temp;
		}
		
		return x;
	}

}
