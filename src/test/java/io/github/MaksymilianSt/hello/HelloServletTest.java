package io.github.MaksymilianSt.hello;

import io.github.MaksymilianSt.lang.Lang;
import io.github.MaksymilianSt.lang.LangRepository;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class HelloServiceTest {

    @Test
    void null_Args_preperGreeting(){

    //given
        var SUT =  new HelloService(LangRepo());

        //when
        var result = SUT.preparGreeting(null,null);

        //then
        assertEquals("Hello world!", result);
}




    LangRepository LangRepo(){
        return new LangRepository() {
            @Override
            public List<Lang> findAll() {
                return null;
            }

            @Override
            public List<Lang> findAll(Sort sort) {
                return null;
            }

            @Override
            public List<Lang> findAllById(Iterable<Integer> integers) {
                return null;
            }

            @Override
            public <S extends Lang> List<S> saveAll(Iterable<S> entities) {
                return null;
            }

            @Override
            public void flush() {

            }

            @Override
            public <S extends Lang> S saveAndFlush(S entity) {
                return null;
            }

            @Override
            public <S extends Lang> List<S> saveAllAndFlush(Iterable<S> entities) {
                return null;
            }

            @Override
            public void deleteAllInBatch(Iterable<Lang> entities) {

            }

            @Override
            public void deleteAllByIdInBatch(Iterable<Integer> integers) {

            }

            @Override
            public void deleteAllInBatch() {

            }

            @Override
            public Lang getOne(Integer integer) {
                return null;
            }

            @Override
            public Lang getById(Integer integer) {
                return null;
            }

            @Override
            public <S extends Lang> List<S> findAll(Example<S> example) {
                return null;
            }

            @Override
            public <S extends Lang> List<S> findAll(Example<S> example, Sort sort) {
                return null;
            }

            @Override
            public Page<Lang> findAll(Pageable pageable) {
                return null;
            }

            @Override
            public <S extends Lang> S save(S entity) {
                return null;
            }

            @Override
            public Optional<Lang> findById(Integer integer) {
                return Optional.empty();
            }

            @Override
            public boolean existsById(Integer integer) {
                return false;
            }

            @Override
            public long count() {
                return 0;
            }

            @Override
            public void deleteById(Integer integer) {

            }

            @Override
            public void delete(Lang entity) {

            }

            @Override
            public void deleteAllById(Iterable<? extends Integer> integers) {

            }

            @Override
            public void deleteAll(Iterable<? extends Lang> entities) {

            }

            @Override
            public void deleteAll() {

            }

            @Override
            public <S extends Lang> Optional<S> findOne(Example<S> example) {
                return Optional.empty();
            }

            @Override
            public <S extends Lang> Page<S> findAll(Example<S> example, Pageable pageable) {
                return null;
            }

            @Override
            public <S extends Lang> long count(Example<S> example) {
                return 0;
            }

            @Override
            public <S extends Lang> boolean exists(Example<S> example) {
                return false;
            }

            @Override
            public <S extends Lang, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
                return null;
            }
        };
    }
}