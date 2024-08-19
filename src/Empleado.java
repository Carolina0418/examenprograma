

/**
 *
 * @author carol
 */
public class Empleado extends Persona {

    static int getNumRegs;
    
    String vector[] = {"Cédula",
            "Nombre", "Dirección",
            "Teléfono", "Fecha Ingreso",
            "Puesto","Salario Mensual", "Comisión",
            "Salario Bruto", "CCSS", "Pensión Complementaria",
            "Total Deducciones", "Salario Neto"};
    
    private String fechaIngreso;
    private String puesto;
    private int salarioMensual;
    private int procComision;

    public Empleado(int par) {
       super ( );
        this.fechaIngreso = "";
        this.puesto = "";
        this.salarioMensual = 0;
        this.procComision = 0;
    }

    public Empleado(String fechaIngreso, String puesto, int salarioMensual, int procComision, int cedula, String nombre, String direccion, String telefono) {
        super(cedula, nombre, direccion, telefono);
        this.fechaIngreso = "";
        this.puesto = "";
        this.salarioMensual = 0;
        this.procComision = 0;
    }

    public Empleado(String fechaIngreso, String puesto, int salarioMensual, int procComision, int cedula, String nombre, String direccion) {
        super(cedula, nombre, direccion);
        this.fechaIngreso = "";
        this.puesto = "";
        this.salarioMensual = 0;
        this.procComision = 0;
    }
    
    

    @Override
    public float calcularSalarioBruto() {
        double salarioMen = 0;
        double precio = salarioMen + salarioMen * 0.10;
        return (float) precio;
    }

    @Override
    public float calcularDeducciones() {
   
        return 0;
   
    }
        
   
           

    @Override
    public float calcularSalarioNeto() {
        
        float total = calcularSalarioBruto() - calcularDeducciones();
        return 0;
        

    }

   
    
       
    
    
    
}
