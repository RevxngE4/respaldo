public class Mesa {
    private Long idMesa;
    private Long idUsuario;
    private int numeroMesa;
    private int capacidad;

    // Constructor
    public Mesa(Long idMesa, Long idUsuario, int numeroMesa, int capacidad) {
        this.idMesa = idMesa;
        this.idUsuario = idUsuario;
        this.numeroMesa = numeroMesa;
        this.capacidad = capacidad;
    }

    // Getters y Setters
    public Long getIdMesa() {
        return idMesa;
    }

    public void setIdMesa(Long idMesa) {
        this.idMesa = idMesa;
    }

    public Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getNumeroMesa() {
        return numeroMesa;
    }

    public void setNumeroMesa(int numeroMesa) {
        this.numeroMesa = numeroMesa;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
}
