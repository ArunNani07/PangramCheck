package cloud_vandana_test_1;

import java.util.TreeSet;

public class PangramCheck {
  public static String pangram(String s) {
	  s=s.replaceAll(" " , "");
	  s=s.toLowerCase();
	  TreeSet<Character> treeSet=new TreeSet<>();
	  for(int i=0;i<=s.length()-1;i++) {
		  treeSet.add(s.charAt(i));
	  }
	  
	  if(treeSet.size()==26) {
		  return "PANGARM";
	  }
	  else {
		return "NOT PANGRAM";
	}
  }
  public static void main(String[] args) {
	String value="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	String v=pangram(value);
	System.out.println(v);
}
}
