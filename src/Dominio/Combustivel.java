package Dominio;

    public class Combustivel
    {
        private String tipoDeCombustivel;

        private double valorPorLitro;


        public Combustivel(String tipoDeCombustivel, double valorPorLitro)
        {
            this.tipoDeCombustivel = tipoDeCombustivel;
            this.valorPorLitro = valorPorLitro;
        }


        public String getTipoDeCombustivel()
        {
            return tipoDeCombustivel;
        }

        public void setTipoDeCombustivel(String tipoDeCombustivel)
        {
            this.tipoDeCombustivel = tipoDeCombustivel;
        }

        public double getValorPorLitro()
        {
            return valorPorLitro;
        }

        public void setValorPorLitro(double valorPorLitro)
        {
            this.valorPorLitro = valorPorLitro;
        }

        @Override
        public String toString()
        {
            return "Combustivel{" +
                    "tipoDeCombustivel='" + tipoDeCombustivel + '\'' +
                    ", valorPorLitro=" + valorPorLitro +
                    '}';
        }
    }
