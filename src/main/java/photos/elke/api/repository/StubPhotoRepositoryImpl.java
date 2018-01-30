package photos.elke.api.repository;

import org.springframework.data.repository.CrudRepository;
import photos.elke.api.model.Photo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class StubPhotoRepositoryImpl implements StubPhotoRepository {

    private List<Photo> photos = new ArrayList<Photo>();

    public void init() {
        photos.add(new Photo(1));
        photos.add(new Photo(2));
        photos.add(new Photo(3));
    }

    @Override
    public <S extends Photo> S save(S photo) {
        if (this.photos.add(photo)) {
            return photo;
        }

        return null;
    }

    @Override
    public <S extends Photo> Iterable<S> saveAll(Iterable<S> iterable) {
        ArrayList<S> success = new ArrayList<S>();
        for (S photo : iterable) {
            if (this.photos.add(photo))
            {
                success.add(photo);
            }
        }
        return success;
    }

    @Override
    public Optional<Photo> findById(Integer integer) {
        int index = this.photos.indexOf(new Photo(integer));
        if (index >= 0) {
            return Optional.of(this.photos.get(index));
        }
        return Optional.empty();
    }

    @Override
    public boolean existsById(Integer integer) {
        return this.photos.indexOf(new Photo(integer)) >= 0;
    }

    @Override
    public Iterable<Photo> findAll() {
        return this.photos;
    }

    @Override
    public Iterable<Photo> findAllById(Iterable<Integer> iterable) {
        ArrayList<Photo> results = new ArrayList<Photo>();
        for (Integer id : iterable) {
            int index = this.photos.indexOf(new Photo(id));
            if (index >= 0)
            {
                results.add(this.photos.get(index));
            }
        }
        return results;
    }

    @Override
    public long count() {
        return this.photos.size();
    }

    @Override
    public void deleteById(Integer integer) {
        this.photos.remove(new Photo(integer));
    }

    @Override
    public void delete(Photo photo) {
        this.photos.remove(photo);
    }

    @Override
    public void deleteAll(Iterable<? extends Photo> iterable) {
        for (Photo photo : iterable) {
            this.photos.remove(photo);
        }
    }

    @Override
    public void deleteAll() {
        this.photos.clear();
    }
}
