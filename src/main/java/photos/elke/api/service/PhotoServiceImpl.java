package photos.elke.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import photos.elke.api.repository.JSONPhotoRepository;

@Service
public class PhotoServiceImpl implements PhotoService {

    @Autowired
    private JSONPhotoRepository repository;

    @Override
    public String getProject365Photos() {
        this.repository.findAll();
        return "PHOTOS!";
    }
}
