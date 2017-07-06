package dataProvide;

import java.io.File;
//import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;





public class xlwrite {
	public static void main (String[] args ) throws IOException{
		
		@SuppressWarnings("resource")
		XSSFWorkbook workbook = new XSSFWorkbook();
		// creating a sheet
		
		XSSFSheet sheet = workbook.createSheet("second Sheet");
		// Creatig raw
		
		for(int i=0; i<=10;i++){
			Row row = sheet.createRow(i);
			
			for(int j=0; j<=10;j++){
				Cell cell = row.createCell(j);
				cell.setCellValue((int)(Math.random()*100));
			}
			
		}
		
		
		
		
		
		//creating cell
		
		//Cell cellB = row1.createCell(1);
		
		//cellB.setCellValue("second cell");
		
		
		File file = new File("C:\\Users\\RakibKhan\\Desktop\\test2.xlsx");
		// Fileoutput steam
		FileOutputStream fis = new FileOutputStream(file);
		workbook.write(fis);
		fis.close();
		System.out.println("File has been Created");
		
	}

}
