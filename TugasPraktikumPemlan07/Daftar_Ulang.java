package TugasPraktikumPemlan07;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class Daftar_Ulang extends JFrame {
    private JLabel lblNamaLengkap, lblTanggalLahir, lblNomorPendaftaran, lblNoTelp, lblAlamat, lblEmail;
    private JTextField txtNamaLengkap, txtTanggalLahir, txtNomorPendaftaran, txtNoTelp, txtAlamat, txtEmail;
    private JButton btnSubmit;

    public Daftar_Ulang() {
        setLayout(null);
        setTitle("Formulir Daftar Ulang Mahasiswa Baru");

        lblNamaLengkap = new JLabel("Nama Lengkap");
        txtNamaLengkap = new JTextField();

        lblTanggalLahir = new JLabel("Tanggal Lahir");
        txtTanggalLahir = new JTextField();
        
        lblNomorPendaftaran = new JLabel("Nomor Pendaftaran");
        txtNomorPendaftaran = new JTextField();

        lblNoTelp = new JLabel("No. Telp");
        txtNoTelp = new JTextField();

        lblAlamat = new JLabel("Alamat");
        txtAlamat = new JTextField();

        lblEmail = new JLabel("E-mail");
        txtEmail = new JTextField(); 
      
        btnSubmit = new JButton("Submit");

        setSize(400, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        
        lblNamaLengkap.setBounds(20, 20, 150, 30);
        add(lblNamaLengkap);
        txtNamaLengkap.setBounds(15, 50, 360, 20);
        add(txtNamaLengkap);
        lblTanggalLahir.setBounds(20, 70, 150, 30);
        add(lblTanggalLahir);
        txtTanggalLahir.setBounds(15, 100, 360, 20);
        add(txtTanggalLahir);
        lblNomorPendaftaran.setBounds(20, 120, 150, 30);
        add(lblNomorPendaftaran);
        txtNomorPendaftaran.setBounds(15, 150, 360, 20);
        add(txtNomorPendaftaran);
        lblNoTelp.setBounds(20, 170, 150, 30);
        add(lblNoTelp);
        txtNoTelp.setBounds(15, 200, 360, 20);
        add(txtNoTelp);
        lblAlamat.setBounds(20, 220, 150, 30);
        add(lblAlamat);
        txtAlamat.setBounds(15, 250, 360, 20);
        add(txtAlamat);
        lblEmail.setBounds(20, 270, 150, 30);
        add(lblEmail);
        txtEmail.setBounds(15, 300, 360, 20);
        add(txtEmail);
        btnSubmit.setBounds(270, 335, 100, 25);
        add(btnSubmit);
        
        btnSubmit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (isFieldFilled()) {
                    JOptionPane.showMessageDialog(Daftar_Ulang.this, "Data sukses disubmit!");
                    showOutput();
                } else {
                    JOptionPane.showMessageDialog(Daftar_Ulang.this, "Mohon isi semua data yang diperlukan!");
                }
            }
        });
    }
    
    public boolean isFieldFilled() {
        return !txtNamaLengkap.getText().isEmpty() 
        && !txtTanggalLahir.getText().isEmpty() 
        && !txtNomorPendaftaran.getText().isEmpty() 
        && !txtNoTelp.getText().isEmpty() 
        && !txtAlamat.getText().isEmpty() 
        && !txtEmail.getText().isEmpty();
    }

    public void showOutput() {
        JFrame frame = new JFrame("Data Mahasiswa Baru");
        frame.setLayout(null);
        frame.setSize(400, 500);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setVisible(true);

        JLabel lblNamaLengkapOutput = new JLabel("Nama Lengkap : " + txtNamaLengkap.getText());
        lblNamaLengkapOutput.setBounds(20, 20, 300, 30);
        JLabel lblTanggalLahirOutput = new JLabel("Tanggal Lahir : " + txtTanggalLahir.getText());
        lblTanggalLahirOutput.setBounds(20, 50, 300, 30);
        JLabel lblNomorPendaftaranOutput = new JLabel("Nomor Pendaftaran : " + txtNomorPendaftaran.getText());
        lblNomorPendaftaranOutput.setBounds(20, 80, 300, 30);
        JLabel lblNoTelpOutput = new JLabel("Nomor Telepon : " + txtNoTelp.getText());
        lblNoTelpOutput.setBounds(20, 110, 300, 30);
        JLabel lblAlamatOutput = new JLabel("Alamat : " + txtAlamat.getText());
        lblAlamatOutput.setBounds(20, 140, 300, 30);
        JLabel lblEmailOutput = new JLabel("Email : " + txtEmail.getText());
        lblEmailOutput.setBounds(20, 170, 300, 30);

        frame.add(lblNamaLengkapOutput);
        frame.add(lblTanggalLahirOutput);
        frame.add(lblNomorPendaftaranOutput);
        frame.add(lblNoTelpOutput);
        frame.add(lblAlamatOutput);
        frame.add(lblEmailOutput);
    }
}