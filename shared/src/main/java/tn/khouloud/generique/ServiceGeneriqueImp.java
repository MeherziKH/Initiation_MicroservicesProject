package tn.khouloud.generique;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.util.Assert;
import org.springframework.util.ReflectionUtils;

import java.lang.reflect.Field;
import java.util.List;
import java.util.Map;


public abstract class ServiceGeneriqueImp<T, ID> implements ServiceGenerique<T, ID> {

    @Autowired
    private JpaRepository<T, ID> jpaRepository;

    @Override
    public T add(T entity){
        return jpaRepository.save(entity);
    };

    @Override
    public List<T> getAll(){
        return jpaRepository.findAll();
    }

    @Override
    public T getOne(ID id){
        return jpaRepository.findById(id).orElse(null);
    };

    @Override
    public T update(ID id, Map<Object, Object> fields){
        T t = jpaRepository.findById(id).orElse(null);
        Assert.notNull(t, "Object not found with this id: "+id);
        fields.forEach((key, value) ->{
            Field field= ReflectionUtils.findField((Class<T>) t.getClass(), (String) key);
            field.setAccessible(true);
            ReflectionUtils.setField(field,t,value);
        });
        return jpaRepository.save(t);
    }

    @Override
    public void delete(ID id){
        jpaRepository.deleteById(id);
    }

}
