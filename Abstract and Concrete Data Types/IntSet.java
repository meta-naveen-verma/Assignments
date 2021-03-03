import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;


public class IntSet {
	private int[] arr;
	public IntSet(int[] ar){
		HashSet<Integer> set = new HashSet<>(Arrays.stream(ar)
													.boxed()
													.collect(Collectors.toList()));
		this.arr = new int[set.size()];
		int index=0;
		for(int a:set){
			this.arr[index++]=a;
		}
	}
	public int[] getIntSet(){
		return arr;
	}
	public boolean isMember(int key){
		for (int a: arr) {
			if(a == key){
				return true;
			}
		}
		return false;
	}
	public int size(){
		return arr.length;
	}
	public boolean isSubSet(IntSet subSet){
		for (int a : subSet.getIntSet()) {
			if(!this.isMember(a)){
				return false;
			}
		}
		return true;
	}
	public static int[] union (IntSet set1, IntSet set2){
		List<Integer> newList = new ArrayList<Integer>();
		for (int a : set1.arr) {
			newList.add(a);
		}
		for (int a : set2.getIntSet()) {
			if(!set1.isMember(a)){
				newList.add(a);
			}
		}
		int[] union = new int[newList.size()];
		int index=0;
		for(int a:newList){
			union[index++]=a;
		}
		return union;
	}
	public int[] getComplement(){
		int[] complement = new int[1000-arr.length+1];
		int index=0;
		for(int i=1;i<1000;i++){
			if(!isMember(i)){
				complement[index++]=i;
			}
		}
		return complement;
	}
}
