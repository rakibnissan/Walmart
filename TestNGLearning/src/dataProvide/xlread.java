package dataProvide;

import java.io.File;
import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class xlread {
	public static void main (String[] args ) throws EncryptedDocumentException, InvalidFormatException, IOException{
		File file = new File("C:\\Users\\RakibKhan\\Desktop\\test.xlsx");
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook workbook = (XSSFWorkbook) WorkbookFactory.create(fis);
		
		Sheet sheet = workbook.getSheetAt(0);
		
		int rows=sheet.getPhysicalNumberOfRows();
		
		
		Row row = sheet.getRow(0);
		Cell cells = row.getCell(0);
		int celln =row.getPhysicalNumberOfCells();
		for(int i=0; i<rows;i++){
			row = sheet.getRow(i);
			System.out.println();
			for(int j=0; j<celln;j++){
				
				cells = row.getCell(j);
				System.out.print(" "
						+ ""+(int)(cells.getNumericCellValue()));
			}
		}
		
	
		
		
	
		
	}

}
