package bugs;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * Устрани ошибку с сериализацией
 */
public class Bug7 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Child child = new Child("Child");
        FileOutputStream fos = new FileOutputStream(new File("file.ser"));
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(child);
        oos.close();

        FileInputStream fis = new FileInputStream(new File("file.ser"));
        ObjectInputStream ois = new ObjectInputStream(fis);
        Object obj = ois.readObject();
        ois.close();

        Child castChild = (Child) obj;

        System.out.println(castChild.getParentString());
        System.out.println(castChild.getChildString());
    }
}


class Parent {
    private String parentString;

    public Parent() {
    }

    public Parent(String parentString) {
        this.parentString = parentString;
        parentString = "Parent";
    }

    public String getParentString() {
        return parentString;
    }
}


class Child extends Parent implements Serializable {
    private String childString;

    public Child(String childString) {
        super(childString);
        this.childString = childString;
    }

    public String getChildString() {
        return childString;
    }
}