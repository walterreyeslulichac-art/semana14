public class FabricaCreadora {
    public PlanDatos crearPlan(String proveedor, String tipo){
        PlanDatos plan=null;
        switch (tipo.toUpperCase()){
            case "PERSONAL":
                plan=new PlanDatosPersonal();
                break;

            case "NEGOCIO":
                plan=new PlanDatosNegocio();
                break;

            case "ACADEMICO":
                plan=new PlanDatosAcademico();
                break;

        }

        if(plan!=null)
            plan.setTasa(proveedor);

        return plan;
        }
    }
