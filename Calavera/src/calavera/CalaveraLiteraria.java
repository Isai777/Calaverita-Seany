package calavera;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author Isai
 */
public class CalaveraLiteraria extends JFrame {

    public CalaveraLiteraria() {
        setTitle("Calavera Literaria Texto");
        setSize(1278, 720);
        setLayout(null);
        Componentes();
        //this.setResizable(false);
        setLocationRelativeTo(null);
    }

    public void Componentes() {

        JLabel etiqueta = new JLabel();
        etiqueta.setText("Texto / Imagen");
        etiqueta.setBounds(0, 0, 1278, 720);
        etiqueta.setIcon(new ImageIcon(getClass().getResource("/Imagen/10.gif")));
     
        JButton boton = new JButton();
        boton.setText("<--//");
        boton.setBounds(100, 550, 100, 30);
        boton.addActionListener((ActionEvent arg0) -> {
            Calavera literaria = new Calavera();
            literaria.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            literaria.setVisible(true);
            
            setVisible(false);
        });

       
         add(boton);
        add(etiqueta);
       
    }

}
