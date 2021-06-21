package kafka.streams.producer;

import lombok.RequiredArgsConstructor;
import org.springframework.core.io.ClassPathResource;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ProducerService {

    private final KafkaTemplate<String, String> kafkaTemplate;

    public String producerCSV(String topic) {

        ClassPathResource resource = new ClassPathResource("data.csv");

        try {
            Path path = Paths.get(resource.getURI());
            List<String> contents = Files.readAllLines(path);

            for (String content : contents) {
                System.out.println(content);
                kafkaTemplate.send(topic, content);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return "success";
    }
}
