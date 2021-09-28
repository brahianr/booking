# Automatizacion en Booking
Prueba tecnica de Automatizacion para Devco realizada sobre la pagina:  
https://www.booking.com/

## Requisitos  
Para la clonacion y ejecucion del proyecto es necesario contar con los siguientes requisitos:  
- Java 11
- Gradle version 7.0.
- IntelliJ IDEA Community Edition version 2020.1.1 o mas reciente.
- Plugin "Cucumber for Java" instalado en intelliJ.
- Plugin "Gherkin" instalado en intelliJ.
- Navegdor Google Chrome Versión 93.0.4577.63.
- Git

## Clonacion del proyecto
Clonar el proyecto en la maquina local en la ubicacion deseada con el siguiente comando de git:  
`git clone https://github.com/brahianr/booking.git`

### Abrir el proyecyo en Intellij
- Se recomeinda abir el proyecto desde el archivo build.gradle en IntelliJ.

## Ejecucion de casos de prueba
Para la ejecucion de los escenarios de prueba se puede usar el siguiente comando desde la consola de intelliJ:  
`gradle clean test aggregate`  
El comando anterior realiza la ejecucion de todos los escenarios de prueba que se tengan en el proyecto.  

En caso que se quiera ejecutar un escenario en especifico dentro de la carpeta runners se puede elegir el escenario a ejecutar, la carpeta runner se encuentra en la ruta:  
booking\src\test\java\co\com\devco\certification\booking\runners  
 - Para la ejecucion de un runner en especifico se debe de dar click derecho sobre este y luego la opcion Run.


### Casos de prueba automatizados
Los casos de prueba automatizados se encuentran tageados dentro de los archivos feature con el tag:  
`@automatic`  
Esto se hace con el fin de diferenciarlos de los ccasos de prueba manuales.

### Casos de prueba manuales
Los casos de prueba manuales se crearon dentro de los difeentes archivos .features identificados con los tags:  
```
@manual  
@manual-result:passed  
```
ó  
```
@manual  
@manual-result:failed  
```
 - El tag @manual-result:passed hace referencia a que de caso de prueba manual tuvo un resultado exitoso.
 - El tag @manual-result:failed hace referencia a que de caso de prueba manual tuvo un resultado Fallido.  
 Esto se hace con el fin de que al momento de ejecutar los diferentes escenarios de prueba estos queden registrados en el reporte de serenity como ejecucion de forma manual y asi poder visualizar todos los escenrios de prueba en un mismo reporte. 

## Reporte de ejecucion de pruebas
Para la visualizacion del reporte de serenity se debe de abrir el archivo index.html el cual se encuentra en la ruta del proyecto:  
booking\target\site\serenity  
Se debe tener presente que el reporte se sobreescribe en cada ejecucion realizada.

