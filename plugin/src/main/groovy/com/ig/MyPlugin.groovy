package com.ig

import org.gradle.api.Plugin
import org.gradle.api.Project

/**
 * Created by sachin on 24/06/14.
 */

class MyPlugin implements Plugin<Project> {

    void  apply(Project project){

        project.task("MyTask") << {
         println "Hi!! I am task from Plugin. :-)"
        }
    }
}
