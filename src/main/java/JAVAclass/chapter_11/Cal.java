package JAVAclass.chapter_11;

public class Cal {
    int result;
    public void sum(int a, int b){
        result = a + b;
    }
}
class A extends Cal{
    @Override
    public void sum(int a, int b) {
        result = a *b;
    }

    public static void main(String[] args) {
        Cal result2 = new Cal();

        result2.sum(1,2);
        System.out.println(result2.result);
    }
}
