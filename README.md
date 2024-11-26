
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


![Evaluación2](https://github.com/user-attachments/assets/b61f3161-c330-49e2-b7ab-81b48f81a17d)


## Estructura del proyecto

El proyecto está compuesto por varias clases que interactúan entre sí para proporcionar la funcionalidad deseada. Entre las principales se incluyen:


**1. [Asignación](Modulo6/src/Asignacion.java)**: Es una clase intermedia que permite realizar asignaciones entre los objetos de la clase Factura y la Interfaz IReporte

**1. [Asignación](Código/src/Asignacion.java)**: Es una clase intermedia que permite realizar asignaciones entre los objetos de la clase Factura y la Interfaz IReporte

**2. [Factura](Código/src/Factura.java)**: Contiene la información general de la factura como un número para identificarla, los descuentos e impuestos aplicados, la fecha de emisión y monto total.

**3. [ItemFactura](Código/src/ItemFactura.java)**: Es una clase que compone a Factura, incluye la información de un producto individual contenido en la factura, como el subtotal a pagar y la cantidad de productos que se vendieron. Calcula el subtotal con y sin impuestos y permite imprimir dicho item.

**4. [Mesa](Código/src/Mesa.java)**: Representa cada mesa que existe en el restaurante. Con esta clase se puede saber la cantidad de uso que una mesa ha tenido y hace uso de un código para identificarlas.

**5. [Persona](Código/src/Persona.java)**: Es una clase abstracta que permite establecer los atributos básicos como nombre e identificación que serán heredados a mesero.

**6. [Mesero](Código/src/Mesero.java)**: Se trata de una clase para identificar a los trabajadores que se desempeñen como meseros en el restaurante. Proporciona información del número de pedidos que atendió cada mesero.

**7. [Estadistica](Código/src/Estadistica.java)**: Se trata de una clase abstracta que hereda a las clases EstadisticaMesa, EstadisticaMesero y EstadisticaProducto. 

**8. [EstadisticaMesa](Código/src/EstadisticaMesa.java)**: Esta clase calcula la mesa más usada y almacena el código de dicha mesa en el atributo mesaMasUsada.

**9. [EstadisticaMesero](Código/src/EstadisticaMesero.java)**: Esta clase calcula el mejor mesero en base al número de pedidos atendidos, guarda el nombre de dicho empleado en el atributo mejorMesero.

**10. [EstadisticaProducto](Código/src/EstadisticaProducto.java)**: Calcula el producto más vendido del restaurante y tambien por categoría. Almacena dichos datos en sus atributos.

**11. [Grafico](Código/src/Grafico.java)**: Permite generar un gráfico de tipo pastel con un título referente a la información recibida de la clase Reporte.

**12. [IReporte](Código/src/IReporte.java)**: Se trata de una Interface que integra los métodos para calcular las Ventas Totales, visualizar el reporte y exportar reporte. Interactua con la clase asignación para obtener los datos de las facturas.

**13. [Main](Código/src/Main.java)**: Contiene la configuración general del programa. Permite presentar en el terminal determinada información.

**14. [Producto](Código/src/Producto.java)**: Contiene información más específica acerca del producto que se ha relacionado en la clase itemProducto, como nombre, precio, categoría y cantidad.

**15. [Reporte](Código/src/Reporte.java)**: Esta clase implementa los métodos de la clase IReporte, pero permite generar reportes diarios, semanales o mensuales que estan implementados en un enumerador. Contiene un título y se relaciona con el gráfico generado en la clase Gráfico. Además, se puede exportar dependiendo del tipo de archivo que se especifica en un enumerador.

**16. [TipoArchivo](Código/src/TipoArchivo.java)**: Se trata de un enumerador que contiene los tipos de reportes que se pueden generar. Existen 3 atributos: diario, semanal y mensual.

**17. [TipoReporte](Código/src/TipoReporte.java)**: Es un enumerador que especifica el formato en el cual se desea exportar el Reporte. Contiene los atributos PDF e IMAGEN



## Reflexión del Proyecto

Este proyecto nos permitió aplicar conocimientos previos en programación orientada a objetos, además de aprender cómo estructurar un sistema con una lógica empresarial clara y modular. A lo largo del desarrollo, enfrentamos diversos desafíos relacionados con la organización de clases y la correcta implementación de las estadísticas, pero aprendimos a abordarlos mediante la revisión y el trabajo en equipo.

Una de las lecciones más importantes fue entender la importancia de la organización del código y cómo una estructura bien definida puede facilitar la escalabilidad y el mantenimiento del sistema. También aprendimos a trabajar con gráficos y reportes, lo que añadió una capa de complejidad pero también permitió visualizar la información de manera efectiva. Además, se presentaron problemas al momento de codificar el diagrama de clases, por lo que fue necesario cambiar algunas relaciones de herencia, como la de estadística, generando una nueva clase que almacene métodos y atributos en común para que herede a las clases de estadísticas específicas. Para ello fue necesario tener presente el concepto de polimorfismo en java y la forma en que interactuan estas clases.

En el futuro, nos gustaría agregar más funcionalidades, como la integración con bases de datos para la gestión de la información, la posibilidad de agregar más tipos de reportes o gráficos y la optimización de la generación de reportes en formatos más avanzados, como PDFs interactivos.
