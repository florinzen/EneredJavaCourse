package module2.reportsgenerator.practice;

import module2.reportsgenerator.practice.DataProvider;
import module2.reportsgenerator.practice.model.Report;
import module2.reportsgenerator.practice.model.ReportContext;
import module2.reportsgenerator.practice.generators.CustomerSatisfactionReportGenerator;
import module2.reportsgenerator.practice.generators.ReportGenerator;
import module2.reportsgenerator.practice.generators.SalaryReportGenerator;

import java.util.List;

public class Application {

        public static void main(String[] args) {
            // retrieve raw data from the client somehow (database/read from a file/over the internet)
            List<ReportContext> inputData = DataProvider.simulateDataRetrieval();

            ReportGenerator customerReportGenerator = new CustomerSatisfactionReportGenerator();
            ReportGenerator salaryReportGenerator = new SalaryReportGenerator();

            // compute the raw data and transform it to reports
            List<Report> generatedReports = customerReportGenerator.generateReports(inputData);
            List<Report> generatedReportsSalary = salaryReportGenerator.generateReports(inputData);

            // display the created reports
            System.out.println(generatedReports);
            System.out.println(generatedReportsSalary);
        }
}
