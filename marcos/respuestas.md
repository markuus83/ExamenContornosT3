1. Ejercicio 1: Documentación

```Shell    

    $ Para la documentación de la clase "CuentaBancaria.Java", entramos en dicha clase, y al principio de cada fragmento de código que queremos documentar, en este caso son solamente los métodos y atributos, abrimos un bloque de documentación "/**/" y escribimos ahí el comentario a redactar.

    $ Nos dirigimos a la terminal 'terminator', y ejecutamos el comando: "mvn archetype:generate", el cual nos crea un proyecto en maven.

    $ Dentro del archivo 'pom.xml' generado automáticamente, hacmos los cambios correspondientes para su correcto funcionamiento.

    $ Posteriormente, siguiendo el directorio del proyecto, y una vez dentro del repositorio con el 'maven', ejecutamos el siguiente comando: "mvn javadoc:javadoc" para crear, perdon por la redundancia, la documentación en javadoc de la clase CuentaBancaria.

```


```Shell

    $ Tras modificar correctamente el archivo 'pom.xml', no habría ningún problema de incopatibilidades, por lo cual, podríamos empezar el ejercicio.

    $ Nuevamente, nos dirigimos a una terminal, y dentro del directorio maven, ejecutamos el comando: "mvn test".

    $ Observamos como la build es correcta y no da ningun error.
    
```

```Shell

    $ Creamos la clase App.java y escribimos las líneas de código oportunas para su correcto funcionamiento.

    $ Nos dirigimos a la terminal y nos establecemos en el directorio del proyecto de maven. Posteriormente, ejecutamos el comando: "mvn jar.jar"

```

