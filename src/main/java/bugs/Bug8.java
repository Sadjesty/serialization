package bugs;

/**
 * Подумай над порядком инициализации
 * Какой конструктор вызывается за каким
 * Устрани StackOverflowError
 */

public class Bug8 {
    public static void main(String[] args) {
        new A1();
    }
}

class A1 {
    private A2 a2 = new A2();
}

class A2 {
    private A3 a3 = new A3();
}


class A3 {
}
