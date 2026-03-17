package JavaTest;
import java.util.HashMap;
import java.util.Map;

public class StringFrequency {

	public static void main(String[] args) {
		String str="manikandan";
		HashMap<Character,Integer>Hash=new HashMap<>();
		for(char c:str.toCharArray()) {
			if(Hash.containsKey(c)) {
				Hash.put(c,Hash.get(c)+1);
			}
			else
			{
				Hash.put(c,1);
			}
		}
			for(char C :Hash.keySet()){
				System.out.println(C+"-"+Hash.get(C));
			
		}
			
		}
			
		}