package poi_xlfile;
                          // Add POI  5 jar files

    import java.io.FileInputStream;                         //Read   
	import java.io.FileOutputStream;                        //Write
	import org.apache.poi.xssf.usermodel.XSSFCell;
//	import org.apache.poi.xssf.usermodel.XSSFRow;
	import org.apache.poi.xssf.usermodel.XSSFSheet;
	import org.apache.poi.xssf.usermodel.XSSFWorkbook;        // Group of sheet
	public class POI_Exel {
	public static void main(String args[]) throws Exception{
	    FileInputStream fileinput = new FileInputStream("S:\\XLSX\\Emp_Detail.xlsx");  // URL of .xlsx file
	    XSSFWorkbook workbook = new XSSFWorkbook(fileinput);         // Workbook : -- group of sheet
	    XSSFSheet sheet = workbook.getSheet("Sheet1");               // sheet name
	    System.out.println(sheet.getSheetName());
	    System.out.println(sheet.getLastRowNum());
	System.out.println("Before updating Cell Data :"+ sheet.getRow(3).getCell(1));// Read data in perticular cell
    
	// Write the data to excel file
	                                      
	    XSSFCell cell =  sheet.getRow(2).getCell(1);   // write data in cell
	    cell.setCellValue("ABHI");                      // data     
	    fileinput.close();                             // close input data
	    FileOutputStream fileOut = new FileOutputStream("S:\\XLSX\\Emp_Detail.xlsx");
	    workbook.write(fileOut);                       // To save data use the write()
	    System.out.println("Updated data after write is done " + cell.getStringCellValue());
	    fileOut.close();
	   
	}
	}

