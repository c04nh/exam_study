package Package;
class SubstringExam3_9 {
	public static void main(String[] args) {
		String strData1 = "I love You";
		String strData3;
		strData3 = strData1.substring(7);
		System.out.println("strData3.substring(7) -> " + strData3);
		strData3 = strData1.substring(2, 5);
		System.out.println("strData3.substring(2, 5) -> " + strData3);
	}
}
