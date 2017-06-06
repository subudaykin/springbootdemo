package golden.horde.demo.repositary;

import org.springframework.data.jpa.repository.JpaRepository;

import golden.horde.demo.domain.Journal;

public interface JournalRepository extends JpaRepository<Journal, Long> {

}
