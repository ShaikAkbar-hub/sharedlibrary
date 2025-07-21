def gitDownload(repo)
{
   git "https://github.com/ShaikAkbar-hub/${repo}.git"
}

def buildArtefact()
{
   sh 'mvn package'
}
