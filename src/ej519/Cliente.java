package ej519;

public class Cliente {
    private long id;
    private double dinerogastado;
    private boolean vip = false;

    public Cliente(long id, double dinerogastado) {
        this.id = id;
        this.dinerogastado = dinerogastado;
        if(dinerogastado>=1000){
            setVip(true);
        }
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getDinerogastado() {
        return dinerogastado;
    }

    public void setDinerogastado(double dinerogastado) {
        this.dinerogastado = dinerogastado;
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", dinerogastado=" + dinerogastado +
                ", vip=" + vip +
                '}';
    }
}
