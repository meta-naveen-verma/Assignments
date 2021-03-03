import java.util.Arrays;
public class MainPoly {

	public static void main(String[] args) {
		Poly p1 = new Poly(new double[]{2,3.5}, new int[]{2,1});
		Poly p2 = new Poly(new double[]{3,5}, new int[]{2,1});
		Poly add = Poly.addPoly(p1, p2);
		Poly mul = Poly.mulPoly(p1, p2);
		System.out.println(p1.evaluate(4));
		System.out.println(Arrays.toString(add.getCoefficient())+"\n"
				+ Arrays.toString(add.getExponent()));
		System.out.println(Arrays.toString(mul.getCoefficient())+"\n"
				+ Arrays.toString(mul.getExponent()));
			

	}

}
