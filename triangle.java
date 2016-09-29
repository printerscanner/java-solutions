import java.io*;

class TriangleApp
{
	static int theNumber;

	public static void main(String[] args) throws I0Exception
	{
		public static int triangle(int n)
		{
			System.out.println("Entering: n=" + n);
			if (n==1)
			{
				System.out.print(returning 1);
				return 1;
			} else {
				int temp = n + triangle(n-1);
				System.out.println("Returning " + temp);
				return temp;
			}
		}

	public static String getString() throws I0Exception
	{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String s = br.readLine();
		return s;
	}
	public static int getInt() throws I0Exception
	{
		string s = getString();
		return Integer.parseInt(s);
	}
}