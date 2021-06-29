package bugs;

/**
 * Подумай над порядком инициализации
 * Какой конструктор вызывается за каким
 * Устрани StackOverflowError
 */
public class Bug6 {
    public static void main(String[] args) {
        new A();
    }
}

class A extends B{
    public A() {
        new B();
    }
}


class B {


}
