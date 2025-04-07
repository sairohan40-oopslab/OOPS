class Multiplier { public void multiply(int a, int b) { int result = a * b; System.out.println("Multiplication of two 
numbers: " + result); }
public void multiply(int a, int b, int c) {
 int result = a * b * c;
 System.out.println("Multiplication of three numbers: " + result);
}
public void multiply(int a, int b, int c, int d) {
 int result = a * b * c * d;
 System.out.println("Multiplication of four numbers: " + result);
}
}
public class MultiplierExample { public static void main(String[] args) { Multiplier multiplier = new Multiplier();
 multiplier.multiply(2, 3);
 multiplier.multiply(2, 3, 4);
 multiplier.multiply(2, 3, 4, 5);
}
}
