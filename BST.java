import java.lang.*;
import java.io.*;
class BST{
    public static void main (String[]args) throws IOException
    {
        BufferedReader br =new BufferedReader (new InputStreamReader (System.in));
        int n, i, j, a;
        System.out.print ("Enter N value:");
        n = Integer.parseInt (br.readLine ());
    
        for (i = n; i >= 1; i--)
        {
	        a = (i * (i - 1)) + 1;
	        for (j = 1; j < n; j++)
	        {
	            System.out.print ((a++) + "*");
	        }
	        System.out.println(a++);
        }
    }
}