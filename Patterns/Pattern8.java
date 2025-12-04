public class Pattern8 {
	public static void main(String[] args) {
		int n=5;
		for(int row=0; row<2*n; row++)
        {
		    int totalcolinrow = row>n?2*n-row:row;
		    for(int col=0; col<totalcolinrow; col++)
        {
		    System.out.print("* ");
		}
		System.out.println();
		}
	}
}