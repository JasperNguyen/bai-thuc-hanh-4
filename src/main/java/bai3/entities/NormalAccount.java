
package bai3.entities;


public class NormalAccount extends Account{

    public NormalAccount(Integer soDuHienTai, Integer soGiaoDich) {
        super(soDuHienTai, soGiaoDich);
    }

    public NormalAccount() {}

    @Override
    protected Integer endMomthCharge() {
        return 10000;
    }

    @Override
    protected Integer endMomthCharge(int val) {
        return 10000;
    }

    @Override
    protected Integer tinhPhiRutTienTheoLuot(int val) {
        return 0;
    }
}
