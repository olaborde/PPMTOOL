package com.laborde.ppmtool.services;


import com.laborde.ppmtool.domain.Project;
import com.laborde.ppmtool.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectService {

    @Autowired
    private ProjectRepository projectRepository;

    public Project saveOrUpdateProject ( Project project){

        return projectRepository.save(project);

    }
}
