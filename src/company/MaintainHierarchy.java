package company;

import javafx.util.Pair;

import java.util.*;

public class MaintainHierarchy implements Hierarchy {
    private Map<String, Employee> idToEmployeeMap = new HashMap<>();
    private Map<String, List<String>> managerToEmployee = new HashMap<>();
    private Map<String, String> employeeToManagerMap = new HashMap<>();
//    private Map<Pair<String , Employee>, List<Employee>> managerToEmployee = new HashMap<>();
//    private Map<Pair<String , Employee>, Pair<String , Employee>> employeeToManagerMap = new HashMap<>();

    protected MaintainHierarchy(Map<String, List<String>> managerToEmployee ){
        this.managerToEmployee = managerToEmployee;
    }//do we need factory?

    public static  MaintainHierarchy createMaintainHierarchy(){
        return new MaintainHierarchy(new HashMap<>());
    }

    @Override
    public void addEmployee(String manager_id, Employee employee){
        if(manager_id == null || employee == null)
            throw new IllegalArgumentException();
        String empId = employee.getId();
        this.idToEmployeeMap.put(empId,  employee );
        this.managerToEmployee.getOrDefault(manager_id, new LinkedList<>()).add(empId);
        this.employeeToManagerMap.put(empId, manager_id);
    }

//    @Override
//    public void addManager(Employee employee){
//        this.managerToEmployee.put(employee, new LinkedList<>());
//    }

    @Override
    public List<String> getHierarchy(String id){
        List<String> Hierarchy = new LinkedList<>(); //keep CEO employee ops separate
        String ceo_id = "" ;
        if(this.managerToEmployee.containsKey(id)) {
            ceo_id = this.employeeToManagerMap.get(id);
            Hierarchy.add(ceo_id);
            Hierarchy.addAll(this.managerToEmployee.get(id));
        }
        else if(this.employeeToManagerMap.containsKey(id)) {
            ceo_id = this.employeeToManagerMap.get(this.employeeToManagerMap.get(id));
            Hierarchy.add(ceo_id);
            Hierarchy.add(this.employeeToManagerMap.get(id));

        }

        return Hierarchy;
    }

    @Override
    public void removeEmployee(String id){
        //remove leaf node

    }

    @Override
    public void changeDesignation(String id, int level){

    }

    @Override
    public  void ChangeManager(String new_manager_id, String employee_id){

    }
}
