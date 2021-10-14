# Parcial 2do Tercio -Ejercicios de Diseño 2nd group (copy)
## Miguel ángel Rodríguez Siachoque
### 14/10/2021

## CONTEXTO
Diseñe un prototipo de calculadora de microservicios que tenga un servicios de matemáticas con al menos dos funciones implementadas y desplegadas en al menos dos instancias virtuales de EC2. Además debe implementar un service proxy que recibe las solicitudes de servicios y se las delega a las dos instancias usando un algoritmo de round-robin. Asegúrese que se pueden configurar las direcciones y puertos de las instancias en el porxy usando variables de entorno del sistema operativo. Cada estudiante debe seleccionar para desarrollar dos funciones matemáticas de acuerdo a los dos últimos dígitos de su cédula como se especifica en la lista (Si sus dos últimos dígitos de su cédula son el mismo use el siguiente dígito que sea diferente). Todas las funciones reciben un solo parámetro de tipo "Double" y retornan una parámetro de tipo "Double".

![Imagen](Images/Image0.jpg)<br>

0. log
1. ln
2. sin
3. cos
4. tan
5. acos
6. asin
7. atan
8. sqrt
9. exp (el número de eauler elevado ala potendia del parámetro)

En mi caso son las funciones ___3. cos y 9. exp___.

Implemente los servicios para responder al método de solicitud HTTP GET. Deben usar el nombre de la función especificado en la lista y el parámetro debe ser pasado en la variable de query con nombre "value".

El proxy debe delegar el llamado a los servicios de backend. El proxy y los servicios se deben implementar en Java usando Spark.


Ejemplo de una llamado:

EC2
https://amazonxxx.x.xxx.x.xxx:{port}/cos?value=3.141592

Salida. El formato de la salida y la respuesta debe ser un JSON con el siguiente formato

{

 "operation": "cos",

 "input":  3.141592,

 "output":  -0.999999

}

## FUNCIONAMIENTO LOCAL
### Hello
![Imagen](Images/Image1.jpg)<br>
### Cos
![Imagen](Images/Image2.jpg)<br>
### Exp e 
![Imagen](Images/Image3.jpg)<br>

## Ejecución - EC2 
Siga tal cual y en orden los siguientes comandos
> sudo yum update -y
<br>
> sudo yum install docker
<br>
> sudo service docker start
<br>
> docker run -d -p 42000:6000 --name firstdockerimageaws (Repositorio de DockerHub)
<br>
