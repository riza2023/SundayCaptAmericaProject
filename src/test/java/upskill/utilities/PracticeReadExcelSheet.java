package upskill.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class PracticeReadExcelSheet {
	public static Map<String, Map<String, String>> setMapData() throws Exception { // Map comes from Java

		String path = System.getProperty("user.dir") + "/src/test/resource/Datasheets/Practice.xlsx";
		FileInputStream fis = new FileInputStream(path);

		Workbook workbook = new XSSFWorkbook(fis);
		Sheet sheet = workbook.getSheetAt(0); // we don't need to say new since we are getting sheet from workbook.
		int lastRow = sheet.getLastRowNum();

		Map<String, Map<String, String>> excelFile = new HashMap<String, Map<String, String>>();// row
		
		Map<String, String> dataMap = new HashMap<String, String>(); // hashmap<key, value> //column

		for (int i = 0; i <= lastRow; i++) {
			Row row = sheet.getRow(i);
			Cell keyCell = row.getCell(0);
			Cell valueCell = row.getCell(1);

			DataFormatter datafor = new DataFormatter();
			String key = datafor.formatCellValue(keyCell);
			String value = datafor.formatCellValue(valueCell);

			dataMap.put(key, value);
			excelFile.put("PracticeReadExcelSheet", dataMap);

		}
		return excelFile;
	}

	public static String getMapData(String key) throws Exception {
		Map<String, String> getValue = setMapData().get("PracticeReadExcelSheet");
		String value = getValue.get(key);
		return value;
	}
}
