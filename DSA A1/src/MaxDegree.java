import java.util.ArrayList;
import java.util.LinkedList;


public class MaxDegree {
	String str;
	LinkedList<LinkedList<Integer>> ls = new LinkedList<LinkedList<Integer>>();
	MaxDegree(String str){
		this.str=str;
	}
	int calculateMaxDegree(){
		int max=0;
		calculateLinkedList();
		for(LinkedList<Integer> l :ls){
			int sum=0;
			for(int a:l){
				sum+=a;
			}
			if(sum>max){
				max=sum;
			}
		}
		return max;
	}
	void calculateLinkedList(){
		String[] strrr=str.split("[+-]");
		for(String s:strrr){
			LinkedList<Integer> lss = new LinkedList<Integer>();
			for(int i=0;i<s.length();i++){
				if(s.charAt(i)=='x'||s.charAt(i)=='y'){
					if(i==s.length()-1||s.charAt(i+1)=='x'||s.charAt(i+1)=='y'){
						lss.add(1);
					}
					else{
						lss.add(Integer.parseInt(""+s.charAt(i+1)));
					}
				}
			}
			ls.add(lss);
		}
	}
}
