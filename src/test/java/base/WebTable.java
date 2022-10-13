package base;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class WebTable {
    
    private WebElement webTable;
    public WebTable(WebElement webElement){
        this.webTable = webElement;
    }
    
    //得到表格的行数
    public int getRowCount(){
        List<WebElement>rowCounts = webTable.findElements(By.tagName("tr"));
        return rowCounts.size();
    }
    //得到表格的行数

    
    //得到指定行的列数
    public int getColCount(int rowId){
        List<WebElement>rowCounts = webTable.findElements(By.tagName("tr"));
        //取得当前的tr
        WebElement rowNum = rowCounts.get(rowId);
        //计算当前的td数
        List<WebElement>colCounts =rowNum.findElements(By.tagName("td"));
        return colCounts.size();
    }
    
    // 得到指定单元格的内容
    public  String getCellText(int rowIdx, int colIdx) {
        
        String text = "";
        
        try{
            List<WebElement> rowCounts = webTable.findElements(By.tagName("tr"));
            WebElement currentRow = rowCounts.get(rowIdx);
            List<WebElement> td = currentRow.findElements(By.tagName("td"));
            WebElement cell = td.get(colIdx);
             text = cell.getText();       
        }catch(IndexOutOfBoundsException e){
            System.out.println("超出table边界值");
        }
        
        return text; 
    }
}