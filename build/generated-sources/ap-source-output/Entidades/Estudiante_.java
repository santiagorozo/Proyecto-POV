package Entidades;

import Entidades.Acudiente;
import Entidades.AgendaWeb;
import Entidades.BitacoraServicioSocial;
import Entidades.Curso;
import Entidades.RegistroAsistencia;
import Entidades.RegistroNota;
import Entidades.Usuario;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-06-08T13:14:45")
@StaticMetamodel(Estudiante.class)
public class Estudiante_ { 

    public static volatile ListAttribute<Estudiante, AgendaWeb> agendaWebList;
    public static volatile SingularAttribute<Estudiante, Acudiente> idAcudiente;
    public static volatile SingularAttribute<Estudiante, Integer> estado;
    public static volatile ListAttribute<Estudiante, RegistroNota> registroNotaList;
    public static volatile ListAttribute<Estudiante, RegistroAsistencia> registroAsistenciaList;
    public static volatile SingularAttribute<Estudiante, Usuario> idUsuario;
    public static volatile ListAttribute<Estudiante, BitacoraServicioSocial> bitacoraServicioSocialList;
    public static volatile SingularAttribute<Estudiante, Curso> idCurso;
    public static volatile SingularAttribute<Estudiante, Integer> idEstudiante;

}