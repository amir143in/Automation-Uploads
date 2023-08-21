# Proyecto Automation API con Karate

Este proyecto demuestra pruebas automatizadas utilizando Karate y Maven con Java. Siga los pasos a continuación para configurar y ejecutar las pruebas.

## Requisitos previos

-JavaJDK (11)
- Maven instalado
- En Eclipse IDE installa el plugin Cucumber


## Configuración

1. Clone o descargue este repositorio en su máquina local.
	- El codigo esta en github y puede clonar https://github.com/amir143in/KarateAPIOpcion3.git

2. Instale Java JDK:
     - Descargue e instale Java JDK (8 o superior) si aún no está instalado. He usado jdk 11.
     - Configure la variable de entorno `JAVA_HOME`.

3. Instalar Maven:
     - Descargue e instale Maven si aún no está instalado.
     - Agregue el directorio `bin` de la instalación de Maven a la variable de entorno `PATH`.

4. Dependencias del proyecto:
     - Navegue al directorio raíz del proyecto.
     - Ejecute `mvn clean install` para descargar las dependencias del proyecto.

## Ejecución

1. Pruebas de escritura:
     - Crea tus clases de prueba en el directorio `src/test/java/com.test`.
     - Crea los datos/payload en el directorio `src/test/java/data`.

2. Ejecución de pruebas:
     - Navegue al directorio raíz del proyecto y abra cmd.
     - Ejecute `mvn clean test` para ejecutar todas las pruebas.

2. Informes:
     - Los informes de prueba se pueden encontrar en el directorio `target/karate-reports/karate-summary.html` después de la ejecución de la prueba.


## Solución de problemas
- Si alguna prueba falla, verifique los mensajes de error en la salida de la consola e inspeccione los informes de prueba generados para obtener detalles.