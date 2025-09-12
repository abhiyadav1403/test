// package Day3;

public class BitwiseOperator {
    public static void main(String [] args){
        int a = 12;
        int b = 10;
        System.out.println("Number : a" + a + "(Binary : " + Integer.toBinaryString(a)+")");
        System.out.println("Number : b" + b + "(Binary : " + Integer.toBinaryString(b)+")");

        int andResult = a & b;
        System.out.println(Integer.toBinaryString(a) + "&" + Integer.toBinaryString(b) + "=" + Integer.toBinaryString(andResult));
    
        // System.out.println(Integer.toBinaryString(a) + "&" + Integer.toBinaryString(a) + "=" + Integer.toBinaryString(andResult));
         System.out.println("Bitwise AND:" + a + "&" + b + "=" + andResult + "(Binary :" + Integer.toBinaryString(andResult)+")"); 


         int orResult = a | b;
         System.out.println("Bitwise OR:" + orResult);

         int xorResult = a ^ b;
         System.out.println("Bitwise XOR:" + xorResult);

         int notResult = ~a;
         System.out.println("Bitwise NOT:" + notResult);

         int leftShiftResult = a <<2;
         System.out.println("Bitwise left shift:" + leftShiftResult + "(Binary:" + Integer.toBinaryString(leftShiftResult)+")");

         int rightShiftResult = a >>2;
         System.out.println("Bitwise right shift" + rightShiftResult);
         int unsignedRightShiftResult = a >> 2;
         System.out.println(unsignedRightShiftResult);
    }
    
}
