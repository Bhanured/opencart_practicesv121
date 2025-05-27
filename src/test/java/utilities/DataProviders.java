package utilities;


import java.io.IOException;

public class DataProviders {

    // DataProvider 1
    @org.testng.annotations.DataProvider(name = "LoginData")
    public String[][] getData() throws IOException {

        String path = ".\\testData\\sample_credentials.xlsx"; // Path to Excel file

        ExcelUtil xlutil = new ExcelUtil(path); // Creating object for ExcelUtil

        int totalRows = xlutil.getRowCount("Sheet1");
        int totalCols = xlutil.getCellCount("Sheet1", 1);

        String[][] loginData = new String[totalRows][totalCols]; // 2D array to hold data

        for (int i = 1; i <= totalRows; i++) { // Rows start from 1 (excluding header)
            for (int j = 0; j < totalCols; j++) {
                loginData[i - 1][j] = xlutil.getCellData("Sheet1", i, j); // Store data
            }
        }

        return loginData; // Returning 2D array
    }
}
