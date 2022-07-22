import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Degiskenler tanimlandi.
        String kullaniciAdi = "patika";
        int sifre = 3326, secim;

        /*
        Kullanicidan bilgiler alindi.
        Kullanicidan alinan bilgilerle data karsilastiriliyor.
        Sifre yanlis girilmis ise tekrar isteniyor.
        Dogru ise kullaniciya bilgi veriliyor
        */
        Scanner scan = new Scanner(System.in);
        System.out.print("Kullanici Adinizi Giriniz : ");
        kullaniciAdi = scan.nextLine();

        if (kullaniciAdi.equals("patika"))
        {
            System.out.println("-----------------------------");
            System.out.print("Kullanici Adiniz Dogru \nLutfen Sifrenizi Giriniz (4 Haneli PIN) : ");
            sifre = scan.nextInt();
            if (sifre == 3326)
            {
                System.out.println("-----------------------------");
                System.out.print("Basariyla Giris Yaptiniz. \nHos Geldiniz! ");
            }
            else if (sifre != 3326)
            {
                System.out.println("-----------------------------");
                System.out.print("Sifreniz Yanlistir. \nSifrenizi Yenilemek Ister Misiniz ? \nEvet Icin 1, Hayir Icin 2 Yaziniz : ");
                secim = scan.nextInt();
                if (secim == 1)
                {
                    System.out.println("-----------------------------");
                    System.out.print("Lutfen Yeni Sifrenizi Giriniz (4 Haneli PIN) : ");
                    sifre = scan.nextInt();
                    if (sifre != 3326)
                    {
                        System.out.println("-----------------------------");
                        System.out.print("Sifreniz Basariyla Degistirildi. ");
                    }
                    else if (sifre == 3326)
                    {
                        System.out.print("Hata! Yeni Sifreniz Eski Sifrenizle Ayni Olamaz. \nLutfen Tekrar Giriniz :");
                        sifre = scan.nextInt();
                        if (sifre == 3326)
                        {
                            System.out.println("-----------------------------");
                            System.out.print("Daha Onceki Sifrenizi Tekrar Girdiniz. \nYeni Sifre Eskisiyle Ayni Olamaz."+
                                    " \nProgram Kapatiliyor. \nLutfen Sistem Yoneticinize Basvurun!");
                        }
                        else
                        {
                            System.out.println("-----------------------------");
                            System.out.print("Sifreniz Basariyla Degistirildi. ");
                        }
                    }
                }
                else if (secim == 2)
                {
                    System.out.println("-----------------------------");
                    System.out.print("Sifre Degistirmemeyi Tercih Ettiniz. \nProgram Kapatiliyor.");
                }
                else
                {
                    System.out.println("-----------------------------");
                    System.out.print("Hatali Tuslama Yaptiniz. \nProgram Kapatiliyor.");
                }
            }
        }
        else
        {
            System.out.println("-----------------------------");
            System.out.print("Kullanici Adinizi Yanlis Girdiniz. \nProgram Kapatiliyor.");
        }
    }
}
