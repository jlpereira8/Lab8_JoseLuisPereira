/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8_joseluispereira;

/**
 *
 * @author j0c3lwiz
 */
public class empleados {
    //Todos los empleados (Los gerentes también son empleados ) tienen: Un nombre , ID empresa , contraseña, quien es su jefe , 
    //salario y puesto( En los gerentes la gerencia es su puesto).
    private String nombre;
    private String empresa;
    private String contra;
    private String boss;
    private double salario;
    private String puesto;

    public empleados(String nombre, String empresa, String contra, String boss, double salario, String puesto) {
        this.nombre = nombre;
        this.empresa = empresa;
        this.contra = contra;
        this.boss = boss;
        this.salario = salario;
        this.puesto = puesto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public String getBoss() {
        return boss;
    }

    public void setBoss(String boss) {
        this.boss = boss;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    @Override
    public String toString() {
        return puesto+" = "+nombre;
    }

    
    
    
    
    
}
