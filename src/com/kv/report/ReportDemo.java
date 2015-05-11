package com.kv.report;

import java.util.HashMap;
import java.util.Map;

import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.xml.JRXmlLoader;

/**
 * <p>Title: FSVM System</p>
 *
 * <p>Description: </p>
 * 
 * <p>Copyright: Copyright (c) 2015</p>
 *
 * <p>Company: Foxconn</p>
 * 
 * @date 2015-5-5 ÉÏÎç10:37:30
 *
 * @author kevin
 * @version 1.1
 */
public class ReportDemo {

	public static void main(String[] args) {
		JasperReport jasperReport;
		JasperPrint jasperPrint;
		
		try {
			jasperReport = JasperCompileManager.compileReport(System.getProperty("user.dir") + "/reports/ReportDemo.jrxml");
			jasperPrint = JasperFillManager.fillReport(jasperReport, new HashMap(), new JREmptyDataSource());
			JasperExportManager.exportReportToPdfFile(jasperPrint, "D:/Reports/ReportDemo.pdf");
		} catch (JRException e) {
			e.printStackTrace();
		}
	}
}
