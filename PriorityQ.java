class PriorityQ 
{
	private int maxSize;
	private long[] queArray;
	private int nItems;

	public PriorityQ(int s)
	{
		maxSize = s;
		queArray = new long[maxSize];
		nItems = 0;
	}

	public void insert(long item)
	{
		int j;

		if(nItems ==0)
			queArray[nItems++] = item;
		else 
		{
			for (j=nItems-1; j>=0; j--) // start at the top
			{
				if (item > queArray[j]) // if new item is longer
					queArray[j+1] = queArray[j];
				else
					break;		
			}
			queArray[j+1] = item;
			nItems++;
		}
	}

	public long remove()
	{ return queArray[--nItems];}

	public long peakMin()
	{ return queArray[nItems-1];}

	public boolean isEmpty()
	{ return (nItems == 0);}

	public boolean isFull()
	{ return (nItems == maxSize);}

} // end class PriorityQ

class PriorityQApp
{
	public static void main(String[] args) 
	{
		PriorityQ thePQ = new PriorityQ(5);

		thePQ.insert(20);
		thePQ.insert(50);
		thePQ.insert(30);
		thePQ.insert(40);
		thePQ.insert(10);

		while( !thePQ.isEmpty())
		{
			long item = thePQ.remove();
			System.out.print(item + " ");
		}
	System.out.println(" ");
	}		
}













