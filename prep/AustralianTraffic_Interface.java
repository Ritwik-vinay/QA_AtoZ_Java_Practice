public class AustralianTraffic_Interface implements centralTraffic, ContinentalTraffic {
    public static void main(String[] args) {
        //Interface implements from other two interface class
        centralTraffic ct = new AustralianTraffic_Interface();
        ContinentalTraffic at = new AustralianTraffic_Interface();
        AustralianTraffic_Interface a = new AustralianTraffic_Interface();

        ct.redStop();
        ct.yellowWait();
        ct.greenGo();
        a.walking();
        at.Trainsymbol();

    }

    @Override
    public void greenGo() {
        System.out.println("Green Go Implements");
    }

    @Override
    public void yellowWait() {
        System.out.println("Yellow wait implements");

    }

    @Override
    public void redStop() {
        System.out.println("Red Strp implements");

    }

    public void walking() {
        System.out.println("Australian Traffic Start Walking");
    }

    @Override
    public void Trainsymbol() {
        System.out.println("Train traffics starts ");
    }
}

