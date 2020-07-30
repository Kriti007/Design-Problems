package company;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface Hierarchy {

    void addEmployee(String manager_id, Employee employee);
    void addManager(Employee employee);
    void removeEmployee(String id);
    void changeDesignation(String id, int level);
    List<String> getHierarchy(String id);
    void ChangeManager(String new_manager_id, String employee_id);
}
