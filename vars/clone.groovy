def call(String url, String branch){
    echo "clonning the code from git hub"
    git url: "${url}", branch: "${branch}"
    echo "code clonning successful"
}
