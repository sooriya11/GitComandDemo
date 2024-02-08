package enacapsulation;

public class LearnThreadLocal {
	private static ThreadLocal<Integer> ccpin = new ThreadLocal<Integer>();
	
	private void setpin() {
		ccpin.set(9876);
	}
		
		public int getpin() {
			return ccpin.get();
			
		}
		
		public static void main(String[] args) {
			LearnThreadLocal ltl = new LearnThreadLocal();
			ltl.setpin();
			System.out.println(ltl.getpin());
			
		}
		
	}


