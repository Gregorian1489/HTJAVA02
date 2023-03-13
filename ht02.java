/** Создать файл с названием file.txt. Если файл уже есть,
 *  то создавать не надо Записать в него Слово "TEXT" 100 раз */

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption; 

public class ht02 {
    
    public static void main(String[] args) throws IOException{
        
        Path dir = Path.of("file.txt");
        if (Files.notExists(dir)){
        
        Files.createFile(dir);
        
        for (int i = 0; i < 101; i++) {
            Files.writeString(dir, "TEXT ", StandardOpenOption.APPEND); 
        }
        } else {
            Files.delete(dir);
            Files.createFile(dir);
            for (int i = 0; i < 101; i++) {
                Files.writeString(dir, "TEXT 2 ", StandardOpenOption.APPEND);        
            }      
        }
        
    }
}