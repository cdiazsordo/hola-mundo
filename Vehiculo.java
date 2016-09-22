public class Vehiculo {
    protected String matricula;
    protected String color;
    protected int numRuedas;
    protected int cilindrada;
    protected int potencia;
        
    //constructor 1
    Vehiculo(String matricula, String color) {
        this.matricula = matricula;
        this.color = color;
        numRuedas=cilindrada=potencia=0;
    }
        
    //constructor 2
    Vehiculo(String matricula, String color, int numRuedas, int cilindrada, int potencia) {
        this(matricula,color);           //invoco al constructor 1 para inicializar matricula y color
        this.numRuedas = numRuedas;
        this.cilindrada = cilindrada;
        this.potencia = potencia;
    }

    public int getCilindrada() {
        return cilindrada;
    }
    
    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }
    
    //Sobrescritura del método toString 
    public String toString() {
        return "Matrícula del vehículo actual: "+matricula+" - Color: "+color+" \nRuedas: "+ numRuedas+" - Cilindrada: "+
        cilindrada+" - Potencia: "+potencia;
    }   
}
