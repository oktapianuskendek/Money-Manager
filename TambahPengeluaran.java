
import java.sql.*;
import java.text.*;
import java.util.Calendar;
import java.util.Vector;
import javax.swing.*;
import static javax.swing.JOptionPane.showMessageDialog;
public class TambahPengeluaran extends javax.swing.JFrame {

    
   public TambahPengeluaran() {
        initComponents();
    }

    public TambahPengeluaran(String keterangan){
        initComponents();
        tfKeterangan.setText(keterangan);
        cbJenisPengeluaran.setEnabled(false);
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tfMonth1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cbJenisPengeluaran = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tfKeterangan = new javax.swing.JTextField();
        spJumlah = new javax.swing.JSpinner();
        btnTambah = new javax.swing.JButton();
        cbDay = new javax.swing.JComboBox();
        cbMonth = new javax.swing.JComboBox();
        cbYear = new javax.swing.JComboBox();

        tfMonth1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfMonth1ActionPerformed(evt);
            }
        });

        jLabel5.setText("jLabel5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Jenis pengeluaran:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Tanggal:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Keterangan:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Jumlah:");

        jLabel6.setText("DD");

        jLabel7.setText("MM");

        jLabel8.setText("YYYY");

        spJumlah.setValue(10000);

        btnTambah.setText("Tambah");
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });

        cbDay.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        cbMonth.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
        cbMonth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbMonthActionPerformed(evt);
            }
        });

        cbYear.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2025", "2026", "2027", "2028", "2029", "2030" }));
        cbYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbYearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbJenisPengeluaran, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cbDay, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addGap(19, 19, 19)
                        .addComponent(cbMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addGap(13, 13, 13)
                        .addComponent(cbYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8))
                    .addComponent(tfKeterangan, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnTambah)
                        .addComponent(spJumlah, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(cbJenisPengeluaran, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(cbMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3))
                    .addComponent(tfKeterangan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(spJumlah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnTambah)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfMonth1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfMonth1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfMonth1ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.setLocationRelativeTo(null);
        try{
            Connection con=ModuleDB.connectDB();
            String sql="SELECT * FROM jenis";
            Statement stmt=con.createStatement();
            ResultSet result=stmt.executeQuery(sql);
            Vector cbItems=new Vector();
            while(result.next()){
                cbItems.add(result.getString("jenis"));
            }
            con.close();
            DefaultComboBoxModel model=new DefaultComboBoxModel(cbItems);
            cbJenisPengeluaran.setModel(model);
        }
        catch(SQLException e){
            showMessageDialog(null,e.getMessage());
        }
        DateFormat dateFormat;
        Calendar cal=Calendar.getInstance();
        dateFormat=new SimpleDateFormat("dd");
        String tanggalSkrg=dateFormat.format(cal.getTime());
        dateFormat=new SimpleDateFormat("MM");
        String bulanSkrg=dateFormat.format(cal.getTime());
        dateFormat=new SimpleDateFormat("YYYY");
        String tahunSkrg=dateFormat.format(cal.getTime());
        cbYear.setSelectedItem(tahunSkrg);
        cbMonth.setSelectedItem(bulanSkrg);
        cbDay.setSelectedItem(tanggalSkrg);
    }//GEN-LAST:event_formWindowOpened

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing

    }//GEN-LAST:event_formWindowClosing

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        String jenisPengeluaran=cbJenisPengeluaran.getSelectedItem().toString();
        int idJenisPengeluaran;
        String tanggal=cbDay.getSelectedItem().toString();
        String bulan=cbMonth.getSelectedItem().toString();
        String tahun=cbYear.getSelectedItem().toString();
        String tanggalPengeluaran=tahun+"-"+bulan+"-"+tanggal;
        String keterangan=tfKeterangan.getText();
        int jumlah=(int)spJumlah.getValue();
        try{
            String sql="SELECT id_jenis FROM jenis WHERE jenis='"+jenisPengeluaran+"';";
            Connection con=ModuleDB.connectDB();
            Statement stmt=con.createStatement();
            ResultSet result=stmt.executeQuery(sql);
            result.next();
            idJenisPengeluaran=result.getInt(1);
            sql="INSERT INTO pengeluaran (id_user,id_jenis,tanggal,keterangan,jumlah) VALUES ("+ModuleDB.idUser+","+idJenisPengeluaran+",'"+tanggalPengeluaran+"','"+keterangan+"',"+jumlah+");";
            stmt.executeUpdate(sql);
            showMessageDialog(null,"Data pengeluaran berhasil ditambahkan!");
            con.close();
        }
        catch(SQLException e){
            showMessageDialog(null,e.getMessage());
        }
    }//GEN-LAST:event_btnTambahActionPerformed

    private void cbMonthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbMonthActionPerformed
        int bulan=cbMonth.getSelectedIndex()+1;
        int tahun=Integer.parseInt(cbYear.getSelectedItem().toString());
        if(bulan<=7 && bulan%2!=0 || bulan>=8 && bulan%2==0)
            cbDay.setModel(bln31hari);
        else if(bulan<=7 && bulan%2==0 && bulan!=2 || bulan>=8 && bulan%2!=0)
            cbDay.setModel(bln30hari);
        else if(bulan==2 && tahun%4!=0)
            cbDay.setModel(februariNonKabisat);
        else if(bulan==2 && tahun%4==0)
            cbDay.setModel(februariKabisat);
    }//GEN-LAST:event_cbMonthActionPerformed

    private void cbYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbYearActionPerformed
    
    }//GEN-LAST:event_cbYearActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
      
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TambahPemasukan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TambahPemasukan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TambahPemasukan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TambahPemasukan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TambahPemasukan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTambah;
    private javax.swing.JComboBox cbDay;
    private javax.swing.JComboBox cbJenisPengeluaran;
    private javax.swing.JComboBox cbMonth;
    private javax.swing.JComboBox cbYear;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSpinner spJumlah;
    private javax.swing.JTextField tfKeterangan;
    private javax.swing.JTextField tfMonth1;
    // End of variables declaration//GEN-END:variables
}