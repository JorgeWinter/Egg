package eggjpa.entidades;

import eggjpa.entidades.Pulga;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-09-09T21:17:54")
@StaticMetamodel(Mascota.class)
public class Mascota_ { 

    public static volatile ListAttribute<Mascota, Pulga> pulgas;
    public static volatile SingularAttribute<Mascota, String> id;
    public static volatile SingularAttribute<Mascota, String> atributo1;
    public static volatile SingularAttribute<Mascota, String> nombre;
    public static volatile SingularAttribute<Mascota, Integer> atributo3;
    public static volatile SingularAttribute<Mascota, String> atributo2;

}