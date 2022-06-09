package com.assignment2;
	public class WrapperClassConvert 
	{ 
		public static void convertToWrapper(Object primitive){
	if(primitive instanceof Integer) {
	Integer in = (Integer) primitive;
	System.out.println(in);
	}
	else
	if(primitive instanceof Character) {
	Character ch = (Character) primitive;
	System.out.println(ch);
	}
	else
	if(primitive instanceof Byte) {
	Byte by = (Byte) primitive;
	System.out.println(by);
	}
	else
	if(primitive instanceof Short) {
	Short sh = (Short) primitive;
	System.out.println(sh);
	}
	else
	if(primitive instanceof Long) {
	Long l = (Long) primitive;
	System.out.println(l);
	}
	else
	if(primitive instanceof Float) {
	Float f = (Float) primitive;
	System.out.println(f);
	}
	else
	if(primitive instanceof Double) {
	Double d = (Double) primitive;
	System.out.println(d);
	}
	else
	if(primitive instanceof Boolean) {
	Boolean boo = (Boolean) primitive;
	System.out.println(boo);
	}
	else {
	System.out.println("Give proper primitive as input");
	}
	}
	public static void main(String[] args) {
	char ch = 'v';
	byte b = 16;
	short sc = 29;
	int n = 875;
	long ln = 243987;
	float fl = 25387f;
	double du = 89786.11;
	boolean bo = false;
	convertToWrapper(ch);
	convertToWrapper(b);
	convertToWrapper(sc);
	convertToWrapper(n);
	convertToWrapper(ln);
	convertToWrapper(fl);
	convertToWrapper(du);
	convertToWrapper(bo);
	}}


