/*
 * Created by Krystsina Trostle
 *
 * Created on June 18, 2020
 *
 * The objective of the program is to define the TestReadInventoryProductSequential 
 * class that allows the user to display the data records written to the file
 * via the ClassSequentialInventoryProduct.
 * 
 */
package Java2_assign4_updated;

import java.io.DataInputStream;
import java.io.IOException;

public class TestReadInventoryProductSequential {
    
    static DataInputStream inputRecord;
    
    public static void main(String[] args) throws IOException 
    {
        inputRecord = ClassSequentialInventoryProduct.
                openTheFileInputStream(inputRecord);
                
        ClassSequentialInventoryProduct.readTheFileInputStream(inputRecord);
        
        ClassSequentialInventoryProduct.closeTheFileInputStream(inputRecord);
    }
}
