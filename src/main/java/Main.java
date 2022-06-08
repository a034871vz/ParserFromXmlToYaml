public class Main {
    public static void main(String[] args) {

        Parser parser = new Parser();
        var deserializeObject = parser.parseFromXmlToObject();
        parser.parseFromObjectToYaml(deserializeObject);
    }
}
