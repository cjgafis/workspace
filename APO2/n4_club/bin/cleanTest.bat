@echo off
REM ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
REM Universidad de los Andes (Bogot� - Colombia)
REM Departamento de Ingenier�a de Sistemas y Computaci�n
REM Licenciado bajo el esquema Academic Free License version 2.1
REM
REM Proyecto Cupi2
REM Ejercicio: Club
REM Autor: Jorge Jimenez - 7-Jul-2005
REM ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
REM/


REM ---------------------------------------------------------
REM Borra todos los archivos generados por el build
REM ---------------------------------------------------------

cd ..\test
del classes\* /s /q 
del lib\clubTest.jar /s /q 

cd ..\bin
