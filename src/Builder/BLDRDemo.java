package Builder;

public class BLDRDemo {
    public static void main(String[] args) {
        HTMLBuilder bldr = new HTMLBuilder("ul");
        bldr.addChild("li", "Hello");
        bldr.addChild("li", "World");
        System.out.println(bldr);




//        String hello = "Hello";
//        System.out.println("<p>" + hello + "</p>");
//
//        String[] words = {"This", "is", "a",  "bunch",  "of",  "stuff",  "to",  "demonstrate",
//                "how",  "the",  "Builder",  "pattern",  "works",  "with",  "StringBuilder"};
//        StringBuilder sb = new StringBuilder();
//        sb.append("<ul>\n");
//        for(String word : words){
//            sb.append(String.format("  <li>%s</li>\n", word));
//        }
//        sb.append("</ul>\n");
//        System.out.println(sb);
    }
}
