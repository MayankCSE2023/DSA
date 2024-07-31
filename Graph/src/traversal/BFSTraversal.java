package traversal;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/*BFS of graph
Difficulty: EasyAccuracy: 44.09%Submissions: 376K+Points: 2
Given a directed graph. The task is to do Breadth First Traversal of this graph starting from 0.
Note: One can move from node u to node v only if there's an edge from u to v. Find the BFS traversal of the graph starting from the 0th vertex, from left to right according to the input graph. Also, you should only take nodes directly or indirectly connected from Node 0 in consideration.


Example 1:

Input:
V = 5, E = 4
adj = {{1,2,3},{},{4},{},{}}


Output: 
0 1 2 3 4
Explanation: 
0 is connected to 1 , 2 , 3.
2 is connected to 4.
so starting from 0, it will go to 1 then 2
then 3. After this 2 to 4, thus bfs will be
0 1 2 3 4.
Example 2:

Input:
V = 3, E = 2
adj = {{1,2},{},{}}

Output: 
0 1 2
Explanation:
0 is connected to 1 , 2.
so starting from 0, it will go to 1 then 2,
thus bfs will be 0 1 2. 

Your task:
You dont need to read input or print anything. Your task is to complete the function bfsOfGraph() which takes the integer V denoting the number of vertices and adjacency list as input parameters and returns  a list containing the BFS traversal of the graph starting from the 0th vertex from left to right.


Expected Time Complexity: O(V + E)
Expected Auxiliary Space: O(V)*/

public class BFSTraversal {
	public static void main(String[] args) {
		
	}
	
	
	 public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
	        // Code here
	        ArrayList<Integer> bfs= new ArrayList<>();
	        Queue<Integer> q= new LinkedList<>();
	        q.add(0);
	        bfs.add(0);
	        
	        while(!q.isEmpty()){
	            
	            int curr=q.remove();
	            
	            ArrayList<Integer> e = adj.get(curr);
	            
	                for(int j : e){
	                    if(!bfs.contains(j)){
	                        bfs.add(j);
	                        q.add(j);
	                    }
	                }
	            
	            
	        }
	        
	        return bfs;
	    }
}