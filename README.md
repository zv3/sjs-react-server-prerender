# sjs-react-server-prerender
Proof of concept of a simple pagination component built with jagpolly's [scalajs-react](https://github.com/japgolly/scalajs-react), performing in node.js for server side rendering using lihaoyi's [upickle](https://github.com/lihaoyi/upickle-pprint) library (remote rendering using expressjs).

So essentially this is just about pre-rendering components built with Scala.js on the server using a node environment. The main idea to this is to create a backend service running in nodejs to render React components (built with Scala.js) to their initial HTML code using the [`ReactDOMServer.renderToString()`](https://facebook.github.io/react/docs/react-dom-server.html#rendertostring) method. The returned HTML markup could then be sent to a JVM app (i.e. Play Framework) which in turn could send that data back to the user's browser. 

#### Steps to reproduce ####

Run:
`sbt fastOptJS && npm i && node server.js` 

Hit your browser to [http://localhost:3000/pagination](http://localhost:3000/pagination) and check the generated source HTML code.
