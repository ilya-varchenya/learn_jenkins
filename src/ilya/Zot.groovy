// src/org/foo/Zot.groovy
package ilya

def checkOutFrom(repo) {
    git url: "git@github.com:jenkinsci/${repo}"
}

return this