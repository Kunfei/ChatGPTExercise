package tw.idv.kunfei;

import com.opencsv.CSVReader;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class EmployeeReader {

    public static List<Employee> readEmployeesFromCSV(String csvPath) {
        List<Employee> employees = new ArrayList<>();

        try (CSVReader reader = new CSVReader(new FileReader(csvPath))) {
            String[] line;

            // Skip the first line (header)
            reader.skip(1);

            while ((line = reader.readNext()) != null) {
                String department = line[0];
                String name = line[1];

                Employee employee = new Employee(department, name);
                employees.add(employee);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return employees;
    }
}

