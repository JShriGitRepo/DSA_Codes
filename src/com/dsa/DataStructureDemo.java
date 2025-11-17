package com.dsa;

import java.util.*;

public class DataStructureDemo {

	static Scanner sc = new Scanner(System.in);

	// Arrays demo
	static void arrayDemo() {
		System.out.println("\n---1D Array---");
		int[] arr = { 1, 2, 3, 4, 5 };
		System.out.println(Arrays.toString(arr));

		System.out.println("\n---ArrayList---");
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10, 20, 30));
		System.out.println(list);

		System.out.println("\n---Vector---");
		Vector<Integer> vector = new Vector<>(Arrays.asList(100, 200, 300));
		System.out.println(vector);

		System.out.println("\n---2D Array (Matrix)---");
		int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		for (int[] row : matrix)
			System.out.println(Arrays.toString(row));
	}

	// Linked List demo
	static void linkedListDemo() {
		System.out.println("\n---Linked List Demo---");
		Node head = new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(30);

		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " -> ");
			temp = temp.next;
		}
		System.out.println("null");
	}

	// Stack demo
	static void stackDemo() {
		System.out.println("\n---Stack Demo---");
		Stack<Integer> stack = new Stack<>();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		System.out.println("Stack: " + stack);
		System.out.println("Popped: " + stack.pop());
		System.out.println("Stack now: " + stack);
	}

	// Queue demo
	static void queueDemo() {
		System.out.println("\n---Queue Demo---");
		Queue<Integer> queue = new LinkedList<>();
		queue.add(1);
		queue.add(2);
		queue.add(3);
		System.out.println("Queue: " + queue);
		System.out.println("Removed: " + queue.remove());
		System.out.println("Queue now: " + queue);
	}

	// Binary tree demo
	static void treeDemo() {
		System.out.println("\n---Binary Search Tree Demo---");
		BinaryTree tree = new BinaryTree();
		tree.root = tree.insertBST(tree.root, 50);
		tree.insertBST(tree.root, 30);
		tree.insertBST(tree.root, 70);
		tree.insertBST(tree.root, 20);
		tree.insertBST(tree.root, 40);
		tree.insertBST(tree.root, 60);
		tree.insertBST(tree.root, 80);
		System.out.print("Inorder Traversal: ");
		tree.inorder(tree.root);
		System.out.println();
	}

	// Graph demo
	static void graphDemo() {
		System.out.println("\n---Graph Demo---");
		Graph g = new Graph(5);
		g.addEdge(0, 1);
		g.addEdge(0, 4);
		g.addEdge(1, 2);
		g.addEdge(1, 3);
		g.addEdge(1, 4);
		g.addEdge(2, 3);
		g.addEdge(3, 4);
		g.display();
	}

	// Searching & sorting demo
	static void searchSortDemo() {
		System.out.println("\n---Search & Sort Demo---");
		int[] arr = { 5, 2, 8, 1, 3 };
		Arrays.sort(arr);
		System.out.println("Sorted Array: " + Arrays.toString(arr));

		int key = 3;
		int index = -1;
		for (int i = 0; i < arr.length; i++)
			if (arr[i] == key)
				index = i;
		System.out.println("Linear search index of " + key + ": " + index);

		index = Arrays.binarySearch(arr, key);
		System.out.println("Binary search index of " + key + ": " + index);

		for (int i = 0; i < arr.length - 1; i++)
			for (int j = 0; j < arr.length - 1 - i; j++)
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
		System.out.println("Bubble Sorted: " + Arrays.toString(arr));
	}

	// Greedy algorithm: Fractional Knapsack
	static void greedyDemo() {
		System.out.println("\n---Greedy Algorithm: Fractional Knapsack---");
		int W = 50;
		int[] value = { 60, 100, 120 };
		int[] weight = { 10, 20, 30 };
		double totalValue = 0;
		double[] ratio = new double[value.length];
		for (int i = 0; i < value.length; i++)
			ratio[i] = (double) value[i] / weight[i];

		Integer[] index = { 0, 1, 2 };
		Arrays.sort(index, (i, j) -> Double.compare(ratio[j], ratio[i]));

		int capacity = W;
		for (int i : index) {
			if (weight[i] <= capacity) {
				capacity -= weight[i];
				totalValue += value[i];
			} else {
				totalValue += value[i] * ((double) capacity / weight[i]);
				break;
			}
		}
		System.out.println("Maximum value: " + totalValue);
	}

	// Shortest path: Dijkstra
	static void dijkstraDemo() {
		System.out.println("\n---Dijkstra's Shortest Path---");
		int[][] graph = { { 0, 10, 0, 0, 5 }, { 0, 0, 1, 0, 2 }, { 0, 0, 0, 4, 0 }, { 7, 0, 6, 0, 0 },
				{ 0, 3, 9, 2, 0 } };
		int V = graph.length;
		int src = 0;
		int[] dist = new int[V];
		boolean[] sptSet = new boolean[V];
		Arrays.fill(dist, Integer.MAX_VALUE);
		dist[src] = 0;

		for (int count = 0; count < V - 1; count++) {
			int u = -1;
			for (int i = 0; i < V; i++)
				if (!sptSet[i] && (u == -1 || dist[i] < dist[u]))
					u = i;
			sptSet[u] = true;
			for (int v = 0; v < V; v++)
				if (graph[u][v] != 0 && !sptSet[v] && dist[u] + graph[u][v] < dist[v])
					dist[v] = dist[u] + graph[u][v];
		}

		System.out.println("Vertex Distance from Source:");
		for (int i = 0; i < V; i++)
			System.out.println(i + " -> " + dist[i]);
	}

	// Main menu
	public static void main(String[] args) {
		while (true) {
			System.out.println("\n---All-in-One Java Demo---");
			System.out.println("1. Arrays & Matrix");
			System.out.println("2. Linked List");
			System.out.println("3. Stack");
			System.out.println("4. Queue");
			System.out.println("5. Binary Tree");
			System.out.println("6. Graph");
			System.out.println("7. Searching & Sorting");
			System.out.println("8. Greedy Algorithm");
			System.out.println("9. Dijkstra's Algorithm");
			System.out.println("0. Exit");
			System.out.print("Choose an option: ");
			int choice = sc.nextInt();
			switch (choice) {
			case 1 -> arrayDemo();
			case 2 -> linkedListDemo();
			case 3 -> stackDemo();
			case 4 -> queueDemo();
			case 5 -> treeDemo();
			case 6 -> graphDemo();
			case 7 -> searchSortDemo();
			case 8 -> greedyDemo();
			case 9 -> dijkstraDemo();
			case 0 -> {
				System.out.println("Exiting...");
				return;
			}
			default -> System.out.println("Invalid choice!");
			}
		}
	}
}

// Supporting classes
class Node {
	int data;
	Node next;
	Node left, right;

	Node(int data) {
		this.data = data;
		this.next = null;
		this.left = this.right = null;
	}
}

class BinaryTree {
	Node root;

	Node insertBST(Node root, int data) {
		if (root == null)
			return new Node(data);
		if (data < root.data)
			root.left = insertBST(root.left, data);
		else
			root.right = insertBST(root.right, data);
		return root;
	}

	void inorder(Node node) {
		if (node != null) {
			inorder(node.left);
			System.out.print(node.data + " ");
			inorder(node.right);
		}
	}
}

class Graph {
	private int V;
	private LinkedList<Integer>[] adjList;

	@SuppressWarnings("unchecked")
	Graph(int v) {
		V = v;
		adjList = (LinkedList<Integer>[]) new LinkedList[v];
		for (int i = 0; i < v; i++)
			adjList[i] = new LinkedList<>();
	}

	void addEdge(int u, int v) {
		adjList[u].add(v);
		adjList[v].add(u);
	}

	void display() {
		for (int i = 0; i < V; i++) {
			System.out.print(i + " -> ");
			for (int node : adjList[i])
				System.out.print(node + " ");
			System.out.println();
		}
	}
}
