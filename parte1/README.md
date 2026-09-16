# Práctica 01 - Primeros pasos con Scala

## Entorno 1 — JupyterLab + Almond Kernel + Scala 2.12.21

En este primer entorno se configura **JupyterLab** para trabajar de forma interactiva con **Scala 2.12.21** mediante el **Almond Kernel**.

### Instalación de JupyterLab

Para instalar JupyterLab utilicé Python mediante `pip`.

![Instalación de JupyterLab](../images/jupyter-instalacion.png)

Una vez completada la instalación, inicié JupyterLab desde la terminal de Windows.

![Inicio de JupyterLab desde terminal](../images/jupyter-inicio-terminal.png)

Al iniciar el entorno, JupyterLab se abre automáticamente mediante una dirección local en el navegador web.

En mi caso, accedo a JupyterLab utilizando **Google Chrome**, desde donde puedo crear y ejecutar notebooks mediante su interfaz gráfica.

![JupyterLab ejecutándose](../images/jupyter-inicio.png)

### Instalación de Almond Kernel

Para poder ejecutar código Scala dentro de JupyterLab instalé **Almond Kernel** utilizando **Coursier** desde PowerShell.

![Instalación de Almond Kernel](../images/jupyter-almond.png)

Una vez completada la instalación, Scala quedó disponible como kernel dentro de JupyterLab.

Al crear un nuevo Notebook, se puede seleccionar **Scala 2.12.21** como kernel.

![Selección del kernel Scala 2.12.21](../images/jupyter-kernel-scala.png)

### Verificación de la versión de Scala

Después de crear el Notebook utilizando Almond, comprobé la versión de Scala utilizada por el entorno.

El resultado confirma que el Notebook está ejecutándose con **Scala 2.12.21**.

![Verificación de Scala 2.12.21](../images/jupyter-scala-version.png)

### Pruebas con el entorno

Para comprobar el correcto funcionamiento del entorno realicé las tres pruebas propuestas en la práctica.

La primera prueba utiliza variables e interpolación de cadenas.

La segunda realiza una operación numérica utilizando dos valores.

La tercera crea una colección sencilla utilizando una lista de lenguajes.

Las tres pruebas se ejecutaron correctamente dentro del Notebook utilizando Scala 2.12.21.

![Pruebas de Scala en Jupyter](../images/jupyter-pruebas-scala.png)

### Notebook

El Notebook utilizado durante la práctica se encuentra disponible en formato `.ipynb` dentro de la carpeta correspondiente del repositorio.

[Ver Notebook de Scala](notebook/entorno-scala.ipynb)

## Entorno 2 — Visual Studio Code + Metals + Scala 2.12.21 + JDK 17 + sbt

En este segundo entorno se prepara un proyecto Scala utilizando **Visual Studio Code**, **Metals**, **JDK 17**, **Scala 2.12.21** y **sbt**.

### Instalación de JDK 17

Se instaló **JDK 17** como entorno de ejecución y compilación de Java necesario para trabajar con Scala y sbt.

![Instalación de JDK 17](../images/vscode-jdk17-instalacion.png)

A continuación, se comprobó correctamente la versión instalada de Java y del compilador `javac`.

![Comprobación de Java y javac](../images/vscode-java-version.png)

### Visual Studio Code

Para trabajar con el proyecto se utilizó **Visual Studio Code** como editor principal.

La siguiente imagen muestra la pantalla principal del programa.

![Pantalla principal de Visual Studio Code](../images/vscode-inicio.png)

También se comprobó la versión instalada desde la opción **Help → About**.

![Versión de Visual Studio Code](../images/vscode-version.png)

### Instalación de Metals

Desde el apartado de extensiones de Visual Studio Code se buscó la extensión **Scala (Metals)**.

![Búsqueda de Scala Metals](../images/vscode-metals-busqueda.png)

Después de instalarla, Metals quedó disponible dentro de Visual Studio Code para trabajar con proyectos Scala.

![Metals instalado](../images/vscode-metals.png)

### Instalación de sbt

Se instaló **sbt** utilizando su instalador para Windows.

Una vez finalizada la instalación, se comprobó desde PowerShell que el comando estaba disponible y que la herramienta se había instalado correctamente.

![Versión de sbt](../images/vscode-sbt-version.png)

### Configuración del proyecto

En el archivo `build.sbt` se configuró explícitamente el proyecto para utilizar **Scala 2.12.21**.

![Configuración de build.sbt](../images/vscode-build-sbt.png)

La estructura del proyecto quedó organizada con el archivo `build.sbt`, la carpeta `project` y el código fuente dentro de `src/main/scala`.

![Estructura del proyecto](../images/vscode-proyecto-estructura.png)

Dentro de `Main.scala` se creó el programa principal utilizado para comprobar el funcionamiento del entorno.

![Contenido de Main.scala](../images/vscode-main-scala.png)

### Reconocimiento del proyecto con Metals

Al abrir la carpeta del proyecto, Metals detectó correctamente la configuración de sbt y reconoció el proyecto como un proyecto Scala.

![Proyecto reconocido por Metals](../images/vscode-metals-proyecto.png)

### Compilación y ejecución

El proyecto se compiló correctamente utilizando sbt desde la terminal integrada de Visual Studio Code.

![Compilación del proyecto](../images/vscode-sbt-compile.png)

Finalmente, se ejecutó el programa y se comprobó que la salida se mostraba correctamente en la terminal.

![Ejecución del proyecto](../images/vscode-sbt-run.png)

## Entorno 3 — IntelliJ IDEA Community + Scala 2.12.21 + sbt

En este tercer entorno se prepara un proyecto Scala utilizando **IntelliJ IDEA Community Edition**, **Scala Plugin**, **JDK 17**, **Scala 2.12.21** y **sbt**.

### Instalación de IntelliJ IDEA

Se descargó e instaló **IntelliJ IDEA Community Edition** utilizando su instalador para Windows.

![Instalación de IntelliJ IDEA](../images/intellij-inicio.png)

Una vez instalado, se comprobó la versión disponible desde el propio programa.

![Versión de IntelliJ IDEA](../images/intellij-version.png)

### Instalación del plugin de Scala

Desde el apartado de plugins de IntelliJ se buscó la extensión necesaria para añadir soporte para Scala.

![Búsqueda del plugin de Scala](../images/intellij-plugin-busqueda.png)

Posteriormente, se instaló el plugin para poder trabajar con proyectos Scala dentro del IDE.

![Plugin de Scala instalado](../images/intellij-plugin-scala.png)

### Configuración de JDK 17

Durante la creación del proyecto `scala_intellij` se seleccionó **JDK 17** como versión de Java para el proyecto.

![Configuración de JDK 17](../images/intellij-jdk17.png)

### Configuración del proyecto sbt

Dentro del proyecto se utilizó un archivo `build.sbt` para definir la configuración principal.

En este archivo se configuró explícitamente **Scala 2.12.21** y el nombre del proyecto.

![Contenido de build.sbt](../images/intellij-build-sbt.png)

Al detectar el archivo `build.sbt`, IntelliJ solicitó cargar y construir la configuración del proyecto sbt.

![Detección del proyecto sbt](../images/intellij-sbt-detectado.png)

Después de aceptar la importación, IntelliJ construyó automáticamente la estructura del proyecto.

![Importación del proyecto sbt](../images/intellij-sbt-importado.png)

### Estructura del proyecto

Una vez completada la importación, la estructura del proyecto quedó organizada con el archivo `build.sbt`, la carpeta `project` y el código fuente dentro de `src/main/scala`.

![Estructura del proyecto](../images/intellij-proyecto.png)

Dentro de `Main.scala` se creó el programa utilizado para comprobar el funcionamiento del entorno.

![Contenido de Main.scala](../images/intellij-main-scala.png)

### Ejecución desde IntelliJ IDEA

El programa se ejecutó utilizando el botón de ejecución integrado de IntelliJ IDEA.

La consola del IDE mostró correctamente la salida del programa.

![Ejecución desde IntelliJ IDEA](../images/intellij-run.png)

### Compilación y ejecución con sbt

Además de ejecutarlo desde el propio IDE, se comprobó también el funcionamiento del proyecto utilizando **sbt** desde la terminal.

Primero se realizó la compilación del proyecto.

![Compilación con sbt](../images/intellij-sbt-compile.png)

Posteriormente se ejecutó el programa utilizando sbt y se comprobó correctamente la salida.

![Ejecución con sbt](../images/intellij-sbt-run.png)

### Configuración de UTF-8

Durante las pruebas realizadas tanto en **Visual Studio Code** como en **IntelliJ IDEA**, fue necesario configurar manualmente la codificación **UTF-8** en la terminal para que los caracteres especiales y los acentos se mostraran correctamente durante la ejecución con sbt.

![Configuración de UTF-8 en terminal](../images/sbt-utf8-configuracion.png) 

