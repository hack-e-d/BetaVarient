package vijay.projects.betavarient.StandaloneCodeProblems;

public class StaticIntialization {

    public static int i = 0, b = 1;

    public void staticSetting() {

        if (b < 5 || b > 6) {
            try {
                b = 6;
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        else {
            i = 0;
            b++;
        }
        i++;
    }

    public static void main(String[] args) {
        StaticIntialization staticIntialization = new StaticIntialization();

        staticIntialization.staticSetting();
        System.out.println(i + "  :  " + b);
        staticIntialization.staticSetting();
        System.out.println(i + "  :  " + b);
        staticIntialization.staticSetting();
        System.out.println(i + "  :  " + b);
    }
}
