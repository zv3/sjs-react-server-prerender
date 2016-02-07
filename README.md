# sjs-react-server-prerender
Proof of concept of a simple pagination component built with jagpolly's [scalajs-react](https://github.com/japgolly/scalajs-react), performing in nodejs for server side rendering using lihaoyi's [upickle](https://github.com/lihaoyi/upickle-pprint) library (remote rendering using expressjs).

The idea behind this is to create a backend service in nodejs the JVM will talk to, to render react components or an entire page (using the same scalajs app) into plain html that will be served back to the user.

#### Steps to reproduce ####

Run:
`sbt fastOptJS && npm install && node server.js` 

Hit your browser on http://localhost:3000/pagination and check the source HTML code.
