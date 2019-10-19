# PruebaSura
#Explicacion para la construccion y el despliegue.


Nota Importante: De la prueba me falto conseguir el API para mostrar la foto referente a la frase. estoy utilizando una URL en el codigo para simular la respuesta.
El consumo del API provista lo realice de manera exitosa.
Si me permiten mas tiempo, consigo el API para la foto y realizo una interfaz web.
muchas gracias

Herramientas:

lenguaje: java 8
Framework: Sprin Boot, Hibernate
Base de datos: Postgresql
Gestor de dependencias: maven
Estandar: JPA


Paso:
1. Ejecutar script de base de datos tanto la BD como la tabla, aunque la tabla se crearia automaticamente al desplegar el aplicativo.

2. importar coo proyecto gradle, preferiblemente en el IDE Spring Tool Suite (STS)

3. Compilar el proyecto

4. Ejecutar como aplicativo Spring Boot App

5. Probar con los sigientes Endpoint.



Endpoint aplicativo:

Obtener la frase y la URL:
http://localhost:8080/generar/frase_foto

CRUD tabla para guardar frase y url foto

Create:
http://localhost:8080/api/smile/createsmiles metodo: POST
Request: 
{
   	
   	"urlimagen":"https://www.google.com/search?q=image+churchill&sxsrf=ACYBGNSEbKNqCKBPJLn9N6KQnFuWtPE7JA:1571453428424&tbm=isch&source=iu&ictx=1&fir=Jw6QOPi0",
	"frase":"A lie gets halfway around the world before the truth has a chance to get its pants on."
	
}



Obtener lista y por ID respectivamnte:  metodo GET
http://localhost:8080/api/smile/listsmile
http://localhost:8080/api/smile/getsmile/2


Actualizar:  Metodo PUT
http://localhost:8080/api/smile/updatesmiles/2
request:
{
    "id_dato": 2,
    "urlimagen": "https://github.com/manuelinin/Manuel",
    "frase": "quote:Nobody puts Baby in a corner."
}


Eliminar: metodo DELETE
http://localhost:8080/api/smile/deletesmiles/1
