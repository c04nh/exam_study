package Package;
class TrimExam3_8 {
	public static void main(String[] args) {
		String strData1 = " I love You ";
		String strData2;
		strData2 = strData1.trim();
		System.out.println("strData2.trim() -> " + strData2);
		if(strData1.contentEquals(strData2)) 
			System.out.println("����");
		else
			System.out.println("�ٸ�");
	}

}
