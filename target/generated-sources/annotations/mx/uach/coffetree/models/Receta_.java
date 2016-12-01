package mx.uach.coffetree.models;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Receta.class)
public abstract class Receta_ {

	public static volatile SingularAttribute<Receta, Integer> cant;
	public static volatile SingularAttribute<Receta, Long> id;
	public static volatile SingularAttribute<Receta, Producto> producto;
	public static volatile SingularAttribute<Receta, Ingrediente> ingrediente;

}

