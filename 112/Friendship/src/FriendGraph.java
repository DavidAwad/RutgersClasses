import java.util.*;
import java.io.*;
import java.lang.*;

public class FriendGraph {  //graph is implemented as a  ArrayList of linked lists. The head of each list is the person, and the list is their friends
	ArrayList<String, LinkedList<Person>> friends;

	public FriendGraph(ArrayList<String, LinkedList<Person>> partners) {
		friends = partners;

	}

}

