package module2.reportsgenerator.practice.generators;

import module2.reportsgenerator.practice.model.Report;
import module2.reportsgenerator.practice.model.ReportContext;

import java.util.List;

public interface ReportGenerator {

    List<Report> generateReports(List<ReportContext> inputData);

}
