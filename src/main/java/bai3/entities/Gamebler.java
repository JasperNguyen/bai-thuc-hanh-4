
package bai3.entities;
import java.util.Random;

public class Gamebler extends Account{

    public Gamebler(Integer soDuHienTai, Integer soGiaoDich) {
        super(soDuHienTai, soGiaoDich);
    }

    public Gamebler() {
    }

    @Override
    protected Integer endMomthCharge() {
        return 0;
    }
    
    @Override
    protected Integer endMomthCharge(int val) {
        return 0;
    }
    
    @Override
    protected Integer tinhPhiRutTienTheoLuot(int val) {
        return this.isTruTien() ? val: 0;
    }

    private Boolean isTruTien(){
        return ran.nextFloat() > 0.49;
    }
    
    private final Random ran = new Random();
}
