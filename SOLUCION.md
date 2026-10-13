## Back

Se reestructuro todo el proyecto, actualizando las dependencias del pom, actualizando la versión de java de 17 a 21 por instalación en la maquina
Se paso de DTO tipo Class a Record, esto a que los records son inmutables
Se mappeo la entidad con jackarta
Se restructo el service, haciendo el codigo mucho mas limpio, con menos líneas de código y utilizando los atributos de spring boot
Se quito la etiqueta @Autowraid 
Se separaron mejor las clases por paquetes
Se implemento JPA repository
Se adiciono el servicio delete
Se refino el codigo de los controladores, ya que por buenas practicas dentro de dicha clase no debe ir logica y no repetir el path /client
Se implemento cadena de conexión con H2 para el proyecto