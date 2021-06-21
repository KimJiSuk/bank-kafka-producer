package kafka.streams.producer;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ProducerController {

    private final ProducerService producerService;

    @Value("${topic}")
    private String topic;

    @GetMapping("/producer")
    @ResponseBody
    public String producer() {
        return producerService.producerCSV(topic);
    }
}
