/*
 * Created by Krystsina Trostle
 *
 * Created on June 18, 2020
 *
 * The objective of the program is to define the TestWriteInventoryProductSequential 
 * class that allows the user to enter test data and write the data to the file
 * via the ClassSequentialInventoryProduct.
 * 
 */
package Java2_assign4_updated;

import java.io.DataOutputStream;

public class TestWriteInventoryProductSequential {  
    static DataOutputStream outputRecord;
    
    public static void main(String[] args) {
        outputRecord = ClassSequentialInventoryProduct.
                openTheFileOutputStream(outputRecord);
                
        ClassSequentialInventoryProduct.writeRecordsOutputStream(outputRecord);
        
        ClassSequentialInventoryProduct.closeTheFileOutputStream(outputRecord);
    }
}
