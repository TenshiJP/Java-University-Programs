
package principal;

import java.util.*;

public class Estudiante extends Persona {
    private String centroRegional;
    private String facultad;
    private String semestre;
    private String salon;
    private String curso1, curso2, curso3, curso4, curso5;
    private double nota1, nota2, nota3, nota4, nota5;

    public Estudiante() {
        
    }

    public Estudiante(String nombre, String apellido, String dpi, int edad, String centroRegional, String facultad, String semestre, String salon, String curso1, String curso2, String curso3, String curso4, String curso5, double nota1, double nota2, double nota3, double nota4, double nota5) {
        super(nombre, apellido, dpi, edad);
        this.centroRegional = centroRegional;
        this.facultad = facultad;
        this.semestre = semestre;
        this.salon = salon;
        this.curso1 = curso1;
        this.curso2 = curso2;
        this.curso3 = curso3;
        this.curso4 = curso4;
        this.curso5 = curso5;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.nota4 = nota4;
        this.nota5 = nota5;
    }
  
    public String getCentroRegional() {
        return centroRegional;
    }

    public void setCentroRegional(String centroRegional) {
        this.centroRegional = centroRegional;
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    public String getSalon() {
        return salon;
    }

    public void setSalon(String salon) {
        this.salon = salon;
    }

    public String getCurso1() {
        return curso1;
    }

    public void setCurso1(String curso1) {
        this.curso1 = curso1;
    }

    public String getCurso2() {
        return curso2;
    }

    public void setCurso2(String curso2) {
        this.curso2 = curso2;
    }

    public String getCurso3() {
        return curso3;
    }

    public void setCurso3(String curso3) {
        this.curso3 = curso3;
    }

    public String getCurso4() {
        return curso4;
    }

    public void setCurso4(String curso4) {
        this.curso4 = curso4;
    }

    public String getCurso5() {
        return curso5;
    }

    public void setCurso5(String curso5) {
        this.curso5 = curso5;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public double getNota4() {
        return nota4;
    }

    public void setNota4(double nota4) {
        this.nota4 = nota4;
    }

    public double getNota5() {
        return nota5;
    }

    public void setNota5(double nota5) {
        this.nota5 = nota5;
    }
  

    @Override
    public void imprimirInfo(){
        
    }

    @Override
    public String toString() {
        return super.toString()+" Estudiante{" + "centroRegional=" + centroRegional + ", facultad=" + facultad + '}';
    }
      
}
