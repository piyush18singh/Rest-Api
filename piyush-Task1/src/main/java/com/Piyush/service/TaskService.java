package  com.Piyush.service;

import com.Piyush.model.Task;
import com.Piyush.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {
    @Autowired
    private TaskRepository repository;

    public Task addTask(Task task){
        return repository.save(task);


    }

    public List<Task> findAllTask(){
       return repository.findAll();
    }

    public Task getTaskById(String id){

        return repository.findById(id).get();

    }

    public List<Task> getTaskByName(String name){
        return repository.findByName(name);
    }

    public String deleteTask(String id){
        repository.deleteById(id);
        return id + "task delete from dashboard";
    }

}