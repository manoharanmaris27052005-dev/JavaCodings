package ArraryList;

import java.util.HashSet;

class HashSetExample {

	public static void main(String[] args) {
		
		HashSet<String> hash = new HashSet<>();
		hash.add("MARIS");
		hash.add("VIRAT");
		hash.add("VIRAT");
		hash.stream().forEach(x -> System.out.println(x));
		
		
		
	}
}