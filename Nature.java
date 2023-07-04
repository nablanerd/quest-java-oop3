public class Nature {

    public static void main(String[] args) {

        Penguin pingou = new Penguin("Pingou");
        pingou.dive();
        pingou.swimDown(3);
        pingou.swimUp(1);
        pingou.swimDown(4);
        pingou.swimUp(5);
        pingou.swimUp(1);
        pingou.getOut();


        System.out.println(" ");


        Eagle hawkeye = new Eagle("Hawkeye");
        // TODO : uncomment the following code in order to test it

        //Hawkeye takes off in the sky.
        hawkeye.takeOff();

        //Hawkeye flies upward, altitude: 120
        hawkeye.ascend(120);

        //Hawkeye flies upward, altitude: 150
        hawkeye.ascend(30);

        //glides into the air.
        hawkeye.glide();

        //Hawkeye flies downward, altitude: 10
        hawkeye.descend(140);

        //Hawkeye is too high, it can't land.
        hawkeye.land();

        //Hawkeye flies downward, altitude: 1
        hawkeye.descend(9);

        //Hawkeye lands on the ground.
        hawkeye.land();

    }
}
