package SecondHW.Example002;
import java.io.IOException;
import java.util.logging.*;

//Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.
public class Example {
    
    public static void main(String[] args) throws IOException {
        StringBuilder sb =new StringBuilder();
        int[] array = {8,2,5,7,21,354,5,1};
        Logger logger = Logger.getLogger(Example.class.getName());
        FileHandler fh = new FileHandler("SecondHW/Example002/log.txt");
        logger.addHandler(fh);

        SimpleFormatter sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat);
        //logger.log(Level.WARNING, "Тестовое логирование 1");
        //logger.info("Тестовое логирование 2");

        for (int i = 0; i < array.length-1; i++) {
            for (int j = 0; j < array.length-1; j++) {
                if(array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    
                }
            sb.setLength(0);
            for (int k = 0; k < array.length; k++) {
                    sb.append(array[k] + " ");
                }
            }
            logger.log(Level.INFO, String.format("Итерация %s, %s", i+1, sb));
            
        }
    }
}
