public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        System.out.println(smartTv.ligada);
        System.out.println(smartTv.canal);
        System.out.println(smartTv.volume);

        smartTv.aumentarVolume();
        smartTv.mudarCanal();
        smartTv.power();

        System.out.println("------------------------------------------------");
        System.out.println(smartTv.ligada);
        System.out.println(smartTv.volume);
        System.out.println(smartTv.canal);

        smartTv.mudarCanalDefinido(50);
        smartTv.power();

        System.out.println("------------------------------------------------");
        System.out.println(smartTv.ligada);
        System.out.println(smartTv.canal);
        System.out.println(smartTv.volume);
    }
}
