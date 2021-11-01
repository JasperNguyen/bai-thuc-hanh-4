
package app;

import bai3.entities.Account;
import bai3.entities.NickelNDime;
import bai3.entities.NormalAccount;
import bai4.d.TestBai4;


public class Program {

    
    public static void main(String[] args) {
       
        Account a = new NormalAccount();
        a.deposit(100000);
        System.out.println(a.withdraw(1000)); 
        System.out.println(a.withdraw(1000));
        System.out.println(a.withdraw(1000));
        a.endMonth();
        
        System.out.println(a.getSoDuHienTai());
        
        
        //new TestBai4();
        
    }
    
}
