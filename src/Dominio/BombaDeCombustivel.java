package Dominio;
import Dominio.*;

import java.text.DecimalFormat;
import java.util.List;

public class BombaDeCombustivel
    {
        private CombustivelBomba combustivelGasolina;

        private CombustivelBomba combustivelAlcool;

        private CombustivelBomba combustivelDiesel;

        public BombaDeCombustivel(CombustivelBomba combustivelGasolina, CombustivelBomba combustivelAlcool, CombustivelBomba combustivelDiesel)
        {
            this.combustivelGasolina = combustivelGasolina;
            this.combustivelAlcool = combustivelAlcool;
            this.combustivelDiesel = combustivelDiesel;
        }

        public String AbastecerPorValor(double valor, int combustivelEscolhido)
        {
            String resultado = "";
            var litrosAbastecidos = 0.00;
            if(valor > 0)
            {

                if (combustivelEscolhido == 1)
                {
                    if(combustivelGasolina.getQuantidade() >=  valor / this.combustivelGasolina.getCombustivel().getValorPorLitro())
                    {
                        litrosAbastecidos =  valor / this.combustivelGasolina.getCombustivel().getValorPorLitro();
                        this.combustivelGasolina.setQuantidade(combustivelGasolina.getQuantidade() -  litrosAbastecidos);
                        resultado = String.format("%.2f", litrosAbastecidos);
                        resultado = "Você abasteceu " + resultado + "litros";
                    }
                    else
                        resultado = "Não há combustível suficiente na bomba, ela possui apenas " + combustivelGasolina.getQuantidade() + " litros";

                }

                if (combustivelEscolhido == 2)
                {
                    litrosAbastecidos = valor / this.combustivelAlcool.getCombustivel().getValorPorLitro();
                    this.combustivelAlcool.setQuantidade(litrosAbastecidos);
                    resultado = String.format("%.2f", litrosAbastecidos);
                    resultado = "Você abasteceu " + resultado + "litros";
                }
                if (combustivelEscolhido == 3)
                {
                    litrosAbastecidos = valor / this.combustivelDiesel.getCombustivel().getValorPorLitro();
                    this.combustivelDiesel.setQuantidade(litrosAbastecidos);
                    resultado = String.format("%.2f", litrosAbastecidos);
                    resultado = "Você abasteceu " + resultado + "litros";
                }



            }
            else
                resultado = "Não é possível abastecer um valor negativo";

           return resultado;
        }

        public String AbastecerPorLitro(double litros, int combustivelEscolhido)
        {
            String resultado = "";
            double valorASerPago = 0;
            if(litros > 0)
            {
                if (combustivelEscolhido == 1)
                {
                    valorASerPago = litros * this.combustivelGasolina.getCombustivel().getValorPorLitro();
                    this.combustivelGasolina.setQuantidade(litros);
                }

                if (combustivelEscolhido == 2)
                {
                    valorASerPago = litros * this.combustivelAlcool.getCombustivel().getValorPorLitro();
                    this.combustivelAlcool.setQuantidade(litros);
                }
                if (combustivelEscolhido == 3)
                {
                    valorASerPago = litros * this.combustivelDiesel.getCombustivel().getValorPorLitro();
                    this.combustivelDiesel.setQuantidade(litros);
                }
                resultado = String.valueOf(valorASerPago);
            }
            else
                resultado = "Não é possível abastecer uma quantidade de litros negativa";


            return resultado;
        }

        @Override
        public String toString()
        {
            return "BombaDeCombustivel{" +
                    "\ncombustivelGasolina=" + combustivelGasolina +
                    "\n combustivelAlcool=" + combustivelAlcool +
                    "\n combustivelDiesel=" + combustivelDiesel +
                    '}';
        }

        public CombustivelBomba getCombustivelGasolina()
        {
            return combustivelGasolina;
        }

        public void setCombustivelGasolina(CombustivelBomba combustivelGasolina)
        {
            this.combustivelGasolina = combustivelGasolina;
        }

        public CombustivelBomba getCombustivelAlcool()
        {
            return combustivelAlcool;
        }

        public void setCombustivelAlcool(CombustivelBomba combustivelAlcool)
        {
            this.combustivelAlcool = combustivelAlcool;
        }

        public CombustivelBomba getCombustivelDiesel()
        {
            return combustivelDiesel;
        }

        public void setCombustivelDiesel(CombustivelBomba combustivelDiesel)
        {
            this.combustivelDiesel = combustivelDiesel;
        }
    }
