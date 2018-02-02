package photos.elke.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import photos.elke.api.repository.StubPhotoRepository;

@RestController
@RequestMapping("api/v1/")
public class ApiController {

    @Autowired
    private StubPhotoRepository repository;

    @RequestMapping(value = "photos", method = RequestMethod.GET)
    public String getAll() {
        this.repository.findAll();
        return "GET!";
    }

    @RequestMapping(value = "photos", method = RequestMethod.PUT)
    public ResponseEntity update() {
        return new ResponseEntity(HttpStatus.NOT_IMPLEMENTED);
    }

    @RequestMapping(value = "photos", method = RequestMethod.POST)
    public ResponseEntity create() {
        return new ResponseEntity(HttpStatus.NOT_IMPLEMENTED);
    }

    @RequestMapping(value = "photos", method = RequestMethod.DELETE)
    public ResponseEntity remove() {
        return new ResponseEntity(HttpStatus.NOT_IMPLEMENTED);
    }
}
