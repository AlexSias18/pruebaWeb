# Proyecto de Automatización con Serenity BDD y Screenplay

Este proyecto utiliza **Serenity BDD** y el patrón **Screenplay** para la automatización de pruebas funcionales, gestionado con **Gradle** como herramienta de construcción.

Para Ejecutar las Pruebas

  Ejecutar pruebas específicas por etiqueta (tags) utilizar el comando:
    
    gradle clean test aggregate -Dtags="@tag_especifico"

Generar solo el reporte Serenity:
  Si las pruebas ya fueron ejecutadas y deseas generar el reporte nuevamente:
    
    gradle aggregate
