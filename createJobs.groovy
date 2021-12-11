pipelineJob('pipelineJob') {
    definition {
        cps {
            script(readFileFromWorkspace('pipelineJob.groovy'))
            sandbox()
        }
    }
}
pipelineJob('theme-park-job-docker') {
    definition {
        cpsScm{
            scm{
                git{
                    remote{
                        url 'https://github.com/mdmhasan307/spring-boot-api-example.git'
                    }
                    branch 'master'
                    scriptPath 'Jenkinsfile'
                }
            }

        }
    }
}
