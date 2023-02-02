@file:Suppress("PackageName")

import org.gradle.api.Plugin
import org.gradle.api.Project
import package_name.buildlogic.setupMaven

class BuildLogicPlugin : Plugin<Project> {
    override fun apply(project: Project) {
        project.subprojects {
            setupMaven()
        }
    }
}
