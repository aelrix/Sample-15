package main;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class Football {
    @RequestMapping("/get/branch")
    Branch showBranch() {
        return b;
    }
    @RequestMapping({"/get/manager", "/frank"})
    Manager showFrank() {
        return m;
    }
    @Autowired @Qualifier("first") Manager m;
    @Autowired Branch b;
}

// http://localhost:8080/get/manager
// http://localhost:8080/frank
// http://localhost:8080/get/branch