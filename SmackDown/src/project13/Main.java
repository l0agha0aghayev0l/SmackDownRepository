package project13;

public class Main {
    public static void main(String[] args) {
        int[] i = new int[10];// 0,1,2,3,4,5,6,7,8,9
        int a = 5;
        try {
            i[10] = 15;
            a /= 0;
        } catch (ArrayIndexOutOfBoundsException exception){
            throw new ArrayIndexOutOfBoundsException();
        } catch (ArithmeticException exception){
            System.out.println("На ноль делить нельзя");
        } finally {
            System.out.println("Some Code");
        }
        System.out.println("Hello");
    }

    public void method() throws ArithmeticException{

    }
}
