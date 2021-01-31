package com.training.assignment.service;

import com.training.assignment.framework.Menu;
import com.training.assignment.framework.MenuProvider;

import java.util.ArrayList;
import java.util.List;

public class MenuService {

    public List<Menu> menus() {

        List<Menu> allMenus = new ArrayList<>();

        MenuProvider employeeMenuProvider = new EmployeeService();
        allMenus.add(employeeMenuProvider.showMenu());

        MenuProvider projectMenuProvider = new ProjectService();
        allMenus.add(projectMenuProvider.showMenu());

        return allMenus;
    }
}
