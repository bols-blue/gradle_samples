package jp.lnc.java.gradle

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

class GreetingTask extends DefaultTask {
    String greeting = 'hello from GreetingTask'

    @TaskAction
    def greet() {
        println greeting
        def env = System.getenv()
        //Print all the environment variables.

        env.each{
            println it
        }
        // You can also access the specific variable, say 'username', as show below
        String user= env['USERNAME']

    }
}
