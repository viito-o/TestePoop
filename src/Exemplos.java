public class Exemplos {
    private static void sayHelloManyTimes(int times){
        for (int i = 0; i < times; i++){
            sayHello();
        }
    }
    private static void sayHello() {
        System.out.println("Olá mundinho safadito!!");
    }
    public static void main(String[] args) {
        sayHelloManyTimes(5);
    }
}
