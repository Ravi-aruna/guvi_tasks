 

import java.io.File; 
import java.io.FileInputStream; 
import java.io.IOException; 
import org.apache.poi.hssf.usermodel.HSSFSheet; 
import org.apache.poi.hssf.usermodel.HSSFWorkbook; 
import org.apache.poi.ss.usermodel.Cell; 
import org.apache.poi.ss.usermodel.FormulaEvaluator; 
import org.apache.poi.ss.usermodel.Ro
public class excel{ 
 
	public static void main(String[] args) 
	{ 

		
		try { 

			 
			FileInputStream file = new FileInputStream( 
				new File("excel.xlsx")); 

			
			XSSFWorkbook workbook = new XSSFWorkbook(file); 

			 
			XSSFSheet sheet = workbook.getSheetAt(0); 
 
			Iterator<Row> rowIterator = sheet.iterator(); 

			 (rowIterator.hasNext()) { 

				Row row = rowIterator.next(); 
 
				Iterator<Cell> cellIterator 
					= row.cellIterator(); 

				while (cellIterator.hasNext()) { 

					Cell cell = cellIterator.next(); 
					 
					switch (cell.getCellType()) { 
 
					case Cell.CELL_TYPE_NUMERIC: 
						System.out.print( 
							cell.getNumericCellValue() 
							+ "t"); 
						break;  
					case Cell.CELL_TYPE_STRING: 
						System.out.print( 
							cell.getStringCellValue() 
							+ "t"); 
						break; 
					} 
				} 

				System.out.println(""); 
			} 

			// Closing file output streams 
			file.close(); 
		} 

		 { 
 
		} 
	} 
}
