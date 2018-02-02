package photos.elke.api.service;

import org.springframework.stereotype.Service;
import photos.elke.api.model.Photo;

@Service
public interface PhotoService {

    public Iterable<Photo> getProject365Photos();

}
