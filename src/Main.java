import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        String yourAnswerForDanaci= "";
        String yourAnswerForBanica = "";
        String yourPartia="";

        int yourAnswerForPartia = 0;

        boolean POOR=false;
        boolean RICH=false;
        boolean NORMAL=false;
        boolean VIP=false;
        boolean superVIP=false;

        //Write the serial number
        System.out.print("Моля въведете сериен номер: ");
        int serialNumber = scanner.nextInt();

        // check the serial number
        if(0<serialNumber && serialNumber<10){
            POOR=true;
        }else if(10<=serialNumber && serialNumber<100000){
            NORMAL=true;
        }else if(serialNumber>100000){
            RICH=true;
        }

        // The voice from the terminal
        if(POOR){
            System.out.println("Хайде по-бързо и да те няма");
        }else if(RICH){
            System.out.println("Има за нас, има и за вас");
        }else if(NORMAL){
            System.out.println("Радваме се, че нормални хора вече гласуват");
        }

        // Check for VIP
        if(serialNumber % 2 == 0){
            VIP=true;
        }

        // Check the number before the last number
        if(((serialNumber % 100)/10) >3){

            System.out.println("Укривали ли сте данъци?");
            yourAnswerForDanaci=scanner.next();
            if(yourAnswerForDanaci.equals("да")){
                System.out.println("Браво мойто момче!");
            }else if(yourAnswerForDanaci.equals("не")){
                System.out.println("Будала");
            }

        }

        // check super VIP status
        boolean isSuperVIP = VIP && yourAnswerForDanaci.equals("не") ;

        if(isSuperVIP){
            superVIP=true;
            System.out.println("Искаш ли баничка?");
            yourAnswerForBanica=scanner.nextLine();
            if(yourAnswerForBanica.equals("yes")){
                System.out.println("Не може");
            }else{
                System.out.println("Ами то и без това няма");
            }
        }

        // show the menu with parties
        System.out.println("Списък с партии");
        System.out.println("****************");
        System.out.println("1. Партия за прогресивен канибализъм");
        System.out.println("27. Замундска вегетарианска партия");
        System.out.println("666. Синдикат на вуду-трактористите");
        System.out.println("999. Партия на труда, мотиката и наковалнята");

        System.out.print("Моля въведете номер на партия:");
        yourAnswerForPartia=scanner.nextInt();

        if(yourAnswerForPartia==1){
            yourPartia="Партия за прогресивен канибализъм";

        }else if(yourAnswerForPartia==27){
            yourPartia="Замундска вегетарианска партия";

        }else if(yourAnswerForPartia==666){
            yourPartia="Синдикат на вуду-трактористите";

        }else if(yourAnswerForPartia==999){
            yourPartia="Партия на труда, мотиката и наковалнята";

        }

        System.out.println("Вие си поръчахте да ви управлява "+ yourPartia);

        // chech if a man want banisa
        boolean isBanitsa = NORMAL && yourAnswerForBanica.equals("не") && yourAnswerForPartia==27;

        if(isBanitsa){
            System.out.println("Животът е жесток и дължи данък от един банан при напускане");
        }
    }
}
