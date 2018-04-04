
public class LCS {
	
	public int lcs(char a[],char b[],int l,int m) {
		int C[][] = new int[l+1][m+1];
		for (int i = 0;i<=l;i++){
			for (int j = 0;j<=m;j++) {
				if (i == 0 || j == 0)
		            C[i][j] = 0;
				else if (a[i-1] == b[j-1]){
					C[i][j] =  C[i-1][j-1] + 1;
				}else {
					C[i][j] = max(C[i-1][j],C[i][j-1]);
				}
			}
			
		}
		
		
		return C[l][m];
	}
	public int max(int a,int b){
		return (a>b)? a:b;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LCS lcs = new LCS();
		    String s1 = "AGGTAB";
		    String s2 = "GXTXAYB";
		 
		    char[] X=s1.toCharArray();
		    char[] Y=s2.toCharArray();
		    int m = X.length;
		    int n = Y.length;
		 
		    System.out.println("Length of LCS is" + " " +
		                                  lcs.lcs( X, Y, m, n ) );

	}

}
