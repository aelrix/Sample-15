package main;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class Sample {
    @RequestMapping("/api/branch/list")
    String[] branchList() {
        return storage.list;
    }
    @Autowired BranchStorage storage;
   
    @RequestMapping("/player") 
    PlayerStorage show() {
        return playerStorage;
    }
    @Autowired PlayerStorage playerStorage;
}

@Repository
class BranchStorage {
    String[] list = { "London", "New York", "Tokyo"};
}

@Repository
class PlayerStorage {
    public String player = "Messi";
}