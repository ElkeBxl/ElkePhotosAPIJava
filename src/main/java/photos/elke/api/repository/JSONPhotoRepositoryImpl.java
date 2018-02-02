package photos.elke.api.repository;

import org.springframework.stereotype.Repository;
import photos.elke.api.model.Photo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class JSONPhotoRepositoryImpl implements JSONPhotoRepository {
    @Override
    public <S extends Photo> S save(S s) {
        return null;
    }

    @Override
    public <S extends Photo> Iterable<S> saveAll(Iterable<S> iterable) {
        return null;
    }

    @Override
    public Optional<Photo> findById(Integer integer) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Integer integer) {
        return false;
    }

    @Override
    public Iterable<Photo> findAll() {
        List<Photo> result = new ArrayList<Photo>();
        result.add(new Photo(1));
        return result;
    }

    @Override
    public Iterable<Photo> findAllById(Iterable<Integer> iterable) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Integer integer) {

    }

    @Override
    public void delete(Photo photo) {

    }

    @Override
    public void deleteAll(Iterable<? extends Photo> iterable) {

    }

    @Override
    public void deleteAll() {

    }
}