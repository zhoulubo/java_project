package enumproject;

import java.util.Scanner;

// 使用枚举实现单例模式
public class MainClass {

	public static void main(String[] args) {
		Scanner scanner = null;

		StaticInnerClass staticInnerClass = new StaticInnerClass("innerClass", 111);
		OuterClass outerClass = new OuterClass("outerClass", 222);

		System.out.print("the innerName is : " + staticInnerClass.name + "\n");
		System.out.print("the innerValue is : " + staticInnerClass.value + "\n");

		while (true) {
			System.out.print("intput color you want \n");
			scanner = new Scanner(System.in);
			if (scanner.hasNextLine()) {
				String nextLine = scanner.nextLine();
				if (nextLine != null) {
					if (nextLine.toLowerCase().equals("close")) {
						break;
					}else if(nextLine.toLowerCase().equals("test")){
//						test();
					}

					try {
						Color color = Color.valueOf(nextLine.toUpperCase());
						System.out.print("the input color is : " + nextLine + "\n");
						String redName = color.getColorName();
						int redValue = color.getColorValue();
						System.out.print("redName " + redName + " redValue " + redValue + "\n");
					} catch (java.lang.IllegalArgumentException e) {
						System.out.print("color not found in define ,please type again \n ");
					} finally {

					}
				} else {

				}
			}
		}
		if (scanner != null) {
			scanner.close();
		}

	}

	private void test() {
		StaticInnerClass staticInnerClass = new StaticInnerClass("staticInnerClass in test ", 111);
		InnerClass innerClass = new InnerClass("innerClass in test ", 222);
		System.out.print("the innerName is : " + staticInnerClass.name + "\n");
		System.out.print("the innerValue is : " + staticInnerClass.value + "\n");
		System.out.print("the innerName is : " + innerClass.name + "\n");
		System.out.print("the innerValue is : " + innerClass.value + "\n");
	}

	/**
	 * 
	 * @author Administrator 静态内部类
	 */
	static class StaticInnerClass {

		private String name;

		private int value;

		public StaticInnerClass(String name, int value) {
			this.name = name;
			this.value = value;
		}

		public String getColorName() {
			return name;
		}

		public int getColorValue() {
			return value;
		}
	}

	/**
	 * 
	 * @author Administrator
	 *
	 *         非静态内部类
	 *
	 */
	class InnerClass {

		private String name;

		private int value;

		public InnerClass(String name, int value) {
			this.name = name;
			this.value = value;
		}

		public String getColorName() {
			return name;
		}

		public int getColorValue() {
			return value;
		}
	}

}

class OuterClass {

	private String name;

	private int value;

	public OuterClass(String name, int value) {
		this.name = name;
		this.value = value;
	}

	public String getColorName() {
		return name;
	}

	public int getColorValue() {
		return value;
	}
}

/**
 * 使用枚举类型实现单例模式，枚举类型天然支持单实例操作，同时避免了反序列化是单实例被破坏的问题，因为枚举类型是不是通过反射调用构造函数进行实例的构造的
 * @author Administrator
 *
 */
enum Color {
	RED("red", 1111), BLACK("black", 2222), WHITE("white", 3333);

	private String name;

	private int value;

	private Color(String name, int value) {
		this.name = name;
		this.value = value;
	}

	public String getColorName() {
		return name;
	}

	public int getColorValue() {
		return value;
	}

}
