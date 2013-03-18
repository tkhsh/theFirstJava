public class Sample5_5 {
	public static void main(String[] args) {
		long longValue = 1;
		int intValue = 2;
		short shortValue = 3;
		byte byteValue = 4;

		System.out.println("最初の値");
		System.out.println(longValue);
		System.out.println(intValue);
		System.out.println(shortValue);
		System.out.println(byteValue);

		longValue = intValue;
		intValue = shortValue;
		byteValue = (byte) shortValue;
		longValue = intValue;

		System.out.println("代入後の値");
		System.out.println(longValue);
		System.out.println(intValue);
		System.out.println(shortValue);
		System.out.println(byteValue);
	}
}
