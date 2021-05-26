package com.github.sysulincn.autogeneric.services

import com.github.sysulincn.autogeneric.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
