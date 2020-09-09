package eggjpa.entidades;

import eggjpa.entidades.Mascota;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-09-04T19:34:14")
@StaticMetamodel(Persona.class)
public class Persona_ { 

    public static volatile SingularAttribute<Persona, String> apellido;
    public static volatile SingularAttribute<Persona, Mascota> mascota;
    public static volatile SingularAttribute<Persona, String> id;
    public static volatile SingularAttribute<Persona, String> nombre;

}