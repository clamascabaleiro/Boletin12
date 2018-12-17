package boletin12_1;


/**
 *
 * @author clamascabaleiro
 */
public class Coche {
//Atributos

    private String matricula;
    private String marca;
//Constructores

    public Coche() {
    }

    public Coche(String matricula, String marca) {
        this.matricula = matricula;
        this.marca = marca;
    }

//Getters y Setters
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

//ToString
    @Override
    public String toString() {
        return "Coche{" + "matricula=" + matricula + '}';
    }
}
