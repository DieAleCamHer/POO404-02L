package interfaceswing.recursos;

import javax.swing.*;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class formPersona extends JFrame {
    private JPanel pnlPersona;
    private JComboBox cmbSexo;
    private JTextField txtId;
    private JTextField txtNombre;
    private JTextField txtEdad;
    private JTextField txtTelefono;
    private JButton btnObtenerDatos;
    private JButton btnLimpiar;
    private JPanel pnlBotones;

    public formPersona(String title) {
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(pnlPersona);
        this.setMinimumSize(new Dimension(600,500));
        this.setLocationRelativeTo(getParent());
        btnObtenerDatos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnObtenerDatos();
            }
        });
        btnLimpiar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnLimpiar();
            }
        });
    }

    private void btnObtenerDatos() {
        String id;
        String nombres;
        String edad;
        String telefono;
        String sexo;
        //adquiere de controles del form a datos dados por usuario
        id = txtId.getText();
        nombres = txtNombre.getText();
        edad = txtEdad.getText();
        telefono = txtTelefono.getText();
        sexo = cmbSexo.getSelectedItem().toString();

        JOptionPane.showMessageDialog(null,
                "Datos Obtenidos: \n ID: " + id +
                "\n nombres: " + nombres + "\n Edad: " + edad +
                "\n Telefono: " + telefono + "\n Sexo: " + sexo);
    }

    private void btnLimpiar() {
        //borra contenido actual de los controles del form
        txtId.setText("");
        txtNombre.setText("");
        txtEdad.setText("");
        txtTelefono.setText("");
        //pone el combobox en su valor de indice 0
        cmbSexo.setSelectedIndex(0);
        txtId.requestFocus(); //recibe el foco
    }
}
