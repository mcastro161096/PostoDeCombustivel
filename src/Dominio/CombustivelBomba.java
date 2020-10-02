package Dominio;

    public class CombustivelBomba
    {
        private Combustivel combustivel;

        private double quantidade;

        public CombustivelBomba(Combustivel combustivel, double quantidade)
        {
            this.combustivel = combustivel;
            this.quantidade = quantidade;
        }

        public Combustivel getCombustivel()
        {
            return combustivel;
        }

        public void setCombustivel(Combustivel combustivel)
        {
            this.combustivel = combustivel;
        }

        public double getQuantidade()
        {
            return quantidade;
        }

        public void setQuantidade(double quantidade)
        {
            this.quantidade = quantidade;
        }
    }
