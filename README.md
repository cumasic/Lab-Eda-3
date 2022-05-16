# Lab-Eda-3
<table>
    <theader>
        <tr>
            <td><img src="https://github.com/rescobedoq/pw2/blob/main/epis.png?raw=true" alt="EPIS" style="width:50%; height:auto"/></td>
            <th>
                <span style="font-weight:bold;">UNIVERSIDAD NACIONAL DE SAN AGUSTIN</span><br />
                <span style="font-weight:bold;">FACULTAD DE INGENIERÍA DE PRODUCCIÓN Y SERVICIOS</span><br />
                <span style="font-weight:bold;">ESCUELA PROFESIONAL DE INGENIERÍA DE SISTEMAS</span>
            </th>
            <td><img src="https://github.com/rescobedoq/pw2/blob/main/abet.png?raw=true" alt="ABET" style="width:50%; height:auto"/></td>
        </tr>
    </theader>
    <tbody>
        <tr><td colspan="3"><span style="font-weight:bold;">Formato</span>: Guía de Práctica de Laboratorio / Talleres / Centros de Simulación</td></tr>
        <tr><td><span style="font-weight:bold;">Aprobación</span>:  2022/03/01</td><td><span style="font-weight:bold;">Código</span>: GUIA-PRLD-001</td><td><span style="font-weight:bold;">Página</span>: 1</td></tr>
    </tbody>
</table>
</div>
<div align="center">
    <span style="font-weight:bold;"><h2>INFORME DE LABORATORIO</h2></span>
</div>


<table>
<theader>
    <tr><th colspan="6" style="width:50%; height:auto; text-align:center">INFORMACIÓN BÁSICA</th></tr>
</theader>
<tbody>
    <tr>
        <td>ASIGNATURA:</td><td colspan="5">Laboratorio de Estructura de Datos y Algoritmos</td>
    </tr>
    <tr>
        <td>TÍTULO DE LA PRÁCTICA:</td><td colspan="5">Revisión de elementos de programación (Parte I)</td>
    </tr>
    <tr>
        <td>NÚMERO DE PRÁCTICA:</td><td>02</td><td>AÑO LECTIVO:</td><td>2022 A</td><td>NRO. SEMESTRE:</td><td>III</td>
    </tr>
    <tr>
        <td colspan="2">FECHA DE PRESENTACIÓN:</td><td>16-May-2022</td><td colspan="2">HORA DE PRESENTACIÓN: 9pm</td><td></td>
    </tr>
    <tr>
        <td colspan="3">INTEGRANTES:
        <ol>
        <li>Umasi Cariapaza, Carlos Daniel</li>
        </ol>
        </td>
        <td colspan="2"> NOTA:</td>
        <td>     </td>
    </tr>
    <tr>
        <td colspan="6">DOCENTE:<br>
        Mg. Richart Smith Escobedo Quispe
        </td>
    </tr>
</tdbody>
</table>

<table>
    <theader>
        <tr>
            <th style="text-align:center">SOLUCIÓN Y RESULTADOS</th>
        </tr>
    </theader>
    <tbody>
        <tr>
            <td>
            I. SOLUCIÓN DE EJERCICIOS/PROBLEMAS
            <ol>
                <li><b>Invertir un matriz de enteros<br>
                <p>Se utilizó la siguiente porción de código:<br>
                for(int i=0,j=A.length-1;i< A.length;i++,j--){<br>
                Ain[i] = A[j];<br>
                } </p>
                El cual es un bucle que invierte las posiciones de la matriz de enteros colocando el final adelante y viceversa.<br>
                Ejemplo:<br>
                <img src="Ejercicio1.png"style="width:50%; height:auto"/>
                <li><b>Rotación a la Izquierda<br>
                <p>Se utilizó la siguiente porción de código:<br>
                for(int i=0;i < A.length-d;i++){<br>
                 Aiz[i+d] =A[i];<br>
                } <br>
                for(int i=0;i < d;i++){ <br>
                 Aiz[i] =A[A.length-d+i];<br>
                } </p>
                El cual utiliza 2 bucles, desplazando los valores de la matriz hacia la derecha dependiendo del “d” que se le da. Y el otro colocando los valores del final hacia adelante de la matriz.<br>
                Ejemplo:<br>
                <img src="Ejercicio2.png"style="width:50%; height:auto"/>
                <li><b>Triángulo recursivo<br>
                <p>Se utilizó la siguiente porción de código:<br>
                if(base == 1){<br>
                System.out.println("*");<br>
                } <br>
                else{<br>
                 for(int i=0;i < base;i++){<br>
                 System.out.print("*");<br>
                } <br>
                 System.out.println();<br>
                 trianguloRecursivo(base-1);<br>
                } </p>
                El cual utiliza un condicional hasta llegar a 1, además de un bucle dependiendo la base lo que hace es imprimir un “*” dependiendo el número de la base siendo que cada vez desciende el número de esta hasta que termina con 1 lo que ocasiona que se produzca una pirámide de “*”<br>
                Ejemplo:<br>
                <img src="Ejercicio3.png"style="width:50%; height:auto"/>
                <li><b>Lista<br>
                <p>Se utilizó 3 clases para crear la lista:<br>
                -Principal (donde se ejecuta el código)<br>
                -Node (Recibe tipo genérico)<br>
                -Listas (Almacena datos básicos para la lista<br>
                Para crear una lista se utilizó:<br>
                List<Node> Personas = new ArrayList<>();<br>
                Personas.add(new Node(new Lista("Maria",27,2000)));<br>
                Personas.add(new Node(new Lista("Pedro",32,3000)));<br>
                Personas.add(new Node(new Lista("Osbaldo",28,1500)));<br>
            </ol> 
            </td> 
        </tr>
        <tr>
            <td>
            II. SOLUCIÓN DEL CUESTIONARIO<br>
            <ul>
                <li><b>¿Qué diferencia hay entre un List y un ArrayList en Java?</b></li>
                <p>Qué List es una interfaz y ArrayList es una clase de colección, List se usa para almacenar objetos asociados a sus índices en cambio ArrayList se usa para crear una matriz dinámica que  cambia de tamaño, tambien se podria decir que List es un tipo genérico de ArrayList.
                <li><b>¿Qué beneficios y oportunidades ofrecen las clases genéricas en Java?
                </b></li>
                <p>Nos permite reutilizar los objetos pues al no ser de una clase específica se puede reutilizar para varias clases dándonos una mayor potencia a la hora de programar.
            </ul>
            </td>
        </tr>
        <tr>
            <td>
            III. CONCLUSIONES<br>
                <ul>
                    <li>Los tipos genéricos nos pueden dar una gran ayuda a la hora de hacer objetos, pues su futura reutilización es un punto muy fuerte en estos</li>
                    <li>Se puede utilizar List en reemplazo de ArrayList pues este ofrece más ventajas que su clase de colección. </li>
                </ul>
            </td>
        </tr>
    </tbody>
</table>

<table>
    <theader>
        <tr>
            <th style="text-align:center">RETROALIMENTACIÓN GENERAL</th>
        </tr>
    </theader>
    <tbody>
        <tr>
            <td>
            </td>
        </tr>
    </tbody>
</table>

<table>
    <theader>
        <tr>
            <th style="text-align:center">REFERENCIAS Y BIBLIOGRAFÍA</th>
        </tr>
    </theader>
    <tbody>
        <tr>
            <td>
                -Escobedo, R., 2022. pw2/labs/lab01 at main · rescobedoq/pw2. [online] GitHub. Available at: https://github.com/rescobedoq/pw2/tree/main/labs/lab01.<br>
                -Proyectos de tecnología con arduino, 2022. Manejo de ramas de Git, en vs code . (branch). [video] Available at: https://www.youtube.com/watch?v=k8UlMFtNDpE.<br>
                -https://docs.oracle.com/javase/tutorial/java/generics/types.html<br>
                -https://docs.oracle.com/javase/7/docs/api/java/util/List.html<br> 
            </td>
        </tr>
    </tbody>
</table>