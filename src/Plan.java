public abstract class Plan {
    protected String nombre;
    protected float tasa;
    public abstract void setTasa(String proveedor);
    public void calculoPago(int datos){
        System.out.println("Plan : " + nombre);
        System.out.println("Megas: " + datos);
        System.out.println("Total: S/ " + (datos*tasa));
    }
    @Override
    public String toString(){
        return nombre + " - " + tasa;
    }
    }

