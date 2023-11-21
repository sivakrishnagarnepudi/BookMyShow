public class BookMyshow {
        String SelectMovie;
        String ChooseSeat;
        String PaymentGateway;
        public BookMyshow(String SelectMovie,String ChooseSeat,String PaymentGateway) {
            this.SelectMovie = SelectMovie;
            this.ChooseSeat = ChooseSeat;
            this.PaymentGateway = PaymentGateway;
        }

        public String getSelectMovie(){
            return SelectMovie;
        }

        public String getChooseSeat() {
            return ChooseSeat;
        }

        public String getPaymentGateway() {
            return PaymentGateway;
        }

    public void setPaymentGateway(String PaymentGateway) {
        this.PaymentGateway = PaymentGateway;
    }

    public void setChooseSeat(String ChooseSeat) {
        this.ChooseSeat = ChooseSeat;
    }

    public void setSelectMovie(String SelectMovie) {
        this.SelectMovie = SelectMovie;
    }

}

