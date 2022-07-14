package Vista;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SeleccionLibro extends JFrame
{

    public JButton btLibros;
    public JButton btLibrosdeColeccion;

    public SeleccionLibro()
        {
            //Contenedor de la ventana
            this.setLayout(null);

            btLibros= new JButton("[Libro]");
            btLibros.setBounds(45, 40, 150, 40);
            this.add(btLibros);
            btLibros.setActionCommand("CrearControladorLibros");

            btLibrosdeColeccion= new JButton("[Libro de coleccion]");
            btLibrosdeColeccion.setBounds(205, 40, 180, 40);
            this.add(btLibrosdeColeccion);
            btLibrosdeColeccion.setActionCommand("CrearControladorLibrosDeColeccion");


            //CaracteristiCas de la ventana
            this.setTitle("Seleccione");
            this.setSize(470,200);
            //this.setLocation(100, 100);
            this.setLocationRelativeTo(null);
            this.setResizable(false);
            this.setDefaultCloseOperation(EXIT_ON_CLOSE);
            this.setVisible(true);


        }
}
