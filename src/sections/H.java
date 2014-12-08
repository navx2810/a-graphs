package sections;

import entities.PathFinder;
import graphs.WDGraph;

public class H {

	public H(WDGraph graph) 
	{
		System.out.println("***************************************************************\n*****\tProgram Output for Section H\t*****\n***************************************************************");
		
		PathFinder finder = new PathFinder(graph, graph.nodes.get(2), graph.nodes.get(4));
		finder.findBestPath();
		System.out.println("\n\n");
	}

}
