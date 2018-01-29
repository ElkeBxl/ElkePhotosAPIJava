package photos.elke.api.repository;

import org.springframework.data.repository.CrudRepository;
import photos.elke.api.model.Photo;

@org.springframework.stereotype.Repository
public interface StubPhotoRepository extends CrudRepository<Photo, Integer> {
}