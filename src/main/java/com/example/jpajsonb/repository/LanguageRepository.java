package com.example.jpajsonb.repository;
import java.util.List;
import com.example.jpajsonb.domain.Language;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by xiongsc on 2017/12/19.
 */
@RepositoryRestResource(path = "language")
public interface LanguageRepository extends JpaRepository<Language,Long> {

    List<Language> findByLanguageid(@Param("languageid") Long languageid);

}
