public class PlanDatosAcademico extends PlanDatos {
    public PlanDatosAcademico() {
        nombre = "ACADEMICO";
    }
    @Override
    public void setTasa(String proveedor) {
       switch (proveedor.toUpperCase()){
           case "LINEARAPIDA":
               tasa = 1.0f;
               break;

           case "CLARO":
               tasa = 1.2f;
               break;

           case "MOVISTAR":
               tasa = 1.25f;
               break;

           default:
               System.out.println("Proveedor no válido.");
               tasa = 0;
               break;
       }
    }
}
