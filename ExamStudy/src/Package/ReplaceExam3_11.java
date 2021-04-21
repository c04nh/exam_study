package Package;
class ReplaceExam3_11 {
	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer("java Programing");
		StringBuffer sb2 = null;
		sb2 = sb1.replace(0, 4, "JAVA");
		System.out.println("sb2 = " + sb2);
	}

}
