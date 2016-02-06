# sjs-react-server-prerender
Proof of concept of a simple pagination component built with jagpolly's [scalajs-react](https://github.com/japgolly/scalajs-react), performing in nodejs for server side rendering using lihaoyi's [autowire](https://github.com/lihaoyi/autowire)/[upickle](https://github.com/lihaoyi/upickle-pprint) libraries.

# Steps to reproduce

Run:
`sbt fastOptJS && npm install && node server.js` 

Hit your browser on http://localhost:3000/pagination and check the source HTML code.
