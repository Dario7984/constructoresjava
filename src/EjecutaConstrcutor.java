
public class EjecutaConstrcutor {
    public static void main(String[]args){
        //instanciar los objetos de la clase constructor
        Constructor ob1 = new Constructor();
        Constructor ob2 = new Constructor (5);
        Constructor ob3 = new Constructor (2,5);
        Constructor ob4 = new Constructor (1.65,100);
        Constructor ob5 = new Constructor ("Dario","Flores");
        Constructor ob6 = new Constructor(ob5);
        //llamar a los metodos
        ob1.mensaje();
        ob2.sacarFactorial();
        ob3.fibonaci();
        ob4.masaCorporal();
        ob5.buscarLetra();
        ob6.buscarLetra();
        
    }
    }
