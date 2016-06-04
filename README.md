"Jammazwan" [is Hindi](href="https://books.google.com/books?id=_kWROaer5UsC&amp;pg=PA1138&amp;lpg=PA1138&amp;dq=jammazwan+camel+keeper+hindi&amp;source=bl&amp;ots=7FaF5BXK_F&amp;sig=Cg-U5ORP3dHrFycaCFvo34GdpZ0&amp;hl=en&amp;sa=X&amp;ved=0ahUKEwj8v4OV3YbNAhVjpIMKHSYUB_oQ6AEIHDAA#v=onepage&amp;q=jammazwan%20camel%20keeper%20hindi&amp;f=false) for "camel keeper", and is [explained in this blog](https://betterologist.net/2016/05/jammazwan-projects-for-learning-apache-camel/).

|[**_a jammazwan?_**](https://betterologist.net/2016/06/jammazwan-for-hire/)|also a jammazwan|
| --- | --- |
|<img class="style-svg" src="https://betterologist.net/wp-content/uploads/2016/05/pete-300x297.jpg" alt="pete" width="116" height="115" />|<img class="style-svg" src="https://betterologist.net/wp-content/uploads/2016/05/jammazwanPhotoSmall.png" alt="jammazwanPhotoSmall" width="200" height="116" />|

---

# Jammazwan.shared

This project provides a set of base data feeds in various forms, for other jammazwan projects to consume.

### Use This Project Only As A Dependency:

Do not use this project except when advised to do so by another project.

It has no useful code by itself. It is only meant to be a dependency of another project.
In every sense, this is like a parent project in maven. Only it is written as a sibling.

### Warning: Isolation and Practicality At Odds Herein:

Jammazwan projects are specifically made to facilitate learning by finding the sweet spot between isolation of a small thing to learn, and meaningful context, which can be too broad. More [here](https://betterologist.net/2016/05/jammazwan-projects-for-learning-apache-camel/).

So here's how that screwed up the code in this project. Entity beans are duplicated **_<argh!>-** to only include one particular kind of annotation for that particular use case!! 

This creates 3 City beans! 
 * City for JPA
 * City for CSV
 * City for plain pojo no annotations
 * and a City interface and CityToJpa class!!
 
Yikes. Stupid!

So that is one thing which might drive you nuts as a developer. **_But it might make it easier for the poor guy who is just encountering his first JPA or CSV/camel-bindy use case._** Which is what jammazwan is all about. Get in, get out, no confusion.