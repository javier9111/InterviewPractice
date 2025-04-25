Bueno para la Authentificacion de usuarios
podria poner el SSO activo para gmail
Tambien tendria una base de datos relacional

User
id
Name
User_Type_id

// type id 1 user, id 2 restaurante
User_Type
id
type

restaurante
id
location
Description
Menu_id

Menu
Id
Description

items
id
Menu_id
Description
cost

Busqueda de restaurantes
Seria por cercania (location)

Api
GET Restaurantes
POST Creacion de pedidos

POST Creacion de Reparto

Systema de notificaciones para el seguimiento en tiempo real
// no estoy seguro que usar para crear las notificaciones

High level desing seria

Una base relacional para gestion de usuarios
Una base de datos no relacional para la gestion de repartidores, sesion y notificaciones

CAP
Necesito la concistencia para el manejo de pedidos y pagos
Disponibilidad es vital para el reparto

entonces podria sacrificar la particion para tener la consistencia y disponibilidad

entonces podria crear tambien un redis para el cache de los resturantes cercanos e invalidar el cache con el horario de cierre

un CDN para las imagenes basicas de la aplicacion

Crear un Master slave para las tablas relacionales y para la base de datos No SQL ya que no puedo sacrificar la consistencia de datos

Un balanceador de carga para distribuir los request

si hacemos una muestra de 1000 request hora entonces seria 24000 request por dia
podriamos gestionar un autoscaling group cada hora pico donde suelen hacer los request
