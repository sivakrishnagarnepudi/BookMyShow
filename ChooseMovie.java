public class ChooseMovie extends BookMyshow{


    public ChooseMovie(String SelectMovie,String ChooseSeat,String PaymentGateway) {
        super(SelectMovie, ChooseSeat,PaymentGateway);
        
    }
    public static void main(String args[]){
        ChooseMovie Cm=new ChooseMovie("7G Brundhavana Colony","11,12","Online net Bank");

        System.out.println(Cm.SelectMovie);
        System.out.println(Cm.ChooseSeat);
        System.out.println(Cm.getPaymentGateway());
    }
}
