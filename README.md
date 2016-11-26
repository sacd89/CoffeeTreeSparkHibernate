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

El proyecto original lo podrán encontrar en el siguiente link:
---- link

A continuacion observaremos los cambios realizados en el proyecto anterior.

Primero que nada cambiamos la base de datos de Oracle a MySQL.
Se implemento hibernate con persistencia para la conexión a la base de datos. Se
requiere una base de datos llamada "coffee_tree" y cambiamos la configuracióń de
la conexión como el usuario y contraseña.
