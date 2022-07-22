package jxl_Excel_file;

import java.io.FileInputStream;

import jxl.Sheet;
import jxl.Workbook;

public class Jxl {
public static void main(String args[]) throws Exception {

	FileInputStream file = new FileInputStream("S:\\XLS\\student.xls");
    Workbook wb = Workbook.getWorkbook(file);
    Sheet st = wb.getSheet(0);
	int row = 5 ;
	

String empid = st.getCell(0,row).getContents();  // getCell()-- To identify perticular cell
System.out.println(empid);                                                                 

String name = st.getCell(1,row).getContents();   // getContent()-- To retrive data from perticular cell
System.out.println(name);

String email = st.getCell(2,row).getContents();
System.out.println(email);

String no = st.getCell(3,row).getContents();
System.out.println(no);     
}
}
