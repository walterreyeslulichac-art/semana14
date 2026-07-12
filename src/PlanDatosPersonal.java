public class PlanDatosPersonal extends Plan{
    public PlanDatosPersonal(){
        nombre="PERSONAL";
    }
    @Override
    public void setTasa(String proveedor) {
       switch (proveedor.toUpperCase()){
           case "LINEARAPIDA":
               tasa=0.5f;
               break;

           case "CLARO":
               tasa=0.6f;
               break;

           case "MOVISTAR":
               tasa=0.8f;
               break;
       }
    }
}
