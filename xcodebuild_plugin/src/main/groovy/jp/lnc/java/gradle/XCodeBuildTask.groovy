package jp.lnc.java.gradle

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

/**
 * Created by bols on 17/05/24.
 */
class XCodeBuildTask extends DefaultTask {

    @TaskAction
    def build() {
        def env = System.getenv()
        String KEYCHAIN_PASSWORD = env['KEYCHAIN_PASSWORD']
        String KEYCHAIN_PATH = env['KEYCHAIN_PATH']
        println "key@pass:" + KEYCHAIN_PATH + '@' + KEYCHAIN_PASSWORD

    }
}
