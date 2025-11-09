import com.company.analytics.sales.SalesReport;
import com.company.analytics.hr.EmployeeReport;

public class MainClass {
    public static void main(String[] args) {
        SalesReport salesReport = new SalesReport();
        EmployeeReport employeeReport = new EmployeeReport();

        System.out.println("=== Company Combined Report ===");
        salesReport.printSalesData();
        System.out.println();
        employeeReport.printEmployeePerformance();
    }
}
