package principal;

public class Estudiante extends Persona{
    /*Variables de la clase*/
    private String carnet;
    private String centroRegional;
    private String facultad;
    private String semestre;
    private String salon;
    private String curso1;
    private String curso2;
    private String curso3;
    private String curso4;
    private String curso5;
    private double nota1;
    private double nota2;
    private double nota3;
    private double nota4;
    private double nota5;
    
    public Estudiante (){       /*Constructor vacio*/
        
    }

    /*Constructor*/
    public Estudiante(String nombre, String apellido, String dpi, int edad,String carnet, String centroRegional, String facultad, String semestre, String salon, String curso1, String curso2, String curso3, String curso4, String curso5, double nota1, double nota2, double nota3, double nota4, double nota5){
        super(nombre, apellido, dpi, edad);
        this.carnet = carnet;
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

    
    /*Inicio - Metodos get y set de las variables de la clase.*/
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

    public String getCarnet() {
        return carnet;
    }

    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }
    /*Fin - Metodos get y set.*/
    
    //Metodo abstracto heredado de la clase abstracta Persona 
    @Override
    public void imprimirInfo(){
        System.out.println("------------------------------------------------------------------------------------");
        System.out.println("\tDatos del Alumno\nNo.carnet       : " +getCarnet());
        System.out.println("Nombre          : " +getNombre() +" "+ getApellido());
        System.out.println("No.DPI          : "+getDpi());
        System.out.println("Edad            : "+getEdad());
        System.out.println("Centro Regional : "+getCentroRegional());
        System.out.println("Facultad        : "+getFacultad());
        System.out.println("Semestre        : "+getSemestre());
        System.out.println("Salon           : "+getSalon());
        System.out.println(getCurso1()+": "+getNota1());
        System.out.println(getCurso2()+": "+getNota2());
        System.out.println(getCurso3()+": "+getNota3());
        System.out.println(getCurso4()+": "+getNota4());
        System.out.println(getCurso5()+": "+getNota5());
        System.out.println("------------------------------------------------------------------------------------");
    }

    //Metodo To String - Polimorfismo
    @Override
    public String toString() {
        return "||Datos del Alumno||"+ super.toString() +"\n||Centro Regional = " + centroRegional + "||Facultad = " + facultad + "|| Semestre = " + semestre + "|| Salon = " + salon + "||\n||" + curso1 + " = " + nota1 +"||\n||"+curso2 + " = "+nota2 +"||\n||"+ curso3 + " = "+ nota3+ "||\n||" + curso4 + " = " +nota4+"||\n||"+ curso5 + " = " + nota5 + "||";
    }
    
    
}
