package com.sample;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
/**
 * 
 * @author Sangeetha
 *
 */
public class DataImporter_05 {

	public static void main(String[] args) {

		String fileName = "D:\\java-new-workspace\\java-assignment\\src\\import.xls";

		try (Connection conn = DriverManager.getConnection("jdbc:postgresql://127.0.0.1:5432/postgres", "postgres",
				"postgres")) {
            conn.setAutoCommit(false);
			if (conn != null) {
				System.out.println("Connected to the database!");
			} 
			PreparedStatement ps = null;
			FileInputStream input = new FileInputStream(fileName);
			POIFSFileSystem fs = new POIFSFileSystem(input);
			HSSFWorkbook wb = new HSSFWorkbook(fs);
			HSSFSheet sheet = wb.getSheetAt(0);
			HSSFRow row;
			for (int i = 1; i <= sheet.getLastRowNum(); i++) {
				
				row = sheet.getRow(i);
				int emp_id = (int) row.getCell(0).getNumericCellValue();
				String emp_name = row.getCell(1).getStringCellValue();
				
				String sqlQuery = "INSERT INTO employee VALUES('" + emp_id + "','" + emp_name + "')";
				ps = (PreparedStatement) conn.prepareStatement(sqlQuery);
				ps.execute();
				
				System.out.println("Import data into the table 'EMPLOYEE' Successfully ::" + i);
			}
			conn.commit();
			ps.close();
			conn.close();
			input.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}