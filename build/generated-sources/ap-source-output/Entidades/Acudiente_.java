package Entidades;

import Entidades.Cita;
import Entidades.Estudiante;
import Entidades.Pqrs;
import Entidades.Usuario;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

<<<<<<< HEAD
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-06-02T00:11:11")
=======
<<<<<<< HEAD
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-06-01T23:31:35")
=======
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-06-01T23:24:52")
>>>>>>> e9ffd11de3bc4d6cb7da994a8f50d81be0407e24
>>>>>>> 215acba729b7b7afca6f69be5aa8ba7d72a2a2fb
@StaticMetamodel(Acudiente.class)
public class Acudiente_ { 

    public static volatile SingularAttribute<Acudiente, Integer> idAcudiente;
    public static volatile ListAttribute<Acudiente, Pqrs> pqrsList;
    public static volatile SingularAttribute<Acudiente, Usuario> idUsuario;
    public static volatile ListAttribute<Acudiente, Estudiante> estudianteList;
    public static volatile ListAttribute<Acudiente, Cita> citaList;

}