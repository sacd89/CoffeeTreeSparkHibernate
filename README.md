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

1. Cambiar la base de datos de Oracle a MySQL.

Modelo de la base de datos ORACLE
Modelo de la base de datos MSQL...

Los cambios que se le realizó a la base de datos, fue hacer los id's incrementales.
Se cambiaron los tipos de los datos, agregando enums.
Se elimino una tabla de la base de datos.

Para poner a trabajar la base de datos, al modelo anterior le aplicamos la ingeniería directa.
Para poblar la base de datos se encuentra un script llamado "scriptProductos" con los datos necesarios.

Se implemento hibernate con persistencia para la conexión a la base de datos.

2. Se implemento el patrón de diseño "Singleton", en el proyecto original se realizaba una nueva conexión cada vez que se realizaba una query. Un ejemplo es el siguiente:

--Imagen screenshot viejo

Ahora lo implementamos de la siguiente manera:

--Imagen nuevo.

3. Los modelos ahora son entidades por la implementacion de hibernate. En el proyecto original un modelo esta de esta manera:

--imagen vieja.

Ahora con la implementación de hibernate esta de esta manera:

--imagen nuevo.

4. Se cambiaron las consultas querys a sus respectivos controladores. En el proyecto original existen consultas dentro de las vistas como se ve en el siguiente ejemplo:

-- imagen viejo

Ahora los implementamos dentro de los controladores de la siguiente manera:

-- imagen nuevo

5. Se cambio la plataforma. El proyecto original es una aplicación de escritorio. Ahora, gracias al framework "Spark" es una aplicación web.

6. Por el cambio de plataforma, se crearon nuevas vistas, en el proyecto original son de esta manera:

--imagen viejo

Ahora las vistas se ven de esta manera:

--imagen nuevo
