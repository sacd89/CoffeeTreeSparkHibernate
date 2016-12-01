package mx.uach.coffetree.models;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Venta.class)
public abstract class Venta_ {

	public static volatile SingularAttribute<Venta, Date> fecha;
	public static volatile SingularAttribute<Venta, Float> total;
	public static volatile SingularAttribute<Venta, Date> hora;
	public static volatile SingularAttribute<Venta, Usuario> usuario;
	public static volatile SingularAttribute<Venta, Long> id;

}

