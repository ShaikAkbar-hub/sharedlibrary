def gitDownload(repo)
{
   git "https://github.com/ShaikAkbar-hub/${repo}.git"
}

def buildArtefact()
{
   sh 'mvn package'
}

def deployTomcat(jobname,ipaddress,context)
{
   sh "scp /var/lib/jenkins/workspace/${jobname}/webapp/target/webapp.war ubuntu@${ipaddress}:/var/lib/tomcat10/webapps/${context}.war"
}
