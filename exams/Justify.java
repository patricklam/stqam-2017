import java.util.ArrayList;
import java.util.List;

class Justify {
    public static String default_text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";
    
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("usage: java Justify <line-length>");
            System.exit(1);
        }
        String text = default_text;
        if (args.length == 2)
            text = args[1];
        
        int N = Integer.parseInt(args[0]);
        List<String> wrapped = wrap(text, N);
        for (String s : wrapped)
            System.out.println(s);
    }

    public static List<String> wrap(String input, int line_length) {
        List<String> rv = new ArrayList<String>();
        int last_break = -1, last_space = 0;
        
        for (int i = 0;
             i < input.length();
             i++) {
            if (input.charAt(i) == ' ') {
                last_space = i;
            }
            
            if (i - last_break > line_length) {
                rv.add(input.substring(last_break + 1, last_space));
                last_break = i;
            }
        }
        if (last_space >= last_break + 1)
            rv.add(input.substring(last_break + 1, last_space));
        return rv;
    }
}
