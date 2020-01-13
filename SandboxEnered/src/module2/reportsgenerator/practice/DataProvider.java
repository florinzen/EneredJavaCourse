package module2.reportsgenerator.practice;

import module2.reportsgenerator.practice.model.ReportContext;

import java.util.ArrayList;

public class DataProvider {

    public static ArrayList<ReportContext> simulateDataRetrieval() {
        ReportContext r1 = new ReportContext("Salary 1");
        ReportContext r2 = new ReportContext("Salary 2");
        ReportContext r3 = new ReportContext("Salary 3");
        ReportContext r4 = new ReportContext("Salary 4");

        ArrayList<ReportContext> inputData = new ArrayList<>();

        inputData.add(r1);
        inputData.add(r2);
        inputData.add(r3);
        inputData.add(r4);

        return inputData;
    }
}
