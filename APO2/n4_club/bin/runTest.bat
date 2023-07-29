@echo off
REM ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
REM Universidad de los Andes (Bogotá - Colombia)
REM Departamento de Ingeniería de Sistemas y Computación
REM Licenciado bajo el esquema Academic Free License version 2.1
REM
REM Proyecto Cupi2
REM Ejercicio: Club
REM Autor: Jorge Jimenez 7-Jul-2005
REM ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
REM/

REM ---------------------------------------------------------
REM Ejecucion de las pruebas
REM ---------------------------------------------------------

cd ..
java -classpath ./lib/club.jar;./test/lib/clubTest.jar;./test/lib/junit.jar junit.swingui.TestRunner uniandes.cupi2.club.test.ClubTest
java -classpath ./lib/club.jar;./test/lib/clubTest.jar;./test/lib/junit.jar junit.swingui.TestRunner uniandes.cupi2.club.test.SocioTest
cd bin

