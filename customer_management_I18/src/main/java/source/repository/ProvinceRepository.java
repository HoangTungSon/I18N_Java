package source.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import source.model.Province;

public interface ProvinceRepository extends PagingAndSortingRepository<Province, Long> {
}
