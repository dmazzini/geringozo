# Code Challenge: geringozo

El geringozo es una variante lúdica del habla en la que se intercalan sílabas entre medio de una palabra en forma reiterada.

Para usarlo debemos introducir delante de cada vocal la letra P y luego la letra vocal, aca tenemos unos ejemplos:

- no => nopo  
- si => sipi  
- hola => hopolapa
- estar => epestapar  

Se requiere que dada una palabra se retorne su traducción al geringozo

## Instrucciones
- Crear un nuevo repositorio utilizando este repositorio como template (Boton: use this template).
- Editar el código del método geringozo definido en la clase Geringozo con un algoritmo que permita obtener los resultados esperados en los test.
- Ejecutar los test validando que todos resulten exitosos.

## Ejecutar Pruebas

Importar como proyecto Maven desde IDE (sugerencia Eclipse o Intellij)

Run as JUnit Test

## Entrada

##### Parámetro 1
- **nombre**: str
- **tipo**: String
- **limitaciones**: 0 < **str.length** <= 30

## Salida

- **tipo**: String

## Ejemplo
Dado el string "hola" debe retornar "hopolapa"

## Tests

### Test 1  

- **Parametros**: (str = "hola") 
- **Resultado esperado**: "hopolapa"
---
### Test 2  

- **Parametros**:  (str = "¿como estas?")  
- **Resultado esperado**: "¿copomopo epestapas?"
---
### Test 3  

- **Parametros**: (str = "estoy bien ¿y vos?")  
- **Resultado esperado**: "epestopoy bipiepen ¿y vopos?"
---
### Test 4 

- **Parametros**: (str = "a todo ritmo")  
- **Resultado esperado**: "apa topodopo ripitmopo"
---
### Test 5 

- **Parametros**: (str = "quiero queso")  
- **Resultado esperado**: "quipieperopo quepesopo"
