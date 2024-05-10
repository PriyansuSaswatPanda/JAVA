import java.util.*;
public class revNum {
	public static void main(String args[]) {
		System.out.println(subSeq("","abc"));
	}
	static ArrayList<String> subSeq(String p,String up) {
		if(up.isEmpty()) {
			ArrayList<String> list = new ArrayList<>();
			list.add(p);
			return list;
		}
		char ch = up.charAt(0);
		
		ArrayList<String> left = subSeq(p + ch , up.substring(1));
		ArrayList<String> right = subSeq(p , up.substring(1));
		
		left.addAll(right);
		return left;
	}
}
