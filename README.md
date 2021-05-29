# Juego Ruso
## EXPLICACIÓN DE LA APP

En esta app llamada appRuletaRusa, podremos interactuar con hasta 10 jugadores.
El juego consiste en disparar dos revolver que hay en juego y ver cuáles de los jugadores quedan vivos o muertos.

Las acciones a realizar con estos jugadores son:
- Avanzar cilindro aleatoriamente
	- Esta acción gira el cilindro del revolver aleatoriamente
- Dispara
	- Esta acción hace que los propios jugadores se peguen un tiro con el revolver seleccionado en la opción 1, y te dirá si ha salido bala y ha matado o si ha tenido suerte y está vivo.
- Pista
	- Esta acción te dice en que posición se encuentra la bala dentro del cilindro del revolver, y cuál es la posición actual a disparar.
- Comprobar jugadores vivos
	- Esta acción mediante un booleano comprueba jugador por jugador cuál está vivo devolviendo true o cuál muerto devolviendo false.
- Fin
	- Esta acción para el juego y sale de la app.
---		

## Pasos para descargar la app
#### Comprobar la versión de java instalada y el JDK, en caso de no tenerlo sigue estos pasos
1. Abrimos cmd Windows + r 
2. Escribimos cmd intro
3. Escribimos java -versión, con esto comprobamos la versión y si lo tenemos instalado
4. En caso de no tener instalado java 
5. [Descargar Java]:https://www.oracle.com/technetwork/es/java/javase/downloads/index.html
---

#### Descargar archivos de GitHub
1. Primero descargaremos los tres archivos de GitHub
2. Los guardaremos en nuestro ordenador
3. Abrimos consola pulsando tecla Windows+R y escribimos cmd
4. Buscamos donde están alojados nuestros documentos, con el comando dir mostrará el contenido, seguido de cd (espacio) el nombre de la ubicación de nuestro archivo, por ejemplo cd Desktop.
5. Visualizamos nuestros archivo.java y escribimos javac el nombre de nuestro archivo.java
![Ejemplo imagen](/imagenes/ejemplojavac.png)

6. Se nos creará la class, y la ejecutamos escribiendo java (espacio) el nombre de la class y listo!
![Ejemplo imagen](/imagenes/archivos.png)

7. Estos pasos los repetimos con los tres archivos, dejando appRuletaRusa el último en compilar.
8. Una vez tenemos los tres archivos.class ejecutamos la app escribiendo java appRuletaRusa
![Ejemplo imagen](/imagenes/appRuleta.png)
9. Perfecto, ahora empezar a jugar.
---

### Instricciones Git y GitHub.
-- Para identificar a Git:
01. git config --global user.name "Animer15" // Mi nombre.
02. git config --global user.email "coreo@....." // Coreo electronico.
03. git config -l
04. git init // Nuevo referencial git dentro mi directorio.
05. git status // Saber que pasa dentro mi direcorio.
06. git add mi_fichero ou git add .// Añadir ficheros por un commit.
07. git commit --mensage o -m "Mi_mensage", Lansar un commit con un mensage de descripcion.
08. git log // listar todos las commits.
09. git diff // Saber cambios entre mi 1er y 2d version.
10. git diff master..deriver // Saber cambios realizar entre mi 1er y 2 version dentro las dos ramas.
---

Para trabajar a Github:
1. git remote -v // Comprobar si tenemos una Remote.
2. git remote add Origin https://github.com/[username]/[nombre_dispositivo].git
3. git push origin master // Para añadir mi poyecto a "Github", Toma dos parametros.
	// Origin: Serbidor por defecto de Github.
	// master: El nombre de mi rama.
4. git pull origin master // Para recuperar mi trabajo en local.
5. git fetch // Para recuperar trabajo de otra persona.
---
