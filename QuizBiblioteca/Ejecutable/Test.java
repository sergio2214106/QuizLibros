package Ejecutable;

import Controlador.Controlador;
import Vista.SeleccionLibro;
import Vista.VentanaPrincipal;
import modelo.LibroDeColeccion;
import modelo.Libros;

public class Test 
{

    public static void main(String[] args)
    
    {
        SeleccionLibro mSeleccionLibro= new SeleccionLibro();
        Controlador miControlador = new Controlador(mSeleccionLibro);
    }
    
}
