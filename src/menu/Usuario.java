/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menu;

/**
 *
 * @author Henry
 */
public class Usuario {
    private String nombre;
    private String correo;
    private String password;
    private int totalRegistros;

    public Usuario(String nombre, String correo, String password) {
        this.nombre = nombre;
        this.correo = correo;
        this.password = password;
        this.totalRegistros = 0;
        
    }
    public Usuario(int totalRegistros) {
        this.totalRegistros = totalRegistros;
    }

     public String getNombre() {
        return nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public String getPassword() {
        return password;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public String verRegistro() {
        return "Cantidad de usuarios registrados: " + totalRegistros;
    }
}
