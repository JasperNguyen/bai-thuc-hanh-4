
package bai4.d;

import bai4.entities.Employee;
import bai4.entities.Person;

public class TestBai4 {

    public TestBai4() {
        taoMotVaiDoiTuong();
    }
    
    public void taoMotVaiDoiTuong(){
        Person persion = new Person("Nguyen Van A", 1999);
        //System.out.println(persion);
      
        
        Employee a = new Employee(5000D,"Nguyen Van A", 1999);
        System.out.println(a);
        
        Employee b = new Employee(5000D,"Nguyen Van A", 1999);
        System.out.println(a);
    }
}
