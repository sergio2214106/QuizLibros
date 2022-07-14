package modelo;


public class Libros {
    

    //Atributos

    protected String nombreLibro;
    protected String nombreAutor;
    protected int añoEdicion;
    protected boolean tipoEdicion;
    protected int contador;


    public Libros(String nombreLibro,String nombreAutor, int añoEdicion, boolean tipoEdicion)
    {
        this.nombreLibro=nombreLibro;
        this.nombreAutor=(nombreAutor);
        this.añoEdicion=añoEdicion;
        this.tipoEdicion=tipoEdicion;
        contador++;
        
    }
    public Libros()
    {

    }

    public void añadirAutor(String n)
    {
        if (contador<1)
        {
            nombreAutor= n; 
            contador++;
        }
        else if(contador==1)
        {
            nombreAutor+= " y otros"; 
            contador++;
        }

    }



    //----------------------------------------------------------
    //Llenadores

    public void SetNombreLibro(String n)
    {
       nombreLibro = n;
    }
    public String GetNombreLibro()
    {
        return nombreLibro;
    }

    public void SetNombreAutor(String nA)
    {
       nombreAutor=(nA);
       contador++;
    }
    public String GetNombreAutor()
    {
        return nombreAutor;
    }


    public void SetAñoEdicion(int a)
    {
       añoEdicion = a;
    }
    public int GetAñoEdicion()
    {
        return añoEdicion;
    }


    public void SetTipoEdicion(boolean t)
    {
       tipoEdicion = t;
    }
    public boolean GetTipoEdicion()
    {
        return tipoEdicion;
    }



    





}
