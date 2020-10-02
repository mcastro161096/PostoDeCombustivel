package Aplicacao;
import Dominio.*;

import java.util.Scanner;

public class Programa
    {
        public static void main(String [] args)
        {
            Scanner ler = new Scanner(System.in);


            Combustivel gasolina = new Combustivel("Gasolina", 4.26);
            Combustivel alcool = new Combustivel("Alcool", 2.78);
            Combustivel diesel = new Combustivel("Diesel", 3.37);

            CombustivelBomba combustivelGasolina = new CombustivelBomba(gasolina, 20.00);
            CombustivelBomba combustivelAlcool = new CombustivelBomba(alcool, 20.00);
            CombustivelBomba combustivelDiesel = new CombustivelBomba(diesel, 20.00);

            BombaDeCombustivel bomba1 = new BombaDeCombustivel(combustivelGasolina,combustivelAlcool,combustivelDiesel);
            BombaDeCombustivel bomba2 = new BombaDeCombustivel(combustivelGasolina,combustivelAlcool,combustivelDiesel);

            Posto posto = new Posto("Posto de mentirinha", bomba1, bomba2);



        }
    }
