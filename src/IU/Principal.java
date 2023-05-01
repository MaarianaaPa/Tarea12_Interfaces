package IU;

import IU.Eventos.EventosRaton;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Principal extends Frame {
    //componenetes como atributo de clase, composicion
    private Label lblNombre;
    private TextField txtNombre;
    private Button btnBoton1;

    // constructor sobrecargado que isa titulo

    public Principal(String title) throws HeadlessException {
        super(title);
        this.setSize(800, 600);
        // empezamos a configirar la interfaz
        // gestor de como se van ajustadndo
        this.setLayout(new FlowLayout());
        // creamos objetos y los ponemos
        lblNombre = new Label("Nombre: ");
        // agregamos a la interfaz
        this.add(lblNombre);
        // numero de columnas
        txtNombre = new TextField(30);
        // agregamos al contenedor
        this.add(txtNombre);


        //BOTON, creamos y añadimos al contenedor
        // el boton emite porque recibe el click
        btnBoton1 = new Button("Saludar");
        // cuando se de clisk da un evento, se jala el ecento y dice se da click
        // btnBoton1.addMouseListener(new EventosRaton());
        // haciendo con adaptarores, sobreescribiendo codigo
        btnBoton1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println(txtNombre.getText());
                // concatene cadena con txt
                JOptionPane.showMessageDialog(null, "Hola" + txtNombre.getText());
            }
        });
        this.add(btnBoton1);
        // para cerrar ventana
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
                // 0 means todo salio bien
            }
        });

        this.setVisible(true);
    }

}
