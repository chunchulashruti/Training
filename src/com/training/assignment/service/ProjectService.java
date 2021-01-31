package com.training.assignment.service;

import com.training.assignment.framework.Menu;
import com.training.assignment.framework.MenuItem;
import com.training.assignment.framework.MenuProvider;

public class ProjectService implements MenuProvider {

    public void createProject() {

    }

    public void updateProject(String projectId) {

    }

    public void deleteProject(String projectId) {

    }

    public void listProject() {

    }

    @Override
    public Menu showMenu() {
        return new Menu("Project", new MenuItem("Create Project", 1),
                new MenuItem("Update Project", 2),
                new MenuItem("Delete Project", 3),
                new MenuItem("List Project", 4));
    }
}
