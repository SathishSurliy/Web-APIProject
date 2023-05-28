package APITesting;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Arrays;
import java.util.List;

 class Employee_PojoTest {
    private String CustomerName;
    private String Age;
    private String email;
    private List skils;

    public String getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName(String customerName) {
        CustomerName = customerName;
    }

    public String getAge() {
        return Age;
    }

    public void setAge(String age) {
        Age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List getSkils() {
        return skils;
    }

    public void setSkils(List skils) {
        this.skils = skils;
    }

}
public class SerializationProcess_DynamicData_UsingPojoClassTest {

     public static void main(String[] args) throws JsonProcessingException {
        Employee_PojoTest emp1= new Employee_PojoTest();
        emp1.setCustomerName("Sathish");
        emp1.setAge("35");
        emp1.setEmail("sskthree@gmail.com");
        emp1.setSkils(Arrays.asList("java","Python"));
        // Java objects
        System.out.println(emp1.getCustomerName());
        System.out.println(emp1.getAge());
        System.out.println(emp1.getEmail());
        System.out.println(emp1.getSkils());

        //now we construct java objects which yet need to convert to json request
         // Here we go
         ObjectMapper mapper = new ObjectMapper();
         // ObjectMapper is class from Jackson databinder to use to construct java objects, serailation, desearilaition

         String employeeJson= mapper.writerWithDefaultPrettyPrinter().writeValueAsString(emp1);
         // Converted json request successfully
         System.out.println("JSON Request"+employeeJson);
    }
}


