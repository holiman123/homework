package fractionCalc;

public class calculatorrr {

    static public drop add(drop d1, drop d2)
    {
        int obshiySanm = d1.snamenatel * d2.snamenatel;
        int chis1 = obshiySanm/d1.snamenatel * d1.chislitel;
        int chis2 = obshiySanm/d2.snamenatel * d2.chislitel;
        int resCHis = (chis1 + chis2);
        int resSnam = obshiySanm;
        //if((chis1 + chis2) % obshiySanm == 0)
        //{
            for (int i = obshiySanm; i > 1 ; i--) {
                if(resCHis % i == 0 && resSnam % i == 0) {
                    resCHis = resCHis / i;
                    resSnam = resSnam / i;
                }
            }
        //}
        drop resault = new drop(resCHis,resSnam);
        return resault;
    }
    static public drop subtract(drop d1, drop d2)
    {
        int obshiySanm = d1.snamenatel * d2.snamenatel;
        int chis1 = obshiySanm/d1.snamenatel * d1.chislitel;
        int chis2 = obshiySanm/d2.snamenatel * d2.chislitel;
        int resCHis = (chis1 - chis2);
        int resSnam = obshiySanm;
        //if((chis1 + chis2) % obshiySanm == 0)
        //{
        for (int i = obshiySanm; i > 1 ; i--) {
            if(resCHis % i == 0 && resSnam % i == 0) {
                resCHis = resCHis / i;
                resSnam = resSnam / i;
            }
        }
        //}
        drop resault = new drop(resCHis,resSnam);
        return resault;
    }
    static public drop multiply(drop d1, drop d2)
    {
        int resChis = (d1.chislitel * d2.chislitel);
        int resSnam = (d1.snamenatel * d2.snamenatel);

        for (int i = d1.snamenatel * d2.snamenatel; i > 1 ; i--) {
            if(resChis % i == 0 && resSnam % i == 0) {
                resChis = resChis / i;
                resSnam = resSnam / i;
            }
        }

        drop resault = new drop(resChis,resSnam);
        return resault;
    }
    static public drop divide(drop d1, drop d2)
    {
        int resChis = (d1.chislitel * d2.snamenatel);
        int resSnam = (d1.snamenatel * d2.chislitel);

        for (int i = d1.snamenatel * d2.chislitel; i > 1 ; i--) {
            if(resChis % i == 0 && resSnam % i == 0) {
                resChis = resChis / i;
                resSnam = resSnam / i;
            }
        }

        drop resault = new drop(resChis,resSnam);
        return resault;
    }
}
