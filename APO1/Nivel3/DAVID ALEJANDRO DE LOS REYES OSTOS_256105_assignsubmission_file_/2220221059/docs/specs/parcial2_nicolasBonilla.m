% Solución de un Laboratorio nro. 2 realizado en un semestre anterior.
% Varios códigos para calcular o graficar la respuesta paso de un sistema
% que posee POLOS REALES.

clear;	% Borrar el "buffer" de memoria del MATLAB. Las variables se eliminan! close all; % Cierra todas las ventanas que se han abierto desde el MATLAB.
clc;	% Limpia, borra, el código de la pantalla.

% Con base en la función de salida Y(s)=G(s)X(s)=(1/s^2+6s+5)(1/s)=(1/s(s^2+6s+5)
% se calculan los residuos k1, k2 y k3.
% Los valores (de los residuos) calculados a "hand" fueron:
% k1 = 1/s
% k2 = -1/s
% k3 = 1/20
% Vamos a verificar en MATLAB si los cálculos de los residuos k1, k2 y k3
% y los respectivos valores, hallados a "hand", están correctos.
num1 = [ 0 0 0 1]; % [ 0s^2+0s^2+6s+5] = numerador de Y(s).
den1 = [ 1 4 3 0]; % [ 0s^2+6s+5+0s^0 ] = denominador de Y(s).
format rat % Muestra algunos resultados en forma fraccionaria, por ejemplo, 0.5 = 1/2 [residuos, polos, ganancia] = residue(num1,den1) % Calcula los residuos k1, k2 y k3
