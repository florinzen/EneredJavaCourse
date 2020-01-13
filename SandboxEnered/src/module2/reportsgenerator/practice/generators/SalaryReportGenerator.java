package module2.reportsgenerator.practice.generators;

import module2.reportsgenerator.practice.model.Report;
import module2.reportsgenerator.practice.model.ReportContext;

import java.util.LinkedList;
import java.util.List;

public class SalaryReportGenerator implements ReportGenerator {
    @Override
    public List<Report> generateReports(List<ReportContext> inputData) {
        List<Report> reports = new LinkedList<>();
        for(ReportContext reportContext : inputData) {
            // complex logic necessary for report generation
            Report processedReport = new Report(reportContext.getInputData().toUpperCase());
            reports.add(processedReport);
        }
        return reports;
    }
}
