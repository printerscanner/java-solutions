enum State { Unvisited, Visited, Visiting; }

boolean search(Graph g, Node start, Node end) {
	if (start == end ) return true;

	// operates as Queue
	LinkedList<Node> q = new LinkedList<Node>();

	for (Node u : g.getNodes()) {
		u.state = State.Unvisited;
	}
	start.state = State.Visiting;
	q.add(start);
	while(!q.isEmpty()) {
		u = q.removeFirst();
		if(u != null) {
			
		}
	}
}