/*  
    - Integrantes:
        
        
        
    - Compilador utilizado: Apache NetBeans IDE 12.4
    - Sitemas operativos utilizados: Mac-OS y Windows.
    - Código fuente finalizado 23/09/2021.
    - Documentación finalizada 
        
    -
        
    - El programa utiliza variables de tipo String, int, boolean, double.
        Striing: Son utilizadas para guardas cadenas texto (nombres, facultad, cursos, etc) y guardas datos para buscar en las colecciones.
        int: Son utilizadas en ciclos Do-While y for, guardar datos como la edad, ingrear opciones para seleccionar opcion de los switchs.
        boolean: Son utilizadas para las condicionales y para algunos ciclos Do-While.        
        double: Son utilizadasa para guardar las calificaciones de los cursos.
*/
package principal;

import java.util.*;
public class Principal {
    public static void main(String[] args) {
        ArrayList<Estudiante> estudiantes = new ArrayList<Estudiante>();    //Collecion de tipo Estudiante.
        int opcionMenu;   //Variable para seleccionar una opcion en el menú principal.
        Scanner entrada = new Scanner (System.in);  //Objeto tipo Scanner para la lectura de datos desde teclado.
        do{     /*Inicio - Ciclo Do-While para el Menu Principal*/
            System.out.println("\n\t MENU \n| 1 |  Ingresar Registro\n| 2 |  Eliminar registro\n"
                    + "| 3 |  Actualizar registro\n| 4 |  Consultar registros\n| 5 |  Salir");
            System.out.println("Ingrese la opcion: ");
            opcionMenu = validarInt();       //Ingreso de la opción a ingresar al menu desde teclado.
            switch (opcionMenu){            /*Código con las opciones del menu*/
                /*Inicio - Codigo para registrar un estudiante a la coleccion*/
                case 1: 
                    System.out.println("\tIngreso de resgistros\nInscripción");
                    Estudiante estudiante = new Estudiante();   //Instancia de la clase estudiante, para crear objeto tipo Estudiante.
                    
                    /*Inicio - Codigo para comprobar que no se este incluyendo un carnet existente*/
                    System.out.println("Ingrese No.carnet       :");
                    String carnet1 = entrada.nextLine();    //Variable para guardar el carnet del estudiante a registrar y verificar que no este registrado ya.
                    boolean comparar = false;   //Variable booleana para condicional si se encuentra repetido el carnet ingresado anteriormente
                    for(int j=0;j<estudiantes.size();j++){  /*Inicio - Ciclo para recorrer por todos los objetos guardaddo en la coleccion*/
                        Estudiante posicion = estudiantes.get(j);   //Se guarda la posicion de la coleccion en que se encuntra en la varible posicion.
                        if(posicion.getCarnet().equals(carnet1)){   //Condicional para comparar el carnet ingresado en la coleccion.
                            comparar = true;    
                        }
                    }   /*Fin ciclo*/
                    if(comparar){   /*Inicio - Condicional para verificar si carnet ya esta existente*/
                        System.out.println("\tEl No.carnet ya Existe");
                        break;  //Regresa al Menu principal
                    }else{  /*Si el condicoinal no se cumple*/
                        System.out.println("No existe");
                        estudiante.setCarnet(carnet1); //Guarda el carnet ingresado en el objeto estudiante.
                    }
                    /*Fin*/
                    System.out.println("Ingrese nombres         : ");
                    estudiante.setNombre(entrada.nextLine());   //Solicita el nombre desde el teclado, y lo guarda en el objeto estudiante.
                    System.out.println("Ingrese apellidos       : ");
                    estudiante.setApellido(entrada.nextLine());     //Solicita el apellido desde el teclado, y lo guarda en el objeto estudiante.
                    System.out.println("Ingrese DPI             : ");
                    estudiante.setDpi(entrada.nextLine());  //Solicita el DPI desde el teclado, y lo guarda en el objeto estudiante.
                    do{     /*Inicio - Codigo para ingresar una edad valida en ciclo Do-While*/
                        System.out.println("Ingrese edad            : ");
                        estudiante.setEdad(validarInt());   //Solicita la desde el teclado, verifica que lo ingreado sea un dato adecuado y lo guarda en el objeto estudiante.
                        if(estudiante.getEdad() < 18){  /*Condicional para verificar que la edad sea valida*/
                            System.out.println("\tERROR: Ingreso una edad invalida");
                        }else{} /*Fin condiconal*/
                    }while(estudiante.getEdad() < 18);  /*Fin*/
                    System.out.println("Ingrese centro Regional : ");
                    estudiante.setCentroRegional(entrada.nextLine());   //Solicita el centro regional desde el teclado, y lo guarda en el objeto estudiante.
                    int opcFacultad;    //Variable para seleccionar una facultad.
                    boolean opcion = false;     //Variable booleana para cerrar ciclo do while de Facultad
                    do{     /*Inicio clico Do-While para seleccionar la facultad*/
                        System.out.println("\tNuestras Facultades");
                        System.out.println("|1| Ingenieria en Sistemas");
                        System.out.println("|2| Psicologia Industrial");
                        System.out.println("|3| Contaduria Publica y Auditoria");
                        System.out.println("|4| Ingenieria Industrial");
                        System.out.println("|5| Ciencias Juridicas y Sociales");
                        System.out.println("Ingrese la opcion que desea:");
                        opcFacultad = validarInt();     //Solicitar la opcion a ingrear desde el teclado.
                        switch(opcFacultad){
                            case 1:     /*Codigo para falcultad de Ing. en Sistemas*/
                                System.out.println("\tFACULTAD DE INGENIERIA EN SISTEMAS ");
                                estudiante.setFacultad("Ingenieria en Sistemas");   //Guarda la facultad seleccionada en el objeto estudiante
                                boolean semestre = false;//opcion para cerrar ciclo Do-While de semestre.
                                int opcSemestre1; //Variable para seleccionar el semestre
                                do{     /*Inicio - Ciclo Do-While para seleccionar el semestre*/
                                    System.out.println("Semestres: \n|1| Primer semestre\n|2| Segundo semestre\n|3| Tercer semestre\n|4| Cuarto semestre");
                                    System.out.println("|5| Quinto semestre\n|6| Sexto Semestre\n|7| Septimo semestre\n|8| Octavo semestre\n|9| Noveno semestre\n|10| Decimo semestre");
                                    System.out.println("Ingrese opcion: ");
                                    opcSemestre1 = validarInt();    //Solicita la opcion que desea desde el teclado
                                    switch(opcSemestre1){
                                        case 1:
                                            estudiante.setSemestre("Semestre I");   //Guarda el semestre seleccionado en el objeto estudiante
                                            System.out.println("\bSemestre I: Se ha inscrito a los 5 cursos del semestre.");
                                            System.out.println("Ingrese salon       :");
                                            estudiante.setSalon(entrada.nextLine());    //Solicita el salon desde el teclado, y lo guarda en el objeto estudiante.
                                            estudiante.setCurso1("Desarrollo humano y profesional");
                                            estudiante.setCurso2("Metodologia de la investigacion");
                                            estudiante.setCurso3("Contabilidad I");
                                            estudiante.setCurso4("Introduccion a los sistemas de computo");
                                            estudiante.setCurso5("Logica de sistemas");
                                            System.out.println("Ingrese nota de "+estudiante.getCurso1()+" :");
                                            estudiante.setNota1(validarDouble());   //Solicita la nota 1 desde el teclado, y lo guarda en el objeto estudiante.
                                            System.out.println("Ingrese nota de "+estudiante.getCurso2()+" :");
                                            estudiante.setNota2(validarDouble());   //Solicita la nota 2 desde el teclado, y lo guarda en el objeto estudiante.
                                            System.out.println("Ingrese nota de "+estudiante.getCurso3()+" :");
                                            estudiante.setNota3(validarDouble());   //Solicita la nota 3 desde el teclado, y lo guarda en el objeto estudiante.
                                            System.out.println("Ingrese nota de "+estudiante.getCurso4()+" :");
                                            estudiante.setNota4(validarDouble());   //Solicita la nota 4 desde el teclado, y lo guarda en el objeto estudiante.
                                            System.out.println("Ingrese nota de "+estudiante.getCurso5()+" :");
                                            estudiante.setNota5(validarDouble());   //Solicita el nota 5 desde el teclado, y lo guarda en el objeto estudiante.
                                            semestre=true;
                                            break; //Cierra ciclo
                                            
                                        case 2:
                                            estudiante.setSemestre("Semestre II");   //Guarda el semestre seleccionado en el objeto estudiante
                                            System.out.println("\bSemestre II: Se ha inscrito a los 5 cursos del semestre.");
                                            System.out.println("Ingrese salon       :");
                                            estudiante.setSalon(entrada.nextLine());    //Solicita el salon desde el teclado, y lo guarda en el objeto estudiante.
                                            estudiante.setCurso1("Precalculo");
                                            estudiante.setCurso2("Algebra lineal");
                                            estudiante.setCurso3("Contabilidad II");
                                            estudiante.setCurso4("Algoritmos");
                                            estudiante.setCurso5("Matematica discreta");
                                            System.out.println("Ingrese nota de "+estudiante.getCurso1()+" :");
                                            estudiante.setNota1(validarDouble());   //Solicita la nota 1 desde el teclado, y lo guarda en el objeto estudiante.
                                            System.out.println("Ingrese nota de "+estudiante.getCurso2()+" :");
                                            estudiante.setNota2(validarDouble());   //Solicita la nota 2 desde el teclado, y lo guarda en el objeto estudiante.
                                            System.out.println("Ingrese nota de "+estudiante.getCurso3()+" :");
                                            estudiante.setNota3(validarDouble());   //Solicita la nota 3 desde el teclado, y lo guarda en el objeto estudiante.
                                            System.out.println("Ingrese nota de "+estudiante.getCurso4()+" :");
                                            estudiante.setNota4(validarDouble());   //Solicita la nota 4 desde el teclado, y lo guarda en el objeto estudiante.
                                            System.out.println("Ingrese nota de "+estudiante.getCurso5()+" :");
                                            estudiante.setNota5(validarDouble());   //Solicita la nota 5 desde el teclado, y lo guarda en el objeto estudiante.
                                            semestre=true;
                                            break;      //Cierra ciclo
                                            
                                        case 3:
                                            estudiante.setSemestre("Semestre III");   //Guarda el semestre seleccionado en el objeto estudiante
                                            System.out.println("\bSemestre III: Se ha inscrito a los 5 cursos del semestre.");
                                            System.out.println("Ingrese salon       :");
                                            estudiante.setSalon(entrada.nextLine());    //Solicita el salon desde el teclado, y lo guarda en el objeto estudiante.
                                            estudiante.setCurso1("Fisica I");
                                            estudiante.setCurso2("Programacion I");
                                            estudiante.setCurso3("Contabilidad I");
                                            estudiante.setCurso4("Calculo I");
                                            estudiante.setCurso5("Proceso Administrativo");
                                            System.out.println("Ingrese nota de "+estudiante.getCurso1()+" :");
                                            estudiante.setNota1(validarDouble());   //Solicita la nota 1 desde el teclado, y lo guarda en el objeto estudiante.
                                            System.out.println("Ingrese nota de "+estudiante.getCurso2()+" :");
                                            estudiante.setNota2(validarDouble());   //Solicita la nota 2 desde el teclado, y lo guarda en el objeto estudiante.
                                            System.out.println("Ingrese nota de "+estudiante.getCurso3()+" :");
                                            estudiante.setNota3(validarDouble());   //Solicita la nota 3 desde el teclado, y lo guarda en el objeto estudiante.
                                            System.out.println("Ingrese nota de "+estudiante.getCurso4()+" :");
                                            estudiante.setNota4(validarDouble());   //Solicita la nota 4 desde el teclado, y lo guarda en el objeto estudiante.
                                            System.out.println("Ingrese nota de "+estudiante.getCurso5()+" :");
                                            estudiante.setNota5(validarDouble());   //Solicita la nota 5 desde el teclado, y lo guarda en el objeto estudiante.
                                            semestre=true;
                                            break;  //cierra ciclo
                                            
                                        case 4:
                                            estudiante.setSemestre("Semestre IV");   //Guarda el semestre seleccionado en el objeto estudiante
                                            System.out.println("\bSemestre IV: Se ha inscrito a los 5 cursos del semestre.");
                                            System.out.println("Ingrese salon       :");
                                            estudiante.setSalon(entrada.nextLine());    //Solicita el salon desde el teclado, y lo guarda en el objeto estudiante.
                                            estudiante.setCurso1("Microeconomia");
                                            estudiante.setCurso2("Progrmacion II");
                                            estudiante.setCurso3("Calculo II");
                                            estudiante.setCurso4("Estadistiac I");
                                            estudiante.setCurso5("Fisica II");
                                            System.out.println("Ingrese nota de "+estudiante.getCurso1()+" :");
                                            estudiante.setNota1(validarDouble());   //Solicita la nota 1 desde el teclado, y lo guarda en el objeto estudiante.
                                            System.out.println("Ingrese nota de "+estudiante.getCurso2()+" :");
                                            estudiante.setNota2(validarDouble());   //Solicita la nota 2 desde el teclado, y lo guarda en el objeto estudiante.
                                            System.out.println("Ingrese nota de "+estudiante.getCurso3()+" :");
                                            estudiante.setNota3(validarDouble());   //Solicita la nota 3 desde el teclado, y lo guarda en el objeto estudiante.
                                            System.out.println("Ingrese nota de "+estudiante.getCurso4()+" :");
                                            estudiante.setNota4(validarDouble());   //Solicita la nota 4 desde el teclado, y lo guarda en el objeto estudiante.
                                            System.out.println("Ingrese nota de "+estudiante.getCurso5()+" :");
                                            estudiante.setNota5(validarDouble());   //Solicita la nota 5 desde el teclado, y lo guarda en el objeto estudiante.
                                            semestre=true;
                                            break;  //cierra ciclo
                                            
                                        case 5:
                                            estudiante.setSemestre("Semestre V");   //Guarda el semestre seleccionado en el objeto estudiante
                                            System.out.println("\bSemestre V: Se ha inscrito a los 5 cursos del semestre.");
                                            System.out.println("Ingrese salon       :");
                                            estudiante.setSalon(entrada.nextLine());    //Solicita el salon desde el teclado, y lo guarda en el objeto estudiante.
                                            estudiante.setCurso1("Metodos numericos");
                                            estudiante.setCurso2("Progrmacion III");
                                            estudiante.setCurso3("Emprendedores de negocios");
                                            estudiante.setCurso4("Electronica analogica");
                                            estudiante.setCurso5("Estadistica II");
                                            System.out.println("Ingrese nota de "+estudiante.getCurso1()+" :");
                                            estudiante.setNota1(validarDouble());   //Solicita la nota 1 desde el teclado, y lo guarda en el objeto estudiante.
                                            System.out.println("Ingrese nota de "+estudiante.getCurso2()+" :");
                                            estudiante.setNota2(validarDouble());   //Solicita la nota 2 desde el teclado, y lo guarda en el objeto estudiante.
                                            System.out.println("Ingrese nota de "+estudiante.getCurso3()+" :");
                                            estudiante.setNota3(validarDouble());   //Solicita la nota 3 desde el teclado, y lo guarda en el objeto estudiante.
                                            System.out.println("Ingrese nota de "+estudiante.getCurso4()+" :");
                                            estudiante.setNota4(validarDouble());   //Solicita la nota 4 desde el teclado, y lo guarda en el objeto estudiante.
                                            System.out.println("Ingrese nota de "+estudiante.getCurso5()+" :");
                                            estudiante.setNota5(validarDouble());   //Solicita la nota 5 desde el teclado, y lo guarda en el objeto estudiante.
                                            semestre=true;
                                            break;  //cierra ciclo
                                            
                                        case 6:
                                            estudiante.setSemestre("Semestre VI");   //Guarda el semestre seleccionado en el objeto estudiante
                                            System.out.println("\bSemestre VI: Se ha inscrito a los 5 cursos del semestre.");
                                            System.out.println("Ingrese salon       :");
                                            estudiante.setSalon(entrada.nextLine());    //Solicita el salon desde el teclado, y lo guarda en el objeto estudiante.
                                            estudiante.setCurso1("Investigacion de operaciones");
                                            estudiante.setCurso2("Base de datos I");
                                            estudiante.setCurso3("Automatas y lenguajes formales");
                                            estudiante.setCurso4("Sistemas operativos I");
                                            estudiante.setCurso5("Electronica digital");
                                            System.out.println("Ingrese nota de "+estudiante.getCurso1()+" :");
                                            estudiante.setNota1(validarDouble());   //Solicita la nota 1 desde el teclado, y lo guarda en el objeto estudiante.
                                            System.out.println("Ingrese nota de "+estudiante.getCurso2()+" :");
                                            estudiante.setNota2(validarDouble());   //Solicita la nota 2 desde el teclado, y lo guarda en el objeto estudiante.
                                            System.out.println("Ingrese nota de "+estudiante.getCurso3()+" :");
                                            estudiante.setNota3(validarDouble());   //Solicita la nota 3 desde el teclado, y lo guarda en el objeto estudiante.
                                            System.out.println("Ingrese nota de "+estudiante.getCurso4()+" :");
                                            estudiante.setNota4(validarDouble());   //Solicita la nota 4 desde el teclado, y lo guarda en el objeto estudiante.
                                            System.out.println("Ingrese nota de "+estudiante.getCurso5()+" :");
                                            estudiante.setNota5(validarDouble());   //Solicita la nota 5 desde el teclado, y lo guarda en el objeto estudiante.
                                            semestre=true;
                                            break;  //cierra ciclo
                                            
                                        case 7:
                                            estudiante.setSemestre("Semestre VII");   //Guarda el semestre seleccionado en el objeto estudiante
                                            System.out.println("\bSemestre VII: Se ha inscrito a los 5 cursos del semestre.");
                                            System.out.println("Ingrese salon       :");
                                            estudiante.setSalon(entrada.nextLine());    //Solicita el salon desde el teclado, y lo guarda en el objeto estudiante.
                                            estudiante.setCurso1("Base de datos II");
                                            estudiante.setCurso2("Sistemas operativos II");
                                            estudiante.setCurso3("Arquitectura de computadoras I");
                                            estudiante.setCurso4("Analisis de sistemas I");
                                            estudiante.setCurso5("Compiladores");
                                            System.out.println("Ingrese nota de "+estudiante.getCurso1()+" :");
                                            estudiante.setNota1(validarDouble());   //Solicita la nota 1 desde el teclado, y lo guarda en el objeto estudiante.
                                            System.out.println("Ingrese nota de "+estudiante.getCurso2()+" :");
                                            estudiante.setNota2(validarDouble());   //Solicita la nota 2 desde el teclado, y lo guarda en el objeto estudiante.
                                            System.out.println("Ingrese nota de "+estudiante.getCurso3()+" :");
                                            estudiante.setNota3(validarDouble());   //Solicita la nota 3 desde el teclado, y lo guarda en el objeto estudiante.
                                            System.out.println("Ingrese nota de "+estudiante.getCurso4()+" :");
                                            estudiante.setNota4(validarDouble());   //Solicita la nota 4 desde el teclado, y lo guarda en el objeto estudiante.
                                            System.out.println("Ingrese nota de "+estudiante.getCurso5()+" :");
                                            estudiante.setNota5(validarDouble());   //Solicita la nota 5 desde el teclado, y lo guarda en el objeto estudiante.
                                            semestre=true;
                                            break;  //cierra ciclo
                                            
                                        case 8:
                                            estudiante.setSemestre("Semestre VIII");   //Guarda el semestre seleccionado en el objeto estudiante
                                            System.out.println("\bSemestre VIII: Se ha inscrito a los 5 cursos del semestre.");
                                            System.out.println("Ingrese salon       :");
                                            estudiante.setSalon(entrada.nextLine());    //Solicita el salon desde el teclado, y lo guarda en el objeto estudiante.
                                            estudiante.setCurso1("Desarrollo web");
                                            estudiante.setCurso2("Analisis de sistemas II");
                                            estudiante.setCurso3("Redes de computadoras I");
                                            estudiante.setCurso4("Etica profesional");
                                            estudiante.setCurso5("Arquitectura de computadoras II");
                                            System.out.println("Ingrese nota de "+estudiante.getCurso1()+" :");
                                            estudiante.setNota1(validarDouble());   //Solicita la nota 1 desde el teclado, y lo guarda en el objeto estudiante.
                                            System.out.println("Ingrese nota de "+estudiante.getCurso2()+" :");
                                            estudiante.setNota2(validarDouble());   //Solicita la nota 2 desde el teclado, y lo guarda en el objeto estudiante.
                                            System.out.println("Ingrese nota de "+estudiante.getCurso3()+" :");
                                            estudiante.setNota3(validarDouble());   //Solicita la nota 3 desde el teclado, y lo guarda en el objeto estudiante.
                                            System.out.println("Ingrese nota de "+estudiante.getCurso4()+" :");
                                            estudiante.setNota4(validarDouble());   //Solicita la nota 4 desde el teclado, y lo guarda en el objeto estudiante.
                                            System.out.println("Ingrese nota de "+estudiante.getCurso5()+" :");
                                            estudiante.setNota5(validarDouble());   //Solicita la nota 5 desde el teclado, y lo guarda en el objeto estudiante.
                                            semestre=true;
                                            break;  //cierra ciclo
                                            
                                        case 9:
                                            estudiante.setSemestre("Semestre IX");   //Guarda el semestre seleccionado en el objeto estudiante
                                            System.out.println("\bSemestre IX: Se ha inscrito a los 5 cursos del semestre.");
                                            System.out.println("Ingrese salon       ");
                                            estudiante.setSalon(entrada.nextLine());    //Solicita el salon desde el teclado, y lo guarda en el objeto estudiante.
                                            estudiante.setCurso1("Administracion de tecnologias de informacion");
                                            estudiante.setCurso2("Ingenieria de software");
                                            estudiante.setCurso3("Proyecto graduacion I");
                                            estudiante.setCurso4("Redes de computadoras II");
                                            estudiante.setCurso5("Inteligencia artificial");
                                            System.out.println("Ingrese nota de "+estudiante.getCurso1()+" :");
                                            estudiante.setNota1(validarDouble());   //Solicita la nota 1 desde el teclado, y lo guarda en el objeto estudiante.
                                            System.out.println("Ingrese nota de "+estudiante.getCurso2()+" :");
                                            estudiante.setNota2(validarDouble());   //Solicita la nota 2 desde el teclado, y lo guarda en el objeto estudiante.
                                            System.out.println("Ingrese nota de "+estudiante.getCurso3()+" :");
                                            estudiante.setNota3(validarDouble());   //Solicita la nota 3 desde el teclado, y lo guarda en el objeto estudiante.
                                            System.out.println("Ingrese nota de "+estudiante.getCurso4()+" :");
                                            estudiante.setNota4(validarDouble());   //Solicita la nota 4 desde el teclado, y lo guarda en el objeto estudiante.
                                            System.out.println("Ingrese nota de "+estudiante.getCurso5()+" :");
                                            estudiante.setNota5(validarDouble());   //Solicita la nota 5 desde el teclado, y lo guarda en el objeto estudiante.
                                            semestre=true;
                                            break;  //cierra ciclo
                                            
                                        case 10:
                                            estudiante.setSemestre("Semestre X");   //Guarda el semestre seleccionado en el objeto estudiante
                                            System.out.println("\bSemestre X: Se ha inscrito a los 5 cursos del semestre.");
                                            System.out.println("Ingrese salon       :");
                                            estudiante.setSalon(entrada.nextLine());    //Solicita el salon desde el teclado, y lo guarda en el objeto estudiante.
                                            estudiante.setCurso1("Telecomunicaicones");
                                            estudiante.setCurso2("Seminarios de tecnologias de informacion");
                                            estudiante.setCurso3("Aseguramiento de la seguridad de software");
                                            estudiante.setCurso4("Proyecto de graduacion II");
                                            estudiante.setCurso5("Seguridad y audittoria de sistemas");
                                            System.out.println("Ingrese nota de "+estudiante.getCurso1()+" :");
                                            estudiante.setNota1(validarDouble());   //Solicita la nota 1 desde el teclado, y lo guarda en el objeto estudiante.
                                            System.out.println("Ingrese nota de "+estudiante.getCurso2()+" :");
                                            estudiante.setNota2(validarDouble());   //Solicita la nota 2 desde el teclado, y lo guarda en el objeto estudiante.
                                            System.out.println("Ingrese nota de "+estudiante.getCurso3()+" :");
                                            estudiante.setNota3(validarDouble());   //Solicita la nota 3 desde el teclado, y lo guarda en el objeto estudiante.
                                            System.out.println("Ingrese nota de "+estudiante.getCurso4()+" :");
                                            estudiante.setNota4(validarDouble());   //Solicita la nota 4 desde el teclado, y lo guarda en el objeto estudiante.
                                            System.out.println("Ingrese nota de "+estudiante.getCurso5()+" :");
                                            estudiante.setNota5(validarDouble());   //Solicita la nota 5 desde el teclado, y lo guarda en el objeto estudiante.
                                            semestre=true;
                                            break;  //cierra ciclo
                                        default: //Mensaje por ingresar mal una opcion
                                            System.out.println("Error: No ingreso una opcion valida");
                                    }
                                }while(semestre == false);  /*Fin ciclo Do-While*/
                                opcion = true;
                                break;  //Cierra ciclo
                                
                            case 2:
                                System.out.println("\tFACULTAD DE PSICOLOGIA INDUSTRIAL");
                                estudiante.setFacultad("Psicologia industrial");    //Guarda la facultad seleccionada en el objeto estudiante
                                boolean semestre1=false; // Variable para cerrar el ciclo Do-Whiile de Semestre
                                int opcSemestre2;    //Variable para seleccionar el semestre
                                do{     /*Inicio - Codigo Psicologia en ciclo Do-While*/
                                    System.out.println("Semestres: \n|1| Primer semestre\n|2| Segundo semestre\n|3| Tercer semestre\n|4| Cuarto semestre");
                                    System.out.println("|5| Quinto semestre\n|6| Sexto Semestre\n|7| Septimo semestre\n|8| Octavo semestre\n|9| Noveno semestre\n|10| Decimo semestre");
                                    System.out.println("Ingrese opcion: ");
                                    opcSemestre2 = validarInt();    //Ingreso opcion, y validando que lo ingresado sea un entero.
                                    switch(opcSemestre2){
                                        case 1:
                                            estudiante.setSemestre("Semestre I");
                                            System.out.println("\bSemestre I");   //Guarda el semestre seleccionado en el objeto estudiante
                                            System.out.println("Ingrese salon       :");
                                            estudiante.setSalon(entrada.nextLine());    //Solicita el salon desde el teclado, y lo guarda en el objeto estudiante.
                                            estudiante.setCurso1("Desarrollo humano y profesional");
                                            estudiante.setCurso2("Filosofia");
                                            estudiante.setCurso3("Biologia humana");
                                            estudiante.setCurso4("Sociologia general");
                                            estudiante.setCurso5("Indisponible");
                                            System.out.println("Ingrese nota de "+estudiante.getCurso1()+" :");
                                            estudiante.setNota1(validarDouble());   //Solicita la nota 1 desde el teclado, y lo guarda en el objeto estudiante.
                                            System.out.println("Ingrese nota de "+estudiante.getCurso2()+" :");
                                            estudiante.setNota2(validarDouble());   //Solicita la nota 2 desde el teclado, y lo guarda en el objeto estudiante.
                                            System.out.println("Ingrese nota de "+estudiante.getCurso3()+" :");
                                            estudiante.setNota3(validarDouble());   //Solicita la nota 3 desde el teclado, y lo guarda en el objeto estudiante.
                                            System.out.println("Ingrese nota de "+estudiante.getCurso4()+" :");
                                            estudiante.setNota4(validarDouble());   //Solicita la nota 4 desde el teclado, y lo guarda en el objeto estudiante.
//                                            System.out.println("Ingrese nota de "+estudiante.getCurso5()+" :");
                                            estudiante.setNota5(/*validarDouble()*/0);  //Guarda nota 5 en 0 y lo guarda en el objeto estudiante.
                                            semestre1=true;     //cierra ciclo
                                            break;
                                            
                                        case 2:
                                            estudiante.setSemestre("Semestre II");   //Guarda el semestre seleccionado en el objeto estudiante
                                            System.out.println("\bSemestre II");
                                            System.out.println("Ingrese salon       :");
                                            estudiante.setSalon(entrada.nextLine());    //Solicita el salon desde el teclado, y lo guarda en el objeto estudiante.
                                            estudiante.setCurso1("Antropologia general");
                                            estudiante.setCurso2("Logica formal");
                                            estudiante.setCurso3("Sociologia humana");
                                            estudiante.setCurso4("Psicologia general");
                                            estudiante.setCurso5("Indisponible");
                                            System.out.println("Ingrese nota de "+estudiante.getCurso1()+" :");
                                            estudiante.setNota1(validarDouble());   //Solicita la nota 1 desde el teclado, y lo guarda en el objeto estudiante.
                                            System.out.println("Ingrese nota de "+estudiante.getCurso2()+" :");
                                            estudiante.setNota2(validarDouble());   //Solicita la nota 2 desde el teclado, y lo guarda en el objeto estudiante.
                                            System.out.println("Ingrese nota de "+estudiante.getCurso3()+" :");
                                            estudiante.setNota3(validarDouble());   //Solicita la nota 3 desde el teclado, y lo guarda en el objeto estudiante.
                                            System.out.println("Ingrese nota de "+estudiante.getCurso4()+" :");
                                            estudiante.setNota4(validarDouble());   //Solicita la nota 4 desde el teclado, y lo guarda en el objeto estudiante.
                                            //System.out.println("Ingrese nota de "+estudiante.getCurso5()+" :");
                                            estudiante.setNota5(/*validarDouble()*/0);  //Guarda nota 5 en 0 y lo guarda en el objeto estudiante.
                                            semestre1=true;
                                            break;      //cierra el ciclo
                                            
                                        case 3:
                                            estudiante.setSemestre("Semestre III");   //Guarda el semestre seleccionado en el objeto estudiante
                                            System.out.println("\bSemestre III");
                                            System.out.println("Ingrese salon       :");
                                            estudiante.setSalon(entrada.nextLine());    //Solicita el salon desde el teclado, y lo guarda en el objeto estudiante.
                                            estudiante.setCurso1("Anatomia y filosofia del sistema nervioso");
                                            estudiante.setCurso2("Estadistica fundamental");
                                            estudiante.setCurso3("Psicologia evolutiva del niño y del adolescente");
                                            estudiante.setCurso4("Semiologia psicologica");
                                            estudiante.setCurso5("Indisponible");
                                            System.out.println("Ingrese nota de "+estudiante.getCurso1()+" :");
                                            estudiante.setNota1(validarDouble());   //Solicita la nota 1 desde el teclado, y lo guarda en el objeto estudiante.
                                            System.out.println("Ingrese nota de "+estudiante.getCurso2()+" :");
                                            estudiante.setNota2(validarDouble());   //Solicita la nota 2 desde el teclado, y lo guarda en el objeto estudiante.
                                            System.out.println("Ingrese nota de "+estudiante.getCurso3()+" :");
                                            estudiante.setNota3(validarDouble());   //Solicita la nota 3 desde el teclado, y lo guarda en el objeto estudiante.
                                            System.out.println("Ingrese nota de "+estudiante.getCurso4()+" :");
                                            estudiante.setNota4(validarDouble());   //Solicita la nota 4 desde el teclado, y lo guarda en el objeto estudiante.
                                            //System.out.println("Ingrese nota de "+estudiante.getCurso5()+" :");
                                            estudiante.setNota5(/*validarDouble()*/0);  //Guarda nota 5 en 0 y lo guarda en el objeto estudiante.
                                            semestre1=true;
                                            break;      //cierra el ciclo
                                            
                                        case 4:
                                            estudiante.setSemestre("Semestre IV");   //Guarda el semestre seleccionado en el objeto estudiante
                                            System.out.println("\bSemestre IV");
                                            System.out.println("Ingrese salon       :");
                                            estudiante.setSalon(entrada.nextLine());    //Solicita el salon desde el teclado, y lo guarda en el objeto estudiante.
                                            estudiante.setCurso1("Psicometria I");
                                            estudiante.setCurso2("Teorias de la personalidad");
                                            estudiante.setCurso3("Estadistica aplicada a la psicologia");
                                            estudiante.setCurso4("Psicologia evolutiva del adulto");
                                            estudiante.setCurso5("Indisponible");
                                            System.out.println("Ingrese nota de "+estudiante.getCurso1()+" :");
                                            estudiante.setNota1(validarDouble());   //Solicita la nota 1 desde el teclado, y lo guarda en el objeto estudiante.
                                            System.out.println("Ingrese nota de "+estudiante.getCurso2()+" :");
                                            estudiante.setNota2(validarDouble());   //Solicita la nota 2 desde el teclado, y lo guarda en el objeto estudiante.
                                            System.out.println("Ingrese nota de "+estudiante.getCurso3()+" :");
                                            estudiante.setNota3(validarDouble());   //Solicita la nota 3 desde el teclado, y lo guarda en el objeto estudiante.
                                            System.out.println("Ingrese nota de "+estudiante.getCurso4()+" :");
                                            estudiante.setNota4(validarDouble());   //Solicita la nota 4 desde el teclado, y lo guarda en el objeto estudiante.
                                            //System.out.println("Ingrese nota de "+estudiante.getCurso5()+" :");
                                            estudiante.setNota5(/*validarDouble()*/0);  //Guarda nota 5 en 0 y lo guarda en el objeto estudiante.
                                            semestre1=true;
                                            break;  //cierra ciclo
                                            
                                        case 5:
                                            estudiante.setSemestre("Semestre V");   //Guarda el semestre seleccionado en el objeto estudiante
                                            System.out.println("\bSemestre V");
                                            System.out.println("Ingrese salon       :");
                                            estudiante.setSalon(entrada.nextLine());    //Solicita el salon desde el teclado, y lo guarda en el objeto estudiante.
                                            estudiante.setCurso1("Psicometria II");
                                            estudiante.setCurso2("Psicologia del deporte y la recreacion");
                                            estudiante.setCurso3("Psicologia social");
                                            estudiante.setCurso4("Neurofilosofia");
                                            estudiante.setCurso5("Indisponible");
                                            System.out.println("Ingrese nota de "+estudiante.getCurso1()+" :");
                                            estudiante.setNota1(validarDouble());   //Solicita la nota 1 desde el teclado, y lo guarda en el objeto estudiante.
                                            System.out.println("Ingrese nota de "+estudiante.getCurso2()+" :");
                                            estudiante.setNota2(validarDouble());   //Solicita la nota 2 desde el teclado, y lo guarda en el objeto estudiante.
                                            System.out.println("Ingrese nota de "+estudiante.getCurso3()+" :");
                                            estudiante.setNota3(validarDouble());   //Solicita la nota 3 desde el teclado, y lo guarda en el objeto estudiante.
                                            System.out.println("Ingrese nota de "+estudiante.getCurso4()+" :");
                                            estudiante.setNota4(validarDouble());   //Solicita la nota 4 desde el teclado, y lo guarda en el objeto estudiante.
                                            //System.out.println("Ingrese nota de "+estudiante.getCurso5()+" :");
                                            estudiante.setNota5(/*validarDouble()*/0);  //Guarda nota 5 en 0 y lo guarda en el objeto estudiante.
                                            semestre1=true;
                                            break;  //cierra ciclo
                                            
                                        case 6:
                                            estudiante.setSemestre("Semestre VI");   //Guarda el semestre seleccionado en el objeto estudiante
                                            System.out.println("\bSemestre VI");
                                            System.out.println("Ingrese salon       :");
                                            estudiante.setSalon(entrada.nextLine());    //Solicita el salon desde el teclado, y lo guarda en el objeto estudiante.
                                            estudiante.setCurso1("Psicologia Clinica");
                                            estudiante.setCurso2("Introduccion a la psicologia forense");
                                            estudiante.setCurso3("Introduccion a la psicologia industrial");
                                            estudiante.setCurso4("Fundamentos de informatica");
                                            estudiante.setCurso5("Indisponible");
                                            System.out.println("Ingrese nota de "+estudiante.getCurso1()+" :");
                                            estudiante.setNota1(validarDouble());   //Solicita la nota 1 desde el teclado, y lo guarda en el objeto estudiante.
                                            System.out.println("Ingrese nota de "+estudiante.getCurso2()+" :");
                                            estudiante.setNota2(validarDouble());   //Solicita la nota 2 desde el teclado, y lo guarda en el objeto estudiante.
                                            System.out.println("Ingrese nota de "+estudiante.getCurso3()+" :");
                                            estudiante.setNota3(validarDouble());   //Solicita la nota 3 desde el teclado, y lo guarda en el objeto estudiante.
                                            System.out.println("Ingrese nota de "+estudiante.getCurso4()+" :");
                                            estudiante.setNota4(validarDouble());   //Solicita la nota 4 desde el teclado, y lo guarda en el objeto estudiante.
                                            //System.out.println("Ingrese nota de "+estudiante.getCurso5()+" :");
                                            estudiante.setNota5(/*validarDouble()*/0);  //Guarda nota 5 en 0 y lo guarda en el objeto estudiante.
                                            semestre1=true;
                                            break;  //cierra ciclo
                                            
                                        case 7:
                                            estudiante.setSemestre("Semestre VII");   //Guarda el semestre seleccionado en el objeto estudiante
                                            System.out.println("\bSemestre VII");
                                            System.out.println("Ingrese salon       :");
                                            estudiante.setSalon(entrada.nextLine());    //Solicita el salon desde el teclado, y lo guarda en el objeto estudiante.
                                            estudiante.setCurso1("Teoria administrativa");
                                            estudiante.setCurso2("Competencia laborales");
                                            estudiante.setCurso3("Planeacion estrategica de recursos humanos");
                                            estudiante.setCurso4("Lesgilacion laboral");
                                            estudiante.setCurso5("Comportamiento organizacional");
                                            System.out.println("Ingrese nota de "+estudiante.getCurso1()+" :");
                                            estudiante.setNota1(validarDouble());   //Solicita la nota 1 desde el teclado, y lo guarda en el objeto estudiante.
                                            System.out.println("Ingrese nota de "+estudiante.getCurso2()+" :");
                                            estudiante.setNota2(validarDouble());   //Solicita la nota 2 desde el teclado, y lo guarda en el objeto estudiante.
                                            System.out.println("Ingrese nota de "+estudiante.getCurso3()+" :");
                                            estudiante.setNota3(validarDouble());   //Solicita la nota 3 desde el teclado, y lo guarda en el objeto estudiante.
                                            System.out.println("Ingrese nota de "+estudiante.getCurso4()+" :");
                                            estudiante.setNota4(validarDouble());   //Solicita la nota 4 desde el teclado, y lo guarda en el objeto estudiante.
                                            System.out.println("Ingrese nota de "+estudiante.getCurso5()+" :");
                                            estudiante.setNota5(validarDouble());   //Solicita la nota 5 desde el teclado, y lo guarda en el objeto estudiante.
                                            semestre1=true;
                                            break;  //cierra ciclo
                                            
                                        case 8:
                                            estudiante.setSemestre("Semestre VIII");   //Guarda el semestre seleccionado en el objeto estudiante
                                            System.out.println("\bSemestre VIII");
                                            System.out.println("Ingrese salon       :");
                                            estudiante.setSalon(entrada.nextLine());    //Solicita el salon desde el teclado, y lo guarda en el objeto estudiante.
                                            estudiante.setCurso1("Analisis y valucion de puestos");
                                            estudiante.setCurso2("Desarrollo organizacional");
                                            estudiante.setCurso3("Elaboracion de proyectos");
                                            estudiante.setCurso4("Psicometria laboral");
                                            estudiante.setCurso5("Provision del talento humano");
                                            System.out.println("Ingrese nota de "+estudiante.getCurso1()+" :");
                                            estudiante.setNota1(validarDouble());   //Solicita la nota 1 desde el teclado, y lo guarda en el objeto estudiante.
                                            System.out.println("Ingrese nota de "+estudiante.getCurso2()+" :");
                                            estudiante.setNota2(validarDouble());   //Solicita la nota 2 desde el teclado, y lo guarda en el objeto estudiante.
                                            System.out.println("Ingrese nota de "+estudiante.getCurso3()+" :");
                                            estudiante.setNota3(validarDouble());   //Solicita la nota 3 desde el teclado, y lo guarda en el objeto estudiante.
                                            System.out.println("Ingrese nota de "+estudiante.getCurso4()+" :");
                                            estudiante.setNota4(validarDouble());   //Solicita la nota 4 desde el teclado, y lo guarda en el objeto estudiante.
                                            System.out.println("Ingrese nota de "+estudiante.getCurso5()+" :");
                                            estudiante.setNota5(validarDouble());   //Solicita la nota 5 desde el teclado, y lo guarda en el objeto estudiante.
                                            semestre1=true;
                                            break;  //cierra ciclo
                                            
                                        case 9:
                                            estudiante.setSemestre("Semestre IX");   //Guarda el semestre seleccionado en el objeto estudiante
                                            System.out.println("\bSemestre IX");
                                            System.out.println("Ingrese salon       ");
                                            estudiante.setSalon(entrada.nextLine());    //Solicita el salon desde el teclado, y lo guarda en el objeto estudiante.
                                            estudiante.setCurso1("Desarrollo del talento humano");
                                            estudiante.setCurso2("Gestion del desempeño");
                                            estudiante.setCurso3("Gestion de proyecto");
                                            estudiante.setCurso4("Practica supervidada I");
                                            estudiante.setCurso5("Elaboracion de trabajo de graduacion I");
                                            System.out.println("Ingrese nota de "+estudiante.getCurso1()+" :");
                                            estudiante.setNota1(validarDouble());   //Solicita la nota 1 desde el teclado, y lo guarda en el objeto estudiante.
                                            System.out.println("Ingrese nota de "+estudiante.getCurso2()+" :");
                                            estudiante.setNota2(validarDouble());   //Solicita la nota 2 desde el teclado, y lo guarda en el objeto estudiante.
                                            System.out.println("Ingrese nota de "+estudiante.getCurso3()+" :");
                                            estudiante.setNota3(validarDouble());   //Solicita la nota 3 desde el teclado, y lo guarda en el objeto estudiante.
                                            System.out.println("Ingrese nota de "+estudiante.getCurso4()+" :");
                                            estudiante.setNota4(validarDouble());   //Solicita la nota 4 desde el teclado, y lo guarda en el objeto estudiante.
                                            System.out.println("Ingrese nota de "+estudiante.getCurso5()+" :");
                                            estudiante.setNota5(validarDouble());   //Solicita la nota 5 desde el teclado, y lo guarda en el objeto estudiante.
                                            semestre1=true;
                                            break;  //cierra ciclo
                                            
                                        case 10:
                                            estudiante.setSemestre("Semestre X");   //Guarda el semestre seleccionado en el objeto estudiante
                                            System.out.println("\bSemestre X");
                                            System.out.println("Ingrese salon       :");
                                            estudiante.setSalon(entrada.nextLine());    //Solicita el salon desde el teclado, y lo guarda en el objeto estudiante.
                                            estudiante.setCurso1("Gestion en compesacion");
                                            estudiante.setCurso2("Gestion de indicadores laborales");
                                            estudiante.setCurso3("Seguridad industrial y salud ocupacional");
                                            estudiante.setCurso4("Practica supervisada II");
                                            estudiante.setCurso5("Elaboracion de trabajo de graducaion II");
                                            System.out.println("Ingrese nota de "+estudiante.getCurso1()+" :");
                                            estudiante.setNota1(validarDouble());   //Solicita la nota 1 desde el teclado, y lo guarda en el objeto estudiante.
                                            System.out.println("Ingrese nota de "+estudiante.getCurso2()+" :");
                                            estudiante.setNota2(validarDouble());   //Solicita la nota 2 desde el teclado, y lo guarda en el objeto estudiante.
                                            System.out.println("Ingrese nota de "+estudiante.getCurso3()+" :");
                                            estudiante.setNota3(validarDouble());   //Solicita la nota 3 desde el teclado, y lo guarda en el objeto estudiante.
                                            System.out.println("Ingrese nota de "+estudiante.getCurso4()+" :");
                                            estudiante.setNota4(validarDouble());   //Solicita la nota 4 desde el teclado, y lo guarda en el objeto estudiante.
                                            System.out.println("Ingrese nota de "+estudiante.getCurso5()+" :");
                                            estudiante.setNota5(validarDouble());   //Solicita la nota 5 desde el teclado, y lo guarda en el objeto estudiante.
                                            semestre1=true;
                                            break;  //cierra ciclo
                                        default:    //Mensaje por ingreso opcion no valida
                                            System.out.println("Error: No ingreso una opcion valida");
                                    }
                                }while(semestre1 == false);     /*Fin ciclo Do-While*/
                                opcion = true;
                                break;  //cierra ciclo
                                
                            case 3:
                                System.out.println("\tFACULTAD DE CONTADURIA PUBLICA Y AUDITORIA");
                                estudiante.setFacultad("Contaduria publica y auditoria");   //Guarda la facultad seleccionada en el objeto estudiante
                                boolean semestre2=false;    //Variable para cerrar el ciclo Do-While
                                int opcSemestre3;    //Variable para seleccionar el semestre
                                do{     /*Inicio - Codigo facultad Auditori en ciclo Do-While */
                                    System.out.println("Semestres: \n|1| Primer semestre\n|2| Segundo semestre\n|3| Tercer semestre\n|4| Cuarto semestre\n|5| Quinto semestre");
                                    System.out.println("|6| Sexto Semestre\n|7| Septimo semestre\n|8| Octavo semestre\n|9| Noveno semestre\n|10| Decimo semestre\n|11| Decimo primer semestre");
                                    System.out.println("Ingrese opcion: ");
                                    opcSemestre3 = validarInt();
                                    switch(opcSemestre3){
                                        case 1:
                                            estudiante.setSemestre("Semestre I");   //Guarda el semestre seleccionado en el objeto estudiante
                                            System.out.println("\bSemestre I");
                                            System.out.println("Ingrese salon       :");
                                            estudiante.setSalon(entrada.nextLine());    //Solicita el salon desde el teclado, y lo guarda en el objeto estudiante.
                                            estudiante.setCurso1("Desarrollo humano y profesional");
                                            estudiante.setCurso2("Introduccion a la economia");
                                            estudiante.setCurso3("Matematica I");
                                            estudiante.setCurso4("Tecnicas de investigacion");
                                            estudiante.setCurso5("Indisponible");
                                            System.out.println("Ingrese nota de "+estudiante.getCurso1()+" :");
                                            estudiante.setNota1(validarDouble());   //Solicita la nota 1 desde el teclado, y lo guarda en el objeto estudiante.
                                            System.out.println("Ingrese nota de "+estudiante.getCurso2()+" :");
                                            estudiante.setNota2(validarDouble());   //Solicita la nota 1 desde el teclado, y lo guarda en el objeto estudiante.
                                            System.out.println("Ingrese nota de "+estudiante.getCurso3()+" :");
                                            estudiante.setNota3(validarDouble());   //Solicita la nota 1 desde el teclado, y lo guarda en el objeto estudiante.
                                            System.out.println("Ingrese nota de "+estudiante.getCurso4()+" :");
                                            estudiante.setNota4(validarDouble());   //Solicita la nota 1 desde el teclado, y lo guarda en el objeto estudiante.
//                                            System.out.println("Ingrese nota de "+estudiante.getCurso5()+" :");
                                            estudiante.setNota5(/*validarDouble()*/0);  //Guarda la nota 5 a 0 y lo guarda en el objeto estudiante.
                                            semestre2=true;
                                            break;  //cierra ciclo
                                            
                                        case 2:
                                            estudiante.setSemestre("Semestre II");   //Guarda el semestre seleccionado en el objeto estudiante.
                                            System.out.println("\bSemestre II");
                                            System.out.println("Ingrese salon       :");
                                            estudiante.setSalon(entrada.nextLine());    //Solicita el salon desde el teclado, y lo guarda en el objeto estudiante.
                                            estudiante.setCurso1("Contabilidad basica");
                                            estudiante.setCurso2("Introduccion al derecho");
                                            estudiante.setCurso3("Microeconomia I");
                                            estudiante.setCurso4("Matematica II");
                                            estudiante.setCurso5("Indisponible");
                                            System.out.println("Ingrese nota de "+estudiante.getCurso1()+" :");
                                            estudiante.setNota1(validarDouble());   //Solicita la nota 1 desde el teclado, y lo guarda en el objeto estudiante.
                                            System.out.println("Ingrese nota de "+estudiante.getCurso2()+" :");
                                            estudiante.setNota2(validarDouble());   //Solicita la nota 2 desde el teclado, y lo guarda en el objeto estudiante.
                                            System.out.println("Ingrese nota de "+estudiante.getCurso3()+" :");
                                            estudiante.setNota3(validarDouble());   //Solicita la nota 3 desde el teclado, y lo guarda en el objeto estudiante.
                                            System.out.println("Ingrese nota de "+estudiante.getCurso4()+" :");
                                            estudiante.setNota4(validarDouble());   //Solicita la nota 4 desde el teclado, y lo guarda en el objeto estudiante.
                                            //System.out.println("Ingrese nota de "+estudiante.getCurso5()+" :");
                                            estudiante.setNota5(/*validarDouble()*/0);  //Guarda la nota 5 a 0 y lo guarda en el objeto estudiante.
                                            semestre2=true;
                                            break;  //cierra ciclo
                                            
                                        case 3:
                                            estudiante.setSemestre("Semestre III");   //Guarda el semestre seleccionado en el objeto estudiante.
                                            System.out.println("\bSemestre III");
                                            System.out.println("Ingrese salon       :");
                                            estudiante.setSalon(entrada.nextLine());    //Solicita el salon desde el teclado, y lo guarda en el objeto estudiante.
                                            estudiante.setCurso1("Microeconomia II");
                                            estudiante.setCurso2("Normas internacionales de informacion financiera I");
                                            estudiante.setCurso3("Contabilidad de sociedades");
                                            estudiante.setCurso4("Lesgilacion mercantil");
                                            estudiante.setCurso5("Indisponible");
                                            System.out.println("Ingrese nota de "+estudiante.getCurso1()+" :");
                                            estudiante.setNota1(validarDouble());   //Solicita la nota 1 desde el teclado, y lo guarda en el objeto estudiante.
                                            System.out.println("Ingrese nota de "+estudiante.getCurso2()+" :");
                                            estudiante.setNota2(validarDouble());   //Solicita la nota 2 desde el teclado, y lo guarda en el objeto estudiante.
                                            System.out.println("Ingrese nota de "+estudiante.getCurso3()+" :");
                                            estudiante.setNota3(validarDouble());   //Solicita la nota 3 desde el teclado, y lo guarda en el objeto estudiante.
                                            System.out.println("Ingrese nota de "+estudiante.getCurso4()+" :");
                                            estudiante.setNota4(validarDouble());   //Solicita la nota 4 desde el teclado, y lo guarda en el objeto estudiante.
                                            //System.out.println("Ingrese nota de "+estudiante.getCurso5()+" :");
                                            estudiante.setNota5(/*validarDouble()*/0);  //Guarda la nota 5 a 0 y lo guarda en el objeto estudiante.
                                            semestre2=true; //Cierra el ciclo
                                            break;
                                            
                                        case 4:
                                            estudiante.setSemestre("Semestre IV");   //Guarda el semestre seleccionado en el objeto estudiante.
                                            System.out.println("\bSemestre IV");
                                            System.out.println("Ingrese salon       :");
                                            estudiante.setSalon(entrada.nextLine());    //Solicita el salon desde el teclado, y lo guarda en el objeto estudiante.
                                            estudiante.setCurso1("Matematica financiera I");
                                            estudiante.setCurso2("Metodos estadisticos I");
                                            estudiante.setCurso3("Normas internacionales de informacion financiera II");
                                            estudiante.setCurso4("Contabilidad avanzada I");
                                            estudiante.setCurso5("Indisponible");
                                            System.out.println("Ingrese nota de "+estudiante.getCurso1()+" :");
                                            estudiante.setNota1(validarDouble());   //Solicita la nota 1 desde el teclado, y lo guarda en el objeto estudiante.
                                            System.out.println("Ingrese nota de "+estudiante.getCurso2()+" :");
                                            estudiante.setNota2(validarDouble());   //Solicita la nota 2 desde el teclado, y lo guarda en el objeto estudiante.
                                            System.out.println("Ingrese nota de "+estudiante.getCurso3()+" :");
                                            estudiante.setNota3(validarDouble());   //Solicita la nota 3 desde el teclado, y lo guarda en el objeto estudiante.
                                            System.out.println("Ingrese nota de "+estudiante.getCurso4()+" :");
                                            estudiante.setNota4(validarDouble());   //Solicita la nota 4 desde el teclado, y lo guarda en el objeto estudiante.
                                            //System.out.println("Ingrese nota de "+estudiante.getCurso5()+" :");
                                            estudiante.setNota5(/*validarDouble()*/0);  //Guarda la nota 5 a 0 y lo guarda en el objeto estudiante.
                                            semestre2=true;
                                            break;  //cierra ciclo
                                            
                                        case 5:
                                            estudiante.setSemestre("Semestre V");   //Guarda el semestre seleccionado en el objeto estudiante.
                                            System.out.println("\bSemestre V");
                                            System.out.println("Ingrese salon       :");
                                            estudiante.setSalon(entrada.nextLine());    //Solicita el salon desde el teclado, y lo guarda en el objeto estudiante.
                                            estudiante.setCurso1("Metodos estadistcos II");
                                            estudiante.setCurso2("Matematica financiera II");
                                            estudiante.setCurso3("Contabilidad avanzada II");
                                            estudiante.setCurso4("Normas internacionales de auditoria");
                                            estudiante.setCurso5("Indisponible");
                                            System.out.println("Ingrese nota de "+estudiante.getCurso1()+" :");
                                            estudiante.setNota1(validarDouble());   //Solicita la nota 1 desde el teclado, y lo guarda en el objeto estudiante.
                                            System.out.println("Ingrese nota de "+estudiante.getCurso2()+" :");
                                            estudiante.setNota2(validarDouble());   //Solicita la nota 2 desde el teclado, y lo guarda en el objeto estudiante.
                                            System.out.println("Ingrese nota de "+estudiante.getCurso3()+" :");
                                            estudiante.setNota3(validarDouble());   //Solicita la nota 3 desde el teclado, y lo guarda en el objeto estudiante.
                                            System.out.println("Ingrese nota de "+estudiante.getCurso4()+" :");
                                            estudiante.setNota4(validarDouble());   //Solicita la nota 4 desde el teclado, y lo guarda en el objeto estudiante.
                                            //System.out.println("Ingrese nota de "+estudiante.getCurso5()+" :");
                                            estudiante.setNota5(/*validarDouble()*/0);  //Guarda la nota 5 a 0 y lo guarda en el objeto estudiante.
                                            semestre2=true;
                                            break;  //cierra ciclo
                                            
                                        case 6:
                                            estudiante.setSemestre("Semestre VI");   //Guarda el semestre seleccionado en el objeto estudiante.
                                            System.out.println("\bSemestre VI");
                                            System.out.println("Ingrese salon       :");
                                            estudiante.setSalon(entrada.nextLine());    //Solicita el salon desde el teclado, y lo guarda en el objeto estudiante.
                                            estudiante.setCurso1("Finanzas publicas");
                                            estudiante.setCurso2("Contabilidad de costos I");
                                            estudiante.setCurso3("Auditoria I");   //Solicita la nota 1 desde el teclado, y lo guarda en el objeto estudiante.
                                            estudiante.setCurso4("Normas internacionales de auditoria II");
                                            estudiante.setCurso5("Indisponible");
                                            System.out.println("Ingrese nota de "+estudiante.getCurso1()+" :");
                                            estudiante.setNota1(validarDouble());   //Solicita la nota 1 desde el teclado, y lo guarda en el objeto estudiante.
                                            System.out.println("Ingrese nota de "+estudiante.getCurso2()+" :");
                                            estudiante.setNota2(validarDouble());   //Solicita la nota 2 desde el teclado, y lo guarda en el objeto estudiante.
                                            System.out.println("Ingrese nota de "+estudiante.getCurso3()+" :");
                                            estudiante.setNota3(validarDouble());   //Solicita la nota 3 desde el teclado, y lo guarda en el objeto estudiante.
                                            System.out.println("Ingrese nota de "+estudiante.getCurso4()+" :");
                                            estudiante.setNota4(validarDouble());   //Solicita la nota 4 desde el teclado, y lo guarda en el objeto estudiante.
                                            //System.out.println("Ingrese nota de "+estudiante.getCurso5()+" :");
                                            estudiante.setNota5(/*validarDouble()*/0);  //Guarda la nota 5 a 0 y lo guarda en el objeto estudiante.
                                            semestre2=true;
                                            break;      //cierra ciclo
                                            
                                        case 7:
                                            estudiante.setSemestre("Semestre VII");   //Guarda el semestre seleccionado en el objeto estudiante.
                                            System.out.println("\bSemestre VII");
                                            System.out.println("Ingrese salon       :");
                                            estudiante.setSalon(entrada.nextLine());    //Solicita el salon desde el teclado, y lo guarda en el objeto estudiante.
                                            estudiante.setCurso1("Moneda y banca");
                                            estudiante.setCurso2("Legislacion tributaria");
                                            estudiante.setCurso3("Contabilidad de costos II");
                                            estudiante.setCurso4("Auditoria II");
                                            estudiante.setCurso5("Indisponible");
                                            System.out.println("Ingrese nota de "+estudiante.getCurso1()+" :");
                                            estudiante.setNota1(validarDouble());   //Solicita la nota 1 desde el teclado, y lo guarda en el objeto estudiante.
                                            System.out.println("Ingrese nota de "+estudiante.getCurso2()+" :");
                                            estudiante.setNota2(validarDouble());   //Solicita la nota 2 desde el teclado, y lo guarda en el objeto estudiante.
                                            System.out.println("Ingrese nota de "+estudiante.getCurso3()+" :");
                                            estudiante.setNota3(validarDouble());   //Solicita la nota 3 desde el teclado, y lo guarda en el objeto estudiante.
                                            System.out.println("Ingrese nota de "+estudiante.getCurso4()+" :");
                                            estudiante.setNota4(validarDouble());   //Solicita la nota 4 desde el teclado, y lo guarda en el objeto estudiante.
                                            //System.out.println("Ingrese nota de "+estudiante.getCurso5()+" :");
                                            estudiante.setNota5(/*validarDouble()*/0);  //Guarda la nota 5 a 0 y lo guarda en el objeto estudiante.
                                            semestre2=true;
                                            break;      //cierra ciclo
                                            
                                        case 8:
                                            estudiante.setSemestre("Semestre VIII");   //Guarda el semestre seleccionado en el objeto estudiante.
                                            System.out.println("\bSemestre VIII");
                                            System.out.println("Ingrese salon       :");
                                            estudiante.setSalon(entrada.nextLine());    //Solicita el salon desde el teclado, y lo guarda en el objeto estudiante.
                                            estudiante.setCurso1("Presupuestos");
                                            estudiante.setCurso2("Legislacion laboral");
                                            estudiante.setCurso3("Analisis e interpretacion de estados financieros");
                                            estudiante.setCurso4("Aditoria II");
                                            estudiante.setCurso5("Indisponible");
                                            System.out.println("Ingrese nota de "+estudiante.getCurso1()+" :");
                                            estudiante.setNota1(validarDouble());   //Solicita la nota 1 desde el teclado, y lo guarda en el objeto estudiante.
                                            System.out.println("Ingrese nota de "+estudiante.getCurso2()+" :");
                                            estudiante.setNota2(validarDouble());   //Solicita la nota 2 desde el teclado, y lo guarda en el objeto estudiante.
                                            System.out.println("Ingrese nota de "+estudiante.getCurso3()+" :");
                                            estudiante.setNota3(validarDouble());   //Solicita la nota 3 desde el teclado, y lo guarda en el objeto estudiante.
                                            System.out.println("Ingrese nota de "+estudiante.getCurso4()+" :");
                                            estudiante.setNota4(validarDouble());   //Solicita la nota 4 desde el teclado, y lo guarda en el objeto estudiante.
                                            //System.out.println("Ingrese nota de "+estudiante.getCurso5()+" :");
                                            estudiante.setNota5(/*validarDouble()*/0);  //Guarda la nota 5 a 0 y lo guarda en el objeto estudiante.
                                            semestre2=true;
                                            break;  //cierra ciclo
                                            
                                        case 9:
                                            estudiante.setSemestre("Semestre IX");   //Guarda el semestre seleccionado en el objeto estudiante.
                                            System.out.println("\bSemestre IX");
                                            System.out.println("Ingrese salon       ");
                                            estudiante.setSalon(entrada.nextLine());    //Solicita el salon desde el teclado, y lo guarda en el objeto estudiante.
                                            estudiante.setCurso1("Etica profesional");
                                            estudiante.setCurso2("Contabilidad y organizacion bancaria");
                                            estudiante.setCurso3("Auditoria de sistemas de informacion");
                                            estudiante.setCurso4("Teoria administrativa");
                                            estudiante.setCurso5("Indisponible");
                                            System.out.println("Ingrese nota de "+estudiante.getCurso1()+" :");
                                            estudiante.setNota1(validarDouble());   //Solicita la nota 1 desde el teclado, y lo guarda en el objeto estudiante.
                                            System.out.println("Ingrese nota de "+estudiante.getCurso2()+" :");
                                            estudiante.setNota2(validarDouble());   //Solicita la nota 2 desde el teclado, y lo guarda en el objeto estudiante.
                                            System.out.println("Ingrese nota de "+estudiante.getCurso3()+" :");
                                            estudiante.setNota3(validarDouble());   //Solicita la nota 3 desde el teclado, y lo guarda en el objeto estudiante.
                                            System.out.println("Ingrese nota de "+estudiante.getCurso4()+" :");
                                            estudiante.setNota4(validarDouble());   //Solicita la nota 4 desde el teclado, y lo guarda en el objeto estudiante.
                                            //System.out.println("Ingrese nota de "+estudiante.getCurso5()+" :");
                                            estudiante.setNota5(/*validarDouble()*/0);  //Guarda la nota 5 a 0 y lo guarda en el objeto estudiante.
                                            semestre2=true;
                                            break;  //cierra ciclo
                                            
                                        case 10:
                                            estudiante.setSemestre("Semestre X");   //Guarda el semestre seleccionado en el objeto estudiante.
                                            System.out.println("\bSemestre X");
                                            System.out.println("Ingrese salon       :");
                                            estudiante.setSalon(entrada.nextLine());    //Solicita el salon desde el teclado, y lo guarda en el objeto estudiante.
                                            estudiante.setCurso1("Procedimientos legales y administrativos");
                                            estudiante.setCurso2("Redaccion de informes tecnicos");
                                            estudiante.setCurso3("Contabilidad especiales");
                                            estudiante.setCurso4("Auditoria admnistrativa");
                                            estudiante.setCurso5("Indisponible");
                                            System.out.println("Ingrese nota de "+estudiante.getCurso1()+" :");
                                            estudiante.setNota1(validarDouble());   //Solicita la nota 1 desde el teclado, y lo guarda en el objeto estudiante.
                                            System.out.println("Ingrese nota de "+estudiante.getCurso2()+" :");
                                            estudiante.setNota2(validarDouble());   //Solicita la nota 2 desde el teclado, y lo guarda en el objeto estudiante.
                                            System.out.println("Ingrese nota de "+estudiante.getCurso3()+" :");
                                            estudiante.setNota3(validarDouble());   //Solicita la nota 3 desde el teclado, y lo guarda en el objeto estudiante.
                                            System.out.println("Ingrese nota de "+estudiante.getCurso4()+" :");
                                            estudiante.setNota4(validarDouble());   //Solicita la nota 4 desde el teclado, y lo guarda en el objeto estudiante.
                                            //System.out.println("Ingrese nota de "+estudiante.getCurso5()+" :");
                                            estudiante.setNota5(/*validarDouble()*/0);  //Guarda la nota 5 a 0 y lo guarda en el objeto estudiante.
                                            semestre2=true;
                                            break;  //cierra ciclo
                                            
                                        case 11:
                                            estudiante.setSemestre("Semestre XI");   //Guarda el semestre seleccionado en el objeto estudiante.
                                            System.out.println("\bSemestre XI");
                                            System.out.println("Ingrese salon       :");
                                            estudiante.setSalon(entrada.nextLine());    //Solicita el salon desde el teclado, y lo guarda en el objeto estudiante.
                                            estudiante.setCurso1("Propedeutica de tesis");
                                            estudiante.setCurso2("Elaboracion y evaluacion de proyectos");
                                            estudiante.setCurso3("Administracion y gestion de riesgos");
                                            estudiante.setCurso4("Seminario de contabilidad");
                                            estudiante.setCurso5("Seminrio de auditoria");
                                            System.out.println("Ingrese nota de "+estudiante.getCurso1()+" :");
                                            estudiante.setNota1(validarDouble());   //Solicita la nota 1 desde el teclado, y lo guarda en el objeto estudiante.
                                            System.out.println("Ingrese nota de "+estudiante.getCurso2()+" :");
                                            estudiante.setNota2(validarDouble());   //Solicita la nota 2 desde el teclado, y lo guarda en el objeto estudiante.
                                            System.out.println("Ingrese nota de "+estudiante.getCurso3()+" :");
                                            estudiante.setNota3(validarDouble());   //Solicita la nota 3 desde el teclado, y lo guarda en el objeto estudiante.
                                            System.out.println("Ingrese nota de "+estudiante.getCurso4()+" :");
                                            estudiante.setNota4(validarDouble());   //Solicita la nota 4 desde el teclado, y lo guarda en el objeto estudiante.
                                            System.out.println("Ingrese nota de "+estudiante.getCurso5()+" :");
                                            estudiante.setNota5(validarDouble());   //Solicita la nota 5 desde el teclado, y lo guarda en el objeto estudiante.
                                            semestre2=true;
                                            break;  //cierra ciclo
                                        default:        /*Mensaje por ingresar una opcion no valida*/
                                            System.out.println("Error: No ingreso una opcion valida");
                                    }
                                }while(semestre2 == false);     /*Fin ciclo Do-While*/
                                opcion = true;
                                break;  //Cierra ciclo
                                
                            case 4:
                                System.out.println("\tFACULTAD DE INGENIERIA INDUSTRIAL");
                                estudiante.setFacultad("Ingenieria Industrial");    //Guarda la facultad seleccionada en el objeto estudiante
                                boolean semestre3=false;    //Variable para cerrar ciclo Do-While
                                int opcSemestre4;    //Variable para seleccionar el semestre
                                do{     /*Inicio - Codigo para Ing. Industrial en ciclo Do-While*/
                                    System.out.println("Semestres: \n|1| Primer semestre\n|2| Segundo semestre\n|3| Tercer semestre\n|4| Cuarto semestre\n|5| Quinto semestre");
                                    System.out.println("|6| Sexto Semestre\n|7| Septimo semestre\n|8| Octavo semestre\n|9| Noveno semestre\n|10| Decimo semestre\n|11| Decimo primer semestre");
                                    System.out.println("Ingrese opcion: ");
                                    opcSemestre4 = validarInt();
                                    switch(opcSemestre4){
                                        case 1:
                                            estudiante.setSemestre("Semestre I");   //Guarda el semestre seleccionado en el objeto estudiante.
                                            System.out.println("\bSemestre I");
                                            System.out.println("Ingrese salon       :");
                                            estudiante.setSalon(entrada.nextLine());    //Solicita el salon desde el teclado, y lo guarda en el objeto estudiante.
                                            estudiante.setCurso1("Desarrollo humano y profesional");
                                            estudiante.setCurso2("Algebra superior");
                                            estudiante.setCurso3("Historia y comunicacion cientifica");
                                            estudiante.setCurso4("Contabilidad para ingenieros");
                                            estudiante.setCurso5("Quimica inorganica I");
                                            System.out.println("Ingrese nota de "+estudiante.getCurso1()+" :");
                                            estudiante.setNota1(validarDouble());   //Solicita la nota 1 desde el teclado, y lo guarda en el objeto estudiante.
                                            System.out.println("Ingrese nota de "+estudiante.getCurso2()+" :");
                                            estudiante.setNota2(validarDouble());   //Solicita la nota 2 desde el teclado, y lo guarda en el objeto estudiante.
                                            System.out.println("Ingrese nota de "+estudiante.getCurso3()+" :");
                                            estudiante.setNota3(validarDouble());   //Solicita la nota 3 desde el teclado, y lo guarda en el objeto estudiante.
                                            System.out.println("Ingrese nota de "+estudiante.getCurso4()+" :");
                                            estudiante.setNota4(validarDouble());   //Solicita la nota 4 desde el teclado, y lo guarda en el objeto estudiante.
                                            System.out.println("Ingrese nota de "+estudiante.getCurso5()+" :");
                                            estudiante.setNota5(validarDouble());   //Solicita la nota 5 desde el teclado, y lo guarda en el objeto estudiante.
                                            semestre3=true;
                                            break;  //cierra ciclo
                                            
                                        case 2:
                                            estudiante.setSemestre("Semestre II");   //Guarda el semestre seleccionado en el objeto estudiante.
                                            System.out.println("\bSemestre II");
                                            System.out.println("Ingrese salon       :");
                                            estudiante.setSalon(entrada.nextLine());    //Solicita el salon desde el teclado, y lo guarda en el objeto estudiante.
                                            estudiante.setCurso1("Dibujo tecnico");
                                            estudiante.setCurso2("Contabilidad para ingenieros II");
                                            estudiante.setCurso3("Geometria plana y del espacio");
                                            estudiante.setCurso4("Algebra Lineal I");
                                            estudiante.setCurso5("Programacion para ciencia e ingenieria");
                                            System.out.println("Ingrese nota de "+estudiante.getCurso1()+" :");
                                            estudiante.setNota1(validarDouble());   //Solicita la nota 1 desde el teclado, y lo guarda en el objeto estudiante.
                                            System.out.println("Ingrese nota de "+estudiante.getCurso2()+" :");
                                            estudiante.setNota2(validarDouble());   //Solicita la nota 2 desde el teclado, y lo guarda en el objeto estudiante.
                                            System.out.println("Ingrese nota de "+estudiante.getCurso3()+" :");
                                            estudiante.setNota3(validarDouble());   //Solicita la nota 3 desde el teclado, y lo guarda en el objeto estudiante.
                                            System.out.println("Ingrese nota de "+estudiante.getCurso4()+" :");
                                            estudiante.setNota4(validarDouble());   //Solicita la nota 4 desde el teclado, y lo guarda en el objeto estudiante.
                                            System.out.println("Ingrese nota de "+estudiante.getCurso5()+" :");
                                            estudiante.setNota5(validarDouble());   //Solicita la nota 5 desde el teclado, y lo guarda en el objeto estudiante.
                                            semestre3=true;
                                            break;  //Cierra ciclo
                                            
                                        case 3:
                                            estudiante.setSemestre("Semestre III");   //Guarda el semestre seleccionado en el objeto estudiante.
                                            System.out.println("\bSemestre III");
                                            System.out.println("Ingrese salon       :");
                                            estudiante.setSalon(entrada.nextLine());    //Solicita el salon desde el teclado, y lo guarda en el objeto estudiante.
                                            estudiante.setCurso1("Quimica inorganica II");
                                            estudiante.setCurso2("Administracion industrial I");
                                            estudiante.setCurso3("Dibujo asistido por computadora");
                                            estudiante.setCurso4("Calculo I");
                                            estudiante.setCurso5("Progrmacion para la ciencia e ingenieria II");
                                            System.out.println("Ingrese nota de "+estudiante.getCurso1()+" :");
                                            estudiante.setNota1(validarDouble());   //Solicita la nota 1 desde el teclado, y lo guarda en el objeto estudiante.
                                            System.out.println("Ingrese nota de "+estudiante.getCurso2()+" :");
                                            estudiante.setNota2(validarDouble());   //Solicita la nota 2 desde el teclado, y lo guarda en el objeto estudiante.
                                            System.out.println("Ingrese nota de "+estudiante.getCurso3()+" :");
                                            estudiante.setNota3(validarDouble());   //Solicita la nota 3 desde el teclado, y lo guarda en el objeto estudiante.
                                            System.out.println("Ingrese nota de "+estudiante.getCurso4()+" :");
                                            estudiante.setNota4(validarDouble());   //Solicita la nota 4 desde el teclado, y lo guarda en el objeto estudiante.
                                            System.out.println("Ingrese nota de "+estudiante.getCurso5()+" :");
                                            estudiante.setNota5(validarDouble());   //Solicita la nota 5 desde el teclado, y lo guarda en el objeto estudiante.
                                            semestre3=true;
                                            break;  //cierra ciclo
                                            
                                        case 4:
                                            estudiante.setSemestre("Semestre IV");   //Guarda el semestre seleccionado en el objeto estudiante.
                                            System.out.println("\bSemestre IV");
                                            System.out.println("Ingrese salon       :");
                                            estudiante.setSalon(entrada.nextLine());    //Solicita el salon desde el teclado, y lo guarda en el objeto estudiante.
                                            estudiante.setCurso1("Ecologia y sostenibilidad ambiental");
                                            estudiante.setCurso2("Adinistracion industrial II");
                                            estudiante.setCurso3("Calculo II");
                                            estudiante.setCurso4("Fisica I");
                                            estudiante.setCurso5("Microeconomia");
                                            System.out.println("Ingrese nota de "+estudiante.getCurso1()+" :");
                                            estudiante.setNota1(validarDouble());   //Solicita la nota 1 desde el teclado, y lo guarda en el objeto estudiante.
                                            System.out.println("Ingrese nota de "+estudiante.getCurso2()+" :");
                                            estudiante.setNota2(validarDouble());   //Solicita la nota 2 desde el teclado, y lo guarda en el objeto estudiante.
                                            System.out.println("Ingrese nota de "+estudiante.getCurso3()+" :");
                                            estudiante.setNota3(validarDouble());   //Solicita la nota 3 desde el teclado, y lo guarda en el objeto estudiante.
                                            System.out.println("Ingrese nota de "+estudiante.getCurso4()+" :");
                                            estudiante.setNota4(validarDouble());   //Solicita la nota 4 desde el teclado, y lo guarda en el objeto estudiante.
                                            System.out.println("Ingrese nota de "+estudiante.getCurso5()+" :");
                                            estudiante.setNota5(validarDouble());   //Solicita la nota 5 desde el teclado, y lo guarda en el objeto estudiante.
                                            semestre3=true;
                                            break;      //cierra ciclo
                                            
                                        case 5:
                                            estudiante.setSemestre("Semestre V");   //Guarda el semestre seleccionado en el objeto estudiante.
                                            System.out.println("\bSemestre V");
                                            System.out.println("Ingrese salon       :");
                                            estudiante.setSalon(entrada.nextLine());    //Solicita el salon desde el teclado, y lo guarda en el objeto estudiante.
                                            estudiante.setCurso1("Lesgilacion para ingenieros");
                                            estudiante.setCurso2("Fisica II");
                                            estudiante.setCurso3("Estadistica y probabiidad para la ciencia e ingenieria");
                                            estudiante.setCurso4("Psicologia industrial y comportamiento organizacional");
                                            estudiante.setCurso5("Calculo vectorial y multivariable");
                                            System.out.println("Ingrese nota de "+estudiante.getCurso1()+" :");
                                            estudiante.setNota1(validarDouble());   //Solicita la nota 1 desde el teclado, y lo guarda en el objeto estudiante.
                                            System.out.println("Ingrese nota de "+estudiante.getCurso2()+" :");
                                            estudiante.setNota2(validarDouble());   //Solicita la nota 2 desde el teclado, y lo guarda en el objeto estudiante.
                                            System.out.println("Ingrese nota de "+estudiante.getCurso3()+" :");
                                            estudiante.setNota3(validarDouble());   //Solicita la nota 3 desde el teclado, y lo guarda en el objeto estudiante.
                                            System.out.println("Ingrese nota de "+estudiante.getCurso4()+" :");
                                            estudiante.setNota4(validarDouble());   //Solicita la nota 4 desde el teclado, y lo guarda en el objeto estudiante.
                                            System.out.println("Ingrese nota de "+estudiante.getCurso5()+" :");
                                            estudiante.setNota5(validarDouble());   //Solicita la nota 5 desde el teclado, y lo guarda en el objeto estudiante.
                                            semestre3=true;
                                            break;      //cierra ciclo
                                            
                                        case 6:
                                            estudiante.setSemestre("Semestre VI");   //Guarda el semestre seleccionado en el objeto estudiante.
                                            System.out.println("\bSemestre VI");
                                            System.out.println("Ingrese salon       :");
                                            estudiante.setSalon(entrada.nextLine());    //Solicita el salon desde el teclado, y lo guarda en el objeto estudiante.
                                            estudiante.setCurso1("Macroeconomia");
                                            estudiante.setCurso2("Ecuaaciones diferenciales ordinarias");
                                            estudiante.setCurso3("Fisica III");
                                            estudiante.setCurso4("Mecanica de cuerpos rigidos I");
                                            estudiante.setCurso5("Estadistica inferencial");
                                            System.out.println("Ingrese nota de "+estudiante.getCurso1()+" :");
                                            estudiante.setNota1(validarDouble());   //Solicita la nota 1 desde el teclado, y lo guarda en el objeto estudiante.
                                            System.out.println("Ingrese nota de "+estudiante.getCurso2()+" :");
                                            estudiante.setNota2(validarDouble());   //Solicita la nota 2 desde el teclado, y lo guarda en el objeto estudiante.
                                            System.out.println("Ingrese nota de "+estudiante.getCurso3()+" :");
                                            estudiante.setNota3(validarDouble());   //Solicita la nota 3 desde el teclado, y lo guarda en el objeto estudiante.
                                            System.out.println("Ingrese nota de "+estudiante.getCurso4()+" :");
                                            estudiante.setNota4(validarDouble());   //Solicita la nota 4 desde el teclado, y lo guarda en el objeto estudiante.
                                            System.out.println("Ingrese nota de "+estudiante.getCurso5()+" :");
                                            estudiante.setNota5(validarDouble());   //Solicita la nota 5 desde el teclado, y lo guarda en el objeto estudiante.
                                            semestre3=true;
                                            break;  //cierra ciclo
                                            
                                        case 7:
                                            estudiante.setSemestre("Semestre VII");   //Guarda el semestre seleccionado en el objeto estudiante.
                                            System.out.println("\bSemestre VII");
                                            System.out.println("Ingrese salon       :");
                                            estudiante.setSalon(entrada.nextLine());    //Solicita el salon desde el teclado, y lo guarda en el objeto estudiante.
                                            estudiante.setCurso1("Administracion de recursos humanos");
                                            estudiante.setCurso2("Mecanica de solidos I");
                                            estudiante.setCurso3("Planeacioin estrategica");
                                            estudiante.setCurso4("Ciencia de los materiales");
                                            estudiante.setCurso5("Control industrial de calidad");
                                            System.out.println("Ingrese nota de "+estudiante.getCurso1()+" :");
                                            estudiante.setNota1(validarDouble());   //Solicita la nota 1 desde el teclado, y lo guarda en el objeto estudiante.
                                            System.out.println("Ingrese nota de "+estudiante.getCurso2()+" :");
                                            estudiante.setNota2(validarDouble());   //Solicita la nota 2 desde el teclado, y lo guarda en el objeto estudiante.
                                            System.out.println("Ingrese nota de "+estudiante.getCurso3()+" :");
                                            estudiante.setNota3(validarDouble());   //Solicita la nota 3 desde el teclado, y lo guarda en el objeto estudiante.
                                            System.out.println("Ingrese nota de "+estudiante.getCurso4()+" :");
                                            estudiante.setNota4(validarDouble());   //Solicita la nota 4 desde el teclado, y lo guarda en el objeto estudiante.
                                            System.out.println("Ingrese nota de "+estudiante.getCurso5()+" :");
                                            estudiante.setNota5(validarDouble());   //Solicita la nota 5 desde el teclado, y lo guarda en el objeto estudiante.
                                            semestre3=true;
                                            break;  //cierra ciclo
                                            
                                        case 8:
                                            estudiante.setSemestre("Semestre VIII");   //Guarda el semestre seleccionado en el objeto estudiante.
                                            System.out.println("\bSemestre VIII");
                                            System.out.println("Ingrese salon       :");
                                            estudiante.setSalon(entrada.nextLine());    //Solicita el salon desde el teclado, y lo guarda en el objeto estudiante.
                                            estudiante.setCurso1("Analisis numerico");
                                            estudiante.setCurso2("Mecanica de fluidos");
                                            estudiante.setCurso3("Diseño de plantas industriales");
                                            estudiante.setCurso4("Ingenieria electrica I");
                                            estudiante.setCurso5("Investigacion de operaciones I");
                                            System.out.println("Ingrese nota de "+estudiante.getCurso1()+" :");
                                            estudiante.setNota1(validarDouble());   //Solicita la nota 1 desde el teclado, y lo guarda en el objeto estudiante.
                                            System.out.println("Ingrese nota de "+estudiante.getCurso2()+" :");
                                            estudiante.setNota2(validarDouble());   //Solicita la nota 1 desde el teclado, y lo guarda en el objeto estudiante.
                                            System.out.println("Ingrese nota de "+estudiante.getCurso3()+" :");
                                            estudiante.setNota3(validarDouble());   //Solicita la nota 1 desde el teclado, y lo guarda en el objeto estudiante.
                                            System.out.println("Ingrese nota de "+estudiante.getCurso4()+" :");
                                            estudiante.setNota4(validarDouble());   //Solicita la nota 1 desde el teclado, y lo guarda en el objeto estudiante.
                                            System.out.println("Ingrese nota de "+estudiante.getCurso5()+" :");
                                            estudiante.setNota5(validarDouble());   //Solicita la nota 1 desde el teclado, y lo guarda en el objeto estudiante.
                                            semestre3=true; //cierra ciclo
                                            break;
                                            
                                        case 9:
                                            estudiante.setSemestre("Semestre IX");   //Guarda el semestre seleccionado en el objeto estudiante.
                                            System.out.println("\bSemestre IX");
                                            System.out.println("Ingrese salon       ");
                                            estudiante.setSalon(entrada.nextLine());    //Solicita el salon desde el teclado, y lo guarda en el objeto estudiante.
                                            estudiante.setCurso1("Termodinamica I");
                                            estudiante.setCurso2("Contabilidad de costos para ingenieros");
                                            estudiante.setCurso3("Investigacion de operaciones II");
                                            estudiante.setCurso4("Seguridad e higiene industrial");
                                            estudiante.setCurso5("Analisis de mercado");
                                            System.out.println("Ingrese nota de "+estudiante.getCurso1()+" :");
                                            estudiante.setNota1(validarDouble());   //Solicita la nota 1 desde el teclado, y lo guarda en el objeto estudiante.
                                            System.out.println("Ingrese nota de "+estudiante.getCurso2()+" :");
                                            estudiante.setNota2(validarDouble());   //Solicita la nota 2 desde el teclado, y lo guarda en el objeto estudiante.
                                            System.out.println("Ingrese nota de "+estudiante.getCurso3()+" :");
                                            estudiante.setNota3(validarDouble());   //Solicita la nota 3 desde el teclado, y lo guarda en el objeto estudiante.
                                            System.out.println("Ingrese nota de "+estudiante.getCurso4()+" :");
                                            estudiante.setNota4(validarDouble());   //Solicita la nota 4 desde el teclado, y lo guarda en el objeto estudiante.
                                            System.out.println("Ingrese nota de "+estudiante.getCurso5()+" :");
                                            estudiante.setNota5(validarDouble());   //Solicita la nota 5 desde el teclado, y lo guarda en el objeto estudiante.
                                            semestre3=true;
                                            break;      //cierra ciclo
                                            
                                        case 10:
                                            estudiante.setSemestre("Semestre X");   //Guarda el semestre seleccionado en el objeto estudiante.
                                            System.out.println("\bSemestre X");
                                            System.out.println("Ingrese salon       :");
                                            estudiante.setSalon(entrada.nextLine());    //Solicita el salon desde el teclado, y lo guarda en el objeto estudiante.
                                            estudiante.setCurso1("Control de la produccion");
                                            estudiante.setCurso2("Ingenieria de metodos");
                                            estudiante.setCurso3("Procesos de fabricacion I");
                                            estudiante.setCurso4("Ingenieria economica");
                                            estudiante.setCurso5("Logistica");
                                            System.out.println("Ingrese nota de "+estudiante.getCurso1()+" :");
                                            estudiante.setNota1(validarDouble());   //Solicita la nota 1 desde el teclado, y lo guarda en el objeto estudiante.
                                            System.out.println("Ingrese nota de "+estudiante.getCurso2()+" :");
                                            estudiante.setNota2(validarDouble());   //Solicita la nota 2 desde el teclado, y lo guarda en el objeto estudiante.
                                            System.out.println("Ingrese nota de "+estudiante.getCurso3()+" :");
                                            estudiante.setNota3(validarDouble());   //Solicita la nota 3 desde el teclado, y lo guarda en el objeto estudiante.
                                            System.out.println("Ingrese nota de "+estudiante.getCurso4()+" :");
                                            estudiante.setNota4(validarDouble());   //Solicita la nota 4 desde el teclado, y lo guarda en el objeto estudiante.
                                            System.out.println("Ingrese nota de "+estudiante.getCurso5()+" :");
                                            estudiante.setNota5(validarDouble());   //Solicita la nota 5 desde el teclado, y lo guarda en el objeto estudiante.
                                            semestre3=true;
                                            break;  //Cierra ciclo
                                            
                                        case 11:
                                            estudiante.setSemestre("Semestre XI");   //Guarda el semestre seleccionado en el objeto estudiante.
                                            System.out.println("\bSemestre XI");
                                            System.out.println("Ingrese salon       :");
                                            estudiante.setSalon(entrada.nextLine());    //Solicita el salon desde el teclado, y lo guarda en el objeto estudiante.
                                            estudiante.setCurso1("Administracion financiera");
                                            estudiante.setCurso2("Metodologia para la optimazacion de la produccion");
                                            estudiante.setCurso3("Ingenieria de proyectos");
                                            estudiante.setCurso4("Procesos de Fabricacion II");
                                            estudiante.setCurso5("Indisponible");
                                            System.out.println("Ingrese nota de "+estudiante.getCurso1()+" :");
                                            estudiante.setNota1(validarDouble());   //Solicita la nota 1 desde el teclado, y lo guarda en el objeto estudiante.
                                            System.out.println("Ingrese nota de "+estudiante.getCurso2()+" :");
                                            estudiante.setNota2(validarDouble());   //Solicita la nota 2 desde el teclado, y lo guarda en el objeto estudiante.
                                            System.out.println("Ingrese nota de "+estudiante.getCurso3()+" :");
                                            estudiante.setNota3(validarDouble());   //Solicita la nota 3 desde el teclado, y lo guarda en el objeto estudiante.
                                            System.out.println("Ingrese nota de "+estudiante.getCurso4()+" :");
                                            estudiante.setNota4(validarDouble());   //Solicita la nota 4 desde el teclado, y lo guarda en el objeto estudiante.
                                            //System.out.println("Ingrese nota de "+estudiante.getCurso5()+" :");
                                            estudiante.setNota5(/*validarDouble()*/0);  //Guarda nota 5 a 0 en el obejto estudiante.
                                            semestre3=true;
                                            break;  //cierra el ciclo
                                        default:    /*Mensaje por ingreso de una opcion no valida*/
                                            System.out.println("Error: No ingreso una opcion valida");
                                    }
                                }while(semestre3 == false);     /*Fin ciclo Do-While*/
                                opcion = true;
                                break;      //cierra el ciclo
                                
                            case 5:
                                System.out.println("\tFACULTAD DE CIENCIAS JURIDICAS Y SOCIALES");
                                estudiante.setFacultad("Ciencias juruducas y sociales");    //Guarda la facultad seleccionada en el onjeto estudainte
                                boolean semestre4=false;    //Varible booleana para cerrar ciclo Do-While
                                int opcSemestre5;    //Variable para seleccionar el semestre
                                do{     /*Inicio - Codigo para Ciencias Juridicas en Ciclo Do-While*/
                                    System.out.println("Semestres: \n|1| Primer semestre\n|2| Segundo semestre\n|3| Tercer semestre\n|4| Cuarto semestre\n|5| Quinto semestre");
                                    System.out.println("|6| Sexto Semestre\n|7| Septimo semestre\n|8| Octavo semestre\n|9| Noveno semestre\n|10| Decimo semestre\n|11| Decimo primer semestre");
                                    System.out.println("Ingrese opcion: ");
                                    opcSemestre5 = validarInt();    //Ingreso de opcion, validando que sea un entero el ingresado
                                    switch(opcSemestre5){
                                        case 1:
                                            estudiante.setSemestre("Semestre I");   //Guarda el semestre seleccionado en el objeto estudiante.
                                            System.out.println("\bSemestre I");
                                            System.out.println("Ingrese salon       :");
                                            estudiante.setSalon(entrada.nextLine());    //Solicita el salon desde el teclado, y lo guarda en el objeto estudiante.
                                            estudiante.setCurso1("Introduccion al derecho I");
                                            estudiante.setCurso2("Sociologia de Guatemala");
                                            estudiante.setCurso3("Filosofia");
                                            estudiante.setCurso4("Economia");
                                            estudiante.setCurso5("Lenguaje y tecnicas de investigacion");
                                            System.out.println("Ingrese nota de "+estudiante.getCurso1()+" :");
                                            estudiante.setNota1(validarDouble());   //Solicita la nota 1 desde el teclado, y lo guarda en el objeto estudiante.
                                            System.out.println("Ingrese nota de "+estudiante.getCurso2()+" :");
                                            estudiante.setNota2(validarDouble());   //Solicita la nota 2 desde el teclado, y lo guarda en el objeto estudiante.
                                            System.out.println("Ingrese nota de "+estudiante.getCurso3()+" :");
                                            estudiante.setNota3(validarDouble());   //Solicita la nota 3 desde el teclado, y lo guarda en el objeto estudiante.
                                            System.out.println("Ingrese nota de "+estudiante.getCurso4()+" :");
                                            estudiante.setNota4(validarDouble());   //Solicita la nota 4 desde el teclado, y lo guarda en el objeto estudiante.
                                            System.out.println("Ingrese nota de "+estudiante.getCurso5()+" :");
                                            estudiante.setNota5(validarDouble());   //Solicita la nota 5 desde el teclado, y lo guarda en el objeto estudiante.
                                            semestre4=true;
                                            break;  //cierra ciclo
                                            
                                        case 2:
                                            estudiante.setSemestre("Semestre II");   //Guarda el semestre seleccionado en el objeto estudiante.
                                            System.out.println("\bSemestre II");
                                            System.out.println("Ingrese salon       :");
                                            estudiante.setSalon(entrada.nextLine());    //Solicita el salon desde el teclado, y lo guarda en el objeto estudiante.
                                            estudiante.setCurso1("Introduccion al derecho II");
                                            estudiante.setCurso2("Teoria general del estado");
                                            estudiante.setCurso3("Dercho romano y español");
                                            estudiante.setCurso4("Desarrollo humano y profesional");
                                            estudiante.setCurso5("Dercho penal I");
                                            System.out.println("Ingrese nota de "+estudiante.getCurso1()+" :");
                                            estudiante.setNota1(validarDouble());   //Solicita la nota 1 desde el teclado, y lo guarda en el objeto estudiante.
                                            System.out.println("Ingrese nota de "+estudiante.getCurso2()+" :");
                                            estudiante.setNota2(validarDouble());   //Solicita la nota 2 desde el teclado, y lo guarda en el objeto estudiante.
                                            System.out.println("Ingrese nota de "+estudiante.getCurso3()+" :");
                                            estudiante.setNota3(validarDouble());   //Solicita la nota 3 desde el teclado, y lo guarda en el objeto estudiante.
                                            System.out.println("Ingrese nota de "+estudiante.getCurso4()+" :");
                                            estudiante.setNota4(validarDouble());   //Solicita la nota 4 desde el teclado, y lo guarda en el objeto estudiante.
                                            System.out.println("Ingrese nota de "+estudiante.getCurso5()+" :");
                                            estudiante.setNota5(validarDouble());   //Solicita la nota 5 desde el teclado, y lo guarda en el objeto estudiante.
                                            semestre4=true;
                                            break;  //cierra ciclo
                                            
                                        case 3:
                                            estudiante.setSemestre("Semestre III");   //Guarda el semestre seleccionado en el objeto estudiante.
                                            System.out.println("\bSemestre III");
                                            System.out.println("Ingrese salon       :");
                                            estudiante.setSalon(entrada.nextLine());    //Solicita el salon desde el teclado, y lo guarda en el objeto estudiante.
                                            estudiante.setCurso1("Criminologia");
                                            estudiante.setCurso2("Derecho civil I");
                                            estudiante.setCurso3("Derecho penal II");
                                            estudiante.setCurso4("Derecho constitucional guatemalteco");
                                            estudiante.setCurso5("Teoria general del proceso");
                                            System.out.println("Ingrese nota de "+estudiante.getCurso1()+" :");
                                            estudiante.setNota1(validarDouble());   //Solicita la nota 1 desde el teclado, y lo guarda en el objeto estudiante.
                                            System.out.println("Ingrese nota de "+estudiante.getCurso2()+" :");
                                            estudiante.setNota2(validarDouble());   //Solicita la nota 2 desde el teclado, y lo guarda en el objeto estudiante.
                                            System.out.println("Ingrese nota de "+estudiante.getCurso3()+" :");
                                            estudiante.setNota3(validarDouble());   //Solicita la nota 3 desde el teclado, y lo guarda en el objeto estudiante.
                                            System.out.println("Ingrese nota de "+estudiante.getCurso4()+" :");
                                            estudiante.setNota4(validarDouble());   //Solicita la nota 4 desde el teclado, y lo guarda en el objeto estudiante.
                                            System.out.println("Ingrese nota de "+estudiante.getCurso5()+" :");
                                            estudiante.setNota5(validarDouble());   //Solicita la nota 5 desde el teclado, y lo guarda en el objeto estudiante.
                                            semestre4=true;
                                            break;  //cierra ciclo
                                            
                                        case 4:
                                            estudiante.setSemestre("Semestre IV");   //Guarda el semestre seleccionado en el objeto estudiante.
                                            System.out.println("\bSemestre IV");
                                            System.out.println("Ingrese salon       :");
                                            estudiante.setSalon(entrada.nextLine());    //Solicita el salon desde el teclado, y lo guarda en el objeto estudiante.
                                            estudiante.setCurso1("Medicina forense");
                                            estudiante.setCurso2("Derecho civil II");
                                            estudiante.setCurso3("Derecho penal II");
                                            estudiante.setCurso4("Dercho administrativo I");
                                            estudiante.setCurso5("Logica juridica y etica profesional");
                                            System.out.println("Ingrese nota de "+estudiante.getCurso1()+" :");
                                            estudiante.setNota1(validarDouble());   //Solicita la nota 1 desde el teclado, y lo guarda en el objeto estudiante.
                                            System.out.println("Ingrese nota de "+estudiante.getCurso2()+" :");
                                            estudiante.setNota2(validarDouble());   //Solicita la nota 2 desde el teclado, y lo guarda en el objeto estudiante.
                                            System.out.println("Ingrese nota de "+estudiante.getCurso3()+" :");
                                            estudiante.setNota3(validarDouble());   //Solicita la nota 3 desde el teclado, y lo guarda en el objeto estudiante.
                                            System.out.println("Ingrese nota de "+estudiante.getCurso4()+" :");
                                            estudiante.setNota4(validarDouble());   //Solicita la nota 4 desde el teclado, y lo guarda en el objeto estudiante.
                                            System.out.println("Ingrese nota de "+estudiante.getCurso5()+" :");
                                            estudiante.setNota5(validarDouble());   //Solicita la nota 5 desde el teclado, y lo guarda en el objeto estudiante.
                                            semestre4=true;
                                            break;  //cierra ciclo
                                            
                                        case 5:
                                            estudiante.setSemestre("Semestre V");   //Guarda el semestre seleccionado en el objeto estudiante.
                                            System.out.println("\bSemestre V");
                                            System.out.println("Ingrese salon       :");
                                            estudiante.setSalon(entrada.nextLine());    //Solicita el salon desde el teclado, y lo guarda en el objeto estudiante.
                                            estudiante.setCurso1("Derecho ambiental");
                                            estudiante.setCurso2("Derechos humanos");
                                            estudiante.setCurso3("Derecho civil III");
                                            estudiante.setCurso4("Derecho administrativo II");
                                            estudiante.setCurso5("Derecho financiero y tributario");
                                            System.out.println("Ingrese nota de "+estudiante.getCurso1()+" :");
                                            estudiante.setNota1(validarDouble());   //Solicita la nota 1 desde el teclado, y lo guarda en el objeto estudiante.
                                            System.out.println("Ingrese nota de "+estudiante.getCurso2()+" :");
                                            estudiante.setNota2(validarDouble());   //Solicita la nota 2 desde el teclado, y lo guarda en el objeto estudiante.
                                            System.out.println("Ingrese nota de "+estudiante.getCurso3()+" :");
                                            estudiante.setNota3(validarDouble());   //Solicita la nota 3 desde el teclado, y lo guarda en el objeto estudiante.
                                            System.out.println("Ingrese nota de "+estudiante.getCurso4()+" :");
                                            estudiante.setNota4(validarDouble());   //Solicita la nota 4 desde el teclado, y lo guarda en el objeto estudiante.
                                            System.out.println("Ingrese nota de "+estudiante.getCurso5()+" :");
                                            estudiante.setNota5(validarDouble());   //Solicita la nota 5 desde el teclado, y lo guarda en el objeto estudiante.
                                            semestre4=true;
                                            break;  //cierra ciclo
                                            
                                        case 6:
                                            estudiante.setSemestre("Semestre VI");   //Guarda el semestre seleccionado en el objeto estudiante.
                                            System.out.println("\bSemestre VI");
                                            System.out.println("Ingrese salon       :");
                                            estudiante.setSalon(entrada.nextLine());    //Solicita el salon desde el teclado, y lo guarda en el objeto estudiante.
                                            estudiante.setCurso1("Derecho del trabajo I");
                                            estudiante.setCurso2("Derecho procesal penal I");
                                            estudiante.setCurso3("Oratoria forense");
                                            estudiante.setCurso4("Dercho civil IV");
                                            estudiante.setCurso5("Derecho mercantil");
                                            System.out.println("Ingrese nota de "+estudiante.getCurso1()+" :");
                                            estudiante.setNota1(validarDouble());   //Solicita la nota 1 desde el teclado, y lo guarda en el objeto estudiante.
                                            System.out.println("Ingrese nota de "+estudiante.getCurso2()+" :");
                                            estudiante.setNota2(validarDouble());   //Solicita la nota 2 desde el teclado, y lo guarda en el objeto estudiante.
                                            System.out.println("Ingrese nota de "+estudiante.getCurso3()+" :");
                                            estudiante.setNota3(validarDouble());   //Solicita la nota 3 desde el teclado, y lo guarda en el objeto estudiante.
                                            System.out.println("Ingrese nota de "+estudiante.getCurso4()+" :");
                                            estudiante.setNota4(validarDouble());   //Solicita la nota 4 desde el teclado, y lo guarda en el objeto estudiante.
                                            System.out.println("Ingrese nota de "+estudiante.getCurso5()+" :");
                                            estudiante.setNota5(validarDouble());   //Solicita la nota 5 desde el teclado, y lo guarda en el objeto estudiante.
                                            semestre4=true;
                                            break;  //cierra ciclo
                                            
                                        case 7:
                                            estudiante.setSemestre("Semestre VII");   //Guarda el semestre seleccionado en el objeto estudiante.
                                            System.out.println("\bSemestre VII");
                                            System.out.println("Ingrese salon       :");
                                            estudiante.setSalon(entrada.nextLine());    //Solicita el salon desde el teclado, y lo guarda en el objeto estudiante.
                                            estudiante.setCurso1("Derecho procesal administrativo");
                                            estudiante.setCurso2("Derecho del trabajo II");
                                            estudiante.setCurso3("Derecho procesal penal II");
                                            estudiante.setCurso4("Derecho civil V");
                                            estudiante.setCurso5("Derecho mercantil II");
                                            System.out.println("Ingrese nota de "+estudiante.getCurso1()+" :");
                                            estudiante.setNota1(validarDouble());   //Solicita la nota 1 desde el teclado, y lo guarda en el objeto estudiante.
                                            System.out.println("Ingrese nota de "+estudiante.getCurso2()+" :");
                                            estudiante.setNota2(validarDouble());   //Solicita la nota 2 desde el teclado, y lo guarda en el objeto estudiante.
                                            System.out.println("Ingrese nota de "+estudiante.getCurso3()+" :");
                                            estudiante.setNota3(validarDouble());   //Solicita la nota 3 desde el teclado, y lo guarda en el objeto estudiante.
                                            System.out.println("Ingrese nota de "+estudiante.getCurso4()+" :");
                                            estudiante.setNota4(validarDouble());   //Solicita la nota 4 desde el teclado, y lo guarda en el objeto estudiante.
                                            System.out.println("Ingrese nota de "+estudiante.getCurso5()+" :");
                                            estudiante.setNota5(validarDouble());   //Solicita la nota 5 desde el teclado, y lo guarda en el objeto estudiante.
                                            semestre4=true;
                                            break;  //cierra ciclo
                                            
                                        case 8:
                                            estudiante.setSemestre("Semestre VIII");   //Guarda el semestre seleccionado en el objeto estudiante.
                                            System.out.println("\bSemestre VIII");
                                            System.out.println("Ingrese salon       :");
                                            estudiante.setSalon(entrada.nextLine());    //Solicita el salon desde el teclado, y lo guarda en el objeto estudiante.
                                            estudiante.setCurso1("Clinica procesal penal");
                                            estudiante.setCurso2("Seminario de trabajo de graduacion");
                                            estudiante.setCurso3("Derecho procesal civil y mercantil I");
                                            estudiante.setCurso4("Derecho mercantil III");
                                            estudiante.setCurso5("Derecho internacional publico");
                                            System.out.println("Ingrese nota de "+estudiante.getCurso1()+" :");
                                            estudiante.setNota1(validarDouble());   //Solicita la nota 1 desde el teclado, y lo guarda en el objeto estudiante.
                                            System.out.println("Ingrese nota de "+estudiante.getCurso2()+" :");
                                            estudiante.setNota2(validarDouble());   //Solicita la nota 2 desde el teclado, y lo guarda en el objeto estudiante.
                                            System.out.println("Ingrese nota de "+estudiante.getCurso3()+" :");
                                            estudiante.setNota3(validarDouble());   //Solicita la nota 3 desde el teclado, y lo guarda en el objeto estudiante.
                                            System.out.println("Ingrese nota de "+estudiante.getCurso4()+" :");
                                            estudiante.setNota4(validarDouble());   //Solicita la nota 4 desde el teclado, y lo guarda en el objeto estudiante.
                                            System.out.println("Ingrese nota de "+estudiante.getCurso5()+" :");
                                            estudiante.setNota5(validarDouble());   //Solicita la nota 5 desde el teclado, y lo guarda en el objeto estudiante.
                                            semestre4=true;
                                            break;  //cierra ciclo
                                            
                                        case 9:
                                            estudiante.setSemestre("Semestre IX");   //Guarda el semestre seleccionado en el objeto estudiante.
                                            System.out.println("\bSemestre IX");
                                            System.out.println("Ingrese salon       ");
                                            estudiante.setSalon(entrada.nextLine());    //Solicita el salon desde el teclado, y lo guarda en el objeto estudiante.
                                            estudiante.setCurso1("Dercho notarial II");
                                            estudiante.setCurso2("Clinica procesal laboral");
                                            estudiante.setCurso3("Clinica procesal peñal II");
                                            estudiante.setCurso4("Derecho procesal civil y mercantal II");
                                            estudiante.setCurso5("Derecho procesal constitucional");
                                            System.out.println("Ingrese nota de "+estudiante.getCurso1()+" :");
                                            estudiante.setNota1(validarDouble());   //Solicita la nota 1 desde el teclado, y lo guarda en el objeto estudiante.
                                            System.out.println("Ingrese nota de "+estudiante.getCurso2()+" :");
                                            estudiante.setNota2(validarDouble());   //Solicita la nota 2 desde el teclado, y lo guarda en el objeto estudiante.
                                            System.out.println("Ingrese nota de "+estudiante.getCurso3()+" :");
                                            estudiante.setNota3(validarDouble());   //Solicita la nota 3 desde el teclado, y lo guarda en el objeto estudiante.
                                            System.out.println("Ingrese nota de "+estudiante.getCurso4()+" :");
                                            estudiante.setNota4(validarDouble());   //Solicita la nota 4 desde el teclado, y lo guarda en el objeto estudiante.
                                            System.out.println("Ingrese nota de "+estudiante.getCurso5()+" :");
                                            estudiante.setNota5(validarDouble());   //Solicita la nota 5 desde el teclado, y lo guarda en el objeto estudiante.
                                            semestre4=true;
                                            break;  //cierra ciclo
                                            
                                        case 10:
                                            estudiante.setSemestre("Semestre X");   //Guarda el semestre seleccionado en el objeto estudiante.
                                            System.out.println("\bSemestre X");
                                            System.out.println("Ingrese salon       :");
                                            estudiante.setSalon(entrada.nextLine());    //Solicita el salon desde el teclado, y lo guarda en el objeto estudiante.
                                            estudiante.setCurso1("Derecho Notarial III");
                                            estudiante.setCurso2("Clinica procesal civil I");
                                            estudiante.setCurso3("Derecho registral");
                                            estudiante.setCurso4("Derecho bancario bursatil");
                                            estudiante.setCurso5("Derecho procesal civil y mercantil III");
                                            System.out.println("Ingrese nota de "+estudiante.getCurso1()+" :");
                                            estudiante.setNota1(validarDouble());   //Solicita la nota 1 desde el teclado, y lo guarda en el objeto estudiante.
                                            System.out.println("Ingrese nota de "+estudiante.getCurso2()+" :");
                                            estudiante.setNota2(validarDouble());   //Solicita la nota 2 desde el teclado, y lo guarda en el objeto estudiante.
                                            System.out.println("Ingrese nota de "+estudiante.getCurso3()+" :");
                                            estudiante.setNota3(validarDouble());   //Solicita la nota 3 desde el teclado, y lo guarda en el objeto estudiante.
                                            System.out.println("Ingrese nota de "+estudiante.getCurso4()+" :");
                                            estudiante.setNota4(validarDouble());   //Solicita la nota 4 desde el teclado, y lo guarda en el objeto estudiante.
                                            System.out.println("Ingrese nota de "+estudiante.getCurso5()+" :");
                                            estudiante.setNota5(validarDouble());   //Solicita la nota 5 desde el teclado, y lo guarda en el objeto estudiante.
                                            semestre4=true;
                                            break;  //cierra ciclo
                                            
                                        case 11:
                                            estudiante.setSemestre("Semestre XI");   //Guarda el semestre seleccionado en el objeto estudiante.
                                            System.out.println("\bSemestre XI");
                                            System.out.println("Ingrese salon       :");
                                            estudiante.setSalon(entrada.nextLine());    //Solicita el salon desde el teclado, y lo guarda en el objeto estudiante.
                                            estudiante.setCurso1("Filosofia del derecho");
                                            estudiante.setCurso2("Dercho internacional privado");
                                            estudiante.setCurso3("Clinica procesal civl II");
                                            estudiante.setCurso4("Indisponible");
                                            estudiante.setCurso5("Indisponible");
                                            System.out.println("Ingrese nota de "+estudiante.getCurso1()+" :");
                                            estudiante.setNota1(validarDouble());   //Solicita la nota 1 desde el teclado, y lo guarda en el objeto estudiante.
                                            System.out.println("Ingrese nota de "+estudiante.getCurso2()+" :");
                                            estudiante.setNota2(validarDouble());   //Solicita la nota 2 desde el teclado, y lo guarda en el objeto estudiante.
                                            System.out.println("Ingrese nota de "+estudiante.getCurso3()+" :");
                                            estudiante.setNota3(validarDouble());   //Solicita la nota 3 desde el teclado, y lo guarda en el objeto estudiante.
                                            //System.out.println("Ingrese nota de "+estudiante.getCurso4()+" :");
                                            estudiante.setNota4(/*validarDouble()*/0);  //Guarda nota 4 a 0 en el objeto estudiante.
                                            //System.out.println("Ingrese nota de "+estudiante.getCurso5()+" :");
                                            estudiante.setNota5(/*validarDouble()*/0);  //Guarda nota 5 a 0 en el objeto estudiante.
                                            semestre4=true;
                                            break;  //cierra ciclo
                                        default:    /*Mensaje por ingresar una opcion invalida*/
                                            System.out.println("Error: No ingreso una opcion valida");
                                    }
                                }while(semestre4 == false);     /*Fin ciclo Do-While*/
                                opcion = true;
                                break;  //cierra ciclo
                                
                            default:    /*Mensaje por ingresar una opcion invalida*/
                                System.out.println("\tERROR: No ingreso una opcion valida\n");
                        }
                    }while(opcion==false);      /*Fin ciclo Do-While de Registrar Alumno*/
                    //System.out.println(estudiante);
                    estudiantes.add(estudiante);         //Agrega el objeto estudiante a la coleccion estudiantes.
                    estudiante.imprimirInfo();      //Metodo del objeto estudiante para imprimir su información.
                    break;  //Regresa al Menu Principal
                /*Fin - Codigo para ingresar un registro*/
                    
                /*Inicio - Codigo para eliminar un registro de la coleccion estudiantes*/
                case 2:
                    System.out.println("\tEliminar resgistros");
                    String carnet;//Varible para guardar el dato a buscar, el dato ingresado se buscará por el carnet. 
                    boolean encontrado=false;// Variable para condicional de busqueda
                    System.out.println("Buscar carnet\n Ingrese el No.carnet del alumno a eliminar: ");
                    carnet = entrada.nextLine();    //Ingresa el carnet a buscar en la coleccion estudiantes.
                    /*Inicio || Codigo para buscar el objeto ingreado*/
                    for(int j=0; j<estudiantes.size();j++){           /*Ciclo para recorrer toda la coleccion objeto por objeto*/
                        Estudiante actualizar = estudiantes.get(j);     //Posicion     
                        if(actualizar.getCarnet().equals(carnet)){    /*Condicional para comparar dato ingresado en los objetos de la coleccion*/
                            System.out.println("\tRegistro Econtrado.");
                            estudiantes.get(j).imprimirInfo();/*Metodo del objeto encontrado para mostrar su Informacion*/System.out.println("");
                            estudiantes.remove(j);        //Elimina objeto encontrado de la coleccion estudiantes con la opcion remove. j = Igual a la posicion que se encuntra.
                            System.out.println("\nRegistro Eliminado.");
                            encontrado = true;
                        }else{}
                    }/*Fin*/
                    if(!encontrado){        /*Condicional si no se encuentra el objeto*/
                        System.out.println("\tAlumno: "+carnet + " no econtrado.");
                    }else{}
                    break;  //Regresa al Menu Principal
                /*Fin - Codigo para eliminar un registro*/
                    
                /*Inicio - Codigo para actualizar un registro de la coleccion estudiantes*/
                case 3:
                    System.out.println("\tActualizar resgistros");
                    String carnet0;//Varible para ingrear dato a buscar, los objetos guardados en la coleccion se buscaran, por el codigo.
                    boolean encontrar=false;// Varible para condicional de busqueda
                    System.out.println("Buscar Alumno\n Ingrese el carnet del alumono para actualizar notas: ");
                    carnet0 = entrada.nextLine();    //Ingresa el carnet a buscar en la coleccion estudiantes.
                    /*Inicio || Codigo para buscar el objeto ingreado*/
                    for(int j=0; j<estudiantes.size();j++){           /*Ciclo para recorrer toda la coleccion objeto por objeto*/
                        Estudiante actualizar = estudiantes.get(j);     //Igualar el objeto actualizar con Posicion     
                        if(actualizar.getCarnet().equals(carnet0)){    /*Condicional para comparar dato ingresado en los objetos de la coleccion*/
                            System.out.println("\tAlumno encontrado\n"+ estudiantes.get(j) +"\nIngrese nuevas notas:");
                            System.out.println("Ingrese nueva nota de "+estudiantes.get(j).getCurso1()+" :");
                            estudiantes.get(j).setNota1(validarDouble());   //Solicita la nueva nota 1 desde el teclado y lo guarda en el objeto de la posicion que se encuentra.
                            System.out.println("Ingrese nueva nota de "+estudiantes.get(j).getCurso2()+" :");
                            estudiantes.get(j).setNota2(validarDouble());   //Solicita la nueva nota 1 desde el teclado y lo guarda en el objeto de la posicion que se encuentra.
                            System.out.println("Ingrese nueva nota de "+estudiantes.get(j).getCurso3()+" :");
                            estudiantes.get(j).setNota3(validarDouble());   //Solicita la nueva nota 1 desde el teclado y lo guarda en el objeto de la posicion que se encuentra.
                            System.out.println("Ingrese nueva nota de "+estudiantes.get(j).getCurso4()+" :");
                            estudiantes.get(j).setNota4(validarDouble());   //Solicita la nueva nota 1 desde el teclado y lo guarda en el objeto de la posicion que se encuentra.
                            System.out.println("Ingrese nueva nota de "+estudiantes.get(j).getCurso5()+" :");
                            estudiantes.get(j).setNota5(validarDouble());   //Solicita la nueva nota 1 desde el teclado y lo guarda en el objeto de la posicion que se encuentra.
                            encontrar = true;
                        }else{}
                    }/*Fin*/
                    if(!encontrar){        /*Condicional si no se encuentra el objeto*/
                        System.out.println("\tAlumno: "+carnet0 + " no econtrado.");
                    }else{}
                    break;  //Regresa al Menu Principal
                /*Fin - Codigo para actualizar un registro*/
                    
                /*Inicio - Codigo para consultar un registro de la coleccion estudiantes*/    
                case 4:
                    System.out.println("\tConsultar resgistros");
                    System.out.println("|1| Mostrar todos los registros");
                    System.out.println("|2| Buscar un registro");
                    int consultar=validarInt(); //Varible para seleccionar una opcion para consultar registros, ingresada desde le tecaldo, validando que sea un entero.
                    switch(consultar){
                        case 1:     /*Inicio - Codigo para imprimir todos los registros*/
                            System.out.println("\tMostrar todos los Registros");
                             for(Estudiante estudianteLista: estudiantes){   /*Ciclo for para recorrer todos los objetos de coleccion estudiantes*/
                                estudianteLista.imprimirInfo();     /*Metodo que tiene cada objeto para imprimir su informacion*/
                            }
                            System.out.println("");
                            break;  //Regresa al Menu Principal
                            /*Fin*/
                            
                        case 2:     /*Inicio - Codigo para imprimir un registro*/
                            System.out.println("\tBuscar un Registro");
                            String carnet2;//Varible para guardar el dato a buscar, el dato ingresado se buscará por el carnet. 
                            boolean encontrado1=false;// Variable para condicional de busqueda
                            System.out.println("Buscar carnet\nIngrese carnet:");
                            carnet2 = entrada.nextLine();     //Ingresa el carnet a buscar en la coleccion estudiantes.
                            /*Inicio || Codigo para buscar el objeto ingreado*/
                            for(int j=0; j<estudiantes.size();j++){           /*Ciclo para recorrer toda la coleccion objeto por objeto*/
                                Estudiante buscarRegistro = estudiantes.get(j);     //Posicion     
                                if(buscarRegistro.getCarnet().equals(carnet2)){    /*Condicional para comparar dato ingresado en los objetos de la coleccion*/
                                    System.out.println("\tRegistro econtrado.");
                                    estudiantes.get(j).imprimirInfo()/*Metodo del objeto encontrado para mostrar su Informacion*/;System.out.println("");
                                    encontrado1 = true;
                                }else{}
                            }/*Fin*/
                            if(!encontrado1){        /*Condicional si no se encuentra el objeto*/
                                System.out.println("\tAlumno: "+carnet2 + " no econtrado.");
                            }else{}
                            break;  //Regresa al Menu Principal
                            /*Fin*/
                            
                        default:    /*Mensaje para ingreso de opciones invalidas*/
                            System.out.println("Error: No ingreso opcion disponible");
                    }
                    break;  //Regresa al Menu Principal
                    /*Fin - Codigo para consultar un registro*/
                    
                case 5:         //Cierra el Programa
                    break;
                default:    /*Mensaje para ingreso de opciones invalidas*/
                        System.out.println("\tERROR: Ingreso un valor incorrecto\n\tIngrese un valor de acuerdo a las opciones");
                } 
        }while(opcionMenu != 5);
        /*Fin ciclo Do-While Menu Principal*/
    }
    
    /*Metodo para continuar por posibles valores inesperados en variables int (enteros)*/
    public static int validarInt(){      
        Scanner teclado = new Scanner(System.in); // Objeto para leer desde el teclado
         do{            /*Inicia ciclo*/
            if(teclado.hasNext()){     /*Condicional para verificar si la varible tiene un dato guardado.*/
                if(teclado.hasNextInt()){      /*Condicional para verificar si la varible tiene guadado un dato Int*/
                    return teclado.nextInt();   //Retorna el dato Int guardado
                }else{      /*Contrario segundo condicional*/
                    teclado.next(); //Limpia el objeto scanner teclado.
                    System.out.println("\tERROR: No ingreso un entero.\n\tSolo se puede ingresar enteros."
                            + "\nIngrese la opcion de nuevo:");
                }
            }else{          /*Contrario primer condicional*/
                 return 0;
            }
        }while(true);   /*Fin del ciclo*/
    }
    
    /*Metodo para continuar por posibles valores inesperados en variables doubles*/
    public static double validarDouble(){
        Scanner teclado = new Scanner(System.in); // Objeto para leer desde el teclado
         do{            /*Inicia ciclo*/
            if(teclado.hasNext()){     /*Condicional para verificar si la varible tiene un dato guardado.*/
                if(teclado.hasNextDouble()){      /*Condicional para verificar si la varible tiene guadado un dato Int*/
                    return teclado.nextDouble();   //Retorna el dato Int guardado
                }else{      /*Contrario segundo condicional*/
                    teclado.next(); //Limpia el objeto scanner teclado.
                    System.out.println("\tERROR: No ingreso un numero."
                            + "\nIngrese la opcion de nuevo:");
                }
            }else{          /*Contrario primer condicional*/
                return 0;
            }
        }while(true);   /*Fin del ciclo*/
    }
    
}
