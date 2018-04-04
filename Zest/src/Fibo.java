
public class Fibo {

	  final int MAX = 100;
	  final int NIL = -1;
	 
	  double lookup[] = new double[MAX];
	 
	  /* Function to initialize NIL values in lookup table */
	  void _initialize()
	  {
	    for (int i = 0; i < MAX; i++)
	        lookup[i] = NIL;
	  }
	public  double fib (int num) {
		if (lookup[num] == NIL){
			if (num <= 1 ) {
				lookup[num] = num;
			}else {
				lookup[num] = fib(num - 2) + fib(num - 1);
			}
		}
		return lookup[num];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fibo fi = new Fibo();
		fi._initialize();
		double answer = fi.fib(99);
		System.out.println(answer);

	}

}
