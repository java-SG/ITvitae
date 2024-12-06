package school.les;

/*
if (browser == 'Edge') {
    System.out.println("Je gebruikt Edge");
}
else if (browser == 'chrome' || browser == 'firefox' || browser == 'opera') {
    System.out.println("Je gebruikt een moderne browser");
}
else if (browser == 'IE') {
    System.out.println("Waarom gebruik je Internet Explorer?");
}
else {
    System.out.println("Je gebruikt een niet-ondersteunde browser");
}
*/

public class hoofdstuk_05_switch_statements {
    public static void main(String[] args) {
        String browser = "Firefox";
        switch (browser) {
            case "Edge":
                System.out.println("You are using the " + browser + " browser");
                break;
            // These next 3 cases will all express the code after the 3rd case until it breaks again, kinda like it read the 2nd case as part of the code block for the 1st case and then the 3rd case as part of the 2nd case's code block?
            case "Chrome":
            case "Firefox":
            case "Opera":
                System.out.println("You are using a modern browser: " + browser);
                break;
            case "IE":
                System.out.println("Download a real browser using this browser, you caveman");
                break;
            default:
                System.out.println("You are not using a browser, still better than IE!");
                break;
        };
    }
}
