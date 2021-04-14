package dp.co;

public class Runner {

    public static void main(String[] args) {
        Directory dA = new Directory("A");
        File f1 = new File("f1.doc");
        File f2 = new File("f1.txt");
        File f3 = new File("f2.xls");

        dA.add(f1);
        dA.add(f2);
        dA.add(f3);

        Directory dB = new Directory("B");
        File f4 = new File("f4.mov");
        File f5 = new File("f5.m2t");
        File f6 = new File("f6.c");

        dB.add(f4);
        dB.add(f5);
        dB.add(f6);

        dA.add(dB);

        Directory dC = new Directory("C");
        File f7 = new File("abc.txt");

        dC.add(f7);

        Directory dD = new Directory("D");
        File f8 = new File("document.odt");

        dD.add(f8);

        dC.add(dD);

        dA.add(dC);
    }


}
