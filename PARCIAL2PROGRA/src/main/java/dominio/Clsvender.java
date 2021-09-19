/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

/**
 *
 * @author HP-PC
 */
public class Clsvender {
    private int codigo;
    private String Nombre;
    private double Enero;
    private double febrero;
    private double Marzo;

    @Override
    public String toString() {
        return "Clsvender{" + "codigo=" + codigo + ", Nombre=" + Nombre + ", Enero=" + Enero + ", febrero=" + febrero + ", Marzo=" + Marzo + '}';
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public double getEnero() {
        return Enero;
    }

    public void setEnero(double Enero) {
        this.Enero = Enero;
    }

    public double getFebrero() {
        return febrero;
    }

    public void setFebrero(double febrero) {
        this.febrero = febrero;
    }

    public double getMarzo() {
        return Marzo;
    }

    public void setMarzo(double Marzo) {
        this.Marzo = Marzo;
    }
    
    
}
