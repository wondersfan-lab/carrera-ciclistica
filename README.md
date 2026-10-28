# carrera-ciclistica
Proyecto de carrera ciclistica en Java con POO

Emmanuel Ortega Alban , Esteban Ordoñez , Jhonatan Morales




-------------------------------------------------------------------------------------------------------------------------------------

Que hice yo ? Emmanuel Ortega Alban 


Diseño de Clases Base y Jerarquía (POO): Desarrollé la clase abstracta Ciclista.java para definir los atributos comunes y el comportamiento general de la jerarquía. Asimismo, implementé la clase concreta Velocista.java aplicando herencia y sobreescritura de métodos según los requerimientos del diagrama UML.

Estandarización y Configuración Maven: Lideré la unificación de los paquetes del proyecto bajo el estándar de Maven (package com.uniajc;), resolviendo conflictos estructurales de compilación y asegurando que la arquitectura del código fuera limpia y coherente en todo el equipo.

Implementación de Pruebas Unitarias (JUnit 5): Diseñé y desarrollé la suite completa de pruebas unitarias (src/test/java/com/uniajc/), cubriendo de forma automatizada componentes críticos como CiclistaTest, VelocistaTest y el resto de las clases del sistema, garantizando la calidad mediante ejecuciones exitosas de mvn clean test."

-------------------------------------------------------------------------------------------------------------------------------------

Que hice yo ? jhontan Moreales Trochez 

se crea dos tipos de ciclistas para el programa: el Escalador, que es el ciclista especialista en subidas y del que se guarda qué tan rápido acelera en las cuestas y qué tan empinada puede ser la pendiente que soporta, y el Contrarrelojista, que es el ciclista especialista en carreras contra el tiempo y del que se guarda su velocidad máxima.

Ambos ciclistas parten de una base común o la clase abstracta que fue lo que vimos en clase, así que heredan sus datos básicos, como el nombre y el número de identificación, y solo agregan lo que los hace especiales. Además, cada uno sabe decir qué tipo de ciclista es y mostrar su información en pantalla.

------------------------------------------------------------------------------------------------------------------------------------

Que hice yo ? Esteban Muñoz  Ordoñez 

Para mi parte del proyecto, me encargué de la gestión colectiva del equipo, la orquestación de los datos y la ejecución del programa en consola. El desarrollo lo estructuré paso a paso de la siguiente manera:
  
1) ​Creación de la clase Equipo: Desarrollé esta clase para administrar la información grupal (nombre del equipo y país de origen). Además, integré una lista dinámica (List<Ciclista>) para almacenar de forma ordenada a todos los deportistas sin importar su especialidad. 
 
2) ​Implementación de métodos clave: Programé la lógica para añadir nuevos ciclistas a la lista, calcular el tiempo total acumulado de la competencia y estructurar la impresión de los datos de todo el equipo en la consola.
  
3) ​Configuración del punto de entrada (Main): Diseñé la clase Main con su respectivo método public static void main. Allí instancié el equipo y creé los objetos de cada categoría (Velocista, Escalador y Contrarrelojista), vinculándolos correctamente para verificar que la herencia y el polimorfismo funcionaran al ejecutar y mostrar los resultados por consola.