package com.mf;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.*;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ExcelParser {

    private Workbook workbook;
    private Sheet sheet;
    private DataFormatter dataFormatter;

    public void parse(String filePath, int sheetNumber) throws IOException, InvalidFormatException {
        workbook = WorkbookFactory.create(new File(filePath));
        sheet = workbook.getSheetAt(sheetNumber);
        // Create a DataFormatter to format and get each cell's value as String
        dataFormatter = new DataFormatter();
    }

    public String[] getAllCellsByHeaderName(String headerName){
        Row firstRow = sheet.getRow(0);
        List<String> valuesList = new ArrayList<>();
        String cellValue;

        for(Cell cell: firstRow) {
            cellValue = dataFormatter.formatCellValue(cell);
            if (cellValue.equals(headerName)) {
                int colIndex = cell.getColumnIndex();
                // Start at 1 - skipping the header row
                for (int rowIndex = 1; rowIndex <= sheet.getLastRowNum(); rowIndex++ ) {
                    Row currentRow = sheet.getRow(rowIndex);
                    if (currentRow != null) {
                        Cell currentCell = currentRow.getCell(colIndex);
                        if (currentCell != null) {
                            cellValue = dataFormatter.formatCellValue(currentCell);
                            valuesList.add(cellValue);
                        }
                    }
                }
                break;
            }
        }
        return valuesList.toArray(new String[valuesList.size()]);
    }

    public void close() throws IOException {
        workbook.close();
    }
}
