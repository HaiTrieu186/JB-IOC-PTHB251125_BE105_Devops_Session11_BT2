package ptithcm.customerservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class CustomerController {

    @GetMapping("/api/v1/customers")
    public List<Map<String, Object>> getCustomers() {
        return List.of(
                Map.of("id", 1, "name", "Nguyen Van A"),
                Map.of("id", 2, "name", "Tran Thi B")
        );
    }
}