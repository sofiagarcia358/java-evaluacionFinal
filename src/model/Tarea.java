package model;

public class Tarea {
    private String Titulo;
    private String Descripcion;
    private String FechaLimite;
    private boolean Pendiente;
    private boolean EnProgreso;
    private boolean Completado;


    public Tarea(String titulo, String descripcion, String fechaLimite, boolean pendiente, boolean enProgreso, boolean completado) {
        this.Titulo = titulo;
        this.Descripcion = descripcion;
        this.FechaLimite = fechaLimite;
        this.Pendiente = pendiente;
        this.EnProgreso = enProgreso;
        this.Completado = completado;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    public String getFechaLimite() {
        return FechaLimite;
    }

    public void setFechaLimite(String fechaLimite) {
        FechaLimite = fechaLimite;
    }

    public boolean isPendiente() {
        return Pendiente;
    }

    public void setPendiente(boolean pendiente) {
        Pendiente = pendiente;
    }

    public boolean isEnProgreso() {
        return EnProgreso;
    }

    public void setEnProgreso(boolean enProgreso) {
        EnProgreso = enProgreso;
    }

    public boolean isCompletado() {
        return Completado;
    }

    public void setCompletado(boolean completado) {
        Completado = completado;
    }
}
