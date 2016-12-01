package mx.uach.coffetree.models;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Ingrediente.class)
public abstract class Ingrediente_ {

	public static volatile SingularAttribute<Ingrediente, Date> fecha_ped;
	public static volatile SingularAttribute<Ingrediente, Long> id;
	public static volatile SingularAttribute<Ingrediente, String> nombre;
	public static volatile SingularAttribute<Ingrediente, Integer> cant_disp;

}

