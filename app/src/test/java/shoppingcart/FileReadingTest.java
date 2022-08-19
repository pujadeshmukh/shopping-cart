package shoppingcart;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class FileReadingTest {

    @Test
    public void readFile() throws FileNotFoundException {
        String filePath = "/Users/pujadeshmukh/Documents/EqualExperts/equal_experts-cff60214-4ac1-4480-bf62-4eb161e57acc/InputDataSet";
        Scanner scanner = new Scanner(new FileReader(filePath));
        String input = "";
        String[] inputArray = new String[10];
        input = scanner.nextLine();
        inputArray = input.split(" ");

        String productName = "DOVE";
        Assertions.assertEquals(productName,inputArray[0]);
    }
}
