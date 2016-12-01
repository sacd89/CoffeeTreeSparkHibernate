package mx.uach.coffetree.models;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mx.uach.coffetree.enums.TipoProducto;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Producto.class)
public abstract class Producto_ {

	public static volatile SingularAttribute<Producto, Float> precio;
	public static volatile SingularAttribute<Producto, TipoProducto> tipoProducto;
	public static volatile SingularAttribute<Producto, Long> id;
	public static volatile SingularAttribute<Producto, String> nombre;

}

