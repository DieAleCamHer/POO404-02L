package interfaceswing;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class frmPersona extends JFrame {

    private JPanel pnlPersona;

    private JTextField txtId;
    private JTextField txtNombre;
    private JTextField txtEdad;
    private JTextField txtTelefono;

    private JComboBox<String> cmbSexo;

    private JButton btnObtenerDatos;
    private JButton btnLimpiar;

    private JTable tblDatos;

    private DefaultTableModel modelo;

    public frmPersona(String titulo) {

        setTitle(titulo);
        setSize(800,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        pnlPersona = new JPanel();
        pnlPersona.setLayout(new BorderLayout());

        JPanel panelForm = new JPanel(new GridLayout(5,2));

        panelForm.add(new JLabel("ID"));
        txtId = new JTextField();
        panelForm.add(txtId);

        panelForm.add(new JLabel("Nombre"));
        txtNombre = new JTextField();
        panelForm.add(txtNombre);

        panelForm.add(new JLabel("Edad"));
        txtEdad = new JTextField();
        panelForm.add(txtEdad);

        panelForm.add(new JLabel("Telefono"));
        txtTelefono = new JTextField();
        panelForm.add(txtTelefono);

        panelForm.add(new JLabel("Sexo"));
        cmbSexo = new JComboBox<>(new String[]{"Masculino","Femenino"});
        panelForm.add(cmbSexo);

        pnlPersona.add(panelForm, BorderLayout.NORTH);

        modelo = new DefaultTableModel();
        modelo.addColumn("ID");
        modelo.addColumn("Nombre");
        modelo.addColumn("Edad");
        modelo.addColumn("Telefono");
        modelo.addColumn("Sexo");

        tblDatos = new JTable(modelo);

        JScrollPane scroll = new JScrollPane(tblDatos);
        pnlPersona.add(scroll, BorderLayout.CENTER);

        JPanel panelBotones = new JPanel();

        btnObtenerDatos = new JButton("Obtener Datos");
        btnLimpiar = new JButton("Limpiar");

        panelBotones.add(btnObtenerDatos);
        panelBotones.add(btnLimpiar);

        pnlPersona.add(panelBotones, BorderLayout.SOUTH);

        add(pnlPersona);

        cargarDesdeCSV();

        btnObtenerDatos.addActionListener(e -> {
            btnObtenerDatos();
            btnLimpiar();
            guardarEnCSV();
        });

        btnLimpiar.addActionListener(e -> btnLimpiar());

        tblDatos.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                tblObtenerFila(e);
            }
        });
    }

    private void btnObtenerDatos() {

        String id = txtId.getText();
        String nombres = txtNombre.getText();
        String edad = txtEdad.getText();
        String telefono = txtTelefono.getText();
        String sexo = cmbSexo.getSelectedItem().toString();

        Object[] persona = {id,nombres,edad,telefono,sexo};

        insertarOActualizar(persona);

        JOptionPane.showMessageDialog(this,"Datos guardados correctamente");
    }

    private void btnLimpiar(){

        txtId.setText("");
        txtNombre.setText("");
        txtEdad.setText("");
        txtTelefono.setText("");
        cmbSexo.setSelectedIndex(0);
    }

    private void tblObtenerFila(MouseEvent e){

        int fila = tblDatos.rowAtPoint(e.getPoint());

        txtId.setText(modelo.getValueAt(fila,0).toString());
        txtNombre.setText(modelo.getValueAt(fila,1).toString());
        txtEdad.setText(modelo.getValueAt(fila,2).toString());
        txtTelefono.setText(modelo.getValueAt(fila,3).toString());
        cmbSexo.setSelectedItem(modelo.getValueAt(fila,4).toString());
    }

    private void cargarDesdeCSV(){

        File archivo = new File("src/datos/personas.csv");

        if(!archivo.exists()) return;

        try(BufferedReader br = new BufferedReader(new FileReader(archivo))){

            String linea;

            while((linea = br.readLine()) != null){

                String[] datos = linea.split(",");

                modelo.addRow(datos);
            }

        }catch(IOException e){
            e.printStackTrace();
        }
    }

    private void guardarEnCSV(){

        File archivo = new File("src/datos/personas.csv");

        try(PrintWriter pw = new PrintWriter(new FileWriter(archivo))){

            for(int i=0;i<modelo.getRowCount();i++){

                String linea = modelo.getValueAt(i,0)+","+
                        modelo.getValueAt(i,1)+","+
                        modelo.getValueAt(i,2)+","+
                        modelo.getValueAt(i,3)+","+
                        modelo.getValueAt(i,4);

                pw.println(linea);
            }

        }catch(IOException e){
            e.printStackTrace();
        }
    }

    private void insertarOActualizar(Object[] persona){

        String idNuevo = persona[0].toString();
        boolean encontrado = false;

        for(int i=0;i<modelo.getRowCount();i++){

            String idTabla = modelo.getValueAt(i,0).toString();

            if(idTabla.equals(idNuevo)){

                modelo.setValueAt(persona[1],i,1);
                modelo.setValueAt(persona[2],i,2);
                modelo.setValueAt(persona[3],i,3);
                modelo.setValueAt(persona[4],i,4);

                encontrado = true;
                break;
            }
        }

        if(!encontrado){
            modelo.addRow(persona);
        }
    }
}