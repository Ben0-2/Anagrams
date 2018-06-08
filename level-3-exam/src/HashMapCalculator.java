import java.util.HashMap;

public class HashMapCalculator {

	public int commonKeyValuePairs(HashMap<String, String> hashmap1, HashMap<String, String> hashmap2) {
		int numOfSamePairs = 0;
		// TODO Auto-generated method stub
		for(String s1: hashmap1.keySet()) {
			for(String s2: hashmap2.keySet()) {
				if(s1.equals(s2)) {
					if(hashmap1.get(s1).equals(hashmap2.get(s2))) {
						numOfSamePairs+=1;
					}
				}
			}
		}
			
		
		return numOfSamePairs;
	}

}
