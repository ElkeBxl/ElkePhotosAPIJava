package photos.elke.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import photos.elke.api.model.Photo;
import photos.elke.api.repository.JSONPhotoRepository;

@Service
public class PhotoServiceImpl implements PhotoService {

    @Autowired
    private JSONPhotoRepository repository;

    @Override
    public Iterable<Photo> getProject365Photos() {
        return this.repository.findAll();
    }
}
