package utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class extentReportNG {
public static ExtentReports extent;
public static ExtentReports getReportObject() {
	String path=System.getProperty("user.dir")+"\\test-output\\report.html";
	ExtentSparkReporter reporter=new ExtentSparkReporter(path);
	reporter.config().setReportName("Web Automation Result");
	reporter.config().setDocumentTitle("Test Result");
	extent=new ExtentReports();
	extent.attachReporter(reporter);
	extent.setSystemInfo("tester", "Keerthana");
	return extent;
}
}

	