public class PlanDatosNegocio extends PlanDatos {
    public PlanDatosNegocio() {
        nombre = "NEGOCIO";
    }


    @Override
    public void setTasa(String proveedor) {
    switch (proveedor.toUpperCase()){
        case"LINEARAPIDA":
            tasa=1.5f;
            break;
        case "CLARO":
            tasa=1.6f;
            break;
        case"MOVISTAR":
            tasa=1.6f;
            break;
        default:
            System.out.println("Proveedor no valido. ");
            tasa=0;
            break;
    }
    }
}
