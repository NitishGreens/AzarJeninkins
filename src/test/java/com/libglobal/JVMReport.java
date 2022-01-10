package com.libglobal;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMReport {

	public static void generateJvmReport(String jsonFile) {

		// mention loc of report
		File file = new File(System.getProperty("user.dir") + "\\src\\test\\resources\\Reports");

		// set config
		Configuration configuration = new Configuration(file, "Facebook");

		// add classification
		configuration.addClassifications("platformName", "Windows");
		configuration.addClassifications("platformVersion", "11");
		configuration.addClassifications("buildNo", "48241");
		configuration.addClassifications("sprint", "37");
		configuration.addClassifications("author", "jhon");

		List<String> jsonFiles = new ArrayList<String>();
		jsonFiles.add(jsonFile);

		ReportBuilder builder = new ReportBuilder(jsonFiles, configuration);
		builder.generateReports();

	}

}
