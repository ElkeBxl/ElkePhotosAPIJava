package photos.elke.api.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import photos.elke.api.model.Photo;

@Repository
public interface StubPhotoRepository extends CrudRepository<Photo, Integer> {
}