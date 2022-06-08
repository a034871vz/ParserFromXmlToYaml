import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import com.fasterxml.jackson.dataformat.yaml.YAMLGenerator;
import lombok.SneakyThrows;
import model.ResponseFsaType;

import java.io.*;

public class Parser {

    private final XmlMapper xmlMapper = new XmlMapper();
    private final ObjectMapper yamlMapper = new ObjectMapper(new YAMLFactory().disable(YAMLGenerator.Feature.WRITE_DOC_START_MARKER));
    private final File xmlFile = new File("src/main/resources/sample.xml");
    private final File yamlFile = new File("src/main/resources/output.yml");

    @SneakyThrows
    public ResponseFsaType parseFromXmlToObject() {
        xmlMapper.findAndRegisterModules();
        String xml = inputStreamToString(new FileInputStream(xmlFile));
        return xmlMapper.readValue(xml, ResponseFsaType.class);
    }

    @SneakyThrows
    public void parseFromObjectToYaml(ResponseFsaType deserializeObject) {
        yamlMapper.findAndRegisterModules();
        yamlMapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
        yamlMapper.writeValue(yamlFile, deserializeObject);
    }

    @SneakyThrows
    private String inputStreamToString(InputStream is)  {
        StringBuilder sb = new StringBuilder();
        String line;
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        while ((line = br.readLine()) != null) {
            sb.append(line);
        }
        br.close();
        return sb.toString();
    }

}
