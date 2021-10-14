# Parcial Segundo Tercio
## Requerimientos
Diseñe, construya y despliegue los siguientes servicios en un microcontenedor docker desplegado en una instancei a EC2 de AWS. Cada estudiante debe seleccionar para desarrollar dos funciones matemáticas de acuerdo a los dos últimos dígitos de su cédula como se especifica en la lista. Todas las funciones reciben un solo parámetro de tipo "Double" y retornan una prámetro sde tipo "Double".
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

Implemente los servicios para responder al método de solicitud HTTP GET. Deben usar el nombre de la función especificado en la lista y el parámetro debe ser pasado en la variable de query con nombre "value".

Ejemplo de una llamado:

https://amazonxxx.x.xxx.x.xxx:{port}/cos?value=3.141592

Salida. El formato de la salida y la respuesta debe ser un JSON con el siguiente formato

{
 "operation": "cos",
 "input":  3.141592,
 "output":  -0.999999
}

## Prerrequisitos
Para la realización y ejecución tanto del programa como de las pruebas de este, se requieren ser instalados los siguientes programas:
* [Maven](https://maven.apache.org/). Herramienta que se encarga de estandarizar la estructura física de los proyectos de software, maneja dependencias (librerías) automáticamente desde repositorios y administra el flujo de vida de construcción de un software.
* [GIT](https://git-scm.com/). Sistema de control de versiones que almacena cambios sobre un archivo o un conjunto de archivos, permite recuperar versiones previas de esos archivos y permite otras cosas como el manejo de ramas (branches).
* [Docker](https://www.docker.com/). Programa encargado de crear contenedores ligeros y portables para las aplicaciones software que puedan ejecutarse en cualquier máquina con Docker instalado, independientemente del sistema operativo que la máquina tenga por debajo, facilitando así también los despliegues.
Para asegurar que el usuario cumple con todos los prerrequisitos para poder ejecutar el programa, es necesario disponer de un Shell o Símbolo del Sistema para ejecutar los siguientes comandos para comprobar que todos los programas están instalados correctamente, para así compilar y ejecutar tanto las pruebas como el programa correctamente.

Para asegurar que el usuario cumple con todos los prerrequisitos para poder ejecutar el programa, es necesario disponer de un Shell o Símbolo del Sistema para ejecutar los siguientes comandos para comprobar que todos los programas están instalados correctamente, para así compilar y ejecutar tanto las pruebas como el programa correctamente.

```
mvn -version
git --version
java -version
docker version
```

## Instalación
Para descargar el proyecto de GitHub, primero debemos clonar este repositorio, ejecutando la siguiente línea de comando en GIT.

```
git clone https://github.com/JuanMunozD/AREPParcial2Juan.git
```

## Ejecución
Para compilar el proyecto utilizando la herramienta Maven, nos dirigimos al directorio donde se encuentra alojado el proyecto, y dentro de este ejecutamos en un Shell o Símbolo del Sistema el siguiente comando:

```
mvn package
```

### Docker

Para comprobar que la página web ha sido desplegada con éxito de manera local utilizando Docker, y calcular el ArcoTangente del valor ingresado (en este caso será 90) se ingresa en el navegador la siguiente URL: http://localhost:8000/atan?value=90. Como se puede observar, el contenedor ha sido desplegado satisfactoriamente de manera local utilizando Docker.

![img](https://github.com/JuanMunozD/AREPParcial2Juan/blob/main/img/PruebalocalAtan.PNG)

Para comprobar que la página web ha sido desplegada con éxito de manera local utilizando Docker, y calcular el Seno del valor ingresado (en este caso será 90) se ingresa en el navegador la siguiente URL: http://localhost:8000/log?value=90. Como se puede observar, el contenedor ha sido desplegado satisfactoriamente de manera local utilizando Docker.

![img](https://github.com/JuanMunozD/AREPParcial2Juan/blob/main/img/PruebalocalSin.PNG)

----------

### AWS
Para comprobar que la página web ha sido desplegada con éxito utilizando AWS, y calcular el ArcoTangente del valor ingresado (en este caso será 90) se ingresa en el navegador la siguiente URL: http://ec2-52-14-197-83.us-east-2.compute.amazonaws.com:8000/atan?value=90 y la otra URL para Seno http://ec2-52-14-197-83.us-east-2.compute.amazonaws.com:8000/sin?value=90. Como se puede observar, el contenedor ha sido desplegado satisfactoriamente en AWS.

![img](https://github.com/Skullzo/AREP-Parcial2/blob/main/img/PruebaAmazon.PNG)

## Autor
[Juan Sebastian Muñoz Dorado](https://github.com/JuanMunozD)