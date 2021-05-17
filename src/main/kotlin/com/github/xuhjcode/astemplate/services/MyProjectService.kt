package com.github.xuhjcode.astemplate.services

import com.github.xuhjcode.astemplate.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
