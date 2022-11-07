package calavera;
import javax.swing.*;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Isai
 */


public final class Calavera extends JFrame{

    public Calavera() {
        setTitle("Calavera Literaria");
        this.setSize(513, 400);
        setLayout(null);
        Componentes();
        //this.setResizable(false);
        setLocationRelativeTo(null);
    }
  
    public void Componentes() {
    
        JLabel etiqueta = new JLabel();
        etiqueta.setText("Hola");
        etiqueta.setBounds(0, 0, 500, 300);
        //etiqueta.setBorder(border);
        etiqueta.setIcon(new ImageIcon(getClass().getResource("/Imagen/Calaverita.gif")));
        
        JLabel etiqueta2 = new JLabel();
        etiqueta2.setBounds(125, 0, 700, 650);
        etiqueta2.setText("Toca la nariz de cualquier calaverita");
       
   

        
        
        JButton boton = new JButton();
        boton.setText("click");
        boton.setBounds(230, 135, 20,20);

        
        JButton boton2 = new JButton();
        boton2.setText("click");
        boton2.setBounds(157, 190, 20,20);
        
        JButton boton3 = new JButton();
        boton3.setText("click");
        boton3.setBounds(350, 150, 20,20);
        
        boton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {

                CalaveraLiteraria texto = new CalaveraLiteraria();
                texto.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                texto.setVisible(true);

                setVisible(false);

            }
        });
        
        boton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {

                CalaveraLiteraria2 texto = new CalaveraLiteraria2();
                texto.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                texto.setVisible(true);

                setVisible(false);

            }
        });
        
        boton3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {

                CalaveraLiteraria3 texto = new CalaveraLiteraria3();
                texto.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                texto.setVisible(true);

                setVisible(false);

            }
        });
        
        add(etiqueta);
        add(etiqueta2);
        add(boton);
        add(boton2);
        add(boton3);

    }

    
    public static void main(String[] args) {
        Calavera calavera = new Calavera();
        calavera.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        calavera.setVisible(true);
       
    }

}