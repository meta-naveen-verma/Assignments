
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Poly {
	private final double[] coefficient;
	private final int[] exponent;
	public Poly(double[] coefficient, int[] exponent){
		this.coefficient = coefficient;
		this.exponent = exponent;
	}
	public double[] getCoefficient(){
		return coefficient;
	}
	public int[] getExponent(){
		return exponent;
	}
	public float evaluate(float value){
		float result=0;
		for(int i=0;i<coefficient.length;i++){
			result+= coefficient[i] *Math.pow(value, exponent[i]);
		}
		return result;
	}
	public int getDegree(){
		int[] arr = exponent.clone();
		Arrays.sort(arr);
		return arr[arr.length-1];
	}
	public static Poly addPoly(Poly p1, Poly p2){
		List<Double> reCo=new ArrayList<>();
		List<Integer> reEx=new ArrayList<>();
		for(int i=0 ; i< p1.exponent.length ; i++){
			for(int j=0;j<p2.exponent.length;j++){
				if(p1.exponent[i]== p2.exponent[j]){
					reCo.add(p1.coefficient[i]+p2.coefficient[j]);
					reEx.add(p1.exponent[i]);
				}
			}
			if(!reEx.contains(p1.exponent[i])){
				reCo.add(p1.coefficient[i]);
				reEx.add(p1.exponent[i]);
			}
		}
		for(int i=0;i<p2.exponent.length;i++){
			if(!reEx.contains(p2.exponent[i])){
				reCo.add(p2.coefficient[i]);
				reEx.add(p2.exponent[i]);
			}
		}
		double coefficient[] = new double[reCo.size()];
		int exponent[] = new int[reEx.size()];
		int i=0;
		for(double d: reCo){
			coefficient[i++]=d;
		}
		i=0;
		for(int e: reEx){
			exponent[i++]=e;
		}
		return new Poly(coefficient,exponent);
	}
	public static Poly mulPoly(Poly p1, Poly p2){
		int[] exponent = new int[p1.exponent.length*p2.exponent.length];
		double[] coefficient = new double[p1.exponent.length*p2.exponent.length];
		int index=0;
		for(int i=0 ; i< p1.exponent.length ; i++){
			for(int j=0;j<p2.exponent.length;j++){
				exponent[index]=p1.exponent[i]*p2.exponent[j];
				coefficient[index]=p1.coefficient[i]*p2.coefficient[j];
				index++;
			}
		}
		return new Poly(coefficient,exponent);
	}
}
