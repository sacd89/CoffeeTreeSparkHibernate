package mx.uach.coffetree.models;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Ticket.class)
public abstract class Ticket_ {

	public static volatile SingularAttribute<Ticket, Venta> venta;
	public static volatile SingularAttribute<Ticket, Float> cant;
	public static volatile SingularAttribute<Ticket, Long> id;
	public static volatile SingularAttribute<Ticket, Producto> producto;

}

