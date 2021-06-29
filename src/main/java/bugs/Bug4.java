package bugs;

/**
 * Проанализируй почему сравнение 2 строк name и name2 при == дает true
 *         String name = "Test";
 *         String name2 = "Test";
 * но если я напишу
 *         String name = "Test";
 *          String name2 = new String("Test"); то == уже работать не будет?
 *
 * как можно сделать так, чтобы == даже при варианте, описанным выше работал
 * то-есть
 * String name = "Test";
 * String name2 = new String("Test");
 * System.out.println(name == name2);// вернет true <<< что нужно поправить/дописать здесь(строки объявления переменных трогать не нужно)
 *
 * *
 */
public class Bug4 {
    public static void main(String[] args) {
        String name = "Test";
        String name2 = "Test";

        System.out.println(name == name2);// вернет true


        String name3 = "Test";
        String name4 = new String("Test");
        System.out.println(name3 == name4.intern());// false > а нужно true

    }
}
