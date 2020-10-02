package Dominio;
import Dominio.*;

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

        public double AbastecerPorValor(double valor, String combustivelEscolhido)
        {
            double litrosAbastecidos = 0;
            if (combustivelEscolhido == "Gasolina")
            {
                litrosAbastecidos = valor / this.combustivelGasolina.getCombustivel().getValorPorLitro();
            }

            if (combustivelEscolhido == "Alcool")
            {
                litrosAbastecidos = valor / this.combustivelAlcool.getCombustivel().getValorPorLitro();
            }
            if (combustivelEscolhido == "Diesel")
            {
                litrosAbastecidos = valor / this.combustivelDiesel.getCombustivel().getValorPorLitro();
            }

            return litrosAbastecidos;
        }

        public double AbastecerPorLitro(double litros, String combustivelEscolhido)
        {
            double valorASerPago = 0;
            if (combustivelEscolhido == "Gasolina")
            {
                 valorASerPago = litros * this.combustivelGasolina.getCombustivel().getValorPorLitro();
            }

            if (combustivelEscolhido == "Alcool")
            {
                 valorASerPago = litros * this.combustivelAlcool.getCombustivel().getValorPorLitro();
            }
            if (combustivelEscolhido == "Diesel")
            {
                 valorASerPago = litros * this.combustivelDiesel.getCombustivel().getValorPorLitro();
            }

            return valorASerPago;
        }

        @Override
        public String toString()
        {
            return "BombaDeCombustivel{" +
                    "combustivelGasolina=" + combustivelGasolina +
                    ", combustivelAlcool=" + combustivelAlcool +
                    ", combustivelDiesel=" + combustivelDiesel +
                    '}';
        }
    }
