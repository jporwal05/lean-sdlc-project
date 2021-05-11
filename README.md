# LEAN SDLC Project

# Project setup

1. Setup [Checkstyle](https://github.com/HPI-Information-Systems/Metanome/wiki/Installing-the-google-styleguide-settings-in-Intellij-and-eclipse)
2. Install SonarLint plugin/extension in your IDE.
3. Install PMD plugin/extension in your IDE.
4. Run ```mvn clean verify -PmutationTest,integrationTest```
5. If you have a sonar server then run ```mvn clean verify sonar:sonar -PmutationTest,integrationTest```

# Collaboration rules

1. Monitor the project board for issues and pick up accordingly.
2. Appropriate description needs to be provided if you are raising or creating an issue.
3. If you are raising a PR, the issue should be linked to it.
4. All sorts of communication should happen either in form of issues on the project board or in the form of PR(s).
5. Healthy discussion should happen on issues or PR(s) in terms of review comments.
6. PR [hygiene](https://docs.github.com/en/free-pro-team@latest/github/managing-your-work-on-github/linking-a-pull-request-to-an-issue)
7. Commit [hygiene](https://udacity.github.io/git-styleguide/)

For exploring the in memory h2 database, go to the below address in a browser:

http://localhost:8080/lean/h2-console

**Database URL**: jdbc:h2:mem:testd