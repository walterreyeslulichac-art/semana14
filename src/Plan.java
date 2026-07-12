public abstract class Plan {
    protected double tarifa;
    public abstract void obtenerTarifa(String tipo);
    public void calcularpago(int megas){
        System.out.println("Megas consumidos : "+megas);
        System.out.println("tarifa por MB : "+tarifa);
        System.out.println("Total a pagar : "+(megas*tarifa));
    }
}
