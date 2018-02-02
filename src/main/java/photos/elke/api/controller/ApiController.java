package photos.elke.api.controller;

import com.fasterxml.jackson.databind.util.JSONPObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import photos.elke.api.model.Photo;
import photos.elke.api.service.PhotoService;

import java.util.Iterator;
import java.util.List;

@RestController
@RequestMapping("api/v1/")
public class ApiController {

    @Autowired
    private PhotoService service;

    @RequestMapping(value = "photos", method = RequestMethod.GET)
    public Iterable<Photo> getAll() {
        return this.service.getProject365Photos();
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
