public class PlanesaDatosFactory {
    public static void main(String[] args) {
        FabricaCreadora fabrica=new FabricaCreadora();

        PlanDatos p;

        p=fabrica.crearPlan("LINEARAPIDA","PERSONAL");
        p.calculoPago(1000);

        p= fabrica.crearPlan("CLARO","NEGOCIO");
        p.calculoPago(1000);

        p= fabrica.crearPlan("MOVISTAR", "ACADEMICO");
        p.calculoPago(1000);
    }
}
