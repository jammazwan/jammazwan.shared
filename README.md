"Jammazwan" [is Hindi](href="https://books.google.com/books?id=_kWROaer5UsC&amp;pg=PA1138&amp;lpg=PA1138&amp;dq=jammazwan+camel+keeper+hindi&amp;source=bl&amp;ots=7FaF5BXK_F&amp;sig=Cg-U5ORP3dHrFycaCFvo34GdpZ0&amp;hl=en&amp;sa=X&amp;ved=0ahUKEwj8v4OV3YbNAhVjpIMKHSYUB_oQ6AEIHDAA#v=onepage&amp;q=jammazwan%20camel%20keeper%20hindi&amp;f=false) for "camel keeper", and is [explained in this blog](https://betterologist.net/2016/05/jammazwan-projects-for-learning-apache-camel/).

|[**_a jammazwan?_**](https://betterologist.net/2016/06/jammazwan-for-hire/)|also a jammazwan|
| --- | --- |
|<img class="style-svg" src="https://betterologist.net/wp-content/uploads/2016/05/pete-300x297.jpg" alt="pete" width="116" height="115" />|<img class="style-svg" src="https://betterologist.net/wp-content/uploads/2016/05/jammazwanPhotoSmall.png" alt="jammazwanPhotoSmall" width="200" height="116" />|

---

# Jammazwan.shared

This project provides a set of base data feeds in various forms, for other jammazwan projects to consume.

### Use This Project Only As A Dependency:

This project has no runnable code.

In every sense, this is like a parent project in maven. Only it is written as a sibling.

### Duplicate Copies of Entities:

Jammazwan projects are specifically made to facilitate learning by finding the sweet spot between isolation of a small thing to learn, and meaningful context, which can be too broad. More [here](https://betterologist.net/2016/05/jammazwan-projects-for-learning-apache-camel/).

**City.java entity** includes annotations for both **jpa** and **csv/bindy*. So if you are just learning one or another, this can be confusing. Which annotations are required? 

For this reason only, you will find duplicate entities which are not typically consumed, but instead just code examples
 * ..jpa.CityJpa with JPA annotations
 * ..csv.CityCsv with camel-bindy annotations
 * and so on, for other entities provided in this project

So that is one thing which might drive you nuts as a developer. WTF? **_But it might make it easier for the poor guy who is just encountering his first JPA or CSV/camel-bindy use case._** Which is what jammazwan is all about.

### Utility Classes

You may find other experimental and/or questionable classes in this project, such as HoldContextOpenUntilDone. 

Hopefully, some restraint will be used in the future, else this could create more confusion, rather than less.