<h1 align="center">uranus</h1>

<p align="center">
  <a href="https://twitter.com/home?status=Hierarchical%20Memo%20and%20Task%20App%20by%20%40_resotto_%20https://github.com/resotto/uranus"><img src="https://img.shields.io/badge/twitter-tweet-blue.svg"/></a>
  <a href="https://twitter.com/_resotto_"><img src="https://img.shields.io/badge/feedback-@_resotto_-blue.svg" /></a>
  <a href="https://github.com/resotto/uranus/blob/master/LICENSE"><img src="https://img.shields.io/badge/license-GPL%20v3.0-brightgreen.svg" /></a>
</p>

<p align="center">
  <img src="https://raw.github.com/wiki/resotto/uranus/gif/uranus_memo.mov.gif">
  <img src="https://raw.github.com/wiki/resotto/uranus/gif/uranus_task.mov.gif">
</p>

---

Uranus is a hierarchical Memo & Task app. In order to use Uranus, please install Docker in advance.  
If having more time, I would try to implement json/yaml file export feature.  

---

## Getting Started
```
git clone https://github.com/resotto/uranus
cd uranus
docker-compose up -d
open http://0.0.0.0:8888/uranus
```

## Features
- Switch mode from Memo to Task, and vice versa
- Create new item
- Add new item
- Edit item
- Exchange item with above one
- Delete item
- Clear all items
- Check item, and strike through it asynchronously (Task only)

## Developing
If you want to build Uranus from source code, please install Maven in advance.  
First, uncomment build tag in docker-compose.yml and remove images.
```
docker rmi resotto/tomcat:1.0
docker rmi resotto/postgres:1.0
```
Second, build Uranus with Maven.
```
cd ap
mvn package
```
Now, you just run containers.
```
docker-compose up -d
open http://0.0.0.0:8888/uranus
```

## Feedback
- Request a new feature on [Feature request](https://github.com/resotto/uranus/issues/2).
- Report a bug to [Bug report](https://github.com/resotto/uranus/issues/1).
- [Tweet me](https://twitter.com/_resotto_) with any other feedback.

## License
[GNU General Public License v3.0](https://github.com/resotto/uranus/blob/master/LICENSE).
