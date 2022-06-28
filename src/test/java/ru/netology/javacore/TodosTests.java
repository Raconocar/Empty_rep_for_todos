package ru.netology.javacore;

import org.junit.Assert;
import org.junit.Test;

public class TodosTests {


    @Test
    public void addTask() {
        Todos todos = new Todos();
        todos.addTask("testAdd");
        Assert.assertEquals("testAdd", todos.getAllTasks());
    }


    @Test
    public void removeTask() {
        Todos todos = new Todos();
        todos.addTask("testAdd");
        todos.addTask("testAdd");
        todos.addTask("testAdd");
        todos.addTask("testAdd");
        todos.removeTask("testAdd");
        Assert.assertEquals("testAdd testAdd testAdd", todos.getAllTasks());
    }


    @Test
    public void getAllTasks() {
        Todos todos = new Todos();
        todos.addTask("testAdd");
        todos.addTask("testAdd");
        todos.addTask("testAdd");
        todos.addTask("testAdd");
        Assert.assertEquals("testAdd testAdd testAdd testAdd", todos.getAllTasks());

    }
}
