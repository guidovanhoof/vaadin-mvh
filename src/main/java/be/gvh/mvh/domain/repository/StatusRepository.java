package be.gvh.mvh.domain.repository;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StatusRepository extends JpaRepository<Status, UUID> {

}
