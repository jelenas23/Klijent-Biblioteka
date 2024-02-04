/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package form;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextField;

/**
 *
 * @author Jelena
 */
public class frmKreiranjeKnjige extends javax.swing.JDialog {

    /**
     * Creates new form frmKreiranjeKnjige
     */
    public frmKreiranjeKnjige(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelKnjiga = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNazivKnjige = new javax.swing.JTextField();
        cmbAutori = new javax.swing.JComboBox<>();
        txtBrPrimeraka = new javax.swing.JTextField();
        cmbZanrovi = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        txtPolica = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtGodIzdanja = new javax.swing.JTextField();
        btnSacuvaj = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        panelKnjiga.setBorder(javax.swing.BorderFactory.createTitledBorder("Nova knjiga"));

        jLabel1.setText("Naziv:");

        jLabel2.setText("Autor:");

        jLabel3.setText("Broj primeraka:");

        jLabel4.setText("Žanr:");

        cmbAutori.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cmbZanrovi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel5.setText("Polica:");

        jLabel6.setText("Godina izdanja:");

        javax.swing.GroupLayout panelKnjigaLayout = new javax.swing.GroupLayout(panelKnjiga);
        panelKnjiga.setLayout(panelKnjigaLayout);
        panelKnjigaLayout.setHorizontalGroup(
            panelKnjigaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelKnjigaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelKnjigaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE))
                .addGap(22, 22, 22)
                .addGroup(panelKnjigaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtGodIzdanja)
                    .addComponent(cmbZanrovi, 0, 476, Short.MAX_VALUE)
                    .addComponent(txtBrPrimeraka)
                    .addComponent(cmbAutori, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtNazivKnjige)
                    .addComponent(txtPolica))
                .addContainerGap())
        );
        panelKnjigaLayout.setVerticalGroup(
            panelKnjigaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelKnjigaLayout.createSequentialGroup()
                .addGroup(panelKnjigaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNazivKnjige, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelKnjigaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cmbAutori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelKnjigaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtBrPrimeraka, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelKnjigaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbZanrovi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelKnjigaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtPolica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelKnjigaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtGodIzdanja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        btnSacuvaj.setText("Sačuvaj");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelKnjiga, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSacuvaj)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelKnjiga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSacuvaj)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSacuvaj;
    private javax.swing.JComboBox<Object> cmbAutori;
    private javax.swing.JComboBox<Object> cmbZanrovi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel panelKnjiga;
    private javax.swing.JTextField txtBrPrimeraka;
    private javax.swing.JTextField txtGodIzdanja;
    private javax.swing.JTextField txtNazivKnjige;
    private javax.swing.JTextField txtPolica;
    // End of variables declaration//GEN-END:variables

    public JButton getBtnSacuvaj() {
        return btnSacuvaj;
    }

    public void setBtnSacuvaj(JButton btnSacuvaj) {
        this.btnSacuvaj = btnSacuvaj;
    }

    public JComboBox<Object> getCmbAutori() {
        return cmbAutori;
    }

    public void setCmbAutori(JComboBox<Object> cmbAutori) {
        this.cmbAutori = cmbAutori;
    }

    public JComboBox<Object> getCmbZanrovi() {
        return cmbZanrovi;
    }

    public void setCmbZanrovi(JComboBox<Object> cmbZanrovi) {
        this.cmbZanrovi = cmbZanrovi;
    }

    public JTextField getTxtBrPrimeraka() {
        return txtBrPrimeraka;
    }

    public void setTxtBrPrimeraka(JTextField txtBrPrimeraka) {
        this.txtBrPrimeraka = txtBrPrimeraka;
    }

    public JTextField getTxtNazivKnjige() {
        return txtNazivKnjige;
    }

    public void setTxtNazivKnjige(JTextField txtNazivKnjige) {
        this.txtNazivKnjige = txtNazivKnjige;
    }

    public JTextField getTxtPolica() {
        return txtPolica;
    }

    public void setTxtPolica(JTextField txtPolica) {
        this.txtPolica = txtPolica;
    }

    public JTextField getTxtGodIzdanja() {
        return txtGodIzdanja;
    }

    
}
