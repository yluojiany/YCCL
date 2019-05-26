public class No {
	public static int parselnt(String a1) throws Exception {
		if (a1 == null) {
			throw new Exception("²»ÄÜÁô¿Õ");
		}
		int a2 = 0;
		a2 = Integer.valueOf(a1);
		return a2;
	}

	public static void main(String[] args) {

		try {
			int n = No.parselnt(null);
			System.out.println(n);
		} catch (Exception e) {
			System.out.println(e.toString());
		}

		try {
			int n = No.parselnt("PUBG");
			System.out.println(n);
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
		try {
			int n = No.parselnt("10086");
			System.out.println(n);
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
}
