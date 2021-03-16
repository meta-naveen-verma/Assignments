import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;


public class Index {
    static int STUDENTS;
    static HashMap<Student ,String> studentProgram = new HashMap();
    static HashMap<String,Double> programs = new HashMap();
    static Queue<Student> studentsOptions;

    public static void main(String[] args) throws IOException {
	input();
	process();
	output();
    }

    static void input() throws IOException {
	FileInputStream fis = new FileInputStream(new File("C:\\Users\\naveen.verma_metacub\\workspace\\DSA A2\\demo\\student.xls"));
	HSSFWorkbook wb = new HSSFWorkbook(fis);
	HSSFSheet sheet = wb.getSheetAt(0);
	STUDENTS = sheet.getPhysicalNumberOfRows();
	studentsOptions =  new CircularQueue<Student>(STUDENTS) ;
	sheet.getLastRowNum();
	for(Row row: sheet) {
	    Iterator<Cell> cellItr = row.cellIterator();
	    Cell cell = cellItr.next();
	    String name = cell.getStringCellValue();
	    ArrayList<String> pros = new ArrayList<String>();
	    while(cellItr.hasNext()) {
		Cell pcell = cellItr.next();
		pros.add(pcell.getStringCellValue());
	    }
	    Student stu = new Student(name, pros);
	    studentsOptions.enQueue(stu);
	}
	fis = new FileInputStream(new File("C:\\Users\\naveen.verma_metacub\\workspace\\DSA A2\\demo\\pro1.xls"));
	wb = new HSSFWorkbook(fis);
	sheet = wb.getSheetAt(0);

	for(Row row: sheet) {
	    Iterator<Cell> cellitr = row.cellIterator();
	    String name = cellitr.next().getStringCellValue();
	    Double capacity = cellitr.next().getNumericCellValue();
	    programs.put(name, capacity);
	}
    }

    static void process() {
	HashMap<String,Integer> current = new HashMap<String, Integer>();
	while(studentsOptions.isQueueEmpty() == false) {
	    Student stud = studentsOptions.deQueue();
	    String allocated = "none";
	    for( String pro: stud.program) {
		if(!programs.containsKey(pro) || programs.get(pro)<=0)
		    throw new RuntimeException("program is not presnt or has capacity <=0");
		else if( current.containsKey(pro)) {
		    if(current.get(pro) < programs.get(pro)) {
			current.put(pro, current.get(pro)+1);
			allocated = pro;
			break;
		    }
		}
		else {
		    current.put(pro,1);
		    allocated = pro;
		    break;
		}
	    }
	    studentProgram.put(stud,allocated);
	}
    }

    static void output() {
	try  {  
	    String filename = "C:\\Users\\naveen.verma_metacub\\workspace\\DSA A2\\demo\\output.xls";  
	    FileOutputStream fileOut = new FileOutputStream(filename);  
	    HSSFWorkbook workbook = new HSSFWorkbook();  
	    HSSFSheet sheet = workbook.createSheet("allocated programs");  
	    HSSFRow rowhead = sheet.createRow(0);
	    rowhead.createCell(0).setCellValue("student name");  
	    rowhead.createCell(1).setCellValue("program name");  
	    int rowIndex = 1;
	    for(Student stu: studentProgram.keySet()) {
		HSSFRow row = sheet.createRow(rowIndex); 
		row.createCell(0).setCellValue(stu.getName());
		row.createCell(1).setCellValue(studentProgram.get(stu));
		rowIndex++;
	    }
	    workbook.write(fileOut);
	}   
	catch (Exception e)   
	{  
	    e.printStackTrace();  
	}  
    }
}