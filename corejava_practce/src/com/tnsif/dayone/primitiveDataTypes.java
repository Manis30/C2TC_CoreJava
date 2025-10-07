package com.tnsif.dayone;

public class primitiveDataTypes {

	public static void main(String[] args) {
		byte bm=127;
		byte bs=-128;
		System.out.println("Min and max in bytes are:"+bs+" "+bm);
		short sm=32767;
		short ss=-32768;
		System.out.println("Min and max in short are:"+ss+" "+sm);
		int im=2147483647;
		int is=-2147483648;
		System.out.println("Min and max in int are:"+is+" "+im);
		long lm=9223372036854775807L;
		long ls=-9223372036854775808L;
		System.out.println("Min and max in long are:"+ls+" "+lm);
		float fl=34.564f;
		double dl=43.59787864873f;
		System.out.println("Float and double values are: "+fl+" "+dl);
		boolean flag=false;
		System.out.println(flag);
	}

}
