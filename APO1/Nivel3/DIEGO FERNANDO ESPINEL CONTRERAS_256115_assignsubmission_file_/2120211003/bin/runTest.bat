@echo off
REM ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
REM Universidad de los Andes (Bogotá - Colombia)
REM Departamento de Ingeniería de Sistemas y Computación 
REM Licenciado bajo el esquema Academic Free License version 2.1
REM
REM Proyecto Cupi2
REM Ejercicio: n3_notasCurso
REM Autor: Pablo Barvo - 09-Sep-2005
REM ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

REM ---------------------------------------------------------
REM Ejecución de las pruebas
REM ---------------------------------------------------------

java -classpath ../lib/notasCurso.jar;../test/lib/notasCursoTest.jar;../test/lib/junit.jar junit.swingui.TestRunner uniandes.cupi2.notasCurso.test.CursoTest