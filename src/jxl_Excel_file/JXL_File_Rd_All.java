package jxl_Excel_file;

    import java.io.FileInputStream;            // Read data 

	import jxl.Sheet;
	import jxl.Workbook;                       // Group of Sheet

	public class JXL_File_Rd_All {
	public static void main(String args[]) throws Exception  {
	FileInputStream file = new FileInputStream("S:\\XLS\\Emp_Detail.xls");
	Workbook  wb = Workbook.getWorkbook(file);
	Sheet st = wb.getSheet(0);
	
	int rowcount = st.getRows();              // Count the row in sheet
	System.out.println("Total rows :"+ rowcount);
	
	for(int i=1;i<rowcount; i++)     // i<rowcount---Count the row when condition is true
	{
    System.out.println("--------------------------------------------");
	String empid = st.getCell(0,i).getContents();   // getCell()-- To identify particular cell
	System.out.println("Employee ID :"+empid);      // getContent()--- To retrive data from perticular cell
	
	String name = st.getCell(1,i).getContents();
	System.out.println("Employee Name :"+name);

	
	String email = st.getCell(2,i).getContents();
	System.out.println("Employee E-mail :"+email);
	
	String no = st.getCell(3,i).getContents();  
	System.out.println("Employee No :"+no);
	}
	}
	}
	
	
		
	

