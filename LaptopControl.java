package Laptop;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class LaptopControl {

    private String[] header = {"ID BARANG", "NAMA BARANG", "QTY", "HARGA"};

    private ArrayList<Laptop> list = new ArrayList();

//menampilkan data pada tabel
    public void read(JTable jt) {
        DefaultTableModel dtm = new DefaultTableModel(null, header);

        for (int i = 0; i < list.size(); i++) {
            Object[] ob = new Object[4];
            ob[0] = list.get(i).getID_Laptop();
            ob[1] = list.get(i).getNAMA_Laptop();
            ob[2] = list.get(i).getqty();
            ob[3] = list.get(i).getharga();
            dtm.addRow(ob);

        }

        jt.setModel(dtm);

    }

//menambahkan data
    public void create(Laptop L) {
        list.add(L);
        JOptionPane.showMessageDialog(null, "Berhasil Disimpan!!");
    }

//mengubah data
    public void update(Laptop L) {
        for (int i = 0; i < list.size(); i++) {
            if (L.getID_Laptop() == list.get(i).getID_Laptop()) {
                list.set(i, L);
            }

        }
        JOptionPane.showMessageDialog(null, "Berhasil Diubah!!");
    }

//menghapus data
  public void delete(int ID_BARANG) {
        for (int i = 0; i < list.size(); i++) {
            if (ID_BARANG == list.get(i).getID_Laptop()) {
                list.remove(i);
            }
        }

        JOptionPane.showMessageDialog(null, "Berhasil Dihapus!");
    }

    //    untuk melakukan pencarian berdasarkan ID BARANG
    public void search(JTable tb, int ID_BARANG) {
        DefaultTableModel dtm = new DefaultTableModel(null, header);

        for (int i = 0; i < list.size(); i++) {
            if (ID_BARANG == list.get(i).getID_Laptop()) {
                Object[] oj = new Object[4];
                oj[0] = list.get(i).getID_Laptop();
                oj[1] = list.get(i).getNAMA_Laptop();
                oj[2] = list.get(i).getqty();
                oj[3] = list.get(i).getharga();
                dtm.addRow(oj);
            }
        }

        tb.setModel(dtm);
    }
}
