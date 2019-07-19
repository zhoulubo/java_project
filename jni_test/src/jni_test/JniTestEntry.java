package jni_test;

public class JniTestEntry {
	public String strField = "javaField";
	public static String staticField = "javaStaticFiled";
	
	static {
		System.loadLibrary("Project1");
	}
	
	// 声明本地方法
	// 要使用javah生成头文件
	// 执行命令要在java的外目录执行，
	// D:\WorkSpaceEclipse\jni_test\src> javah jni_test.jni_test_entry
	public static native String getStringFromC();
	
	// 非静态方法
	public native String nativeMethodAccessJavaField();
	
	
	public void javaPrintMethod(String msg){
		System.out.println("javaPrintMethod " + msg);
	}
	
	public static void javaStaticPrintMethod(String msg){
		System.out.println("javaStaticPrintMethod " + msg);
	}
	
//	public static String javaStaticPrintMethod(String msg){
//		System.out.println("javaStaticPrintMethod " + msg);
//	}
	
	public static void main(String[] args){
		String str = getStringFromC();
		
		System.out.println("java call c getStringFromC : " + str);
		System.out.println("java staticField change to : " + staticField);
		
		JniTestEntry jniTestEntry = new JniTestEntry();
		
		jniTestEntry.nativeMethodAccessJavaField();
		System.out.println("java strField change to : " + jniTestEntry.strField);
	}
	

	
	
	
}