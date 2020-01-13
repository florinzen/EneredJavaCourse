package module2.reportsgenerator.practice.generators;

import module2.reportsgenerator.practice.model.Report;
import module2.reportsgenerator.practice.model.ReportContext;

import java.util.ArrayList;
import java.util.List;

public class CustomerSatisfactionReportGenerator implements ReportGenerator {

    @Override
    public List<Report> generateReports(List<ReportContext> inputData) {
        List<Report> reports = new ArrayList<>();
        for(ReportContext reportContext : inputData) {
            // other complex logic needed for report generation
            Report processedReport = new Report(reportContext.getInputData().toLowerCase());
            reports.add(processedReport);
        }
        return reports;
    }
}
