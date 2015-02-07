
/**
 * @course AJ4
 * @chapter 01
 * @page 038
 * @sample -
 */

public class MainOuter {

	public static void main(String[] args) {
		Outer.InnerEstatica i = new Outer.InnerEstatica();

		Outer.InnerNaoEstatica i2 = new Outer().new InnerNaoEstatica();

		Outer o = new Outer();
		Outer.InnerNaoEstatica i3 = o.new InnerNaoEstatica();
	}
}
