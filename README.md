# CoffeeTree

Es un sistema que goza de las características típicas de un punto de venta de una
cafetería, se pueden realizar ventas, administrar productos, iniciar sesión con dos
tipos diferentes de usuario y dependiendo del usuario, se establecen las
restricciones.

La base de datos cuenta con diversas tablas, como productos, ingredientes, ventas,
recetas, entre otras no menos importantes.

Se cuenta con dos usuarios, un administrador, el cual es capaz de añadir o eliminar
productos o ingredientes y un cajero, el cual interactúa con el cliente y realiza la
venta de dichos productos.

Al momento de realizar una venta de un producto, los ingredientes de este se van a
ir actualizando en la base de datos, y se impedirá hacer una venta si no hay
existencia del ingrediente, esto se podrá solucionar con la ayuda del administrador,
el cual se encargará de surtir la mercancía.

A continuacion observaremos los cambios realizados en el proyecto anterior.

  -- Cambiar la base de datos de Oracle a MySQL.


  -- Hacer los id's incrementales.

  -- Se cambiaron los tipos de los datos, agregando enums.
  
  -- Se elimino una tabla de la base de datos.

Para poner a trabajar la base de datos, al modelo anterior le aplicamos la ingeniería directa.
Para poblar la base de datos se encuentra un script llamado "scriptProductos" con los datos necesarios.

  -- Se implemento hibernate con persistencia para la conexión a la base de datos.

  -- Se implemento el patrón de diseño "Singleton", en el proyecto original se realizaba una nueva conexión cada vez que se realizaba una query.

  -- Los modelos ahora son entidades por la implementacion de hibernate.

  -- Se cambiaron las consultas querys a sus respectivos controladores. En el proyecto original existen consultas dentro de las vistas.

  -- Se cambio la plataforma. El proyecto original es una aplicación de escritorio. Ahora, gracias al framework "Spark" es una aplicación web.

  -- Por el cambio de plataforma, se crearon nuevas vistas.
