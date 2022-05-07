
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {
    public static void main(String[] args) {
        Person[] people = {new Person(1, "Bob"),
                new Person(2, "Mike"),new Person(3, "Tom")};

        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("people.bin"))){

            objectOutputStream.writeObject(people);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
