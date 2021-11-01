
package bai3.entities;


public class NickelNDime extends Account{

    public NickelNDime(Integer soDuHienTai, Integer soGiaoDich) {
        super(soDuHienTai, soGiaoDich);
    }

    public NickelNDime() {}
    
    // 
    
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
        return 2000;
    }
    
}
