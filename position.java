package programa2A;

class position {
	
	public void pos(int p[], int n) {
		
		int min;
		int x[];
		
		x = tempo.calc(p, n);
		min = menor.min(x, n);
		
		System.out.printf("%d\n",min);
		for(int i=0;i<n;i++) {
			if(x[i] == min) {
				System.out.printf("%d ", i+1);
			}
		}
	}

}
