package interfaceswing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class frmBotonesRadio extends JFrame {

    private JPanel pnlImagenes;
    private JLabel lblTitulo;
    private JLabel lblImagen;

    private JRadioButton rbtOpcion1;
    private JRadioButton rbtOpcion2;
    private JRadioButton rbtOpcion3;

    private ButtonGroup buttonGroup1;

    public frmBotonesRadio(String titulo) {

        setTitle(titulo);
        setSize(new Dimension(600, 450));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        pnlImagenes = new JPanel();
        pnlImagenes.setLayout(new GridLayout(5,2));

        lblTitulo = new JLabel("Seleccione una imagen");
        lblTitulo.setFont(new Font("Segoe Print", Font.BOLD, 22));

        pnlImagenes.add(lblTitulo);
        pnlImagenes.add(new JLabel(""));

        rbtOpcion1 = new JRadioButton("Opcion 1");
        rbtOpcion2 = new JRadioButton("Opcion 2");
        rbtOpcion3 = new JRadioButton("Opcion 3");

        buttonGroup1 = new ButtonGroup();
        buttonGroup1.add(rbtOpcion1);
        buttonGroup1.add(rbtOpcion2);
        buttonGroup1.add(rbtOpcion3);

        pnlImagenes.add(rbtOpcion1);
        pnlImagenes.add(new JLabel(""));

        pnlImagenes.add(rbtOpcion2);
        pnlImagenes.add(new JLabel(""));

        pnlImagenes.add(rbtOpcion3);
        pnlImagenes.add(new JLabel(""));

        lblImagen = new JLabel();
        lblImagen.setHorizontalAlignment(JLabel.CENTER);

        ImageIcon imagenInicial = new ImageIcon(
                getClass().getResource("/interfaceswing/recursos/question-icon.jpeg"));

        lblImagen.setIcon(imagenInicial);

        pnlImagenes.add(lblImagen);

        add(pnlImagenes);

        rbtOpcion1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                ImageIcon imagen = new ImageIcon(
                        getClass().getResource("/interfaceswing/recursos/img1.jpeg"));

                lblImagen.setIcon(imagen);
            }
        });

        rbtOpcion2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                ImageIcon imagen = new ImageIcon(
                        getClass().getResource("/interfaceswing/recursos/img2.jpeg"));

                lblImagen.setIcon(imagen);
            }
        });

        rbtOpcion3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                ImageIcon imagen = new ImageIcon(
                        getClass().getResource("/interfaceswing/recursos/img3.jpeg"));

                lblImagen.setIcon(imagen);
            }
        });
    }
}