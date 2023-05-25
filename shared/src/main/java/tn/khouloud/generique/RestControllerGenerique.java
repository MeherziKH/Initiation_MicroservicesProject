package tn.khouloud.generique;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;


public class RestControllerGenerique <T, ID>{

    @Autowired
    private ServiceGenerique<T, ID> serviceGenerique;

    @GetMapping
    List<T> all() {
        return serviceGenerique.getAll();
    }

    @PostMapping("/")
    T save(@RequestBody T t) {
        return serviceGenerique.add(t);
    }

    @GetMapping("/{id}")
    T one(@PathVariable ID id) {
        return serviceGenerique.getOne(id);
    }

    @PatchMapping("/{id}")
    public T  update(@PathVariable ID id, @RequestBody Map<Object,Object> fields){
        return serviceGenerique.update(id, fields);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable ID id){
        serviceGenerique.delete(id);
    }


}
