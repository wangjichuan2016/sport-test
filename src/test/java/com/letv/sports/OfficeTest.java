package com.letv.sports;

import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.hssf.util.Region;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.util.CellRangeAddress;
import org.junit.Test;

import java.io.*;
import java.util.Date;

/**
 * Created by wangjichuan on 16-9-13.
 */
public class OfficeTest {
    @Test
    public void hello(){
        HSSFWorkbook wb = new HSSFWorkbook();
        HSSFSheet sheet = wb.createSheet("理财资金报表");
        HSSFDataFormat format = wb.createDataFormat();
        sheet.setColumnWidth(0,20*256);
        sheet.setDefaultRowHeight((short)500);
        HSSFRow row = sheet.createRow(0);
        HSSFCell cell = row.createCell(0);
        HSSFCellStyle style = wb.createCellStyle();
        style.setVerticalAlignment(HSSFCellStyle.VERTICAL_CENTER);
        style.setAlignment(HSSFCellStyle.ALIGN_CENTER);
        Font font = wb.createFont();
        font.setFontHeightInPoints((short)20);
        font.setItalic(true);
        style.setFont(font);
        style.setWrapText(true);
       /* style.setBorderBottom((short) 1);
        style.setBorderLeft((short) 2);*/
        style.setDataFormat(format.getFormat("￥#,##0"));

        cell.setCellStyle(style);

        sheet.addMergedRegion(new CellRangeAddress(0,0,20,20));
        cell.setCellValue("hello world!!!");



        HSSFRow row1 = sheet.createRow(0);   //--->创建一行
        // 四个参数分别是：起始行，起始列，结束行，结束列
        sheet.addMergedRegion(new CellRangeAddress(0, (short) 0, 0, (short) 15));
        row1.setHeightInPoints(25);
        HSSFCell cell1 = row1.createCell(0);   //--->创建一个单元格

        cell1.setCellStyle(style);
        cell1.setCellValue("总公司资金运用日报明细表（理财资金）");

        //表格第二行
        sheet.addMergedRegion(new CellRangeAddress(1,1,0,15));
        HSSFRow row2 = sheet.createRow(1);
        row2.setHeightInPoints(35);
        HSSFCell cell2 = row2.createCell(0);
        cell2.setCellValue("报告日期："+new Date());
        cell2.setCellStyle(style);

        //表格第三行
        sheet.addMergedRegion(new CellRangeAddress(2,2,2,(short)15));
        HSSFRow row3 = sheet.createRow(2);
        HSSFCell cell3 = row3.createCell(2);
        cell3.setCellValue("交易日期："+new Date());
        cell3.setCellStyle(style);
        row3.setHeightInPoints(35);

        //表格第四行
        sheet.addMergedRegion(new CellRangeAddress(3, 3, 0, (short)15));
        HSSFRow row4 = sheet.createRow(3);
        row4.setHeightInPoints((short)35);
        HSSFCell cell4 = row4.createCell((short)0);
        HSSFCell cell4_0_1 = row4.createCell(1);
        cell4_0_1.setCellStyle(style);
        HSSFCell cell4_0_2 = row4.createCell(2);
        cell4_0_2.setCellStyle(style);
        cell4.setCellStyle(style);
        cell4.setCellValue("代码/品种");
        OutputStream outputStream = null;
       try {
           outputStream = new FileOutputStream(new File("1.xls"));
           wb.write(outputStream);
       }catch (Exception e){
           e.printStackTrace();
       }finally {
           try {
               outputStream.close();
           } catch (IOException e) {
               e.printStackTrace();
           }
       }

    }
}
