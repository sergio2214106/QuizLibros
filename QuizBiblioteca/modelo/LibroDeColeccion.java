package modelo;

public class LibroDeColeccion extends Libros
{

    //Atributos

    private String nombreColeccion;
    private int numeroEnLaColeccion;


    public LibroDeColeccion(String nombreLibro, String nombreAutor, int añoEdicion, boolean tipoEdicion, String nombreColeccion, int numeroEnLaColeccion) 
    {

        super(nombreLibro, nombreAutor, añoEdicion, tipoEdicion);
        this.nombreColeccion= nombreColeccion;
        this.numeroEnLaColeccion= numeroEnLaColeccion;

    }
    public LibroDeColeccion() 
    {
    }

    public String getNombreColeccion() 
    {
        return nombreColeccion;
    }

    public void setNombreColeccion(String nombreColeccion) 
    {
        this.nombreColeccion = nombreColeccion;
    }

    public int getNumeroEnLaColeccion() {
        return numeroEnLaColeccion;
    }

    public void setNumeroEnLaColeccion(int numeroEnLaColeccion) {
        this.numeroEnLaColeccion = numeroEnLaColeccion;
    }
    
}