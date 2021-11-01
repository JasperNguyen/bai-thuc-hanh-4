
package bai3.entities;


public abstract class Account {

    public Account(Integer soDuHienTai, Integer soGiaoDich) {
        this.soDuHienTai = soDuHienTai;
        this.soGiaoDich = soGiaoDich;
    }
    
    public Account() {
        this.soDuHienTai = 0;
        this.soGiaoDich = 0;
    }
    
    /**
     * Rut tien
     * @param val : so tien can rut
     * @return thuc hien thanh cong giao dich hay khong
     */
    public Boolean withdraw(int val){
        // Init
        int phiRutTienTheoLuot = this.tinhPhiRutTienTheoLuot(val);
        int phiHangThang = endMomthCharge(this.soGiaoDich + 1);
        
        int total = val + phiRutTienTheoLuot + phiHangThang;
        
        
        // Check
        if(total > this.soDuHienTai) return false;
        
        
        // Tinh toan
        this.soGiaoDich += 1;
        this.soDuHienTai -= (val + phiRutTienTheoLuot);
        
        return true;
    }
    
    /**
     * Nap tien
     * @param val: so tien can gui
     * @return thuc hien thanh cong giao dich hay khong
     */
    public Boolean deposit(int val){
        this.soDuHienTai += val;
        return true;
    }
    
    /**
     * Thuc hien tinh phi hang thang neu co va dat lai so giao dich ve 0
     */
    public void endMonth(){
        this.soDuHienTai -= this.endMomthCharge();
        this.soGiaoDich = 0;
    }
    
    
    protected abstract Integer tinhPhiRutTienTheoLuot(int val);
    
    /**
     * 
     * @return Tra ve phi tai khoan trong thang vua qua
     */ 
    protected abstract Integer endMomthCharge();
    protected abstract Integer endMomthCharge(int val);
    
    
    
    protected Integer soDuHienTai;
    protected Integer soGiaoDich;

    public Integer getSoDuHienTai() {
        return soDuHienTai;
    }

    public void setSoDuHienTai(Integer soDuHienTai) {
        this.soDuHienTai = soDuHienTai;
    }

    public Integer getSoGiaoDich() {
        return soGiaoDich;
    }

    public void setSoGiaoDich(Integer soGiaoDich) {
        this.soGiaoDich = soGiaoDich;
    }
}
