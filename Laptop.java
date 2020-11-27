
package Laptop;


public class Laptop {

    private int ID_Laptop;
    private String NAMA_Laptop;
    private int qty;
    private int harga;
    
    
      public int getID_Laptop() {
        return ID_Laptop;
    }

    public void setID_Laptop(int ID_Laptop) {
        this.ID_Laptop = ID_Laptop;
    }

    public String getNAMA_Laptop() {
        return NAMA_Laptop;
    }

    public void setNAMA_Laptop(String NAMA_Laptop) {
        this.NAMA_Laptop = NAMA_Laptop;
    }

    public int getqty() {
        return qty;
    }

    public void setqty(int qty) {
        this.qty = qty;
    }

    public int getharga() {
        return harga;
    }

    public void setharga(int harga) {
        this.harga = harga;
    }
}
