package uuu.vgb.test;

public class TestBitwiseOperators {

	public static void main(String[] args) {
		byte b = 127;		
		System.out.println("b:"+b);//127
		byte c = b++;  //b=(byte)(b+1)
		System.out.println("c:"+c);//127
		System.out.println("b:"+b);//-128
		System.out.println("--b:" +--b);
		
		byte a = 7;
		System.out.println(~a); // 0.....00000111 -> 1.....11111000
		System.out.println((byte)0b11111001); 

		System.out.println(6&5);//0.....0000_0110
								//0.....0000_0101
		//----------------------------------------
								//0.....0000_0100 , print 4
		
		
		System.out.println(6|5);//0.....0000_0110
								//0.....0000_0101
		//----------------------------------------
								//0.....0000_0111 , print 7

		System.out.println(6^5);//0.....0000_0110
								//0.....0000_0101
		//----------------------------------------
								//0.....0000_0011 , print 3

		
		System.out.println(5&3);//0.....0000_0101(已被劃位的為1)
								//0.....0000_0011(想要買2張)
		//----------------------------------------		
								//0.....0000_0001 , print 1，沒空位(&)
		

		System.out.println(5|3);//0.....0000_0101
								//0.....0000_0011
		//----------------------------------------		
								//0.....0000_0111 , print 7，不應劃位(|)
		
		
		System.out.println(5&(3<<3));//0.....00000101
									 //0..00000011000
//----------------------------------------------------		
		 							 //0.....00000000 , print 0，表示有空位(&)

		System.out.println(5|(3<<3));//0.....00000101
									 //0..00000011000
//----------------------------------------		
									 //0.....00011101 , print 29，劃位成功(|)

										//000000 0011000>>1
									  //0..0000000000110
		System.out.println(136&(24>>2));//0.....00101000		 							 
//----------------------------------------------------		
		 							 //0.....00000000 , print 0，表示有空位(&)

										 //000000 0011000>>1
									  //0..00000000000110
		System.out.println(136|(24>>2));//0......00101000		
//----------------------------------------		
		 							    //0......01011100 , print 142，劃位成功(|)
		System.out.println(Math.pow(2, 6));
		System.out.println(2<<5);
		
								//111.....1011
								//11111.....10
		System.out.println(-4>>1); //-2

								  //00..00011000
		System.out.println(24>>2);//0000..000110, print 6
		
								 //111.....1011
								 //00111.....10
		System.out.println(-4>>>1); //2147483646
	
	}

}
