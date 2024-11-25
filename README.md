
# Módulo de Reportes y Estadísticas.


Este módulo proporciona información sobre el desempeño del restaurante a través de reportes y estadísticas. Los reportes incluyen datos sobre las ventas diarias, productos más vendidos, mesas más utilizadas, ingresos generados, y el desempeño de los empleados. El sistema debe permitir generar reportes personalizados por rango de fechas y categorías específicas, como ventas por categoría de producto o por empleado. Además, se deben generar gráficos y tablas que faciliten la interpretación de los datos.

## Miembros del equipo

- **Arelys Ajila**
- **Douglas Carreño**
- **Fabricio Ruiz**
- **María Valarezo**
- **Viviana Córdova**

## Requerimientos.

- Generar reportes de ventas diarias, semanales y mensuales, desglosando por productos y categorías.
- Mostrar estadísticas sobre los productos más vendidos y las mesas más utilizadas en el restaurante.
- Generar reportes personalizados según el rango de fechas y las categorías solicitadas.
- Producir gráficos visuales que resuman el rendimiento del restaurante, facilitando la interpretación de datos.
- Permitir guardar los reportes en formatos digitales (PDF, Excel) para su uso posterior.
- Mostrar el rendimiento de los empleados en términos de ventas y pedidos atendidos.


## Introducción.

Este proyecto consiste en la implementación de un sistema para gestionar estadísticas relacionadas con un restaurante. El objetivo principal es ofrecer una visión detallada de las ventas, los productos más vendidos, el rendimiento de los meseros y el uso de las mesas. Además, el sistema permite generar reportes y gráficos para facilitar la toma de decisiones estratégicas.Fue desarrollado por un equipo colaborativo con el fin de aplicar conceptos de programación orientada a objetos, manejo de bases de datos, y generación de reportes gráficos.

Las estadísticas se calculan en base a los datos generados durante las operaciones diarias del restaurante, lo que permite analizar la información de manera eficiente. El sistema también incluye una funcionalidad para exportar reportes y gráficos en diferentes formatos.

## Diagrama de Clases

![Evaluación2](https://github.com/user-attachments/assets/c79692fe-2562-4fd3-97a6-570c8b7d527c)


## Estructura del proyecto

El proyecto está compuesto por varias clases que interactúan entre sí para proporcionar la funcionalidad deseada. Entre las principales se incluyen:

- **[Asignación](Código/src/Asignacion.java)**: Es una clase intermedia que permite realizar asignaciones entre los objetos de la clase Factura y la Interfaz IReporte
- **[Factura](Código/src/Factura.java)**: Contiene la información general de la factura como un número para identificarla, los descuentos e impuestos aplicados, la fecha de emisión y monto total.
- **[ItemFactura](Código/src/ItemFactura.java)**: Es una clase que compone a Factura, incluye la información de un producto individual contenido en la factura, como el subtotal a pagar y la cantidad de productos que se vendieron.
- **[Mesa](Código/src/Mesa.java)**: Representa cada mesa que existe en el restaurante. Con esta clase se puede saber la cantidad de uso que una mesa ha tenido y hace uso de un código para identificarlas.
- **[Persona](Código/src/Persona.java)**: Es una clase abstracta que permite establecer los atributos básicos como nombre e identificación que serán heredados a mesero.
- **[Mesero](Código/src/Mesero.java)**: Se trata de una clase para identificar a los trabajadores que se desempeñen como meseros en el restaurante. Proporciona información del número de pedidos que atendió cada mesero.



- **Estadísticas**: Clases que calculan las estadísticas de ventas, meseros, productos y mesas.
- **Reportes**: Implementación de reportes que permiten visualizar y exportar la información en diversos formatos.
- **Gráficos**: Generación de gráficos para visualizar las estadísticas.
- **Factura y elementos asociados**: Gestión de los productos dentro de una factura.

## Reflexión del Proyecto

Este proyecto nos permitió aplicar conocimientos previos en programación orientada a objetos, además de aprender cómo estructurar un sistema con una lógica empresarial clara y modular. A lo largo del desarrollo, enfrentamos diversos desafíos relacionados con la organización de clases y la correcta implementación de las estadísticas, pero aprendimos a abordarlos mediante la revisión y el trabajo en equipo.

Una de las lecciones más importantes fue entender la importancia de la organización del código y cómo una estructura bien definida puede facilitar la escalabilidad y el mantenimiento del sistema. También aprendimos a trabajar con gráficos y reportes, lo que añadió una capa de complejidad pero también permitió visualizar la información de manera efectiva.

En el futuro, nos gustaría agregar más funcionalidades, como la integración con bases de datos para la gestión de la información, la posibilidad de agregar más tipos de reportes o gráficos y la optimización de la generación de reportes en formatos más avanzados, como PDFs interactivos.


