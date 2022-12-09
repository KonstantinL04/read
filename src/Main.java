import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public int[] arrayFromFile(String fileName) {
        int[] tempArray = null;
        try  (DataInputStream dis = new DataInputStream(new FileInputStream(fileName))) {
            int size = dis.readInt();
            tempArray = new int[size];
            for (int i = 0; i < size; i++) {
                tempArray[i] = dis.readInt();
            }
            System.out.println("Файл "+ fileName + " успешно прочитан");
        } catch (FileNotFoundException e) {
            System.out.println("Такого файла не существует");
        } catch (IOException e) {
            System.out.println("Ошибка при чтении файла");
        }
        return tempArray;
    }
}