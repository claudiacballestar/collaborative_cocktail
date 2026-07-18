# UB 4

## Requirements / Set up
1. Download from moodle:
- Vorlage Übung
- pom
- site

2. One of the members creates a **new repository** in GitHub and **invites** the other member
- name of the repository *related to the task*

3. Make sure you have Maven installed in your computer (not only in IntelliJ!)


## Instructions / Important notes:
### relevant **for all branches**:
1. Create **new commits** - when you finish a (small) significant task to share results
2. **Push** all branches - to being able to work together
3. **Name branches** = as headings from each task (i.e. *maven*)
4. **Pull request** when a branch is finished - **do not accept it yourself** it should be reviewed and merged by another group member.
5. Tasks can be done
5.1. parallel
5.2. together
6. **Follow best practices** - in documentation, commit messages...
7. **Actualize task list**
8. **Respect Maven File Structure**


## Tasks

Assumed: 
each task must start with the branch creation and its link to the remote repository
(unless specified to make the collaboration easier, but not marked as task!)
*Note: after each task, the readme should also be actualized (and commited)*
*Note: share the tasks - more tasks than branches*

Previous Requisits: 
**Member 1 + Member 2:**
- [ ] Think 3 cocktails and their recipes, write it in a .txt extra, so that you're able to check them later

### 1. BRANCH MAVEN

 **Member 2:**
- [x] Create **new Maven Project** and integrate moodle files (vorlage, pom, site) under the package **at.campus02.bsd**
*Note: make sure that project is created in the* **root folder** 
- [x] Create the first version of a **.gitignore** to make sure only relevant files are saved
- [x] **Push** branch maven


**Member 1:**
- [x] **Pull request** - review changes + **Merge** to main if everything is correct.

### 2. BRANCH README

**Member 1:**
- [x] Create a **README** writing: Project name + name of the members + relevant informations that a README should have
- [x] **Add a Task List** in the readme
- [x] **Push** branch readme

**Member 2:**
- [x] **Pull request** - review changes + **Merge** to main if everything is correct.


### 3. BRANCH MAVEN_DETAIL

**Member 2: Create branch maven_detail**
**Member 1: pull request**

**Member 1 + Member 2:**
- [x] Work in the pom.xml - update your own informations in the file
- push

*Question: which one to push?*

**Member 1 // or 2:**
- [x] **Add Git Repository** address (into pom.xml) + other necesary Maven dependencies
- [x] **Test** the conficurations with the **command line** 
*Note: IntelliJ uses its own integrated Maven - it can work differently depending on the version. It will be taken into account* **your own Maven version** *not IntelliJ and this can also be configuratd through IntelliJ*

**Member 2 // or 1:**
- [x] **Pull request** + **Merge** if everything is correct.

### 4. BRANCH BUG_HUNT

**Member 2:**
- [x] **Find and correct** the 3 errors in the given code
- **Push** the branch

**Member 1:**
- [x] **Pull request** +  **Merge** if everything is correct.

### 5. BRANCH DRINK

**Member 1:**
- [x] **Create** Class *Cocktail* that implements Interface *Drink*
- [x] **Create** your preferred Objects *Liquids* with Constructor with parameters *Name* (string) or *Liquid* list
- **Push** the branch

**Member 2:**
- [x] **Pull request** + **Merge** if everything is correct.

### 6. BRANCH QUEUE
*Note: each of the members implements their methods on separate branches*

**Member 2:**
- [x] **Create** the Class *DrinkQueue* - this adds all existing Drinks into a Queue (class *Cocktail* that implement the Interface *Drink*) *Note: without errors!*
- **Push** the new changes

**Member 1:**
1. **Pull request**

**Member 1 + Member 2:**
- [x] **Create branch queue_surname** - and **create 3 methods** for the selected cocktail
**Push** the new changes

**Member 1 or 2:**
- []**Pull request + Merge** if everything is correct.

### 7. BRANCH JAVADOC

**Member 1:**
- [ ] Create branch javadoc
- [ ] **Create JavaDoc comments** for all existing classes (old and new)
*Note: check [following link](https://www.oracle.com/technical-resources/articles/java/javadoc-tool.html) and [tutorial](4 https://www.baeldung.com/javadoc)*
*introduce @param, @return, @throws and attributes*
- [ ] **Push** new changes

**Member 2:**
- [ ]**Pull request + Merge** if everything is correct.

### 8. BRANCH TEST

**Member 1.**
- [ ] Create branch test

**Member 1 + Member 2:**
- [ ] **Create Test Classes** for old and new Classes and reach 100% coverage. Divide the work. Check the right location in the Maven Project
*Note: name schema for the classes - ClassNameTest (i.e. DrinkQueue.java --> Test: DrinkQueueTest.java)*
- [ ]**Test through Command Line** mvn test - without errors

**Member 1 or 2:**
- [ ]**Pull request + Merge** if everything is correct.


### 9. BRANCH MAVEN_SITE

*Previous notes: how to create a maven site*
- Create the folder structure for Maven Site: [maven_structure](mvn_structure.png)
*Note: since there is only markdown to be added, the folder Markdown is enough*
- Create ein *site.xml* to configurate the Maven Site // there is one already created in moodle
- Try to make maven site work:
-- Don't forget to integrate the test results in the Documentation
-- They should appear in: target/site/index.html.
- Now check:
-- are the project infos and developers visible?
-- are the name for the link of the pages visible?
-- Is the API-Help from JavaDoc connected to our class?
-- Is the JUnit through jacoco visiblee?

**Member 2:**
- [ ] **Create branch maven_site**
- [ ] **Create maven site documentation** integrate all: Project infos, Test stadistics (jacoco) and the API generated documentation

**Member 1 + Member 2:**
- [ ]**Create extra Markdown** - linked it to the main site of Maven Documentation *Name: member1.md,member2.md ...* writing which tasks you did 
- [ ] Use in the command line: mvn site - should work without problems

**Member 1 or 2:**
- [ ]**Pull request + Merge** if everything is correct.


### ENDING:

- [ ]Controll the Repository on github.com.
*All contents there? all needed? anything extra that should bbe deleted?*
- [ ]Upload the Link of the repository in 4. Abgabe: 1 per group 
