Tema: Colecciones de datos del tipo Pila.

Objetivo: Resolución de ejercicios mediante la aplicación de colecciones de datos de tipo la estructura de Pila.

Actividad: Implementa en Java un programa de consola para determinar si los delimitadores ( , ) , { , } , [ , ] en una expresión aritmética (e.j. [(5 + x) - (y+z)] ) están equilibrados:
•	Ejemplo de expresión correcta: ( ) ( () ) { ( [ ( ) ] ) }
•	Ejemplo de expresión incorrecta: ( { [ ] ) }
Utilice la colección de tipo pila para implementar la solución. Considera las siguientes pistas:
•	Si encontramos un símbolo de apertura [ , ( , { debemos apilarla.
•	Si encontramos un símbolo de cierre ] , } , ) entonces consultamos el elemento que hay en la cima de pila. Si son de distinto tipo, podemos afirmar que la expresión no está balanceada. Si son del mismo tipo, debemos desapilar.
•	La expresión estará balanceada si al terminar de leer la expresión la pila está vacía.

