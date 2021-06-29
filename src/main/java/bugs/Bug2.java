package bugs;


/**
 * Смысл программы ниже - к name "приклеить"(сделать concat http://proglang.su/java/strings-concat) цифер от 0 до 10
 * чтобы была строка User1-0-1-2-3-4-5-6...-10
 */
public class Bug2 {
    public static void main(String[] args) {
        String name = "User1";
        StringBuilder builder = new StringBuilder(name);
        for (int i = 0; i < 10; i++) {
            builder.append(i);
        }

        System.out.println(builder.toString());
    }
}
