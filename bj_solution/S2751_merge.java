package bj_solution;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class S2751_merge {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int rp = Integer.parseInt(br.readLine());
	
		List<Integer> num = new ArrayList<>();
		
		for (int i = 0; i < rp; i++) {
			num.add(Integer.parseInt(br.readLine()));
		}
		br.close();
		
		List<Integer> result = new ArrayList<>();
		result.addAll(sort(num));
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		for (int i = 0; i < rp; i++) {
			String s = String.valueOf(result.get(i));
			bw.write(s+"\n");
		}

		bw.flush();
		bw.close();

	}
	
	public static List<Integer> sort(List<Integer> target) {

	    if (target.size() > 1) {
	        return merge(
	            sort(target.subList(0, target.size() / 2)),
	            sort(target.subList(target.size() / 2, target.size()))
	        );
	    } else {
	        return target;
	    }
	    
	}

	public static List<Integer> merge (List<Integer> left, List<Integer> right) {

	    List<Integer> result = new ArrayList<>();	    
	    int rightIdx = 0;

	    for (Integer l : left) {
	        while (right.size() > rightIdx && l > right.get(rightIdx)) {
	            result.add(right.get(rightIdx));
	            rightIdx++;
	        }
	        result.add(l);
	    }

	    for (int i = rightIdx; i < right.size(); i++) {
	        result.add(right.get(i));
	    }
	    
	    return result;
	    
	}

}
