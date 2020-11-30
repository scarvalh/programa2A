package programa2A;

class menor {
	
	public static int min(int x[], int n) {
		
		int menor = x[0];
		
		for(int i=1;i<n;i++) {
			if(x[i] < menor) {
				menor  = x[i];
			}
		}
		
		return menor;
			
	}
}
