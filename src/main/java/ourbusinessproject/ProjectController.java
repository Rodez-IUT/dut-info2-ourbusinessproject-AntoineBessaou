package ourbusinessproject;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProjectController {

    EnterpriseProjectService enterpriseProjectService;

    public ProjectController(EnterpriseProjectService projectService) {
        this.enterpriseProjectService = projectService;
    }

    @RequestMapping(value = "/projectsWithEnterprises", method = RequestMethod.GET)
    @JsonIgnore
    public List<Project> findAllProjectsWithEnterprises() {
        return enterpriseProjectService.findAllProjects();
    }
}