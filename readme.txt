# Proyecto Automation Maven con Selenium WebDriver (Java)

Este proyecto demuestra pruebas automatizadas utilizando Selenium WebDriver en un proyecto Maven con Java. Siga los pasos a continuación para configurar y ejecutar las pruebas.

## Requisitos previos

-JavaJDK (11)
-Maven instalado


## Configuración

1. Clone o descargue este repositorio en su máquina local.

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
     - Crea tus clases de prueba en el directorio `src/test/java`.
     - Puede usar la anotación `@Test` del marco TestNG para marcar los métodos de prueba.

2. Ejecución de pruebas:
     - Navegue al directorio raíz del proyecto y abra cmd.
     - Ejecute `mvn test` para ejecutar todas las pruebas.

2. Informes:
     - Los informes de prueba se pueden encontrar en el directorio `target/surefire-reports` después de la ejecución de la prueba.

## Consejos

- Utilice el patrón de diseño del modelo de objetos de página (POM) para un mejor mantenimiento de las pruebas.
- Use anotaciones de TestNG para administrar el flujo de ejecución de pruebas y las dependencias.


## Solución de problemas
- Si alguna prueba falla, verifique los mensajes de error en la salida de la consola e inspeccione los informes de prueba generados para obtener detalles.