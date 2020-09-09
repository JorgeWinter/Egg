package eggjpa.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Persona {

@Id
private String id;

private String nombre;
private String apellido;

@OneToOne
private Mascota mascota;

public Persona() {
    }
public Persona(String id, String nombre, String apellido, Mascota mascota) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.mascota = mascota;
    }

public String getId() {
        return id;
    }
public void setId(String id) {
        this.id = id;
    }
public String getNombre() {
        return nombre;
    }
public void setNombre(String nombre) {
        this.nombre = nombre;
    }
public String getApellido() {
        return apellido;
    }
public void setApellido(String apellido) {
        this.apellido = apellido;
    }
public Mascota getMascota() {
        return mascota;
    }
public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }

@Override
public String toString() {
        return "Persona{" + "id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", mascota=" + mascota + '}';
    }

}
