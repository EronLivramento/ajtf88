
/**
 * @course AJ4
 * @chapter 01
 * @page 037
 * @sample 01.15
 */
public class Outer {

	private int o1;
	private String o2;

	static class InnerEstatica {
		public void x(){

		}
	}

	class InnerNaoEstatica {
		public void x(){
		}
	}

	public void aMethod(){
		class InnerDeMetodo{
		}

	}
}
