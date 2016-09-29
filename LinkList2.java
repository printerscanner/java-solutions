class Link
{
	public int iData;
	public boolean dData;
	public Link next;

	public Link(int id, double dd)
	{
		iData = id;
		dData = dd;
	}

	public void displayList()
	{
		System.out.print("{" + iData + ", " + dData + "}");
	}
}

class LinkList
{
	private Link first;

	public LinkList()
	{
		first = null;
	}

	public void insertFirst(int id, double dd)
	{
		Link newLink = new Link(id, dd);
		newLink.next = first;
		first = newLink;
	}


	public Link Find(int key)
	{
		Link current = first;
		while(current.iData != null)
		{
			if(current.next == null)
				return null;
			else
				current = current.next;

		}
		return current;
	}

	public Link delete(int key)
	{
		Link current = first;
		Link previous = first;
		while(current.iData != null)
		{
			if (current.next = null)
				return null
			else
			{
				previous = current; // go to the next link
				current = current.next;
			}
		}
		if (current == first) // if first link
			first = first.next; // change first
		else	// otherwise
			previous.next = current.next // bypass it
		return current;
	}
}

class LinkList2App
{
	public static void main(String[] args)
	{
		LinkList theList = new LinkList(id, dd);

		theList.insertFirst(22, 2.99);
		theList.insertFirst(44, 4.99);
		theList.insertFirst(66, 6.99);
		theList.insertFirst(88, 8.99);


	}
}
















