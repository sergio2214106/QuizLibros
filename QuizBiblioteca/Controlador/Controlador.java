package Controlador;

import java.awt.event.ActionListener;

import modelo.Libros;
import Vista.SeleccionLibro;
import Vista.VentanaPrincipal;
import modelo.LibroDeColeccion;

import java.awt.event.ActionEvent;

public class Controlador implements ActionListener
{
        
    
        //----------------------
        //-------Atributos------
        //----------------------

        private VentanaPrincipal vista;
        private SeleccionLibro vistaInicial;
        private LibroDeColeccion modelo1;
        private Libros modelo2;

        //----------------------
        //---------Metodos------
        //---------------------- 
        
        /*Metodo Constructor*/
        public Controlador(VentanaPrincipal pvista, Libros pmodelo)
        {
            this.vista = pvista;
            this.modelo2= pmodelo;
            this.vista.miPanelOperaciones.btHallar.addActionListener(this);
            this.vista.miPanelOperaciones.btBorrar.addActionListener(this);
            this.vista.miPanelOperaciones.btSalir.addActionListener(this);
        }
        public Controlador(VentanaPrincipal pvista, LibroDeColeccion pmodelo)
        {
            this.vista = pvista;
            this.modelo1= pmodelo;
            this.vista.miPanelOperaciones.btHallar.addActionListener(this);
            this.vista.miPanelOperaciones.btBorrar.addActionListener(this);
            this.vista.miPanelOperaciones.btSalir.addActionListener(this);
        }
        public Controlador(SeleccionLibro vistaInicial)
        {
            this.vistaInicial = vistaInicial;
            this.vistaInicial.btLibros.addActionListener(this);
            this.vistaInicial.btLibrosdeColeccion.addActionListener(this);
        }
        
        @Override
        public void actionPerformed(ActionEvent ae)
        {
            // Identificar el comando generado [hallar, borrar, salir]

            String comando = ae.getActionCommand();


            if(comando.equals("salir"))
            {
                System.exit(0);
            }
            if(comando.equals("borrar"))
            {
                this.vista.miPanelEntradaDatos.borrar();
                this.vista.miPanelResultados.borrar();
            }
            if(comando.equals("hallar"))
            {

            }
            if(comando.equals("CrearControladorLibros"))
            {
                Libros miLibros= new Libros();
                VentanaPrincipal miVentanaPrincipal= new VentanaPrincipal();
                Controlador miControlador= new Controlador(miVentanaPrincipal, miLibros);
                //miSeleccionLibro.setVisible(true); 


            }
            if(comando.equals("CrearControladorLibrosDeColeccion"))
            {
                LibroDeColeccion miLibrosDeColeccion= new LibroDeColeccion();
                VentanaPrincipal miVentanaPrincipal= new VentanaPrincipal();
                Controlador miControlador= new Controlador(miVentanaPrincipal, miLibrosDeColeccion); 
            }
        }
    
}
